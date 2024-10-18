/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import modelo.dao.impl.EmpleadoImpl;
import modelo.dao.impl.RolesImpl;
import modelo.entity.Empleado;
import modelo.entity.Roles;
import vista.Administrador.paneles.PanelEmpleadoAdm;

/**
 *
 * @author FranDev
 */
public class ControladorEmpleado implements ActionListener {

    public PanelEmpleadoAdm panelEmpleadoAdm;

    public EmpleadoImpl empleadoImpl = new EmpleadoImpl();
    public RolesImpl rolesImpl = new RolesImpl();

    public ControladorEmpleado(PanelEmpleadoAdm panelEmpleadoAdm) {
        this.panelEmpleadoAdm = panelEmpleadoAdm;
        agregarListeners();

        cargarDatos();

    }

    public void cargarDatos() {
        System.out.println("hola siii entro");
        List<Empleado> empleados = empleadoImpl.getAllEmpleados();

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = panelEmpleadoAdm.modTablaEmpleados;
        model.setRowCount(0);  // Limpiar filas anteriores

        // Rellenar la tabla con los datos de los empleados
        for (Empleado empleado : empleados) {
            Object[] fila = new Object[7];
            fila[0] = empleado.getIdUsuarios();
            fila[1] = empleado.getNombre();
            fila[2] = empleado.getApellido();
            fila[3] = empleado.getDni();
            fila[4] = empleado.getCorreoElectronico();
            List<Roles> roleses = empleado.getRoles();

            String roles = roleses.stream()
                    .map(rol -> rol.getNombreRol())
                    .collect(Collectors.joining(", "));

            System.out.println("los roles son" + roles);

            fila[5] = roles;

            fila[6] = empleado.getEstado();

            System.out.println(empleado.getApellido());
            model.addRow(fila);  // Agrega la fila al modelo de tabla
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelEmpleadoAdm.btnBuscarEmpleado) {
            System.out.println("se esta buscando el empleado espera");
        }

        if (e.getSource() == panelEmpleadoAdm.btnAceptarEm) {
            Empleado datos = panelEmpleadoAdm.getDatosEmpleado();

            Optional<Empleado> emExist = findByDni(datos.getDni());

            if (emExist.isPresent()) {
                Empleado newEmpleado = emExist.get();
                newEmpleado.setCorreoElectronico(datos.getCorreoElectronico());

                updateEmpleado(newEmpleado);
                cargarDatos();
            } else {
                saveEmpleado(datos);
            }

            cargarDatos();
        }
    }

    private void agregarListeners() {
        panelEmpleadoAdm.btnBuscarEmpleado.addActionListener(this);
        panelEmpleadoAdm.btnAceptarEm.addActionListener(this);
        panelEmpleadoAdm.btnBuscarReniecEm.addActionListener(this);
        panelEmpleadoAdm.btnCancelarEm.addActionListener(this);

    }

    private void saveEmpleado(Empleado empleado) {

        empleado.setEstado("ACTIVO");

        empleadoImpl.saveEmpleado(empleado);
    }
    
    
     private void updateEmpleado(Empleado empleado) {

        

        empleadoImpl.updateEmpleado(empleado);
    }

    private Optional<Empleado> findByDni(String dni) {
        Optional<Empleado> empleadoOp = empleadoImpl.findEmpleadoByDni(dni);

        return empleadoImpl.findEmpleadoByDni(dni);
    }
}
