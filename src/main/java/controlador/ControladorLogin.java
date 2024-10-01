/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Login;

/**
 *
 * @author FranDev
 */
public class ControladorLogin  implements ActionListener{
    
    
    
    private Login vistaLogin;
      
    public ControladorLogin() {
       
      
    }
    
    public void correrLogin(){
         vistaLogin = new Login();
         vistaLogin.setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
