/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import modelo.dao.impl.EmpleadoImpl;
import modelo.dao.impl.PagoImpl;
import modelo.entity.Empleado;
import modelo.entity.Roles;
import vista.Administrador.paneles.PanelPerfilAdm;
import vista.Empleado.paneles.PanelPerfil;

/**
 *
 * @author FranDev
 */
public class ControladorPerfil implements ActionListener {

    private PanelPerfilAdm panelPerfilAdm;
    private PanelPerfil panelPerfil; //RECEPCIONISTA
    private EmpleadoImpl empleadoImpl;

    ControladorPerfil(PanelPerfilAdm panelPerfilAdm, PanelPerfil panelPerfil) {
        this.panelPerfilAdm = panelPerfilAdm;
        this.panelPerfil = panelPerfil;
        empleadoImpl = new EmpleadoImpl();
        agregarListeners();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == panelPerfilAdm.btnEditarPerfil) {

        }

        if (e.getSource() == panelPerfilAdm.btnAceptarEditHabitacion) {
            updateEmpleadoUsPerfil();
            cargarDatosPerfil();
        }

//        RECEPCIONISTA
        if (e.getSource() == panelPerfil.btnAceptarCambiarPasswordEm) {
            updateEmpleadoUsPerfil();
            //cargarDatosPerfil();
        }
    }

    public void cargarDatosPerfil() {

        Optional<Empleado> emLo = ControladorLogin.authUserLogin();
        if (emLo.isPresent()) {

            Empleado empleado = emLo.get();
            String rolesConcatenados = empleado.getRoles().stream()
                    .map(Roles::getNombreRol)
                    .collect(Collectors.joining(", "));

            for (Roles roles : empleado.getRoles()) {
                if ("ADMIN".equals(roles.getNombreRol())) {
                    panelPerfilAdm.txtNombreUsLoged.setText(emLo.get().getNombre());
                    panelPerfilAdm.txtApellidoUsLoged.setText(emLo.get().getApellido());
                    panelPerfilAdm.txtDireccionUsPerfil.setText(emLo.get().getDireccion());
                    panelPerfilAdm.txtTelefonoUsPerfil.setText(emLo.get().getTelefono());
                    panelPerfilAdm.txtCorreoUsPerfil.setText(emLo.get().getCorreoElectronico());
                    panelPerfilAdm.txtPasswordEmpleadoUsPerfil.setText(emLo.get().getPassword());
                    panelPerfilAdm.txtRolEmpleadoUsPerfil.setText(rolesConcatenados);
                } else if ("RECEPCIONISTA".equals(roles.getNombreRol())) {
                    panelPerfil.TXTNombre.setText(emLo.get().getNombre());
                    panelPerfil.TXTApellido.setText(emLo.get().getApellido());
                    panelPerfil.TXTCorreo.setText(emLo.get().getCorreoElectronico());
                    panelPerfil.TXTTelefono.setText(emLo.get().getTelefono());
                    panelPerfil.TXTDireccion.setText(emLo.get().getDireccion());
                    panelPerfil.TXTRol.setText(rolesConcatenados);
                }
            }
        }
        // panelPerfilAdm.txtEmailPerfil.setText(emLo.get().getCorreoElectronico());
    }

    public void updateEmpleadoUsPerfil() {
        Empleado datosEm = panelPerfilAdm.datosUpdateEmpleadoPerfil();
        Empleado datosEmRecep = panelPerfil.datosUpdateEmpleadoPerfil();
        Optional<Empleado> emLo = ControladorLogin.authUserLogin();

        if (emLo.isPresent()) {
            Empleado updateEm = emLo.get();

            if (updateEm.getRoles().stream().anyMatch(role -> "ADMIN".equals(role.getNombreRol()))) {
                updateEm.setNombre(datosEm.getNombre());
                updateEm.setApellido(datosEm.getApellido());
                updateEm.setCorreoElectronico(datosEm.getCorreoElectronico());
                updateEm.setTelefono(datosEm.getTelefono());
                updateEm.setDireccion(datosEm.getDireccion());
                updateEm.setPassword(datosEm.getPassword());
            }

            if (updateEm.getRoles().stream().anyMatch(role -> "RECEPCIONISTA".equals(role.getNombreRol()))) {
                //updateEm.setNombre(datosEmRecep.getNombre());
                // updateEm.setApellido(datosEmRecep.getApellido());
                //  updateEm.setCorreoElectronico(datosEmRecep.getCorreoElectronico());
                // updateEm.setTelefono(datosEmRecep.getTelefono());
                // updateEm.setDireccion(datosEmRecep.getDireccion());
                System.out.println(datosEmRecep.getPassword());
                System.out.println("pass");
                System.out.println(updateEm.getPassword());

                if (updateEm.getPassword().equals(datosEmRecep.getPassword())) {
                    updateEm.setPassword(panelPerfil.txtNuevoPassword.getText());
                    panelPerfil.desbloquear(panelPerfil.panelDatos);
                    panelPerfil.bloquearComponnentes();
                    panelPerfil.Panel_RegistroEmpleados.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña Actual no es válida", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
            empleadoImpl.updateEmpleado(updateEm);
        }

    }

    public void agregarListeners() {
        this.panelPerfilAdm.btnEditarPerfil.addActionListener(this);
        this.panelPerfilAdm.btnAceptarEditHabitacion.addActionListener(this);
        this.panelPerfilAdm.btnCancelarEditHabitacion.addActionListener(this);
        this.panelPerfil.btnAceptarCambiarPasswordEm.addActionListener(this);
    }

}
