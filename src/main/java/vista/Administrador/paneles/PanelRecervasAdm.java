/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.Administrador.paneles;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import modelo.entity.Empleado;
import modelo.entity.Habitacion;
import modelo.entity.Roles;
import modelo.entity.TipoHabitacion;

/**
 * @author FranDev
 */
public class PanelRecervasAdm extends javax.swing.JPanel {

    public DefaultTableModel modTablaReservas = new DefaultTableModel();

    /**
     * Creates new form PanelHabitacionesAdm
     */
    public PanelRecervasAdm() {
        initComponents();
        String cabeTableProduc[] = {"ID", "Cliente", "Habitacion", "Check-in", "Check-out", "Estado","Total"};
        darBordes(jpanelContenidoHabi);
        modTablaReservas.setColumnIdentifiers(cabeTableProduc);
        busquedaDinamica();
        tablaReservas.setModel(modTablaReservas);

        tablaReservas.setBackground(Color.BLACK);
        tablaReservas.setForeground(Color.WHITE);

        Panel_RegistroHabitaciones.setVisible(false);
        Panel_EditHabitaciones.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnExportarReporteReservas = new javax.swing.JButton();
        Panel_EditHabitaciones = new javax.swing.JPanel();
        btnAceptarEditHabitacion = new javax.swing.JButton();
        btnCancelarEditHabitacion = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtIdEditHabi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroHabitacionEdit = new javax.swing.JTextField();
        cboxEstadoEditHabi = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cboxTipoHabitacionEditHabi = new javax.swing.JComboBox<>();
        Panel_RegistroHabitaciones = new javax.swing.JPanel();
        btnAceptarGuardarHabitacion = new javax.swing.JButton();
        btnCancelarHabitacion = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPrecioHabi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNumeroHabitacionHi = new javax.swing.JTextField();
        cboxEstadoHabi = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboxTipoHabitacionHabi = new javax.swing.JComboBox<>();
        jpanelContenidoHabi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        btnEliminarHabi = new javax.swing.JButton();
        txtBuscarReservas = new javax.swing.JTextField();
        btnBuscarHabitacion = new javax.swing.JButton();
        btnEditarHabi = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestión de Reservas");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 23, 571, -1));

        btnExportarReporteReservas.setBackground(new java.awt.Color(0, 0, 0));
        btnExportarReporteReservas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExportarReporteReservas.setForeground(new java.awt.Color(255, 255, 255));
        btnExportarReporteReservas.setText("Exportar Excel");
        btnExportarReporteReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarReporteReservasActionPerformed(evt);
            }
        });
        add(btnExportarReporteReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 150, 48));

        Panel_EditHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        Panel_EditHabitaciones.setEnabled(false);
        Panel_EditHabitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarEditHabitacion.setBackground(new java.awt.Color(0, 255, 0));
        btnAceptarEditHabitacion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAceptarEditHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarEditHabitacion.setText("ACEPTAR");
        btnAceptarEditHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarEditHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditHabitacionActionPerformed(evt);
            }
        });
        Panel_EditHabitaciones.add(btnAceptarEditHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 180, 30));

        btnCancelarEditHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarEditHabitacion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCancelarEditHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEditHabitacion.setText("CANCELAR");
        btnCancelarEditHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditHabitacionActionPerformed(evt);
            }
        });
        Panel_EditHabitaciones.add(btnCancelarEditHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 170, 30));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon("D:\\PROYECTOS UNI\\Proyectos-Desktop\\SystemHotelReservas\\src\\main\\java\\Imagenes\\img-editar.png")); // NOI18N
        Panel_EditHabitaciones.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 90));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("ID HABITACION");
        Panel_EditHabitaciones.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 110, 20));

        txtIdEditHabi.setBackground(new java.awt.Color(255, 255, 255));
        txtIdEditHabi.setForeground(new java.awt.Color(0, 0, 0));
        txtIdEditHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEditHabiActionPerformed(evt);
            }
        });
        txtIdEditHabi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdEditHabiKeyTyped(evt);
            }
        });
        Panel_EditHabitaciones.add(txtIdEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("NUMERO HABITACION:");
        Panel_EditHabitaciones.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 130, 20));

        txtNumeroHabitacionEdit.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroHabitacionEdit.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroHabitacionEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroHabitacionEditActionPerformed(evt);
            }
        });
        txtNumeroHabitacionEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroHabitacionEditKeyTyped(evt);
            }
        });
        Panel_EditHabitaciones.add(txtNumeroHabitacionEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 150, -1));

        cboxEstadoEditHabi.setBackground(new java.awt.Color(255, 255, 255));
        cboxEstadoEditHabi.setForeground(new java.awt.Color(0, 0, 0));
        cboxEstadoEditHabi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "DISPONIBLE", "OCUPADA", "RESERVADA", "OCUPADA", "MANTENIMIENTO" }));
        cboxEstadoEditHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxEstadoEditHabiActionPerformed(evt);
            }
        });
        Panel_EditHabitaciones.add(cboxEstadoEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("ESTADO:");
        Panel_EditHabitaciones.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 70, 20));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("TIPO HABITACION:");
        Panel_EditHabitaciones.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 140, 20));

        cboxTipoHabitacionEditHabi.setBackground(new java.awt.Color(255, 255, 255));
        cboxTipoHabitacionEditHabi.setForeground(new java.awt.Color(0, 0, 0));
        cboxTipoHabitacionEditHabi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "ACTIVO", "INACTIVO" }));
        cboxTipoHabitacionEditHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTipoHabitacionEditHabiActionPerformed(evt);
            }
        });
        Panel_EditHabitaciones.add(cboxTipoHabitacionEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 150, -1));

        add(Panel_EditHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 470, 370));

        Panel_RegistroHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        Panel_RegistroHabitaciones.setEnabled(false);
        Panel_RegistroHabitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarGuardarHabitacion.setBackground(new java.awt.Color(0, 255, 0));
        btnAceptarGuardarHabitacion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAceptarGuardarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarGuardarHabitacion.setText("ACEPTAR");
        btnAceptarGuardarHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarGuardarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarGuardarHabitacionActionPerformed(evt);
            }
        });
        Panel_RegistroHabitaciones.add(btnAceptarGuardarHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 180, 30));

        btnCancelarHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarHabitacion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCancelarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarHabitacion.setText("CANCELAR");
        btnCancelarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarHabitacionActionPerformed(evt);
            }
        });
        Panel_RegistroHabitaciones.add(btnCancelarHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 170, 30));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\PROYECTOS UNI\\Proyectos-Desktop\\SystemHotelReservas\\src\\main\\java\\Imagenes\\img-editar.png")); // NOI18N
        Panel_RegistroHabitaciones.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 90));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("PRECIO");
        Panel_RegistroHabitaciones.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 110, 20));

        txtPrecioHabi.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioHabi.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioHabiActionPerformed(evt);
            }
        });
        txtPrecioHabi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioHabiKeyTyped(evt);
            }
        });
        Panel_RegistroHabitaciones.add(txtPrecioHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 190, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("NUMERO HABITACION:");
        Panel_RegistroHabitaciones.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 130, 20));

        txtNumeroHabitacionHi.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroHabitacionHi.setForeground(new java.awt.Color(0, 0, 0));
        txtNumeroHabitacionHi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroHabitacionHiActionPerformed(evt);
            }
        });
        txtNumeroHabitacionHi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroHabitacionHiKeyTyped(evt);
            }
        });
        Panel_RegistroHabitaciones.add(txtNumeroHabitacionHi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 150, -1));

        cboxEstadoHabi.setBackground(new java.awt.Color(255, 255, 255));
        cboxEstadoHabi.setForeground(new java.awt.Color(0, 0, 0));
        cboxEstadoHabi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "DISPONIBLE", "OCUPADA", "RESERVADA", "OCUPADA", "MANTENIMIENTO" }));
        cboxEstadoHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxEstadoHabiActionPerformed(evt);
            }
        });
        Panel_RegistroHabitaciones.add(cboxEstadoHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 190, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ESTADO:");
        Panel_RegistroHabitaciones.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 70, 20));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("TIPO HABITACION:");
        Panel_RegistroHabitaciones.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 140, 20));

        cboxTipoHabitacionHabi.setBackground(new java.awt.Color(255, 255, 255));
        cboxTipoHabitacionHabi.setForeground(new java.awt.Color(0, 0, 0));
        cboxTipoHabitacionHabi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR" }));
        cboxTipoHabitacionHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTipoHabitacionHabiActionPerformed(evt);
            }
        });
        Panel_RegistroHabitaciones.add(cboxTipoHabitacionHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 150, -1));

        add(Panel_RegistroHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 470, 370));

        jpanelContenidoHabi.setBackground(new java.awt.Color(255, 255, 255));
        jpanelContenidoHabi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpanelContenidoHabi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Lista de Reservas");
        jpanelContenidoHabi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 260, 48));
        jpanelContenidoHabi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 7, -1, -1));

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaReservas);

        jpanelContenidoHabi.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 860, 170));

        btnEliminarHabi.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminarHabi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarHabi.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarHabi.setText("Eliminar");
        btnEliminarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHabiActionPerformed(evt);
            }
        });
        jpanelContenidoHabi.add(btnEliminarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 86, 35));

        txtBuscarReservas.setText("Buscar Reserva");
        txtBuscarReservas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarReservasFocusLost(evt);
            }
        });
        txtBuscarReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarReservasMouseClicked(evt);
            }
        });
        jpanelContenidoHabi.add(txtBuscarReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 74, 276, 32));

        btnBuscarHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarHabitacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarHabitacion.setText("Buscar");
        btnBuscarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHabitacionActionPerformed(evt);
            }
        });
        jpanelContenidoHabi.add(btnBuscarHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 73, 86, 35));

        btnEditarHabi.setBackground(new java.awt.Color(0, 0, 0));
        btnEditarHabi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarHabi.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarHabi.setText("Editar");
        btnEditarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarHabiActionPerformed(evt);
            }
        });
        jpanelContenidoHabi.add(btnEditarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 86, 35));

        add(jpanelContenidoHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 89, 990, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHabiActionPerformed
        int fila = tablaReservas.getSelectedRow();

        if (fila == -1) {

            JOptionPane.showConfirmDialog(null, "SELECCIONA UN HABITACION   ", "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } else {
            bloquear(jpanelContenidoHabi);
            bloquearImputs();
            llenarFormEditar();
        }


    }//GEN-LAST:event_btnEliminarHabiActionPerformed

    private void btnBuscarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarHabitacionActionPerformed

    private void btnAceptarGuardarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarGuardarHabitacionActionPerformed
        desbloquear(jpanelContenidoHabi);
        Panel_RegistroHabitaciones.setVisible(false);

        //creamos una arreglo de tipos object
        //Object fila[] = new Object[7];
        // ArrayList<String> list = new ArrayList<>();
        //obtenemos los datos que agrega el usuario
        // String tDni = txtDni.getText();
        //String tNombre = txtNombre.getText();
        //String tApellido = txtApellido.getText();
        //  String puesto = (String) cboxPuesto.getSelectedItem();
        //  String tSalario = txtSalario.getText();
        //  String tTelefno = txtTelefono.getText();
        // list.add(tDni); //0
        // list.add(tNombre); //1
        // list.add(tApellido); //2
        //falta fecha de contratacion
        // list.add(puesto); //3
        //  list.add(tSalario);//4
        // list.add(tTelefno);//5
        //  administrador.registrarEmpleado(modTablaEmpleados, list);

        /*
        String tPuesto = String.valueOf(cboxPuesto.getSelectedItem());
        //
        Empleado empledo1 = new Mozo(tDni, tPuesto, 200, tNombre, tApellido, "", tTelefno, "");
        //        administrador.registrarEmpleado(empledo1);
        //"DNI","NOMBRE","APELLIDO","TELEFONO" ,"PUESTO","FECHA INGRESO","SALARIO"
        //agregamos cada ctenido al arreglo
        fila[0] = empledo1.getDni();
        fila[1] = empledo1.getNombre();
        fila[2] = empledo1.getApellido();
        fila[3] = empledo1.getCelular();
        fila[4] = empledo1.getPuesto();
        fila[5] = "200";
        fila[6] = empledo1.getSalario();
        //agregamos una fila  a la tabla con el contedio que tiene el arreglo
        modTablaEmpleados.addRow(fila);
         */
    }//GEN-LAST:event_btnAceptarGuardarHabitacionActionPerformed

    private void btnCancelarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarHabitacionActionPerformed
        desbloquear(jpanelContenidoHabi);
        Panel_RegistroHabitaciones.setVisible(false);
    }//GEN-LAST:event_btnCancelarHabitacionActionPerformed

    private void btnExportarReporteReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarReporteReservasActionPerformed

       

    }//GEN-LAST:event_btnExportarReporteReservasActionPerformed

    private void txtPrecioHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioHabiActionPerformed

    private void txtPrecioHabiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioHabiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioHabiKeyTyped

    private void btnEditarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarHabiActionPerformed

        int fila = tablaReservas.getSelectedRow();

        if (fila == -1) {

            JOptionPane.showConfirmDialog(null, "SELECCIONA UN HABITACION   ", "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } else {
            bloquearImputs();
            bloquear(jpanelContenidoHabi);
            Panel_EditHabitaciones.setVisible(true);
            llenarFormEditar();
        }
    }//GEN-LAST:event_btnEditarHabiActionPerformed

    private void txtNumeroHabitacionHiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroHabitacionHiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroHabitacionHiActionPerformed

    private void txtNumeroHabitacionHiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroHabitacionHiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroHabitacionHiKeyTyped

    private void cboxEstadoHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxEstadoHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxEstadoHabiActionPerformed

    private void cboxTipoHabitacionHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTipoHabitacionHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxTipoHabitacionHabiActionPerformed

    private void btnAceptarEditHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditHabitacionActionPerformed
        desbloquear(jpanelContenidoHabi);
        Panel_EditHabitaciones.setVisible(false);
    }//GEN-LAST:event_btnAceptarEditHabitacionActionPerformed

    private void btnCancelarEditHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditHabitacionActionPerformed
        desbloquear(jpanelContenidoHabi);
        Panel_EditHabitaciones.setVisible(false);
    }//GEN-LAST:event_btnCancelarEditHabitacionActionPerformed

    private void txtIdEditHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEditHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEditHabiActionPerformed

    private void txtIdEditHabiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEditHabiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEditHabiKeyTyped

    private void txtNumeroHabitacionEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroHabitacionEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroHabitacionEditActionPerformed

    private void txtNumeroHabitacionEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroHabitacionEditKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroHabitacionEditKeyTyped

    private void cboxEstadoEditHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxEstadoEditHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxEstadoEditHabiActionPerformed

    private void cboxTipoHabitacionEditHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTipoHabitacionEditHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxTipoHabitacionEditHabiActionPerformed

    private void txtBuscarReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarReservasMouseClicked
        if (txtBuscarReservas.getText().equals("Buscar Reserva")) {
            txtBuscarReservas.setText("");
        }
    }//GEN-LAST:event_txtBuscarReservasMouseClicked

    private void txtBuscarReservasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarReservasFocusLost
        if (txtBuscarReservas.getText().isEmpty()) {
             txtBuscarReservas.setText("Buscar Reserva");
        }
    }//GEN-LAST:event_txtBuscarReservasFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Panel_EditHabitaciones;
    public javax.swing.JPanel Panel_RegistroHabitaciones;
    public javax.swing.JButton btnAceptarEditHabitacion;
    public javax.swing.JButton btnAceptarGuardarHabitacion;
    public javax.swing.JButton btnBuscarHabitacion;
    public javax.swing.JButton btnCancelarEditHabitacion;
    public javax.swing.JButton btnCancelarHabitacion;
    public javax.swing.JButton btnEditarHabi;
    public javax.swing.JButton btnEliminarHabi;
    public javax.swing.JButton btnExportarReporteReservas;
    public javax.swing.JComboBox<String> cboxEstadoEditHabi;
    public javax.swing.JComboBox<String> cboxEstadoHabi;
    public javax.swing.JComboBox<String> cboxTipoHabitacionEditHabi;
    public javax.swing.JComboBox<String> cboxTipoHabitacionHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelContenidoHabi;
    public javax.swing.JTable tablaReservas;
    private javax.swing.JTextField txtBuscarReservas;
    public javax.swing.JTextField txtIdEditHabi;
    public javax.swing.JTextField txtNumeroHabitacionEdit;
    public javax.swing.JTextField txtNumeroHabitacionHi;
    public javax.swing.JTextField txtPrecioHabi;
    // End of variables declaration//GEN-END:variables
    public void bloquear(Component component) {

        if (component instanceof Container) {
            Component[] components = ((Container) component).getComponents();
            for (Component child : components) {
                bloquear(child); // Llamada recursiva
            }
        }
        component.setEnabled(false);

    }

    public void desbloquear(Component component) {

        if (component instanceof Container) {
            Component[] components = ((Container) component).getComponents();
            for (Component child : components) {
                desbloquear(child); // Llamada recursiva
            }
        }
        component.setEnabled(true);

    }

    public Empleado getDatosEmpleado() {
        Empleado emVista = new Empleado();

        List<Roles> assginedRoles = new ArrayList<>();
        Roles rol = new Roles();

        //  rol.setNombreRol((String) cboxTipoHabi.getSelectedItem());
        assginedRoles.add(rol);

        emVista.setRoles(assginedRoles);

        return emVista;
    }

    public boolean validarCampos() {
        /*
        if (txtApellidoEm.getText().trim().isEmpty()
                || txtCorreoEm.getText().trim().isEmpty()
                || txtCaracteristicasHabi.getText().trim().isEmpty()
                || txtDniEm.getText().trim().isEmpty()
                || txtNombreEm.getText().trim().isEmpty()
                || txtPasswordEm.getText().trim().isEmpty()
                || txtPrecioHabi.getText().trim().isEmpty()) {

            //javax.swing.JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }
         */
        return true;
    }

    public void bloquearImputs() {

        txtIdEditHabi.setEnabled(false);

    }

    public void desbloquearImputs() {

        //  txtDniEm.setEnabled(true);
        // txtNombreEm.setEnabled(true);
        // txtApellidoEm.setEnabled(true);
        // txtCorreoEm.
        // txtDireccionEm.
        // txtDniEm.
        // txtNombreEm.
        // txtPasswordEm.
        // txtTelefonoEm.
    }

    public void llenarFormEditar() {

        /*


         */
        int fila = tablaReservas.getSelectedRow();

        String idHabitacion = String.valueOf(tablaReservas.getValueAt(fila, 0));
        String numeroHabitacion = String.valueOf(tablaReservas.getValueAt(fila, 1));

        txtIdEditHabi.setText(idHabitacion);
        txtNumeroHabitacionEdit.setText(numeroHabitacion);

    }

    public Habitacion datosSaveHabitacion() {
        Habitacion dataHabitacion = new Habitacion();
        TipoHabitacion tipoHabitacion = new TipoHabitacion();

        dataHabitacion.setNumeroDeHabitacion(txtNumeroHabitacionHi.getText());
        dataHabitacion.setEstado(cboxEstadoHabi.getSelectedItem().toString());

        tipoHabitacion.setTipoHabitacion(cboxTipoHabitacionHabi.getSelectedItem().toString());

        dataHabitacion.setTipoHabitacion(tipoHabitacion);

        return dataHabitacion;
    }

    public Habitacion datosUpdateHabitacion() {
        Habitacion dataHabitacion = new Habitacion();
        TipoHabitacion tipoHabitacion = new TipoHabitacion();

        dataHabitacion.setIdHabitacion(Long.valueOf(txtIdEditHabi.getText()));
        dataHabitacion.setNumeroDeHabitacion(txtNumeroHabitacionEdit.getText());
        dataHabitacion.setEstado(cboxEstadoEditHabi.getSelectedItem().toString());
        tipoHabitacion.setTipoHabitacion(cboxTipoHabitacionEditHabi.getSelectedItem().toString());

        dataHabitacion.setTipoHabitacion(tipoHabitacion);

        return dataHabitacion;
    }

    public void darBordes(JPanel jPanel) {
        // Crear una clase interna para el borde redondeado
        class BordeRedondeado extends AbstractBorder {

            private int radio;
            private Color color;
            private int grosor;

            public BordeRedondeado(int radio, Color color, int grosor) {
                this.radio = radio;
                this.color = color;
                this.grosor = grosor;
            }

            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Suaviza bordes
                g2.setColor(color);
                g2.setStroke(new BasicStroke(grosor));
                g2.drawRoundRect(x + grosor / 2, y + grosor / 2, width - grosor, height - grosor, radio, radio); // Esquinas redondeadas
            }

            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(grosor, grosor, grosor, grosor); // Margen del borde
            }

            @Override
            public boolean isBorderOpaque() {
                return true;
            }
        }

        // Aplicar el borde redondeado al JPanel
        jPanel.setBorder(new BordeRedondeado(20, Color.BLACK, 2));
    }
    
    
    public void busquedaDinamica() {
        // Crear un TableRowSorter para el modelo de la tabla
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modTablaReservas);
        tablaReservas.setRowSorter(sorter);

        // Añadir un KeyListener al campo de búsqueda
        txtBuscarReservas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String textoBusqueda = txtBuscarReservas.getText().trim();

                // Si el campo de búsqueda está vacío, mostrar todas las filas
                if (textoBusqueda.isEmpty()) {
                    sorter.setRowFilter(null);
                } else {
                    // Aplicar un filtro en la tabla según el texto ingresado
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoBusqueda));
                }
            }
        });

    }
}
