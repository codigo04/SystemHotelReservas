/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;
import java.util.stream.Collectors;
import modelo.dao.impl.EmpleadoImpl;
import modelo.entity.Empleado;
import vista.Administrador.paneles.PanelPerfilAdm;

/**
 *
 * @author FranDev
 */
public class ControladorPerfil implements ActionListener {

    private PanelPerfilAdm panelPerfilAdm;
    private EmpleadoImpl empleadoImpl;

    ControladorPerfil(PanelPerfilAdm panelPerfilAdm) {
        this.panelPerfilAdm = panelPerfilAdm;
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
    }

    public void cargarDatosPerfil() {

        Optional<Empleado> emLo = ControladorLogin.authUserLogin();
        if (emLo.isPresent()) {
            panelPerfilAdm.txtNombreUsLoged.setText(emLo.get().getNombre());
            panelPerfilAdm.txtApellidoUsLoged.setText(emLo.get().getApellido());
            panelPerfilAdm.txtDireccionUsPerfil.setText(emLo.get().getDireccion());
            panelPerfilAdm.txtTelefonoUsPerfil.setText(emLo.get().getTelefono());
            panelPerfilAdm.txtCorreoUsPerfil.setText(emLo.get().getCorreoElectronico());
            panelPerfilAdm.txtPasswordEmpleadoUsPerfil.setText(emLo.get().getPassword());
            String rolesConcatenados = emLo.get().getRoles().stream()
                    .map(rol -> rol.getNombreRol())
                    .collect(Collectors.joining(", "));

            panelPerfilAdm.txtRolEmpleadoUsPerfil.setText(rolesConcatenados);

        }
        // panelPerfilAdm.txtEmailPerfil.setText(emLo.get().getCorreoElectronico());
    }

    public void updateEmpleadoUsPerfil() {
        Empleado datosEm = panelPerfilAdm.datosUpdateEmpleadoPerfil();
        Optional<Empleado> emLo = ControladorLogin.authUserLogin();

        if (emLo.isPresent()) {
            Empleado updateEm = emLo.get();

            updateEm.setNombre(datosEm.getNombre());
            updateEm.setApellido(datosEm.getApellido());
            updateEm.setCorreoElectronico(datosEm.getCorreoElectronico());
            updateEm.setTelefono(datosEm.getTelefono());
            updateEm.setDireccion(datosEm.getDireccion());
            updateEm.setPassword(datosEm.getPassword());

            empleadoImpl.updateEmpleado(updateEm);

        }

    }

    public void agregarListeners() {
        this.panelPerfilAdm.btnEditarPerfil.addActionListener(this);
        this.panelPerfilAdm.btnAceptarEditHabitacion.addActionListener(this);
        this.panelPerfilAdm.btnCancelarEditHabitacion.addActionListener(this);
    }

}
