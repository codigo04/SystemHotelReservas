/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import aggregates.Servicios.InternoService.HabitacionService;
import aggregates.Servicios.InternoService.ReservaScheduler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import modelo.dao.HabitacionDao;
import modelo.dao.impl.HabitacionImpl;
import modelo.dao.impl.ReservaImpl;
import modelo.dao.impl.TipoHabitacionImpl;
import modelo.entity.Habitacion;
import modelo.entity.TipoHabitacion;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import vista.Administrador.paneles.PanelEmpleadoAdm;
import vista.Administrador.paneles.PanelHabitacionesAdm;
import vista.Empleado.paneles.PanelRecervarHabitaciones;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author FranDev
 */
public class ControladorHabitaciones implements ActionListener {

    private PanelHabitacionesAdm panelHabitacionesAdm;

    private PanelRecervarHabitaciones panelRecervarHabitaciones;

    private HabitacionImpl habitacionImpl;
    private TipoHabitacionImpl tipoHabitacionImpl;
    private ReservaImpl reservaImpl;

    private HabitacionService habitacionService;
    private ReservaScheduler reservaScheduler;

    ControladorHabitaciones(PanelHabitacionesAdm panelHabitacionesAdm, PanelRecervarHabitaciones panelRecervarHabitaciones) {
        this.panelHabitacionesAdm = panelHabitacionesAdm;
        this.panelRecervarHabitaciones = panelRecervarHabitaciones;
        reservaImpl = new ReservaImpl();
        habitacionImpl = new HabitacionImpl();
        tipoHabitacionImpl = new TipoHabitacionImpl();

        reservaScheduler = new ReservaScheduler(habitacionService); // Crear el scheduler

        // Iniciar la tarea programada para verificar y actualizar habitaciones
        reservaScheduler.iniciarTareaProgramada();
        agregarListeners();
        cargarHabitaciones();

        /*
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                habitacionService = new HabitacionService(reservaImpl.getAllReservas()); // Crear el servicio de reservas
                habitacionService.verificarYActualizarReservas();
                cargarHabitaciones();  // Recargar las habitaciones después de actualizar los estados
            }
        }, 0, 60000); // Ejecutar cada 60,000 milisegundos (1 minuto)

         */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelHabitacionesAdm.btnAgregarHabi) {
            // cargarTipoHabitaciones();
        }

        if (e.getSource() == panelHabitacionesAdm.btnAgregarHabi) {
            cargarTipoHabitaciones();
        }

        if (e.getSource() == panelHabitacionesAdm.btnEditarHabi) {
            cargarTipoHabitacionesEdit();
        }

        if (e.getSource() == panelHabitacionesAdm.btnAceptarGuardarHabitacion) {
            saveHabitacion();

        }

