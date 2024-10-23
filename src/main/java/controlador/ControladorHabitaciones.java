/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import modelo.dao.impl.HabitacionImpl;
import modelo.dao.impl.TipoHabitacionImpl;
import modelo.entity.Habitacion;
import modelo.entity.TipoHabitacion;
import vista.Administrador.paneles.PanelEmpleadoAdm;
import vista.Administrador.paneles.PanelHabitacionesAdm;
import vista.Empleado.paneles.PanelHabitaciones;

/**
 * @author FranDev
 */
public class ControladorHabitaciones implements ActionListener {

    private PanelHabitacionesAdm panelHabitacionesAdm;
    private final HabitacionImpl habitacionImpl;
    private final TipoHabitacionImpl tipoHabitacionImpl;

    ControladorHabitaciones(PanelHabitacionesAdm panelHabitacionesAdm) {
        this.panelHabitacionesAdm = panelHabitacionesAdm;
        habitacionImpl = new HabitacionImpl();
        tipoHabitacionImpl = new TipoHabitacionImpl();
        agregarListeners();
        cargarHabitaciones();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if (e.getSource() == panelHabitacionesAdm.btnAgregarHabi) {
             // cargarTipoHabitaciones();
          }

          if (e.getSource() == panelHabitacionesAdm.btnAceptarGuardarHabitacion){
              saveTipoHabitacion();
          }
    }

    public void cargarHabitaciones() {
        System.out.println("hola siii entro");
        List<Habitacion> habitaciones = habitacionImpl.getAllHabitaciones();

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = panelHabitacionesAdm.modTablaHabitaciones;
        model.setRowCount(0);  // Limpiar filas anteriores

        // Rellenar la tabla con los datos de los empleados
        for (Habitacion habitacion : habitaciones) {
            Object[] fila = new Object[6];
            fila[0] = habitacion.getIdHabitacion();
            fila[1] = habitacion.getNumeroDeHabitacion();
            fila[2] = habitacion.getTipoHabitacion().getTipoHabitacion();
            fila[3] = habitacion.getTipoHabitacion().getCaracteristicas();
            fila[4] = habitacion.getTipoHabitacion().getPrecio();
            fila[5] = habitacion.getEstado();

            model.addRow(fila);  // Agrega la fila al modelo de tabla
        }

    }


    public void saveTipoHabitacion(){
     TipoHabitacion newTipoHabi =   panelHabitacionesAdm.datosSaveHbitacion();

        System.out.printf(newTipoHabi.getCaracteristicas());
      tipoHabitacionImpl.save(newTipoHabi);

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
        panelHabitacionesAdm.btnAgregarHabi.addActionListener(this);
        panelHabitacionesAdm.btnAceptarGuardarHabitacion.addActionListener(this);
        panelHabitacionesAdm.btnCancelarHabitacion.addActionListener(this);
    }
}
