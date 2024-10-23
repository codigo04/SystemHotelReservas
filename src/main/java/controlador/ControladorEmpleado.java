/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.dao.impl.EmpleadoImpl;
import modelo.dao.impl.RolesImpl;
import modelo.entity.Empleado;
import modelo.entity.Roles;
import vista.Administrador.paneles.PanelEmpleadoAdm;

/**
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

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == panelEmpleadoAdm.btnBuscarEmpleado) {
            System.out.println("se esta buscando el empleado espera");
        }

        if (e.getSource() == panelEmpleadoAdm.btnAceptarGuardarEm) {
            System.out.println("Procesando datos del empleado...");

            // Validar los campos 
            if (!panelEmpleadoAdm.validarCampos()) {
                return;
            }
            // Obtener datos del formulario
            Empleado datos = panelEmpleadoAdm.getDatosEmpleado();

            System.out.println("Empleado no encontrado, guardando nuevo...");
            saveEmpleado(datos);
            cargarDatos();

        }

        if (e.getSource() == panelEmpleadoAdm.btnAceptarEditarEm) {
            Empleado datosEdit = panelEmpleadoAdm.getDatosEmpleadoEdit();
            System.out.println("Empleado encontrado, actualizando...");

            updateEmpleado(datosEdit);
            cargarDatos();
        }
    }

    private void agregarListeners() {
        panelEmpleadoAdm.btnBuscarEmpleado.addActionListener(this);
        panelEmpleadoAdm.btnAceptarGuardarEm.addActionListener(this);
        panelEmpleadoAdm.btnBuscarReniecEm.addActionListener(this);
        panelEmpleadoAdm.btnCancelarEm.addActionListener(this);
        panelEmpleadoAdm.btnAceptarEditarEm.addActionListener(this);
        panelEmpleadoAdm.btnCancelarEditEm.addActionListener(this);
    }

    private void saveEmpleado(Empleado empleado) {

        empleado.setEstado("ACTIVO");
        // Lista para almacenar los roles asignados
        List<Roles> assginedRoles = new ArrayList<>();

        // Comprobación de los roles del empleado
        for (Roles roles : empleado.getRoles()) {
            Roles rolExist = rolesImpl.findRoleByName(roles.getNombreRol());

            if (rolExist != null) {
                System.out.println("El rol " + roles.getNombreRol() + " ya existe.");
            } else {
                System.out.println("El rol " + roles.getNombreRol() + " no existe, creando uno nuevo...");
                // Aquí podrías crear el rol si no existe.
                // rolesImpl.save(roles); // Ejemplo de cómo podrías guardar un rol nuevo
            }

            assginedRoles.add(rolExist != null ? rolExist : roles); // Si el rol no existe, añade el original
        }

        // Asignar la lista de roles al empleado
        empleado.setRoles(assginedRoles);

        Optional<Empleado> emplExist = findByDni(empleado.getDni());

        if (emplExist.isPresent()) {
            JOptionPane.showConfirmDialog(null, "EL EMPLEADO YA EXISTE", "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } else {
            empleadoImpl.saveEmpleado(empleado);
        }

    }

    private void updateEmpleado(Empleado empleado) {

        Optional<Empleado> emplExist = findByDni(empleado.getDni());

        if (emplExist.isPresent()) {
            Empleado newEm = emplExist.get();
            
            newEm.setNombre(empleado.getNombre());
            newEm.setApellido(empleado.getApellido());
            newEm.setTelefono(empleado.getTelefono());
            newEm.setDireccion(empleado.getDireccion());
            newEm.setCorreoElectronico(empleado.getCorreoElectronico());
            newEm.setPassword(empleado.getPassword());
            newEm.setEstado(empleado.getEstado());
            empleadoImpl.updateEmpleado(newEm);
        }

    }

    private Optional<Empleado> findByDni(String dni) {

        Optional<Empleado> empleadoOp = empleadoImpl.findEmpleadoByDni(dni);

        return empleadoOp;
    }

    public void cargarDatos() {
        System.out.println("hola siii entro");
        List<Empleado> empleados = empleadoImpl.getAllEmpleados();

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = panelEmpleadoAdm.modTablaEmpleados;
        model.setRowCount(0);  // Limpiar filas anteriores

        // Rellenar la tabla con los datos de los empleados
        for (Empleado empleado : empleados) {
            Object[] fila = new Object[8];
            fila[0] = empleado.getIdUsuarios();
            fila[1] = empleado.getNombre();
            fila[2] = empleado.getApellido();
            fila[3] = empleado.getDni();
            fila[4] = empleado.getCorreoElectronico();
            fila[5] = empleado.getTelefono();
            List<Roles> roleses = empleado.getRoles();

            String roles = roleses.stream()
                    .map(rol -> rol.getNombreRol())
                    .collect(Collectors.joining(", "));

            System.out.println("los roles son" + roles);

            fila[6] = roles;

            fila[7] = empleado.getEstado();

            System.out.println(empleado.getApellido());
            model.addRow(fila);  // Agrega la fila al modelo de tabla
        }
    }

}
