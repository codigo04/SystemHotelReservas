/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import modelo.dao.impl.ClienteImpl;

import modelo.dao.impl.PagoImpl;
import modelo.dao.impl.ReservaImpl;
import modelo.entity.Cliente;
import modelo.entity.Empleado;
import modelo.entity.Roles;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.beans.factory.annotation.Autowired;
import vista.Administrador.paneles.PanelInicioAdm;
import vista.Empleado.paneles.PanelInicio;
import vista.usuario;

/**
 *
 * @author Francisco
 */
public class ControladorInicio implements ActionListener {

    private PanelInicioAdm panelInicioAdm;
    //CRISTIAN panel
    private PanelInicio panelInicio;
    
    private PagoImpl pagoImpl;
    private ClienteImpl clienteImpl;
    private ReservaImpl reservaImpl;

    public ControladorInicio(PanelInicioAdm panelInicioAdm, PanelInicio panelInicio) {
        this.panelInicioAdm = panelInicioAdm;
        this.panelInicio = panelInicio;
        pagoImpl = new PagoImpl();
        clienteImpl = new ClienteImpl();
        reservaImpl = new ReservaImpl();
        cargarDasborad();
    }

    public void actionPerformed(ActionEvent e) {

    }

    public void cargarEmpleado() {
        Optional<Empleado> emLo = ControladorLogin.authUserLogin();
        if (emLo.isPresent()) {
            Empleado empleado = emLo.get();
            String nombreCompleto = empleado.getNombre() + " " + empleado.getApellido();

            for (Roles roles : empleado.getRoles()) {
                if ("ADMIN".equals(roles.getNombreRol())) {
                    panelInicioAdm.txtNombreAdmin.setText(nombreCompleto);
                } else if ("RECEPCIONISTA".equals(roles.getNombreRol())) {
                    panelInicio.textEmpleado.setText(nombreCompleto);
                }
            }
        } else {
            System.out.println("No se encontró un empleado logueado.");
        }
    }

    public void cargarDasborad() {

        double totalPafo = pagoImpl.obtenerMontoTotalPagado();
        List<Cliente> clientes = clienteImpl.getAllClientes();
        panelInicioAdm.jlbIngresoTotales.setText("S/ " + totalPafo);

        panelInicioAdm.jlbClientes.setText("" + clientes.size());
        cargarGrafico();
        cargarReservas();
    }

    public void cargarGrafico() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        List<Object[]> ocupacionPorDia = reservaImpl.obtenerOcupacionPorDiaSemana();

        // Mapeo de días de la semana en inglés a español
        Map<String, String> diasSemanaMap = new HashMap<>();
        diasSemanaMap.put("Monday", "Lunes");
        diasSemanaMap.put("Tuesday", "Martes");
        diasSemanaMap.put("Wednesday", "Miércoles");
        diasSemanaMap.put("Thursday", "Jueves");
        diasSemanaMap.put("Friday", "Viernes");
        diasSemanaMap.put("Saturday", "Sábado");
        diasSemanaMap.put("Sunday", "Domingo");

        for (Object[] row : ocupacionPorDia) {
            String diaSemanaIngles = (String) row[0];

            String diaSemanaEspanol = diasSemanaMap.getOrDefault(diaSemanaIngles, diaSemanaIngles);

            Long totalReservas = ((Number) row[1]).longValue();

            dataset.addValue(totalReservas, "Ocupación", diaSemanaEspanol);

            // System.out.println("Día: " + diaSemanaEspanol + ", Total de reservas: " + totalReservas);
        }
        panelInicioAdm.graficoReportes.crearDataset(dataset);
    }

    public void cargarReservas() {
        panelInicioAdm.jlbReservasNuevas.setText("" + reservaImpl.getAllReservas().size());
    }
}
