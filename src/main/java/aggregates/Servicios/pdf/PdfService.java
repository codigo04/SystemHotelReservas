/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aggregates.Servicios.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.*;
import java.awt.Desktop;
import java.io.File;
import modelo.entity.Servicio;
import modelo.entity.Ticket;

/**
 *
 * @author FranDev
 */
public class PdfService {

    public static void generarTicket(Ticket ticket) {
        // Ruta para guardar el PDF
        String pdfPath = "C:\\Users\\FranDev\\Documents\\reportes\\reservas.pdf";
        String imagePath = "D:\\PROYECTOS UNI\\Proyectos-Desktop\\SystemHotelReservas\\src\\main\\java\\Imagenes\\costavelaImg.png";
        // Crear un documento
        // Crear documento
        Document document = new Document();

        try {
            // Configurar el escritor de PDF
            PdfWriter.getInstance(document, new FileOutputStream(pdfPath));

            // Abrir el documento
            document.open();

            // Agregar logotipo
            Image logo = Image.getInstance(imagePath);
            logo.scaleToFit(100, 100); // Ajustar tamaño
            logo.setAlignment(Image.ALIGN_CENTER);
            document.add(logo);

            // Espacio debajo del logotipo
            document.add(new Paragraph("\n"));

            // Agregar título
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
            Paragraph title = new Paragraph("Hotel Costa Vela", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            // Espacio
            document.add(new Paragraph("\n"));

            // Información de la reserva
            Font infoFont = FontFactory.getFont(FontFactory.HELVETICA, 12);
            document.add(new Paragraph("Reserva No: " + ticket.getReserva().getIdReserva(), infoFont));
            document.add(new Paragraph("Codigo reserva: " + ticket.getReserva().getCodigoReserva(), infoFont));
            document.add(new Paragraph("Huésped: " + ticket.getReserva().getCliente().getNombre(), infoFont));
            document.add(new Paragraph("Fecha de Entrada: 24/11/2024", infoFont));
            document.add(new Paragraph("Fecha de Salida: 27/11/2024", infoFont));
            document.add(new Paragraph("Habitación: "+ticket.getReserva().getHabitacion().getTipoHabitacion().getTipoHabitacion(), infoFont));
            document.add(new Paragraph("Precio habitación: "+ticket.getReserva().getHabitacion().getTipoHabitacion().getPrecio(), infoFont));
            document.add(new Paragraph("\n"));

            // Crear tabla para los servicios
            PdfPTable table = new PdfPTable(3); // 3 columnas
            table.setWidthPercentage(100);
            table.setWidths(new float[]{4, 2, 2}); // Ancho relativo de columnas

            // Encabezados de la tabla
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12);
            // Encabezados de la tabla
            table.addCell(new PdfPCell(new Phrase("Servicio", headerFont)));
            table.addCell(new PdfPCell(new Phrase("Cantidad", headerFont)));
            table.addCell(new PdfPCell(new Phrase("Precio", headerFont)));

            System.out.println(ticket.getReserva().getServicios());
            System.out.println("cantidad " + ticket.getReserva().getServicios().size());
// Llenar los datos de la tabla

            double totalPagar = ticket.getMontoTotal();
            for (Servicio servicio : ticket.getReserva().getServicios()) {
                table.addCell(servicio.getNombreServicio());
                table.addCell(String.valueOf("2")); // Asegúrate de que Servicio tiene este método
                table.addCell(String.valueOf(servicio.getPrecio()));

                totalPagar += servicio.getPrecio();
            }

            // Agregar tabla al documento
            document.add(table);

            // Total
            Font totalFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14);
            Paragraph total = new Paragraph("\nTotal: S/" + totalPagar, totalFont);
            total.setAlignment(Element.ALIGN_RIGHT);
            document.add(total);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar el documento
            document.close();
        }

        // Intentar abrir el archivo automáticamente
        try {
            File pdfFile = new File(pdfPath);
            if (pdfFile.exists()) {
                Desktop.getDesktop().open(pdfFile);
                System.out.println("Archivo PDF abierto correctamente.");
            } else {
                System.out.println("El archivo PDF no se encontró: " + pdfPath);
            }
        } catch (Exception e) {
            System.err.println("Error al intentar abrir el archivo PDF: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        PdfService.generarTicket(new Ticket());
    }
}
