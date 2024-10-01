
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.usuario;

import modelo.dao.impl.ClienteImpl;
import modelo.entity.Cliente;

public class ControladorCliente implements ActionListener {

    ClienteImpl cliente = new ClienteImpl();
    ControladorLogin con = new ControladorLogin();
    private usuario frm;
    

    public ControladorCliente(usuario frm) {
        this.frm = frm;
        frm.clickbtn.addActionListener(this);
        frm.setVisible(true);
    }
  
    public void actionPerformed(ActionEvent e) {
        
        
        
        if (e.getSource() == frm.clickbtn) {
            con.correrLogin();
        }
    }
}
