/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.dao.impl.ClienteImpl;
import modelo.entity.Cliente;
import vista.Empleado.paneles.PanelClientesAdm;

/**
 *
 * @author FranDev
 */
public class ControladorClientes implements ActionListener {

    public PanelClientesAdm panelClientesAdm;
    private ClienteImpl clienteImpl;

    public ControladorClientes(PanelClientesAdm panelClientesAdm) {
        this.panelClientesAdm = panelClientesAdm;
        clienteImpl = new ClienteImpl();
        cargarDatos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void cargarDatos() {
        System.out.println("hola siii entro");
        List<Cliente> clientes = clienteImpl.getAllClientes();

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = panelClientesAdm.modTablaClientes;
        model.setRowCount(0);  // Limpiar filas anteriores

        // Rellenar la tabla con los datos de los empleados
        for (Cliente cliente : clientes) {
            Object[] fila = new Object[6];
            fila[0] = cliente.getIdCliente();
            fila[1] = cliente.getNombre();
            fila[2] = cliente.getApellido();
            fila[3] = cliente.getDni();
            fila[4] = cliente.getCorreoElectronico();
            fila[5] = cliente.getCelular();
            
            model.addRow(fila);  // Agrega la fila al modelo de tabla
        }
    }

}
