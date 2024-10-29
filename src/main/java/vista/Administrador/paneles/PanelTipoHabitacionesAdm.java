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

        jLabel1 = new javax.swing.JLabel();
        btnAgregarHabi = new javax.swing.JButton();
        Panel_EditHabitaciones = new javax.swing.JPanel();
        btnAceptarEditHabi = new javax.swing.JButton();
        btnCancelarEditHabi = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPrecioEditHabi = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCaracteristicasEditHabi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTipoEditHabi = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtIdEditHabi = new javax.swing.JTextField();
        Panel_RegistroHabitaciones = new javax.swing.JPanel();
        btnAceptarGuardarHabitacion = new javax.swing.JButton();
        btnCancelarHabitacion = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPrecioHabi = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCaracteristicasHabi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTipoHabi = new javax.swing.JTextField();
        jpanelContenidoHabi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipoHabitaciones = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtBuscarTipoHabitacion = new javax.swing.JTextField();
        btnBuscarEmpleado = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestión de Tipos de Habitaciones");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 23, 571, -1));

        btnAgregarHabi.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregarHabi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarHabi.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarHabi.setText("+ Añadir Tipo Habitacion");
        btnAgregarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHabiActionPerformed(evt);
            }
        });
        add(btnAgregarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 30, 180, 48));

        Panel_EditHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        Panel_EditHabitaciones.setEnabled(false);
        Panel_EditHabitaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarEditHabi.setBackground(new java.awt.Color(0, 255, 0));
        btnAceptarEditHabi.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAceptarEditHabi.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarEditHabi.setText("ACEPTAR");
        btnAceptarEditHabi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarEditHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditHabiActionPerformed(evt);
            }
        });
        Panel_EditHabitaciones.add(btnAceptarEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 180, 30));

        btnCancelarEditHabi.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarEditHabi.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCancelarEditHabi.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEditHabi.setText("CANCELAR");
        btnCancelarEditHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditHabiActionPerformed(evt);
            }
        });
        Panel_EditHabitaciones.add(btnCancelarEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 170, 30));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon("D:\\PROYECTOS UNI\\Proyectos-Desktop\\SystemHotelReservas\\src\\main\\java\\Imagenes\\img-editar.png")); // NOI18N
        Panel_EditHabitaciones.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 90));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("PRECIO");
        Panel_EditHabitaciones.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 110, 20));

        txtPrecioEditHabi.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioEditHabi.setForeground(new java.awt.Color(0, 0, 0));
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

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("CARACTERISTICAS");
        Panel_EditHabitaciones.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 170, 20));

        txtCaracteristicasEditHabi.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Tipo Habitacion");
        Panel_EditHabitaciones.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, 20));

        txtTipoEditHabi.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoEditHabi.setForeground(new java.awt.Color(0, 0, 0));
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

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("ID");
        Panel_EditHabitaciones.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 70, 20));

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
        Panel_EditHabitaciones.add(txtIdEditHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 60, -1));

        add(Panel_EditHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 470, 410));

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
        Panel_RegistroHabitaciones.add(btnAceptarGuardarHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 180, 30));

        btnCancelarHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarHabitacion.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCancelarHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarHabitacion.setText("CANCELAR");
        btnCancelarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarHabitacionActionPerformed(evt);
            }
        });
        Panel_RegistroHabitaciones.add(btnCancelarHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 170, 30));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon("D:\\PROYECTOS UNI\\Proyectos-Desktop\\SystemHotelReservas\\src\\main\\java\\Imagenes\\img-editar.png")); // NOI18N
        Panel_RegistroHabitaciones.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 90));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("PRECIO");
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
        Panel_RegistroHabitaciones.add(txtPrecioHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 190, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("CARACTERISTICAS");
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

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipo Habitacion");
        Panel_RegistroHabitaciones.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, 20));

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
        Panel_RegistroHabitaciones.add(txtTipoHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, -1));

        add(Panel_RegistroHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 470, 410));

        jpanelContenidoHabi.setBackground(new java.awt.Color(255, 255, 255));
        jpanelContenidoHabi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpanelContenidoHabi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Lista de Habitaciones");
        jpanelContenidoHabi.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 260, 48));
        jpanelContenidoHabi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 7, -1, -1));

        tablaTipoHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaTipoHabitaciones);

        jpanelContenidoHabi.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 860, 170));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpanelContenidoHabi.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 86, 35));

        txtBuscarTipoHabitacion.setText("Buscar Tipo Habitacion");
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

        btnBuscarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.setText("Buscar");
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });
        jpanelContenidoHabi.add(btnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 73, 86, 35));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jpanelContenidoHabi.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 86, 35));

        add(jpanelContenidoHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 89, 990, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        bloquearImputs();

        int fila = tablaTipoHabitaciones.getSelectedRow();

        if (fila == -1) {

            JOptionPane.showConfirmDialog(null, "SELECCIONA UN HABITACION   ", "", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

        } else {
            bloquear(jpanelContenidoHabi);
            bloquearImputs();
            llenarFormEditar();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

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
        desbloquear(jpanelContenidoHabi);
        Panel_EditHabitaciones.setVisible(false);
    }//GEN-LAST:event_btnAceptarEditHabiActionPerformed

    private void btnCancelarEditHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditHabiActionPerformed
        desbloquear(jpanelContenidoHabi);
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
    public javax.swing.JButton btnBuscarEmpleado;
    public javax.swing.JButton btnCancelarEditHabi;
    public javax.swing.JButton btnCancelarHabitacion;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelContenidoHabi;
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
}
