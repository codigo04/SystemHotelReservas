/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.Administrador.paneles;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RectangularShape;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import org.jfree.chart.renderer.category.BarPainter;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.chart.ui.RectangleEdge;

/**
 *
 * @author FranDev
 */
public class Grafico extends JPanel {

   // DefaultCategoryDataset dataset;

    public Grafico() {
        /* Crear el dataset
      //  dataset = new DefaultCategoryDataset();

        // Crear el gráfico con un estilo más moderno
        JFreeChart chart = ChartFactory.createBarChart(
                "Ocupación Semanal",
                "Día de la Semana",
                "Porcentaje de Ocupación",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        // Personalizar el gráfico
        personalizarGrafico(chart);

        // Crear el panel para mostrar el gráfico
        ChartPanel panel = new ChartPanel(chart);
        panel.setBackground(Color.white);

        // Añadir el panel del gráfico al panel principal
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);  */
    }

    public CategoryDataset crearDataset(DefaultCategoryDataset dataset) {
        

        // Crear el gráfico con un estilo más moderno
        JFreeChart chart = ChartFactory.createBarChart(
                "Ocupación Semanal",
                "Día de la Semana",
                "Porcentaje de Ocupación",
                dataset,
                PlotOrientation.VERTICAL,
                false, true, false);

        // Personalizar el gráfico
        personalizarGrafico(chart);

        // Crear el panel para mostrar el gráfico
        ChartPanel panel = new ChartPanel(chart);
        panel.setBackground(Color.white);

        // Añadir el panel del gráfico al panel principal
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.CENTER);

        return dataset;
    }

    private void personalizarGrafico(JFreeChart chart) {
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.WHITE);
        plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

        // Usar un BarRenderer personalizado para redondear las barras
        BarRenderer renderer = new BarRenderer() {
            public void paintBar(Graphics2D g2,
                    CategoryPlot plot,
                    CategoryDataset dataset,
                    int row, int column,
                    RectangularShape bar,
                    RectangleEdge base) {
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                // g2.setColor(getSeriesPaint(row));
                g2.fillRoundRect((int) bar.getX(), (int) bar.getY(), (int) bar.getWidth(), (int) bar.getHeight(), 15, 15);
            }
        };

        renderer.setSeriesPaint(0, new Color(127, 196, 150)); // Color verde claro
        renderer.setShadowVisible(true);
        renderer.setShadowPaint(new Color(200, 200, 200, 128)); // Sombra gris semitransparente
        renderer.setItemMargin(0.1); // Espaciado entre barras

        plot.setRenderer(renderer);

        // Personalizar el título y etiquetas
        chart.getTitle().setPaint(new Color(80, 80, 80));
        chart.getTitle().setFont(new Font("Arial", Font.BOLD, 18));

        plot.getDomainAxis().setTickLabelFont(new Font("Arial", Font.PLAIN, 12));
        plot.getDomainAxis().setLabelPaint(new Color(80, 80, 80));
        plot.getDomainAxis().setTickLabelPaint(new Color(60, 60, 60));

        plot.getRangeAxis().setTickLabelFont(new Font("Arial", Font.PLAIN, 12));
        plot.getRangeAxis().setLabelPaint(new Color(80, 80, 80));
        plot.getRangeAxis().setTickLabelPaint(new Color(60, 60, 60));
        plot.getRangeAxis().setRange(0, 100);
    }

    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", new Locale("es", "ES"));

        System.out.println("Días de la semana desde hoy hacia atrás:");

        // Recorremos los últimos 7 días desde el día actual hacia atrás
        for (int i = 0; i < 7; i++) {
            LocalDate fecha = fechaActual.minus(i, ChronoUnit.DAYS);
            System.out.println(fecha.format(formato));
        }
    }
}
