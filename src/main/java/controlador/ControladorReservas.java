/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import aggregates.Reports.ReservaReports;
import aggregates.Servicios.apis.EmpleadoService;
import aggregates.request.PersonaRequest;
import aggregates.response.ResponceReniec;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.dao.impl.ClienteImpl;
import modelo.dao.impl.EmpleadoImpl;
import modelo.dao.impl.HabitacionImpl;
import modelo.dao.impl.PagoImpl;
import modelo.dao.impl.ReservaImpl;
import modelo.dao.impl.ServicioImpl;
import modelo.dao.impl.TicketImpl;
import modelo.dao.impl.TipoHabitacionImpl;
import modelo.entity.*;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.scheduling.annotation.Scheduled;

import vista.Administrador.paneles.PanelRecervasAdm;
import vista.Empleado.paneles.PanelRecervarHabitaciones;
import vista.Empleado.paneles.PanelReservas;

/**
 *
 * @author FranDev
 */
public class ControladorReservas implements ActionListener {

    private PanelRecervasAdm panelRecervasAdm;
    private PanelReservas panelReservas;

    private PanelRecervarHabitaciones panelRecervarHabitaciones;

    private ReservaImpl reservaImpl;
    private EmpleadoImpl empleadoImpl;
    private ClienteImpl clienteImpl;
    private HabitacionImpl habitacionImpl;
    private TipoHabitacionImpl tipoHabitacionImpl;
    private ServicioImpl servicioImpl;
    public EmpleadoService clienteReniec;
    private PagoImpl pagoImpl;
    private TicketImpl ticketImpl;
    List<Servicio> servicios;

    public ControladorReservas(PanelRecervasAdm panelRecervasAdm, PanelReservas panelReservas, PanelRecervarHabitaciones panelRecervarHabitaciones) {
        this.panelRecervasAdm = panelRecervasAdm;
        this.panelReservas = panelReservas;
        this.panelRecervarHabitaciones = panelRecervarHabitaciones;
        reservaImpl = new ReservaImpl();
        empleadoImpl = new EmpleadoImpl();
        clienteImpl = new ClienteImpl();
        habitacionImpl = new HabitacionImpl();
        tipoHabitacionImpl = new TipoHabitacionImpl();
        servicioImpl = new ServicioImpl();
        pagoImpl = new PagoImpl();
        ticketImpl = new TicketImpl();
        clienteReniec = new EmpleadoService();
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

        //RESERVAS - CRIS
        if (e.getSource() == panelReservas.btnEditarReserva) {
            int fila = panelReservas.tablaReservas.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA RESERVA", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                panelReservas.bloquear(panelReservas.PanelBotones);
                panelReservas.Panel_Editar.setVisible(true);
                editarReservas();
            }
        }

        if (e.getSource() == panelReservas.btnActualizar_ReservaEdit) {
            actualizarReserva();
            panelReservas.FormCloseReserva();
            panelReservas.desbloquear(panelReservas.PanelBotones);
            panelReservas.Panel_Editar.setVisible(false);

        }

        if (e.getSource() == panelReservas.btnCancelar_ReservaEdit) {
            panelReservas.FormCloseReserva();
            panelReservas.desbloquear(panelReservas.PanelBotones);
            panelReservas.Panel_Editar.setVisible(false);
        }

        if (e.getSource() == panelReservas.btnCancelarReserva) {
            int fila = panelReservas.tablaReservas.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA RESERVA", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String estado = String.valueOf(panelReservas.tablaReservas.getValueAt(fila, 6));
                if (estado.equals("CANCELADA")) {
                    JOptionPane.showMessageDialog(null, "LA RESERVA YA ESTA CANCELADA", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    panelReservas.bloquear(panelReservas.PanelBotones);
                    panelReservas.Panel_Cancelar.setVisible(true);
                    editarReservas();
                }
            }
        }

        if (e.getSource() == panelReservas.btnCancelar_CancelarReserva) {
            cancelarReserva();
            panelReservas.desbloquear(panelReservas.PanelBotones);
            panelReservas.Panel_Cancelar.setVisible(false);
            cargarRecervas();
        }

        if (e.getSource() == panelReservas.btnSalir_CancelarReserva) {
            panelReservas.desbloquear(panelReservas.PanelBotones);
            panelReservas.Panel_Cancelar.setVisible(false);
        }

