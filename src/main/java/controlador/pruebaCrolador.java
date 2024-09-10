/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.dao.crud;

import modelo.dao.impl.CrudImpl;
import org.springframework.beans.factory.annotation.Autowired;
import vista.usuario;

/**
 *
 * @author Francisco
 */
public class pruebaCrolador implements ActionListener {

    CrudImpl crudR = new CrudImpl();

    private usuario frm;

    public pruebaCrolador(usuario frm) {
        this.frm = frm;
        frm.clickbtn.addActionListener(this);
        frm.setVisible(true);
    }

  
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.clickbtn) {
            frm.clickbtn.setText("nuevo");
            frm.textoPrueba.setText("funcionando");
            crudR.crear();
        }
    }


}
