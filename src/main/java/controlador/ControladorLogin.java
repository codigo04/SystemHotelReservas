/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Administrador.JfrmAdministradorPrueba;
import vista.Login;

/**
 *
 * @author FranDev
 */
public class ControladorLogin implements ActionListener {

    private Login vistaLogin;

    public ControladorLogin() {
        vistaLogin = new Login();
        vistaLogin.btnLongin.addActionListener(this);
    }

    public void correrLogin() {

        vistaLogin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaLogin.btnLongin) {

            ControladorCliente controladorCliente = new ControladorCliente(new JfrmAdministradorPrueba());
            vistaLogin.setVisible(false);
        }
    }

}
