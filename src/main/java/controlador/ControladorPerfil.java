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
import vista.Administrador.paneles.PanelPerfilAdm;

/**
 *
 * @author FranDev
 */
public class ControladorPerfil implements ActionListener {
    
    private PanelPerfilAdm panelPerfilAdm;
    private EmpleadoImpl empleadoImplw;
    
    ControladorPerfil(PanelPerfilAdm panelPerfilAdm) {
        this.panelPerfilAdm = panelPerfilAdm;
        empleadoImplw = new EmpleadoImpl();
        this.panelPerfilAdm.btnEditarPerfil.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()== panelPerfilAdm.btnEditarPerfil) {
            
        }
    }
    
    public void cargarUser() {
        Optional<Empleado> emLo = ControladorLogin.authUserLogin();
        if (emLo.isPresent()) {
            panelPerfilAdm.txtUsuarioLoged.setText(emLo.get().getNombre() + " " + emLo.get().getApellido());
        }
        
    }
    
}