        if (e.getSource() == panelRecervarHabitaciones.btnbuscarDni) {
            try {
                bucarPersona();
            } catch (IOException ex) {
                Logger.getLogger(ControladorReservas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void cargarRecervas() {

        List<Reserva> reservas = reservaImpl.getAllReservas();

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = panelRecervasAdm.modTablaReservas;
        DefaultTableModel modelRecepcionista = panelReservas.modTablaReservas;
        model.setRowCount(0);  // Limpiar filas anteriores
        modelRecepcionista.setRowCount(0);
        // Rellenar la tabla con los datos de los empleados
        for (Reserva reserva : reservas) {
            Object[] fila = new Object[8];
            fila[0] = reserva.getIdReserva();
            fila[1] = reserva.getCliente().getNombre() + " " + reserva.getCliente().getApellido();
            fila[2] = reserva.getCliente().getDni();
            fila[3] = reserva.getHabitacion().getTipoHabitacion().getTipoHabitacion() + "  " + reserva.getHabitacion().getNumeroDeHabitacion();
            fila[4] = reserva.getFechaLLegada();
            fila[5] = reserva.getFechaFin();
            fila[6] = reserva.getEstado();
            fila[7] = reserva.getMontoTotal();

            model.addRow(fila);  // Agrega la fila al modelo de tabla
            modelRecepcionista.addRow(fila);
        }

    }

    public void editarReservas() {
        int fila = panelReservas.tablaReservas.getSelectedRow();

        String idReserva = String.valueOf(panelReservas.tablaReservas.getValueAt(fila, 0));
        Long longIdReserva = Long.parseLong(idReserva);

        ReservaImpl buscarReserva = new ReservaImpl();
        Reserva reserva = buscarReserva.findReservaById(longIdReserva);

        if (panelReservas.Panel_Editar.isVisible()) {
            //CLIENTE
            panelReservas.txtDniR.setText(reserva.getCliente().getDni());
            panelReservas.txtNombreR.setText(reserva.getCliente().getNombre());
            panelReservas.txtApellidoR.setText(reserva.getCliente().getApellido());
            panelReservas.txtTelefonoR.setText(reserva.getCliente().getCelular());
            panelReservas.txtCorreoR.setText(reserva.getCliente().getCorreoElectronico());

            //HABITACION
            panelReservas.txtHabitacionR.setText(reserva.getHabitacion().getNumeroDeHabitacion());
            panelReservas.txtTipoHabitacionR.setText(reserva.getHabitacion().getTipoHabitacion().getTipoHabitacion());

            //RESERVA
            panelReservas.txtFechaLlegada.setDate(reserva.getFechaLLegada());
            panelReservas.txtFechaFinR.setDate(reserva.getFechaFin());
            panelReservas.txtPrecioR.setText(reserva.getMontoTotal().toString());
        } else if (panelReservas.Panel_Cancelar.isVisible()) {
            panelReservas.txtDni_CancelarReserva.setText(reserva.getCliente().getDni());
            panelReservas.txtNombreCliente_CancelarReserva.setText(reserva.getCliente().getNombre() + " " + reserva.getCliente().getApellido());
        } else {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos de la reserva", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizarReserva() {
        try {
            int fila = panelReservas.tablaReservas.getSelectedRow();
            String idReserva = String.valueOf(panelReservas.tablaReservas.getValueAt(fila, 0));
            Long longIdReserva = Long.parseLong(idReserva);

            Reserva reserva = reservaImpl.findReservaById(longIdReserva);
            if (reserva == null) {
                throw new IllegalArgumentException("Reserva no encontrada");
            }

            Cliente foundClient = clienteImpl.findClienteById(reserva.getCliente().getIdCliente());

            if (foundClient != null) {
                foundClient.setNombre(panelReservas.txtNombreR.getText());
                foundClient.setApellido(panelReservas.txtApellidoR.getText());
                foundClient.setCelular(panelReservas.txtTelefonoR.getText());
                foundClient.setCorreoElectronico(panelReservas.txtCorreoR.getText());
                clienteImpl.updateCliente(foundClient);
            } else {
                throw new IllegalArgumentException("Cliente no encontrado");
            }

            Optional<Habitacion> RoomNumber = habitacionImpl.findHabitacionesPorNumHabitacion(panelReservas.txtHabitacionR.getText());
            reserva.getHabitacion().setIdHabitacion(RoomNumber.get().getIdHabitacion());

            panelReservas.txtTipoHabitacionR.setText(RoomNumber.get().getTipoHabitacion().getTipoHabitacion());

            Date fechaLlegadaStr = panelReservas.txtFechaLlegada.getDate();
            Timestamp timestampLLeg = new Timestamp(fechaLlegadaStr.getTime());
            reserva.setFechaLLegada(timestampLLeg);

            Date fechaFinStr = panelReservas.txtFechaFinR.getDate();
            Timestamp timestampFin = new Timestamp(fechaFinStr.getTime());
            reserva.setFechaFin(timestampFin);
            reserva.setMontoTotal(Double.parseDouble(panelReservas.txtPrecioR.getText()));

            reservaImpl.updateReserva(reserva);
            cargarRecervas();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la reserva: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cancelarReserva() {
        int fila = panelReservas.tablaReservas.getSelectedRow();

        String idReserva = String.valueOf(panelReservas.tablaReservas.getValueAt(fila, 0));
        Long longIdReserva = Long.parseLong(idReserva);

        Reserva reserva = reservaImpl.findReservaById(longIdReserva);
        Optional<Habitacion> RoomNumber = habitacionImpl.findHabitacionById(reserva.getHabitacion().getIdHabitacion());
        RoomNumber.get().setEstado("DISPONIBLE");

        reserva.setEstado("CANCELADA");
        reservaImpl.updateReserva(reserva);
        habitacionImpl.updateHabitacion(RoomNumber.get());
        //AÑADIR UN ESTADO A LA RESERVA
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

        List<ReservaReports> reservas = panelRecervasAdm.extraerResultadosFiltrados();

// Crear encabezados
        String[] encabezados = {"ID", "Nombre del Cliente", "Habitacion", "Check-in", "Check-out", "Estado", "Total"};
        Row filaEncabezados = hojaReportesReservas.createRow(0);

        for (int j = 0; j < encabezados.length; j++) {
            Cell celda = filaEncabezados.createCell(j);
            celda.setCellValue(encabezados[j]);
        }

// Agregar datos de reservas
        for (int i = 0; i < reservas.size(); i++) {
            ReservaReports reserva = reservas.get(i);
            Row fila = hojaReportesReservas.createRow(i + 1); // i + 1 para no sobrescribir los encabezados

            fila.createCell(0).setCellValue(reserva.getIdReserva()); // ID de la reserva
            fila.createCell(1).setCellValue(reserva.getCliente()); // Nombre del cliente
            fila.createCell(2).setCellValue(reserva.getHabitacion()); // Fecha de reserva
            fila.createCell(3).setCellValue(reserva.getFechaInicio()); // Estado de la reserva
            fila.createCell(4).setCellValue(reserva.getFechaFin()); // Monto de la reserva
            fila.createCell(5).setCellValue("por definir");
            fila.createCell(6).setCellValue(reserva.getTotalPagar());
        }

// Obtener fecha y hora actual para el nombre del archivo
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fechaHora = ahora.format(formatoFechaHora);

// Definir archivo con el nombre basado en la fecha y hora
        File archivo = new File("C:\\Users\\FranDev\\Documents\\reportes\\REPORTE-" + fechaHora + ".xlsx");
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
            JOptionPane.showMessageDialog(null, "Reporte generado con éxito: " + archivo.getName(), "Información", JOptionPane.INFORMATION_MESSAGE);
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
        newReserva.setEstado("ACTIVA");
        newReserva.setNumeroHuespedes(3);
        habitacionImpl.updateDisponibilidadHabitacion(habiExist.get().getIdHabitacion(), "OCUPADA");

        Optional<Reserva> createReserva = reservaImpl.saveReserva(newReserva);

        if (createReserva.isPresent()) {
            Reserva reservaGuardada = createReserva.get();

            String codigoGenerado = generarCodigo(reservaGuardada.getIdReserva());
            reservaGuardada.setCodigoReserva(codigoGenerado);

            reservaImpl.updateReserva(reservaGuardada);
        }

        Reserva resExist = createReserva.get();

        System.out.println("recerva id" + resExist.getIdReserva());
        System.out.println("recerva crtead" + resExist.getFechaLLegada());

        if (createReserva.isPresent()) {
            return createReserva;
        }

        return Optional.empty();
    }

    public String generarCodigo(Long idReserva) {

        return "RES-" + "0000" + "-" + idReserva;
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

    public void bucarPersona() throws IOException {

        PersonaRequest personaRequest = new PersonaRequest();

        personaRequest.setDni(panelRecervarHabitaciones.txtDniClienteRes.getText());

        ResponceReniec responceReniec = clienteReniec.getEntityRetrofit(personaRequest);

        System.out.println(responceReniec.getApellidoMaterno());
        if (responceReniec != null) {

            panelRecervarHabitaciones.txtNombreClienteRes.setText(responceReniec.getNombres());
            panelRecervarHabitaciones.txtApellidoClienteRes.setText(responceReniec.getApellidoPaterno() + " " + responceReniec.getApellidoMaterno());

        }
    }

    public void agregarListeners() {
        this.panelRecervasAdm.btnExportarReporteReservas.addActionListener(this);
        this.panelRecervarHabitaciones.btnAceptarGuardarRes.addActionListener(this);

        this.panelRecervarHabitaciones.btnRecervar.addActionListener(this);

        this.panelRecervarHabitaciones.btnbuscarDni.addActionListener(this);

        //RESERVAS - CRIS
        this.panelReservas.btnEditarReserva.addActionListener(this);
        this.panelReservas.btnActualizar_ReservaEdit.addActionListener(this);
        this.panelReservas.btnCancelar_ReservaEdit.addActionListener(this);

        this.panelReservas.btnCancelarReserva.addActionListener(this);
        this.panelReservas.btnCancelar_CancelarReserva.addActionListener(this);
        this.panelReservas.btnSalir_CancelarReserva.addActionListener(this);
    }

}
