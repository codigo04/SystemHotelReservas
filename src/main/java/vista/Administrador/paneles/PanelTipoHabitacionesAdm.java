/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.Administrador.paneles;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import modelo.entity.Empleado;
import modelo.entity.Habitacion;
import modelo.entity.Roles;
import modelo.entity.TipoHabitacion;

/**
 *
 * @author FranDev
 */
public class PanelTipoHabitacionesAdm extends javax.swing.JPanel {

    public DefaultTableModel modTablaHabitaciones = new DefaultTableModel();

    /**
     * Creates new form PanelHabitacionesAdm
     */
    public PanelTipoHabitacionesAdm() {
        initComponents();
        String cabeTableProduc[] = {"ID", "Características", "Precio", "Tipo Habitacion"};
        busquedaDinamica();
        modTablaHabitaciones.setColumnIdentifiers(cabeTableProduc);

        tablaTipoHabitaciones.setModel(modTablaHabitaciones);

        tablaTipoHabitaciones.setBackground(Color.BLACK);
        tablaTipoHabitaciones.setForeground(Color.WHITE);

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

        Panel_EditHabitaciones = new javax.swing.JPanel();
        btnAceptarEditHabi = new javax.swing.JButton();
        btnCancelarEditHabi = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtPrecioEditHabi = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCaracteristicasEditHabi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTipoEditHabi = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtIdEditHabi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Panel_RegistroHabitaciones = new javax.swing.JPanel();
        btnAceptarGuardarHabitacion = new javax.swing.JButton();
        btnCancelarHabitacion = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtPrecioHabi = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCaracteristicasHabi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTipoHabi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jpanelContenidoHabi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoHabitaciones = new javax.swing.JTable();
        txtBuscarTipoHabitacion = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarHabi = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_EditHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        Panel_EditHabitaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_EditHabitaciones.setForeground(new java.awt.Color(0, 0, 0));
        Panel_EditHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_EditHabitaciones.setEnabled(false);
        Panel_EditHabitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarEditHabi.setBackground(new java.awt.Color(51, 255, 0));
        btnAceptarEditHabi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAceptarEditHabi.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarEditHabi.setText("ACEPTAR");
        btnAceptarEditHabi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarEditHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditHabiActionPerformed(evt);
            }
        });
        Panel_EditHabitaciones.add(btnAceptarEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 150, 30));

        btnCancelarEditHabi.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarEditHabi.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelarEditHabi.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEditHabi.setText("CANCELAR");
        btnCancelarEditHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditHabiActionPerformed(evt);
            }
        });
        Panel_EditHabitaciones.add(btnCancelarEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 150, 30));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Precio");
        Panel_EditHabitaciones.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 130, 20));

        txtPrecioEditHabi.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioEditHabi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPrecioEditHabi.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecioEditHabi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioEditHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioEditHabiActionPerformed(evt);
            }
        });
        txtPrecioEditHabi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioEditHabiKeyTyped(evt);
            }
        });
        Panel_EditHabitaciones.add(txtPrecioEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 190, -1));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Características");
        Panel_EditHabitaciones.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, 20));

        txtCaracteristicasEditHabi.setBackground(new java.awt.Color(255, 255, 255));
        txtCaracteristicasEditHabi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCaracteristicasEditHabi.setForeground(new java.awt.Color(0, 0, 0));
        txtCaracteristicasEditHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaracteristicasEditHabiActionPerformed(evt);
            }
        });
        txtCaracteristicasEditHabi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaracteristicasEditHabiKeyTyped(evt);
            }
        });
        Panel_EditHabitaciones.add(txtCaracteristicasEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 380, 60));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tipo Habitación");
        Panel_EditHabitaciones.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 120, 20));

        txtTipoEditHabi.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoEditHabi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTipoEditHabi.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoEditHabi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTipoEditHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoEditHabiActionPerformed(evt);
            }
        });
        txtTipoEditHabi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoEditHabiKeyTyped(evt);
            }
        });
        Panel_EditHabitaciones.add(txtTipoEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, -1));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("ID");
        Panel_EditHabitaciones.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 20));

        txtIdEditHabi.setBackground(new java.awt.Color(255, 255, 255));
        txtIdEditHabi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtIdEditHabi.setForeground(new java.awt.Color(0, 0, 0));
        txtIdEditHabi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
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
        Panel_EditHabitaciones.add(txtIdEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 60, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Editar Tipo de Habitación");
        Panel_EditHabitaciones.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        add(Panel_EditHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 470, 410));

        Panel_RegistroHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        Panel_RegistroHabitaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_RegistroHabitaciones.setForeground(new java.awt.Color(0, 0, 0));
        Panel_RegistroHabitaciones.setEnabled(false);
        Panel_RegistroHabitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarGuardarHabitacion.setBackground(new java.awt.Color(0, 255, 0));
        btnAceptarGuardarHabitacion.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        btnAceptarGuardarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarGuardarHabitacion.setText("ACEPTAR");
        btnAceptarGuardarHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarGuardarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarGuardarHabitacionActionPerformed(evt);
            }
        });
        Panel_RegistroHabitaciones.add(btnAceptarGuardarHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 150, 30));

        btnCancelarHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarHabitacion.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        btnCancelarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarHabitacion.setText("CANCELAR");
        btnCancelarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarHabitacionActionPerformed(evt);
            }
        });
        Panel_RegistroHabitaciones.add(btnCancelarHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 150, 30));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Precio");
        Panel_RegistroHabitaciones.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 110, 20));

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
        Panel_RegistroHabitaciones.add(txtPrecioHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 190, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Características");
        Panel_RegistroHabitaciones.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, 20));

        txtCaracteristicasHabi.setBackground(new java.awt.Color(255, 255, 255));
        txtCaracteristicasHabi.setForeground(new java.awt.Color(0, 0, 0));
        txtCaracteristicasHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaracteristicasHabiActionPerformed(evt);
            }
        });
        txtCaracteristicasHabi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCaracteristicasHabiKeyTyped(evt);
            }
        });
        Panel_RegistroHabitaciones.add(txtCaracteristicasHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 380, 60));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo Habitación");
        Panel_RegistroHabitaciones.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 20));

        txtTipoHabi.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoHabi.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoHabiActionPerformed(evt);
            }
        });
        txtTipoHabi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoHabiKeyTyped(evt);
            }
        });
        Panel_RegistroHabitaciones.add(txtTipoHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Agregar Tipo de Habitación");
        Panel_RegistroHabitaciones.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        add(Panel_RegistroHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 470, 410));

        jpanelContenidoHabi.setBackground(new java.awt.Color(255, 255, 255));
        jpanelContenidoHabi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpanelContenidoHabi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Lista de Habitaciones");
        jpanelContenidoHabi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 260, 48));
        jpanelContenidoHabi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 7, -1, -1));

        tablaTipoHabitaciones.setBackground(new java.awt.Color(180, 180, 180));
        tablaTipoHabitaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tablaTipoHabitaciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tablaTipoHabitaciones.setForeground(new java.awt.Color(0, 0, 0));
        tablaTipoHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaTipoHabitaciones.setGridColor(new java.awt.Color(180, 180, 180));
        jScrollPane1.setViewportView(tablaTipoHabitaciones);

        jpanelContenidoHabi.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 860, 210));

        txtBuscarTipoHabitacion.setBackground(new java.awt.Color(180, 180, 180));
        txtBuscarTipoHabitacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBuscarTipoHabitacion.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscarTipoHabitacion.setText("Buscar Tipo Habitación");
        txtBuscarTipoHabitacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarTipoHabitacionFocusLost(evt);
            }
        });
        txtBuscarTipoHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarTipoHabitacionMouseClicked(evt);
            }
        });
        txtBuscarTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarTipoHabitacionActionPerformed(evt);
            }
        });
        jpanelContenidoHabi.add(txtBuscarTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 74, 276, 32));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jpanelContenidoHabi.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 86, 35));

        add(jpanelContenidoHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 940, 380));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("Gestión de Tipos de Habitaciones");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 23, 710, -1));

        btnAgregarHabi.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarHabi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregarHabi.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarHabi.setText("+ Añadir Tipo Habitación");
        btnAgregarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHabiActionPerformed(evt);
            }
        });
        add(btnAgregarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 210, 48));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarGuardarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarGuardarHabitacionActionPerformed

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

    private void btnAgregarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHabiActionPerformed

        bloquear(jpanelContenidoHabi);
        Panel_RegistroHabitaciones.setVisible(true);

    }//GEN-LAST:event_btnAgregarHabiActionPerformed

    private void txtPrecioHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioHabiActionPerformed

    private void txtPrecioHabiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioHabiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioHabiKeyTyped

    private void txtCaracteristicasHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaracteristicasHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaracteristicasHabiActionPerformed

    private void txtCaracteristicasHabiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaracteristicasHabiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaracteristicasHabiKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        bloquearImputsEdit();

        int fila = tablaTipoHabitaciones.getSelectedRow();

        if (fila == -1) {

            JOptionPane.showConfirmDialog(null, "SELECCIONA UN TIPO   ", "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } else {
            bloquear(jpanelContenidoHabi);
            llenarFormEditar();
            bloquearTablaTipoHabi();
            Panel_EditHabitaciones.setVisible(true);

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtTipoHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoHabiActionPerformed

    private void txtTipoHabiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoHabiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoHabiKeyTyped

    private void btnAceptarEditHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditHabiActionPerformed
        
    }//GEN-LAST:event_btnAceptarEditHabiActionPerformed

    private void btnCancelarEditHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditHabiActionPerformed
        desbloquear(jpanelContenidoHabi);
        desbloquearTablaTipoHabi();
        Panel_EditHabitaciones.setVisible(false);
    }//GEN-LAST:event_btnCancelarEditHabiActionPerformed

    private void txtPrecioEditHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioEditHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioEditHabiActionPerformed

    private void txtPrecioEditHabiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioEditHabiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioEditHabiKeyTyped

    private void txtCaracteristicasEditHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaracteristicasEditHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaracteristicasEditHabiActionPerformed

    private void txtCaracteristicasEditHabiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaracteristicasEditHabiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaracteristicasEditHabiKeyTyped

    private void txtTipoEditHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoEditHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoEditHabiActionPerformed

    private void txtTipoEditHabiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoEditHabiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoEditHabiKeyTyped

    private void txtIdEditHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEditHabiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEditHabiActionPerformed

    private void txtIdEditHabiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEditHabiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEditHabiKeyTyped

    private void txtBuscarTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarTipoHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarTipoHabitacionActionPerformed

    private void txtBuscarTipoHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarTipoHabitacionMouseClicked
        if (txtBuscarTipoHabitacion.getText().equals("Buscar Tipo Habitacion")) {
            txtBuscarTipoHabitacion.setText("");
        }
    }//GEN-LAST:event_txtBuscarTipoHabitacionMouseClicked

    private void txtBuscarTipoHabitacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarTipoHabitacionFocusLost
        if (txtBuscarTipoHabitacion.getText().isEmpty()) {
            txtBuscarTipoHabitacion.setText("Buscar Tipo Habitacion");
        }
    }//GEN-LAST:event_txtBuscarTipoHabitacionFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Panel_EditHabitaciones;
    public javax.swing.JPanel Panel_RegistroHabitaciones;
    public javax.swing.JButton btnAceptarEditHabi;
    public javax.swing.JButton btnAceptarGuardarHabitacion;
    public javax.swing.JButton btnAgregarHabi;
    public javax.swing.JButton btnCancelarEditHabi;
    public javax.swing.JButton btnCancelarHabitacion;
    public javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel jpanelContenidoHabi;
    public javax.swing.JTable tablaTipoHabitaciones;
    private javax.swing.JTextField txtBuscarTipoHabitacion;
    public javax.swing.JTextField txtCaracteristicasEditHabi;
    public javax.swing.JTextField txtCaracteristicasHabi;
    public javax.swing.JTextField txtIdEditHabi;
    public javax.swing.JTextField txtPrecioEditHabi;
    public javax.swing.JTextField txtPrecioHabi;
    public javax.swing.JTextField txtTipoEditHabi;
    public javax.swing.JTextField txtTipoHabi;
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

    public TipoHabitacion datosUpdateHbitacion() {
        TipoHabitacion tipoHabitacion = new TipoHabitacion();

        tipoHabitacion.setIdTipo(Long.valueOf(txtIdEditHabi.getText()));
        tipoHabitacion.setTipoHabitacion(txtTipoEditHabi.getText());
        tipoHabitacion.setPrecio(Double.parseDouble(txtPrecioEditHabi.getText()));
        tipoHabitacion.setCaracteristicas(txtCaracteristicasEditHabi.getText());

        return tipoHabitacion;
    }

    public boolean validarCampos() {

        if (txtTipoHabi.getText().trim().isEmpty()
                || txtPrecioHabi.getText().trim().isEmpty()
                || txtCaracteristicasHabi.getText().trim().isEmpty()) {

            javax.swing.JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public void bloquearImputs() {

        //txtDniEm.setEnabled(false);
        //txtNombreEm.setEnabled(false);
        // txtApellidoEm.setEnabled(false);
        // txtCorreoEm.
        // txtDireccionEm.
        // txtDniEm.
        // txtNombreEm.
        // txtPasswordEm.
        // txtTelefonoEm.
    }

    public void bloquearImputsEdit() {

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
        int fila = tablaTipoHabitaciones.getSelectedRow();

        String id = String.valueOf(tablaTipoHabitaciones.getValueAt(fila, 0));
        String caracteristicas = String.valueOf(tablaTipoHabitaciones.getValueAt(fila, 1));
        String precio = String.valueOf(tablaTipoHabitaciones.getValueAt(fila, 2));
        String tipoHasbitacion = String.valueOf(tablaTipoHabitaciones.getValueAt(fila, 3));

        txtIdEditHabi.setText(id);
        txtTipoEditHabi.setText(tipoHasbitacion);
        txtCaracteristicasEditHabi.setText(caracteristicas);
        txtPrecioEditHabi.setText(precio);

    }

    public TipoHabitacion datosSaveHbitacion() {
        TipoHabitacion tipoHabitacion = new TipoHabitacion();

        tipoHabitacion.setTipoHabitacion(txtTipoHabi.getText());
        tipoHabitacion.setPrecio(Double.parseDouble(txtPrecioHabi.getText()));
        tipoHabitacion.setCaracteristicas(txtCaracteristicasHabi.getText());

        return tipoHabitacion;
    }

    public void busquedaDinamica() {
        // Crear un TableRowSorter para el modelo de la tabla
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modTablaHabitaciones);
        tablaTipoHabitaciones.setRowSorter(sorter);

        // Añadir un KeyListener al campo de búsqueda
        txtBuscarTipoHabitacion.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String textoBusqueda = txtBuscarTipoHabitacion.getText().trim();

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

    public void bloquearTablaTipoHabi() {
        // Obtener el JScrollPane que contiene la tabla
        JScrollPane scrollPane = (JScrollPane) tablaTipoHabitaciones.getParent().getParent();

        // Deshabilitar el desplazamiento
        scrollPane.setWheelScrollingEnabled(false); // Deshabilita el scroll con el ratón
        scrollPane.getVerticalScrollBar().setEnabled(false); // Deshabilita la barra de desplazamiento vertical
        scrollPane.getHorizontalScrollBar().setEnabled(false); // Deshabilita la barra de desplazamiento horizontal

        // También, puedes deshabilitar la tabla completamente, para evitar que interactúen con la misma
        tablaTipoHabitaciones.setEnabled(false); // Deshabilita la interacción con la tabla

    }

    public void desbloquearTablaTipoHabi() {
        // Obtener el JScrollPane que contiene la tabla
        JScrollPane scrollPane = (JScrollPane) tablaTipoHabitaciones.getParent().getParent();

        // Deshabilitar el desplazamiento
        scrollPane.setWheelScrollingEnabled(true); // Deshabilita el scroll con el ratón
        scrollPane.getVerticalScrollBar().setEnabled(true); // Deshabilita la barra de desplazamiento vertical
        scrollPane.getHorizontalScrollBar().setEnabled(true); // Deshabilita la barra de desplazamiento horizontal

        // También, puedes deshabilitar la tabla completamente, para evitar que interactúen con la misma
        tablaTipoHabitaciones.setEnabled(true); // Deshabilita la interacción con la tabla

    }

    public boolean validarCamposTipoHabitacionSave() {

        if (txtPrecioHabi.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El precio del tipo de habitación es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String precio = txtPrecioHabi.getText().trim();

        // Verificar que sea un número válido (entero o decimal)
        if (!precio.matches("^\\d+(\\.\\d+)?$")) {
            JOptionPane.showMessageDialog(null, "Ingrese un precio válido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    public boolean validarCamposTipoHabitacionUpdate() {

        if (txtPrecioEditHabi.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El precio del tipo de habitación es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String precio = txtPrecioEditHabi.getText().trim();

        // Verificar que sea un número válido (entero o decimal)
        if (!precio.matches("^\\d+(\\.\\d+)?$")) {
            JOptionPane.showMessageDialog(null, "Ingrese un precio válido", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (txtTipoEditHabi.getText().trim().isEmpty()
                || txtPrecioEditHabi.getText().trim().isEmpty()
                || txtCaracteristicasEditHabi.getText().trim().isEmpty()) {

            javax.swing.JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.", "Error de Validación", javax.swing.JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
}
