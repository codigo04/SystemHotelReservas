/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dao.impl.HabitacionImpl;
import modelo.dao.impl.TipoHabitacionImpl;
import modelo.entity.Habitacion;
import modelo.entity.TipoHabitacion;
import vista.Administrador.paneles.PanelHabitacionesAdm;
import vista.Administrador.paneles.PanelTipoHabitacionesAdm;

/**
 *
 * @author FranDev
 */
public class ControladorTipoHabitaciones implements ActionListener {

    private PanelTipoHabitacionesAdm panelTipoHabitacionesAdm;
    private final HabitacionImpl habitacionImpl;
    private final TipoHabitacionImpl tipoHabitacionImpl;

    ControladorTipoHabitaciones(PanelTipoHabitacionesAdm panelTipoHabitacionesAdm) {
        this.panelTipoHabitacionesAdm = panelTipoHabitacionesAdm;
        habitacionImpl = new HabitacionImpl();
        tipoHabitacionImpl = new TipoHabitacionImpl();

        agregarListeners();
        cargarTipoHabitaciones();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelTipoHabitacionesAdm.btnAgregarHabi) {
            // cargarTipoHabitaciones();
        }

        if (e.getSource() == panelTipoHabitacionesAdm.btnAceptarGuardarHabitacion) {

            if (panelTipoHabitacionesAdm.validarCampos()) {

                if (panelTipoHabitacionesAdm.validarCamposTipoHabitacionSave()) {
                    saveTipoHabitacion();
                    panelTipoHabitacionesAdm.desbloquear(panelTipoHabitacionesAdm.jpanelContenidoHabi);
                    panelTipoHabitacionesAdm.Panel_RegistroHabitaciones.setVisible(false);
                    cargarTipoHabitaciones();
                }

            }

        }

        if (e.getSource() == panelTipoHabitacionesAdm.btnAceptarEditHabi) {
            if (panelTipoHabitacionesAdm.validarCamposTipoHabitacionUpdate()) {
                updateTipoHabitacion();
                panelTipoHabitacionesAdm.desbloquear(panelTipoHabitacionesAdm.jpanelContenidoHabi);
                panelTipoHabitacionesAdm.Panel_EditHabitaciones.setVisible(false);
                cargarTipoHabitaciones();
                JOptionPane.showMessageDialog(null, "Tipo de habitación actualizada correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void cargarTipoHabitaciones() {
        System.out.println("hola siii entro");
        List<TipoHabitacion> tipoHabi = tipoHabitacionImpl.findAll();

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = panelTipoHabitacionesAdm.modTablaHabitaciones;
        model.setRowCount(0);  // Limpiar filas anteriores

        // Rellenar la tabla con los datos de los empleados
        for (TipoHabitacion habitacion : tipoHabi) {
            Object[] fila = new Object[4];
            fila[0] = habitacion.getIdTipo();
            fila[1] = habitacion.getCaracteristicas();
            fila[2] = habitacion.getPrecio();
            fila[3] = habitacion.getTipoHabitacion();

            model.addRow(fila);  // Agrega la fila al modelo de tabla
        }

    }

    public void saveTipoHabitacion() {
        TipoHabitacion newTipoHabi = panelTipoHabitacionesAdm.datosSaveHbitacion();

        tipoHabitacionImpl.save(newTipoHabi);
        JOptionPane.showMessageDialog(null, "Tipo de habitacion guardada con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);

    }

    public void updateTipoHabitacion() {
        TipoHabitacion newTipoHabi = panelTipoHabitacionesAdm.datosUpdateHbitacion();

        Optional<TipoHabitacion> tipoHabitacionExist = tipoHabitacionImpl.findById(newTipoHabi.getIdTipo());

        if (tipoHabitacionExist.isPresent()) {
            TipoHabitacion newtipoHabitacion = tipoHabitacionExist.get();
            newtipoHabitacion.setTipoHabitacion(newTipoHabi.getTipoHabitacion());
            newtipoHabitacion.setPrecio(newTipoHabi.getPrecio());
            newtipoHabitacion.setCaracteristicas(newTipoHabi.getCaracteristicas());

            tipoHabitacionImpl.update(newtipoHabitacion);
        }

    }

    /*
    public void cargarTipoHabitaciones(){
        JComboBox<String> Tipohabitaciones = panelHabitacionesAdm.cboxTipoHabi;
        Tipohabitaciones.removeAllItems();
        List<TipoHabitacion> tipoHabitacions = tipoHabitacionImpl.findAll();

        for (TipoHabitacion tipoHabitacion : tipoHabitacions) {
            Tipohabitaciones.addItem(tipoHabitacion.getTipoHabitacion());
        }

    }
     */
    private void agregarListeners() {
        panelTipoHabitacionesAdm.btnAgregarHabi.addActionListener(this);
        panelTipoHabitacionesAdm.btnAceptarGuardarHabitacion.addActionListener(this);
        panelTipoHabitacionesAdm.btnCancelarHabitacion.addActionListener(this);
        panelTipoHabitacionesAdm.btnAceptarEditHabi.addActionListener(this);
        panelTipoHabitacionesAdm.btnCancelarEditHabi.addActionListener(this);
    }
}
