/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JComboBox;
import modelo.dao.impl.EmpleadoImpl;
import modelo.dao.impl.RolesImpl;
import vista.Administrador.paneles.PanelEmpleadoAdm;

/**
 *
 * @author FranDev
 */
public class ControladorRoles {

    public PanelEmpleadoAdm panelEmpleadoAdm;

    public EmpleadoImpl empleadoImpl = new EmpleadoImpl();
    public RolesImpl rolesImpl = new RolesImpl();

    public ControladorRoles(PanelEmpleadoAdm panelEmpleadoAdm) {
        this.panelEmpleadoAdm = panelEmpleadoAdm;
        cargarRoles();
        cargarEstados();
    }

    public void cargarRoles() {

        JComboBox<String> roles = panelEmpleadoAdm.cboxRoles;

        String[] puestos = {"ADMIN", "RECEPCIONISTA"};

        for (String puesto : puestos) {
            roles.addItem(puesto);
        }

    }


    public void cargarEstados() {

        /* 
        JComboBox<String> roles = panelEmpleadoAdm.cboxEstado;

        String[] estados = {"ACTIVO", "INACTIVO"};

        for (String esta : estados) {
            roles.addItem(esta);
        }
*/
    }
}
