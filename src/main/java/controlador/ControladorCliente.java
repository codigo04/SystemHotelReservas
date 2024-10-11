package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.usuario;

import modelo.dao.impl.ClienteImpl;
import modelo.entity.Cliente;
import vista.Administrador.JfrmAdministradorPrueba;
import vista.Administrador.paneles.PanelEmpleadoAdm;

public class ControladorCliente implements ActionListener {
    

    ClienteImpl cliente = new ClienteImpl();
    ControladorLogin con = new ControladorLogin();

    private JfrmAdministradorPrueba administradorPrueba;
    ControladorEmpleado ctrEmpleado ; 
    
    private usuario frm;

    public ControladorCliente(JfrmAdministradorPrueba administradorPrueba) {
        this.administradorPrueba = administradorPrueba;

        // this.frm = frm;
        // frm.clickbtn.addActionListener(this);
        administradorPrueba.bntEmpleado.addActionListener(this);
        
        ctrEmpleado = new ControladorEmpleado(administradorPrueba.panelEmpleadoAdm);
        //ctrEmpleado.cargarDatos();
        // frm.setVisible(true);
    }

    public void inciarPanelEmpleado() {
        administradorPrueba = new JfrmAdministradorPrueba();
        administradorPrueba.setVisible(true);

    }

    
    
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == administradorPrueba.bntEmpleado) {

            System.out.println("se hizo cliks");

            //cona.iniciarPanelEmpleado();
            // cona.cargarDatos();
        }
    }
}
