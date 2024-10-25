/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;
import modelo.dao.impl.EmpleadoImpl;
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

    private Login vistaLogin;
    private EmpleadoImpl empleadoImpl;
    private ControladorPrincipal controladorCliente;
    public static Empleado eLoged;

    public ControladorLogin() {
        empleadoImpl = new EmpleadoImpl();
        vistaLogin = new Login();
        controladorCliente = new ControladorPrincipal(new JfrmAdministradorPrueba(), new JfrmEmpleado());
        vistaLogin.btnIniciarSesion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaLogin.btnIniciarSesion) {

            char[] passwordChars = vistaLogin.txtpassword.getPassword();
            String password = new String(passwordChars);

            String contraseña = String.valueOf(vistaLogin.txtpassword.getPassword());

            System.out.println(contraseña);

            Optional<Empleado> empleadoExist = empleadoImpl.authenticateEmpleado(vistaLogin.txtUsuario.getText(), contraseña);

            if (empleadoExist.isPresent()) {
                Empleado emplLoged = empleadoExist.get();

                eLoged = emplLoged;

                for (Roles roles : emplLoged.getRoles()) {

                    System.out.println(roles.getNombreRol());

                    if ("ADMIN".equals(roles.getNombreRol())) {
                        System.out.println("entroo");
                        controladorCliente.iniciarPanelAdministrador();
                        vistaLogin.setVisible(false);
                    } else {
                        controladorCliente.iniciarPanelEmpleado();
                        vistaLogin.setVisible(false);
                    }
                }

            }

        } else {
            System.out.println("no hay datos");
        }

    }

    public void correrLogin() {

        vistaLogin.setVisible(true);
    }

    public static Optional<Empleado> authUserLogin() {
        return Optional.of(eLoged);
    }

}
