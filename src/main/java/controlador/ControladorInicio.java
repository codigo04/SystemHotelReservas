/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import modelo.dao.impl.ClienteImpl;
import modelo.dao.impl.HabitacionImpl;

import modelo.dao.impl.PagoImpl;
import modelo.dao.impl.ReservaImpl;
import modelo.entity.Cliente;
import modelo.entity.Empleado;
import modelo.entity.Habitacion;
import modelo.entity.Reserva;
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

    private static PanelInicioAdm panelInicioAdm;
    //CRISTIAN panel
    private static PanelInicio panelInicio;

    private PagoImpl pagoImpl;
    private ClienteImpl clienteImpl;
    private ReservaImpl reservaImpl;
    private HabitacionImpl habitacionImpl;

    public ControladorInicio(PanelInicioAdm panelInicioAdm, PanelInicio panelInicio) {
        this.panelInicioAdm = panelInicioAdm;
        this.panelInicio = panelInicio;
        pagoImpl = new PagoImpl();
        clienteImpl = new ClienteImpl();
        reservaImpl = new ReservaImpl();
        habitacionImpl = new HabitacionImpl();
        panelInicio.txtHuespedesActuales.setText("" + calcularHuespedesActuales());
        panelInicio.txtHabitacionesDis.setText("" + calcalularHabitacionsDisponibles());

        cargarDasborad();

    }

    public void actionPerformed(ActionEvent e) {

    }

    public static void cargarEmpleado() {
        Optional<Empleado> emLo = ControladorLogin.authUserLogin();
        if (emLo.isPresent()) {
            Empleado empleado = emLo.get();
            String nombreCompleto = empleado.getNombre() + " " + empleado.getApellido();

            for (Roles roles : empleado.getRoles()) {

                if (roles.getNombreRol().equals("ADMIN")) {
                    panelInicioAdm.txtNombreAdmin.setText(nombreCompleto);
                } else if (roles.getNombreRol().equals("RECEPCIONISTA")) {
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

    public int calcularHuespedesActuales() {
        List<Reserva> reservas = reservaImpl.getAllReservas();
        int totalHuespedes = 0;
        LocalDate hoy = LocalDate.now();  // Fecha actual

        for (Reserva reserva : reservas) {
            LocalDate fechaLlegada = convertirTimestampALocalDate(reserva.getFechaLLegada());
            LocalDate fechaFin = convertirTimestampALocalDate(reserva.getFechaFin());

            System.out.println("fechaLlegada " + fechaLlegada);
            System.out.println("fechaFin " + fechaFin);
            System.out.println("hoy " + hoy);
            System.out.println("hoy " + reserva.getNumeroHuespedes());
            // Verifica si la reserva está activa y si la fecha actual está dentro del rango
            if (reserva.getEstado().equals("ACTIVA") && !hoy.isBefore(fechaLlegada) && !hoy.isAfter(fechaFin)) {
                totalHuespedes += reserva.getNumeroHuespedes();  // Suma el número de huéspedes
            }
        }
        return totalHuespedes;
    }

    private LocalDate convertirTimestampALocalDate(Timestamp timestamp) {
        // Convierte Timestamp (con fecha y hora) a LocalDate (solo fecha)
        return timestamp.toLocalDateTime().toLocalDate();
    }

    public int calcalularHabitacionsDisponibles() {
        List<Habitacion> habitaciones = habitacionImpl.getAllHabitaciones();
        int totalHabitaciones = 0;

        for (Habitacion habitacion : habitaciones) {

            // Verifica si la reserva está activa y si la fecha actual está dentro del rango
            if (habitacion.getEstado().equals("DISPONIBLE")) {
                totalHabitaciones++;  // Suma el número de huéspedes
            }
        }
        return totalHabitaciones;
    }

    public void cargarReservas() {
        panelInicioAdm.jlbReservasNuevas.setText("" + reservaImpl.getAllReservas().size());
    }
}
