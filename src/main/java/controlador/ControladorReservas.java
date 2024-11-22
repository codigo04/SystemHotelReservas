/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import modelo.dao.impl.ClienteImpl;
import modelo.dao.impl.EmpleadoImpl;
import modelo.dao.impl.HabitacionImpl;
import modelo.dao.impl.PagoImpl;
import modelo.dao.impl.ReservaImpl;
import modelo.dao.impl.ServicioImpl;
import modelo.dao.impl.TicketImpl;
import modelo.entity.Habitacion;
import modelo.entity.Pago;
import modelo.entity.Reserva;
import modelo.entity.Servicio;
import modelo.entity.Ticket;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.scheduling.annotation.Scheduled;

import vista.Administrador.paneles.PanelRecervasAdm;
import vista.Empleado.paneles.PanelRecervarHabitaciones;

/**
 *
 * @author FranDev
 */
public class ControladorReservas implements ActionListener {
    
    private PanelRecervasAdm panelRecervasAdm;
    
    private PanelRecervarHabitaciones panelRecervarHabitaciones;
    
    private ReservaImpl reservaImpl;
    private EmpleadoImpl empleadoImpl;
    private ClienteImpl clienteImpl;
    private HabitacionImpl habitacionImpl;
    private ServicioImpl servicioImpl;
    private PagoImpl pagoImpl;
    private  TicketImpl ticketImpl;
    List<Servicio> servicios;
    
    public ControladorReservas(PanelRecervasAdm panelRecervasAdm, PanelRecervarHabitaciones panelRecervarHabitaciones) {
        this.panelRecervasAdm = panelRecervasAdm;
        this.panelRecervarHabitaciones = panelRecervarHabitaciones;
        reservaImpl = new ReservaImpl();
        empleadoImpl = new EmpleadoImpl();
        clienteImpl = new ClienteImpl();
        habitacionImpl = new HabitacionImpl();
        servicioImpl = new ServicioImpl();
        pagoImpl = new PagoImpl();
        ticketImpl = new TicketImpl();
        agregarListeners();
        cargarRecervas();
        findServicios();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == panelRecervarHabitaciones.btnRecervar) {
            cargarServicios();
        }
        
        if (e.getSource() == panelRecervasAdm.btnExportarReporteReservas) {
            generarReportes();
        }
        
