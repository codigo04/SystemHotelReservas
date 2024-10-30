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

    public ControladorPrincipal(JfrmAdministradorPrueba administradorPrueba, JfrmEmpleado vistaEmpleado) {
        this.administradorPrueba = administradorPrueba;
        this.vistaEmpleado = vistaEmpleado;

        // Configurar eventos
        administradorPrueba.bntEmpleado.addActionListener(this);
        administradorPrueba.btnPerfil.addActionListener(this);
        // Inicializar controladores
        ctrEmpleado = new ControladorEmpleado(administradorPrueba.panelEmpleadoAdm);
        controladorRoles = new ControladorRoles(administradorPrueba.panelEmpleadoAdm);
        controladorHabitaciones = new ControladorHabitaciones(administradorPrueba.panelHabitacionesAdm);
        controladorTipoHabitaciones = new ControladorTipoHabitaciones(administradorPrueba.panelTipoHabitacionesAdm);
        controladorPerfil = new ControladorPerfil(administradorPrueba.panelPerfilAdm);
        controladorReservas = new ControladorReservas(administradorPrueba.panelRecervasAdm);
        controladorInicio = new ControladorInicio(administradorPrueba.panelInicio);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == administradorPrueba.bntEmpleado) {

        }

        if (e.getSource() == administradorPrueba.btnPerfil) {

            controladorPerfil.cargarDatosPerfil();
        }
    }

    // Otros métodos necesarios según la lógica de tu aplicación
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
