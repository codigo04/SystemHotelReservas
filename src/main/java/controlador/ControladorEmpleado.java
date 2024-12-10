/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import aggregates.Servicios.apis.EmpleadoService;
import aggregates.request.PersonaRequest;
import aggregates.response.ResponceReniec;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

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
    public EmpleadoService clienteReniec;

    public ControladorEmpleado(PanelEmpleadoAdm panelEmpleadoAdm) {
        this.panelEmpleadoAdm = panelEmpleadoAdm;
        clienteReniec = new EmpleadoService();
        agregarListeners();

        cargarDatos();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        PersonaRequest personaRequest = new PersonaRequest();

        if (e.getSource() == panelEmpleadoAdm.btnBuscarReniecEm) {
            System.out.println("se esta buscando el empleado espera");

            if (panelEmpleadoAdm.validarDniEmpleado()) {
                try {
                    bucarPersona();
                } catch (IOException ex) {
                    Logger.getLogger(ControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        if (e.getSource() == panelEmpleadoAdm.btnAceptarGuardarEm) {

            System.out.println("Procesando datos del empleado...");

            if (panelEmpleadoAdm.validarCamposSave()) {

                // Obtener datos del formulario
                Empleado datos = panelEmpleadoAdm.getDatosEmpleado();

                if (saveEmpleado(datos)) {
                    panelEmpleadoAdm.desbloquear(panelEmpleadoAdm.jpanelContenidoEm);

                    panelEmpleadoAdm.Panel_RegistroEmpleados.setVisible(false);

                    panelEmpleadoAdm.desbloquearTablaEmpleados();
                    JOptionPane.showMessageDialog(null, "Empleado agregado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    cargarDatos();
                }

            }

        }

        if (e.getSource() == panelEmpleadoAdm.btnEditarEmpleado) {

            String dniEmpleado = panelEmpleadoAdm.extraerDni();

            if (dniEmpleado != null && !dniEmpleado.isEmpty()) {
                Optional<Empleado> empleadoExistnte = findByDni(dniEmpleado);

                if (empleadoExistnte.isPresent()) {
                    cargarDatosEditar(empleadoExistnte.get());
                } else {
                    JOptionPane.showMessageDialog(null, "El empleado con DNI " + dniEmpleado + " no existe.", "Información", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        }

        if (e.getSource() == panelEmpleadoAdm.btnAceptarEditarEm) {
            Empleado datosEdit = panelEmpleadoAdm.getDatosEmpleadoEdit();
            System.out.println("Empleado encontrado, actualizando...");
            if (panelEmpleadoAdm.validarCamposUpdate()) {
                updateEmpleado(datosEdit);
                panelEmpleadoAdm.Panel_EditEmpleados.setVisible(false);
                panelEmpleadoAdm.desbloquear(panelEmpleadoAdm.jpanelContenidoEm);
                panelEmpleadoAdm.desbloquearTablaEmpleados();
            }

        }
    }

    public void cargarDatosEditar(Empleado empleado) {
        panelEmpleadoAdm.txtDniEditEm.setText(empleado.getDni());
        panelEmpleadoAdm.txtNombreEditEm.setText(empleado.getNombre());
        panelEmpleadoAdm.txtApellidoEditEm.setText(empleado.getApellido());
        panelEmpleadoAdm.txtTelefonoEditEm.setText(empleado.getTelefono());
        panelEmpleadoAdm.txtDireccionEditEm.setText(empleado.getDireccion());
        panelEmpleadoAdm.txtCorreoEditEm.setText(empleado.getCorreoElectronico());
        panelEmpleadoAdm.txtPasswordEditEm.setText(empleado.getPassword());
    }

    private boolean saveEmpleado(Empleado empleado) {

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
            return false;
        } else {
            empleadoImpl.saveEmpleado(empleado);
            return true;
        }

    }

    private void updateEmpleado(Empleado empleado) {

        Optional<Empleado> emplExist = findByDni(empleado.getDni());

        if (emplExist.isPresent()) {
            Empleado newEm = emplExist.get();

            // Actualizar los datos básicos
            newEm.setNombre(empleado.getNombre());
            newEm.setApellido(empleado.getApellido());
            newEm.setTelefono(empleado.getTelefono());
            newEm.setDireccion(empleado.getDireccion());
            newEm.setCorreoElectronico(empleado.getCorreoElectronico());
            newEm.setPassword(empleado.getPassword());

            if (panelEmpleadoAdm.validarSelectEstadoEmpleado()) {
                newEm.setEstado(empleado.getEstado());
            }

            if (panelEmpleadoAdm.validarSelectPuesto()) {
                // Manejo de roles
                List<Roles> assignedRoles = new ArrayList<>();
                for (Roles role : empleado.getRoles()) {
                    Roles rolExist = rolesImpl.findRoleByName(role.getNombreRol());

                    if (rolExist != null) {
                        assignedRoles.add(rolExist);
                    } else {
                        System.out.println("El rol " + role.getNombreRol() + " ya existe.");
                        //ssignedRoles.add(rolExist);
                    }
                }
                newEm.setRoles(assignedRoles);
            }

            // Asignar los roles actualizados al empleado
            empleadoImpl.updateEmpleado(newEm);  // Actualizar empleado en la base de datos
            JOptionPane.showMessageDialog(null, "La actualización se realizó con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            cargarDatos();
        } else {
            System.out.println("El empleado con DNI " + empleado.getDni() + " no existe.");
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

    public void bucarPersona() throws IOException {

        PersonaRequest personaRequest = new PersonaRequest();

        personaRequest.setDni(panelEmpleadoAdm.txtDniEm.getText());

        ResponceReniec responceReniec = clienteReniec.getEntityRetrofit(personaRequest);

        if (responceReniec != null) {
            panelEmpleadoAdm.txtNombreEm.setText(responceReniec.getNombres());
            panelEmpleadoAdm.txtApellidoEm.setText(responceReniec.getApellidoPaterno() + " " + responceReniec.getApellidoMaterno());

        } else {
            JOptionPane.showMessageDialog(null, "Persona no encontrada en RENIEC. Intente nuevamente", "Información", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    private void agregarListeners() {
        panelEmpleadoAdm.btnBuscarEmpleado.addActionListener(this);
        panelEmpleadoAdm.btnAceptarGuardarEm.addActionListener(this);
        panelEmpleadoAdm.btnBuscarReniecEm.addActionListener(this);
        panelEmpleadoAdm.btnCancelarEm.addActionListener(this);
        panelEmpleadoAdm.btnAceptarEditarEm.addActionListener(this);
        panelEmpleadoAdm.btnCancelarEditEm.addActionListener(this);
        panelEmpleadoAdm.btnEditarEmpleado.addActionListener(this);

    }

}