        if (e.getSource() == panelRecervarHabitaciones.btnAceptarGuardarRes) {
            crearReservaConPagoYTicket();
           //saveReserva();
            
            cargarHabitaciones();
        }
    }
    
    public void cargarRecervas() {
        
        List<Reserva> reservas = reservaImpl.getAllReservas();

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = panelRecervasAdm.modTablaReservas;
        model.setRowCount(0);  // Limpiar filas anteriores

        // Rellenar la tabla con los datos de los empleados
        for (Reserva reserva : reservas) {
            Object[] fila = new Object[7];
            fila[0] = reserva.getIdReserva();
            fila[1] = reserva.getCliente().getNombre();
            fila[2] = reserva.getHabitacion().getTipoHabitacion().getTipoHabitacion() + "  " + reserva.getHabitacion().getNumeroDeHabitacion();
            fila[3] = reserva.getFechaLLegada();
            fila[4] = reserva.getFechaFin();
            fila[5] = "POR DEFENIR";
            fila[6] = reserva.getMontoTotal();
            
            model.addRow(fila);  // Agrega la fila al modelo de tabla
        }
        
    }
    
    public void cargarServicios() {

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = panelRecervarHabitaciones.modTablaServicios;
        model.setRowCount(0);  // Limpiar filas anteriores

        // Rellenar la tabla con los datos de los empleados
        for (Servicio servicio : this.servicios) {
            Object[] fila = new Object[3];
            fila[0] = servicio.getIdServicios();
            fila[1] = servicio.getNombreServicio();
            fila[2] = servicio.getPrecio();
            
            model.addRow(fila);  // Agrega la fila al modelo de tabla
        }
        
    }
    
    public void findServicios() {
        this.servicios = servicioImpl.getAllServicios();
    }
    
    public List<Servicio> getServices() {
        List<Servicio> serv = panelRecervarHabitaciones.getServiciosReserva();
        
        List<Servicio> servExistentes = new ArrayList<>();
        
        for (Servicio servicio : serv) {
            Optional<Servicio> servExist = servicioImpl.findServicioById(servicio.getIdServicios());
            
            if (servExist.isPresent()) {
                servExistentes.add(servExist.get());
            }
        }
        
        return servExistentes;
    }
    
    public void generarReportes() {
        Workbook newLibro = new SXSSFWorkbook();
        Sheet hojaReportesReservas = newLibro.createSheet("reservas_report");
        
        List<Reserva> reservas = reservaImpl.getAllReservas();

        // Crear encabezados String[] encabezados = {"ID", "Nombre del Cliente", "Habitacion", "Check-in", "Check-out", "Estado", "Total"};
        String[] encabezados = {"ID", "Nombre del Cliente", "Habitacion", "Check-in", "Check-out", "Estado", "Total"};
        Row filaEncabezados = hojaReportesReservas.createRow(0);
        
        for (int j = 0; j < encabezados.length; j++) {
            Cell celda = filaEncabezados.createCell(j);
            celda.setCellValue(encabezados[j]);
        }

        // Agregar datos de reservas
        for (int i = 0; i < reservas.size(); i++) {
            Reserva reserva = reservas.get(i);
            Row fila = hojaReportesReservas.createRow(i + 1); // i + 1 para no sobrescribir los encabezados

            fila.createCell(0).setCellValue(reserva.getIdReserva()); // ID de la reserva
            fila.createCell(1).setCellValue(reserva.getCliente().getNombre()); // Nombre del cliente
            fila.createCell(2).setCellValue(reserva.getHabitacion().getTipoHabitacion().getTipoHabitacion() + "  " + reserva.getHabitacion().getNumeroDeHabitacion()); // Fecha de reserva
            fila.createCell(3).setCellValue(reserva.getFechaLLegada()); // Estado de la reserva
            fila.createCell(4).setCellValue(reserva.getFechaFin()); // Monto de la reserva
            fila.createCell(5).setCellValue("por definir");
            fila.createCell(6).setCellValue(reserva.getMontoTotal());
        }

        // Definir archivo y crear carpeta si no existe
        File archivo = new File("C:\\Users\\FranDev\\Documents\\reportes\\reservas_reports.xlsx");
        File directorio = archivo.getParentFile();

        // Verificación de carpeta y creación
        if (!directorio.exists()) {
            System.out.println("La carpeta no existe, se creará: " + directorio.getAbsolutePath());
            boolean created = directorio.mkdirs(); // Crea la carpeta y sus subdirectorios si no existen
            if (created) {
                System.out.println("Carpeta creada exitosamente.");
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
        } else {
            System.out.println("La carpeta ya existe: " + directorio.getAbsolutePath());
        }
        
        try (FileOutputStream fileOut = new FileOutputStream(archivo)) {
            newLibro.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                newLibro.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public Optional<Reserva> saveReserva() {
        Reserva datosR = panelRecervarHabitaciones.getDatosReserva();
        
        Reserva newReserva = new Reserva();
        
        newReserva.setCliente(clienteImpl.saveCliente(datosR.getCliente()));
        
        System.out.println("la habitaciones: " + datosR.getHabitacion().getNumeroDeHabitacion());
        Optional<Habitacion> habiExist = habitacionImpl.findHabitacionesPorNumHabitacion(datosR.getHabitacion().getNumeroDeHabitacion());
        
        if (habiExist.isPresent()) {
            newReserva.setHabitacion(habiExist.get());
        } else {
            throw new RuntimeException("La habitación no existe");
        }
        
        newReserva.setFechaRegistro(new Timestamp(System.currentTimeMillis()));
        newReserva.setFechaLLegada(datosR.getFechaLLegada());
        newReserva.setFechaFin(datosR.getFechaFin());
        newReserva.setMontoTotal(datosR.getMontoTotal());
        newReserva.setServicios(getServices());
        
        habitacionImpl.updateDisponibilidadHabitacion(habiExist.get().getIdHabitacion(), "OCUPADA");
        
        Optional<Reserva> createReserva = reservaImpl.saveReserva(newReserva);
        
        
         Reserva resExist = createReserva.get();
         
         System.out.println("recerva id"+resExist.getIdReserva());
        System.out.println("recerva crtead"+resExist.getFechaLLegada());
        
        
        if (createReserva.isPresent()) {
            return createReserva;
        }
        
        return Optional.empty();
    }
    
    public Reserva crearReservaConPagoYTicket() {

        // Guardar la reserva
    Optional<Reserva> reservaCreate = saveReserva();
    if (reservaCreate.isPresent()) {
        Reserva resExist = reservaCreate.get();
        System.out.println(resExist.getFechaLLegada());

        // Estructura de pago
        Pago newPago = new Pago();
        newPago.setEstadoPago("PAGADO");
        newPago.setFechaPago(new Date(System.currentTimeMillis()));
        newPago.setMetodoPago("Efectivo");
        newPago.setReserva(resExist);

        // Crear pago
        Optional<Pago> pagoCreate = pagoImpl.savePago(newPago);
        if (pagoCreate.isPresent()) {
            Pago pagoExist = pagoCreate.get();

            // Estructura de ticket
            Ticket newTicket = new Ticket();
            newTicket.setDetalle("Este es un detalle");
            newTicket.setEstado("Impreso");
            newTicket.setFechaEmision(new Date(System.currentTimeMillis()));

            newTicket.setPago(pagoExist);  // Asociar el pago al ticket
            newTicket.setReserva(resExist);  // Asociar la reserva al ticket
            newTicket.setMontoTotal(30.0);  // Establecer el monto total

            // Crear ticket
            Optional<Ticket> ticketCreate = ticketImpl.saveTicket(newTicket);
            if (ticketCreate.isPresent()) {
                Ticket ticketExist = ticketCreate.get();
                System.out.println(ticketExist.getDetalle());
                return resExist;  // Retornar la reserva existente
            } else {
                // Manejo de error si no se pudo guardar el ticket
                System.out.println("Error al crear el ticket.");
                return null;
            }
        } else {
            // Manejo de error si no se pudo guardar el pago
            System.out.println("Error al crear el pago.");
            return null;
        }
    } else {
        // Manejo de error si no se pudo guardar la reserva
        System.out.println("Error al crear la reserva.");
        return null;
    }
    }
    
    public void cargarHabitaciones() {
        System.out.println("hola siii entro");
        List<Habitacion> habitaciones = habitacionImpl.getAllHabitaciones();

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel modelHabiAdm = panelRecervarHabitaciones.modTablaHabitacionesRecervas;
        DefaultTableModel modelHabiEm = panelRecervarHabitaciones.modTablaHabitacionesRecervas;
        modelHabiAdm.setRowCount(0);  // Limpiar filas anteriores
        modelHabiEm.setRowCount(0);
        // Rellenar la tabla con los datos de los empleados
        for (Habitacion habitacion : habitaciones) {
            Object[] fila = new Object[6];
            fila[0] = habitacion.getIdHabitacion();
            fila[1] = habitacion.getNumeroDeHabitacion();
            fila[2] = habitacion.getTipoHabitacion().getTipoHabitacion();
            fila[3] = habitacion.getTipoHabitacion().getCaracteristicas();
            fila[4] = habitacion.getTipoHabitacion().getPrecio();
            fila[5] = habitacion.getEstado();
            
            modelHabiAdm.addRow(fila);
            modelHabiEm.addRow(fila);
        }
        
    }
    
    public void pruebaEscrituraExcel() {
        Workbook libroPrueba = new SXSSFWorkbook();
        Sheet hojaPrueba = libroPrueba.createSheet("Prueba");
        
        Row fila = hojaPrueba.createRow(0);
        fila.createCell(0).setCellValue("Prueba de Escritura");
        
        File archivoPrueba = new File("C:\\Users\\FranDev\\Documents\\reportes\\reservas_prueba.xlsx");
        try (FileOutputStream fileOut = new FileOutputStream(archivoPrueba)) {
            libroPrueba.write(fileOut);
            System.out.println("Archivo de prueba creado en el escritorio.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                libroPrueba.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void agregarListeners() {
        this.panelRecervasAdm.btnExportarReporteReservas.addActionListener(this);
        this.panelRecervarHabitaciones.btnAceptarGuardarRes.addActionListener(this);
        
        this.panelRecervarHabitaciones.btnRecervar.addActionListener(this);
    }
    
}
