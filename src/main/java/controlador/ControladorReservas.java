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
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.dao.impl.ReservaImpl;
import modelo.entity.Reserva;
import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import vista.Administrador.paneles.PanelRecervasAdm;

/**
 *
 * @author FranDev
 */
public class ControladorReservas implements ActionListener {

    private PanelRecervasAdm panelRecervasAdm;
    private ReservaImpl resrvaImpl;

    public ControladorReservas(PanelRecervasAdm panelRecervasAdm) {
        this.panelRecervasAdm = panelRecervasAdm;
        resrvaImpl = new ReservaImpl();
        agregarListeners();
        cargarRecervas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelRecervasAdm.btnExportarReporteReservas) {
            generarReportes();
        }
    }

    public void cargarRecervas() {

        List<Reserva> reservas = resrvaImpl.getAllReservas();

        // Limpiar la tabla antes de agregar nuevos datos
        DefaultTableModel model = panelRecervasAdm.modTablaReservas;
        model.setRowCount(0);  // Limpiar filas anteriores

        // Rellenar la tabla con los datos de los empleados
        for (Reserva reserva : reservas) {
            Object[] fila = new Object[7];
            fila[0] = reserva.getIdReserva();
            fila[1] = reserva.getCliente().getNombre();
            fila[2] = reserva.getHabitacion().getNumeroDeHabitacion();
            fila[3] = reserva.getFechaLLegada();
            fila[4] = reserva.getFechaFin();
            fila[5] = "POR DEFENIR";
            fila[6] = reserva.getMontoTotal();

            model.addRow(fila);  // Agrega la fila al modelo de tabla
        }

    }

    public void generarReportes() {
        Workbook newLibro = new SXSSFWorkbook();
        Sheet hojaReportesReservas = newLibro.createSheet("reservas_report");

        List<Reserva> reservas = resrvaImpl.getAllReservas();

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
            fila.createCell(2).setCellValue(reserva.getHabitacion().getNumeroDeHabitacion()); // Fecha de reserva
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

    }
}