        if (e.getSource() == panelHabitacionesAdm.btnAceptarEditHabitacion) {
            updateHabitacion();
            
        }

    }

    public void cargarHabitaciones() {
        System.out.println("hola siii entro");
        List<Habitacion> habitaciones = habitacionImpl.getAllHabitaciones();

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel modelHabiAdm = panelHabitacionesAdm.modTablaHabitaciones;
        DefaultTableModel modelHabiEm = panelRecervarHabitaciones.modTablaHabitacionesRecervas;
        modelHabiAdm.setRowCount(0);  // Limpiar filas anteriores
        modelHabiEm.setRowCount(0);
        // Rellenar la tabla con los datos de los empleados
        for (Habitacion habitacion : habitaciones) {
            Object[] fila = new Object[6];
            fila[0] = habitacion.getIdHabitacion();
            fila[1] = habitacion.getNumeroDeHabitacion();
            fila[2] = habitacion.getTipoHabitacion().getTipoHabitacion();
            fila[3] = habitacion.getTipoHabitacion().getCaracteristicas();
            fila[4] = habitacion.getTipoHabitacion().getPrecio();
            fila[5] = habitacion.getEstado();

            modelHabiAdm.addRow(fila);
            modelHabiEm.addRow(fila);
        }

    }

    public void saveHabitacion() {
        // Obtenemos los datos desde la interfaz
        Habitacion newHabitacion = panelHabitacionesAdm.datosSaveHabitacion();

        // Comprobar si la habitación ya existe
        Optional<Habitacion> habitacionExist = habitacionImpl.findHabitacionesPorNumHabitacion(newHabitacion.getNumeroDeHabitacion());

        if (panelHabitacionesAdm.validarCamposHabitacion()) {
            if (habitacionExist.isPresent()) {
                // Si la habitación ya existe, mostramos un mensaje de error y retornamos false
                panelHabitacionesAdm.bloquearTablaHabitaciones();
                JOptionPane.showMessageDialog(null, "El número de habitación ya existe", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                // Buscar el tipo de habitación asociado
                Optional<TipoHabitacion> tipoHabitacion = tipoHabitacionImpl.findByTipoHabitacion(newHabitacion.getTipoHabitacion().getTipoHabitacion());

                if (tipoHabitacion.isPresent()) {
                    // Asociar el tipo de habitación si existe
                    newHabitacion.setTipoHabitacion(tipoHabitacion.get());

                    // Guardar la nueva habitación
                    habitacionImpl.saveHabitacion(newHabitacion);
                    JOptionPane.showMessageDialog(null, "Habitación guardada con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);

                    // Desbloquear interfaz y ocultar el panel de registro
                    panelHabitacionesAdm.desbloquear(panelHabitacionesAdm.jpanelContenidoHabi);
                    panelHabitacionesAdm.Panel_RegistroHabitaciones.setVisible(false);

                    cargarHabitaciones();
                    // Retornar true ya que se guardó con éxito

                } else {
                    // Mostrar mensaje si el tipo de habitación no existe y retornar false

                    panelHabitacionesAdm.bloquearTablaHabitaciones();
                    JOptionPane.showMessageDialog(null, "El tipo de habitación especificado no existe. Por favor, verifica los datos.", "Error", JOptionPane.ERROR_MESSAGE);

                }
            }
        }

    }

    public void updateHabitacion() {
        Habitacion dataNewHabitacion = panelHabitacionesAdm.datosUpdateHabitacion();

        // Buscar la habitación a actualizar por su ID
        Optional<Habitacion> habitacionExist = habitacionImpl.findHabitacionById(dataNewHabitacion.getIdHabitacion());

        if (habitacionExist.isPresent()) {
            Habitacion updateHabi = habitacionExist.get();

            // Comprobar si el número de habitación ya existe (excluyendo la habitación actual)
            Optional<Habitacion> numeroHabitacion = habitacionImpl.findHabitacionesPorNumHabitacion(dataNewHabitacion.getNumeroDeHabitacion());

            if (numeroHabitacion.isPresent() && !numeroHabitacion.get().getIdHabitacion().equals(updateHabi.getIdHabitacion())) {
                // Si el número de habitación ya existe y no es la misma habitación que estamos actualizando
                JOptionPane.showMessageDialog(null, "El número de habitación ya existe", "Error", JOptionPane.ERROR_MESSAGE);
                return; // No proceder con la actualización
            }

            // Actualizar los campos de la habitación
            updateHabi.setNumeroDeHabitacion(dataNewHabitacion.getNumeroDeHabitacion());

            if (panelHabitacionesAdm.validarSelectEstado()) {
                updateHabi.setEstado(dataNewHabitacion.getEstado());
            }

            // Validar y asociar el tipo de habitación
            Optional<TipoHabitacion> tipoHabitacion = tipoHabitacionImpl.findByTipoHabitacion(dataNewHabitacion.getTipoHabitacion().getTipoHabitacion());

            if (panelHabitacionesAdm.validarSelectTipoHabitacion()) {
                if (tipoHabitacion.isPresent()) {
                    updateHabi.setTipoHabitacion(tipoHabitacion.get());
                } else {
                    // Si el tipo de habitación no se encuentra, mostrar un error
                    JOptionPane.showMessageDialog(null, "El tipo de habitación no existe", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Guardar la actualización
            habitacionImpl.updateHabitacion(updateHabi);

            // Confirmar que la habitación fue actualizada
            JOptionPane.showMessageDialog(null, "Habitación actualizada con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
            cargarHabitaciones();
            panelHabitacionesAdm.desbloquear(panelHabitacionesAdm.jpanelContenidoHabi);
            panelHabitacionesAdm.Panel_EditHabitaciones.setVisible(false);
        } else {
            // Si no se encuentra la habitación a actualizar
            JOptionPane.showMessageDialog(null, "La habitación no existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarTipoHabitaciones() {
        JComboBox<String> Tipohabitaciones = panelHabitacionesAdm.cboxTipoHabitacionHabi;
        Tipohabitaciones.removeAllItems();
        List<TipoHabitacion> tipoHabitacions = tipoHabitacionImpl.findAll();
        Tipohabitaciones.addItem("SELECCIONAR");
        for (TipoHabitacion tipoHabitacion : tipoHabitacions) {

            Tipohabitaciones.addItem(tipoHabitacion.getTipoHabitacion());
        }

    }

    public void cargarTipoHabitacionesEdit() {
        JComboBox<String> Tipohabitaciones = panelHabitacionesAdm.cboxTipoHabitacionEditHabi;
        Tipohabitaciones.removeAllItems();
        List<TipoHabitacion> tipoHabitacions = tipoHabitacionImpl.findAll();
        Tipohabitaciones.addItem("SELECCIONAR");
        for (TipoHabitacion tipoHabitacion : tipoHabitacions) {
            Tipohabitaciones.addItem(tipoHabitacion.getTipoHabitacion());
        }

    }

    private void agregarListeners() {
        panelHabitacionesAdm.btnAgregarHabi.addActionListener(this);
        panelHabitacionesAdm.btnAceptarGuardarHabitacion.addActionListener(this);
        panelHabitacionesAdm.btnCancelarHabitacion.addActionListener(this);
        panelHabitacionesAdm.btnEditarHabi.addActionListener(this);
        panelHabitacionesAdm.btnEliminarHabi.addActionListener(this);

        panelHabitacionesAdm.btnAceptarEditHabitacion.addActionListener(this);
        panelHabitacionesAdm.btnCancelarEditHabitacion.addActionListener(this);
        panelHabitacionesAdm.btnBuscarHabitacion.addActionListener(this);
    }
}
