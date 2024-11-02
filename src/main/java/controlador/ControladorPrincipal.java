package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.usuario;

import modelo.dao.impl.ClienteImpl;
import modelo.entity.Cliente;
import vista.Administrador.JfrmAdministradorPrueba;
import vista.Administrador.paneles.PanelEmpleadoAdm;
import vista.Empleado.JfrmEmpleado;

public class ControladorPrincipal implements ActionListener {

    private JfrmAdministradorPrueba administradorPrueba;
    private JfrmEmpleado vistaEmpleado;
    private ControladorEmpleado ctrEmpleado;
    private ControladorRoles controladorRoles;
    private ControladorHabitaciones controladorHabitaciones;
    private ControladorTipoHabitaciones controladorTipoHabitaciones;
    private ControladorPerfil controladorPerfil;
    private ControladorReservas controladorReservas;
    private ControladorInicio controladorInicio;
    private ControladorClientes controladorClientes;

    public ControladorPrincipal(JfrmAdministradorPrueba administradorPrueba, JfrmEmpleado vistaEmpleado) {
        this.administradorPrueba = administradorPrueba;
        this.vistaEmpleado = vistaEmpleado;

        // Configurar eventos
        administradorPrueba.bntEmpleado.addActionListener(this);
        administradorPrueba.btnPerfil.addActionListener(this);
        administradorPrueba.btnSalir.addActionListener(this);
        // Inicializar controladores
        ctrEmpleado = new ControladorEmpleado(administradorPrueba.panelEmpleadoAdm);
        controladorRoles = new ControladorRoles(administradorPrueba.panelEmpleadoAdm);
        controladorHabitaciones = new ControladorHabitaciones(administradorPrueba.panelHabitacionesAdm, vistaEmpleado.panelRecervaHabitaciones);
        controladorTipoHabitaciones = new ControladorTipoHabitaciones(administradorPrueba.panelTipoHabitacionesAdm);
        controladorPerfil = new ControladorPerfil(administradorPrueba.panelPerfilAdm);
        controladorReservas = new ControladorReservas(administradorPrueba.panelRecervasAdm, vistaEmpleado.panelRecervaHabitaciones);
        controladorInicio = new ControladorInicio(administradorPrueba.panelInicio);
        controladorClientes = new ControladorClientes(administradorPrueba.panelClientesAdm);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == administradorPrueba.bntEmpleado) {

        }

        if (e.getSource() == administradorPrueba.btnPerfil) {

            controladorPerfil.cargarDatosPerfil();
        }

        if (e.getSource() == administradorPrueba.btnSalir) {
            ControladorLogin controladorLogin = new ControladorLogin();
            controladorLogin.correrLogin();
              administradorPrueba.setVisible(false);
        }
    }

    public void iniciarPanelAdministrador() {
        if (administradorPrueba == null) {
            administradorPrueba = new JfrmAdministradorPrueba();
        }
        administradorPrueba.setVisible(true);
    }

    public void iniciarPanelEmpleado() {
        if (vistaEmpleado == null) {
            vistaEmpleado = new JfrmEmpleado();
        }
        vistaEmpleado.setVisible(true);
    }

}
