/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import aggregates.Servicios.EmailService.EmailService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import modelo.dao.impl.EmpleadoImpl;
import modelo.dao.impl.RolesImpl;
import modelo.entity.Empleado;
import modelo.entity.Roles;
import vista.Administrador.JfrmAdministradorPrueba;
import vista.Empleado.JfrmEmpleado;
import vista.Login;

/**
 *
 * @author FranDev
 */
public class ControladorLogin implements ActionListener {

    //vista
    private Login vistaLogin;

    //modelo
    private EmpleadoImpl empleadoImpl;
    private RolesImpl rolesImpl;
    private ControladorPrincipal controladorCliente;
    private EmailService emailService;
    public static Optional<Empleado> eLoged;
    String numeroGenerado = null;

    public ControladorLogin() {
        empleadoImpl = new EmpleadoImpl();
        vistaLogin = new Login();
        rolesImpl = new RolesImpl();
        emailService = new EmailService();
        controladorCliente = new ControladorPrincipal(new JfrmAdministradorPrueba(), new JfrmEmpleado());
        vistaLogin.btnIniciarSesion.addActionListener(this);
        vistaLogin.btnVerificarCodigo.addActionListener(this);
        //crearRoles();
        crearPrimerUser();
    }

    //detecta las acciones
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaLogin.btnIniciarSesion) {

            // char[] passwordChars = vistaLogin.txtpassword.getPassword();
            // String password = new String(passwordChars);
            //jalamos usuario de vista
            String usuario = vistaLogin.txtUsuario.getText();
            //jalamos contraseña de vista
            String contraseña = String.valueOf(vistaLogin.txtpassword.getPassword());

            System.out.println(contraseña);

            //comunicacion con el modelo
            Optional<Empleado> empleadoExist = empleadoImpl.authenticateEmpleado(usuario, contraseña);

            if (empleadoExist.isPresent()) {
                System.out.println("entroo login");
                Empleado emplLoged = empleadoExist.get();

                econderComponentes();
                
                //guardar el usuari logeado
                eLoged = Optional.of(emplLoged);

                for (Roles roles : emplLoged.getRoles()) {

                    System.out.println(roles.getNombreRol());

                    if ("ADMIN".equals(roles.getNombreRol())) {
                        vistaLogin.panelAutenticacion.setVisible(true);
                        try {
                            mandarToken(emplLoged);
                        } catch (MessagingException ex) {
                            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else if ("RECEPCIONISTA".equals(roles.getNombreRol())) {
                        controladorCliente.iniciarPanelEmpleado();
                        controladorCliente.getControladorPerfil().cargarDatosPerfil();
                        ControladorInicio.cargarEmpleado();
                        vistaLogin.setVisible(false);
                    }
                }

            }

        } else {
            
            System.out.println("no hay datos");
        }

        if (e.getSource() == vistaLogin.btnVerificarCodigo) {

            String codigoIngresado = vistaLogin.txtCodigoVerificacion.getText();
            boolean leged = validarToken(codigoIngresado);

            if (leged) {
                controladorCliente.iniciarPanelAdministrador();
                 ControladorInicio.cargarEmpleado();
                vistaLogin.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "CODIGO INCORRECTO", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public void correrLogin() {

        vistaLogin.setVisible(true);
    }

    public static Optional<Empleado> authUserLogin() {

        if (eLoged == null) {
            return Optional.empty();
        } else {
            return Optional.of(eLoged).get();
        }

    }

    public void crearRoles() {

        if (rolesImpl.findRoleByName("ADMIN") == null || rolesImpl.findRoleByName("RECEPCIONISTA") == null) {
            Roles admin = new Roles();
            admin.setNombreRol("ADMIN");

            Roles recepcionista = new Roles();
            recepcionista.setNombreRol("RECEPCIONISTA");

            rolesImpl.saveRole(admin);
            rolesImpl.saveRole(recepcionista);
        }

    }

    public void crearPrimerUser() {
        Optional<Empleado> empleadoExist = empleadoImpl.authenticateEmpleado("cristianjosephav@gmail.com", "admin");

        if (!empleadoExist.isPresent()) {
            Empleado empleado = new Empleado();
            empleado.setCorreoElectronico("cristianjosephav@gmail.com");
            empleado.setNombre("Cristian");
            empleado.setApellido("Acuña");
            empleado.setPassword("admin");
            empleado.setDni("123456789");
            empleado.setDireccion("sin calle");
            empleado.setEstado("ACTIVO");

            // Verificar y crear el rol "ADMIN" si no existe
            Roles rolAdmin = rolesImpl.findRoleByName("ADMIN");
            if (rolAdmin == null) {
                rolAdmin = new Roles();
                rolAdmin.setNombreRol("ADMIN");
                rolesImpl.saveRole(rolAdmin);
                System.out.println("Rol 'ADMIN' creado.");
            } else {
                System.out.println("Rol 'ADMIN' ya existe.");
            }

            /* Verificar y crear el rol "RECEPCIONISTA" si no existe
            Roles rolRecepcionista = rolesImpl.findRoleByName("RECEPCIONISTA");
            if (rolRecepcionista == null) {
                rolRecepcionista = new Roles();
                rolRecepcionista.setNombreRol("RECEPCIONISTA");
                rolesImpl.saveRole(rolRecepcionista);
                System.out.println("Rol 'RECEPCIONISTA' creado.");
            } else {
                System.out.println("Rol 'RECEPCIONISTA' ya existe.");
            }
           
            
            // Asignar ambos roles al empleado
            
            assignedRoles.add(rolRecepcionista);
            
             */
            List<Roles> assignedRoles = new ArrayList<>();
            assignedRoles.add(rolAdmin);
            empleado.setRoles(assignedRoles);

            // Guardar el empleado en la base de datos
            empleadoImpl.saveEmpleado(empleado);
        }
    }

    private int generarNumeroAleatorio6Digitos() {
        int numero = (int) (Math.random() * 900000) + 100000;
        return numero;
    }

    private void mandarToken(Empleado empleado) throws MessagingException {
        numeroGenerado = String.valueOf(generarNumeroAleatorio6Digitos());

        emailService.sendVerificationCode(empleado.getCorreoElectronico(), numeroGenerado);
    }

    private boolean validarToken(String token) {

        if (token == null ? numeroGenerado == null : token.equals(numeroGenerado)) {
            return true;
        }

        return false;
    }

    private void econderComponentes() {
        vistaLogin.txtUsuario.setVisible(false);
        vistaLogin.txtpassword.setVisible(false);
        vistaLogin.btnIniciarSesion.setVisible(false);
    }

}
