/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.Administrador.paneles;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.entity.Empleado;
import modelo.entity.Roles;

/**
 *
 * @author FranDev
 */
public class PanelEmpleadoAdm extends javax.swing.JPanel {

    public DefaultTableModel modTablaEmpleados = new DefaultTableModel();

    /**
     * Creates new form PanelHabitacionesAdm
     */
    public PanelEmpleadoAdm() {
        initComponents();
        String cabeTableProduc[] = {"ID", "NOMBRE", "DNI", "CARGO", "ESTADO"};

        modTablaEmpleados.setColumnIdentifiers(cabeTableProduc);

        tablaEmpleados.setModel(modTablaEmpleados);

        tablaEmpleados.setBackground(Color.BLACK);
        tablaEmpleados.setForeground(Color.WHITE);

        Panel_RegistroEmpleados.setVisible(false);

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
        jButton1 = new javax.swing.JButton();
        Panel_RegistroEmpleados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreEm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnAceptarEm = new javax.swing.JButton();
        btnCancelarEm = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cboxPuesto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtApellidoEm = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnBuscarReniecEm = new javax.swing.JButton();
        txtDniEm = new javax.swing.JTextField();
        txtPasswordEm = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTelefonoEm = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCorreoEm = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtDireccionEm = new javax.swing.JTextField();
        jpanelContenidoEm = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnBuscarEmpleado = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Gestión de Empleados");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 23, 571, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+ Añadir Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, -1, 48));

        Panel_RegistroEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        Panel_RegistroEmpleados.setEnabled(false);
        Panel_RegistroEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("INGRESE SU DNI: ");
        Panel_RegistroEmpleados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText(" NOMBRE:");
        Panel_RegistroEmpleados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 60, 20));

        txtNombreEm.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreEm.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmActionPerformed(evt);
            }
        });
        txtNombreEm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmKeyTyped(evt);
            }
        });
        Panel_RegistroEmpleados.add(txtNombreEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 210, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PUESTO:");
        Panel_RegistroEmpleados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 70, 20));

        txtSalario.setBackground(new java.awt.Color(255, 255, 255));
        txtSalario.setForeground(new java.awt.Color(0, 0, 0));
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioKeyTyped(evt);
            }
        });
        Panel_RegistroEmpleados.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 60, -1));

        btnAceptarEm.setBackground(new java.awt.Color(0, 255, 0));
        btnAceptarEm.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAceptarEm.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarEm.setText("ACEPTAR");
        btnAceptarEm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEmActionPerformed(evt);
            }
        });
        Panel_RegistroEmpleados.add(btnAceptarEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 180, 30));

        btnCancelarEm.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarEm.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCancelarEm.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEm.setText("CANCELAR");
        btnCancelarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmActionPerformed(evt);
            }
        });
        Panel_RegistroEmpleados.add(btnCancelarEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 170, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("APELLIDO:");
        Panel_RegistroEmpleados.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        cboxPuesto.setBackground(new java.awt.Color(255, 255, 255));
        cboxPuesto.setForeground(new java.awt.Color(0, 0, 0));
        cboxPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administrador", "Recepcionista", "MultiRol " }));
        cboxPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPuestoActionPerformed(evt);
            }
        });
        Panel_RegistroEmpleados.add(cboxPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 210, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SALARIO");
        Panel_RegistroEmpleados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 70, 20));

        txtApellidoEm.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoEm.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoEmActionPerformed(evt);
            }
        });
        txtApellidoEm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEmKeyTyped(evt);
            }
        });
        Panel_RegistroEmpleados.add(txtApellidoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 210, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("CONTRASEÑA:");
        Panel_RegistroEmpleados.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 90, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon("F:\\Proyectos-Desktop\\SystemHotelReservas\\src\\main\\java\\Imagenes\\registrarse.png")); // NOI18N
        Panel_RegistroEmpleados.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 90));

        btnBuscarReniecEm.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarReniecEm.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarReniecEm.setText("Aceptar");
        btnBuscarReniecEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReniecEmActionPerformed(evt);
            }
        });
        Panel_RegistroEmpleados.add(btnBuscarReniecEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, 30));

        txtDniEm.setBackground(new java.awt.Color(255, 255, 255));
        txtDniEm.setForeground(new java.awt.Color(0, 0, 0));
        txtDniEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniEmActionPerformed(evt);
            }
        });
        Panel_RegistroEmpleados.add(txtDniEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 112, 140, -1));

        txtPasswordEm.setBackground(new java.awt.Color(255, 255, 255));
        txtPasswordEm.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordEmActionPerformed(evt);
            }
        });
        txtPasswordEm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordEmKeyTyped(evt);
            }
        });
        Panel_RegistroEmpleados.add(txtPasswordEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 210, -1));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("TELEFONO:");
        Panel_RegistroEmpleados.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 70, 20));

        txtTelefonoEm.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoEm.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEmActionPerformed(evt);
            }
        });
        txtTelefonoEm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEmKeyTyped(evt);
            }
        });
        Panel_RegistroEmpleados.add(txtTelefonoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 210, -1));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("CORREO");
        Panel_RegistroEmpleados.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 20));

        txtCorreoEm.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoEm.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreoEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoEmActionPerformed(evt);
            }
        });
        txtCorreoEm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoEmKeyTyped(evt);
            }
        });
        Panel_RegistroEmpleados.add(txtCorreoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 210, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("DIRECCION:");
        Panel_RegistroEmpleados.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 70, 20));

        txtDireccionEm.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionEm.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccionEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionEmActionPerformed(evt);
            }
        });
        txtDireccionEm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionEmKeyTyped(evt);
            }
        });
        Panel_RegistroEmpleados.add(txtDireccionEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 210, -1));

        add(Panel_RegistroEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, 450));

        jpanelContenidoEm.setBackground(new java.awt.Color(255, 255, 255));
        jpanelContenidoEm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpanelContenidoEm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Lista de Empleados");
        jpanelContenidoEm.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 7, -1, 48));

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\Proyectos-Desktop\\SystemHotelReservas\\src\\main\\java\\Imagenes\\icon-user.png")); // NOI18N
        jpanelContenidoEm.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 7, -1, -1));

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        jpanelContenidoEm.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 860, 170));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpanelContenidoEm.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 86, 35));

        jTextField1.setText("Buscar Empleado");
        jpanelContenidoEm.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 74, 276, 32));

        btnBuscarEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.setText("Buscar");
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });
        jpanelContenidoEm.add(btnBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 73, 86, 35));

        add(jpanelContenidoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 89, 990, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void txtNombreEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmActionPerformed

    private void txtNombreEmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmKeyTyped

        // validarLetras(evt, txtNombre);
    }//GEN-LAST:event_txtNombreEmKeyTyped

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void txtSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyTyped

        // validarNum(evt, txtSalario);
    }//GEN-LAST:event_txtSalarioKeyTyped

    private void btnAceptarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEmActionPerformed
        desbloquear(jpanelContenidoEm);
        Panel_RegistroEmpleados.setVisible(false);

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
    }//GEN-LAST:event_btnAceptarEmActionPerformed

    private void btnCancelarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmActionPerformed
        desbloquear(jpanelContenidoEm);
        Panel_RegistroEmpleados.setVisible(false);
    }//GEN-LAST:event_btnCancelarEmActionPerformed

    private void cboxPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPuestoActionPerformed
        cboxPuesto.getSelectedItem();
        if (cboxPuesto.getSelectedIndex() == 1 || cboxPuesto.getSelectedIndex() == 2 || cboxPuesto.getSelectedIndex() == 3) {
            txtSalario.setText("1200");

        } else if (cboxPuesto.getSelectedIndex() == 4) {
            txtSalario.setText("2000");
        }
    }//GEN-LAST:event_cboxPuestoActionPerformed

    private void txtApellidoEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEmActionPerformed

    private void txtApellidoEmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEmKeyTyped

        // validarNumTe(evt, txtTelefono);
    }//GEN-LAST:event_txtApellidoEmKeyTyped

    private void btnBuscarReniecEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReniecEmActionPerformed
        /* txtDni.getText();
        String nombres = "";
        String apellidoMaterno = "";
        String apellido_paterno = "";
        try {
            String apiUrl = "https://apiperu.dev/api/dni";
            String token = "80023b3d4012da96b050f6d877907074c222c4de47da30a230a92448b46d2eb1";
            String dni = txtDni.getText();

            // Crear una URL
            URL url = new URL(apiUrl);

            // Abrir una conexión HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Establecer el método de solicitud como POST
            connection.setRequestMethod("POST");

            // Habilitar la escritura en la conexión
            connection.setDoOutput(true);

            // Establecer el tipo de contenido
            connection.setRequestProperty("Content-Type", "application/json");

            // Establecer el encabezado de autorización con el token
            connection.setRequestProperty("Authorization", "Bearer " + token);

            // Crear el cuerpo JSON de la solicitud
            String jsonInputString = "{\"dni\": \"" + dni + "\"}";

            // Escribir el cuerpo JSON en la conexión
            try (DataOutputStream os = new DataOutputStream(connection.getOutputStream())) {
                os.write(jsonInputString.getBytes("UTF-8"));
            }

            // Obtener la respuesta de la API
            int responseCode = connection.getResponseCode();

            // Leer la respuesta de la API
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JSONObject jsonResponse = new JSONObject(response.toString());
                JSONObject data = jsonResponse.getJSONObject("data");

                nombres = data.getString("nombres");
                apellidoMaterno = data.getString("apellido_materno");
                apellido_paterno = data.getString("apellido_paterno");
                // Imprimir el nombre y apellido materno
                System.out.println("Nombre: " + nombres);
                System.out.println("Apellido Materno: " + apellidoMaterno);
                System.out.println("Apellido Paterno: " + apellido_paterno);

            } else {
                System.out.println("Error en la solicitud, código de respuesta: " + responseCode);
            }

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        txtNombre.setText(nombres);
        txtApellido.setText(apellido_paterno + " " + apellidoMaterno);
         */
    }//GEN-LAST:event_btnBuscarReniecEmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        bloquear(jpanelContenidoEm);

        Panel_RegistroEmpleados.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPasswordEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordEmActionPerformed

    private void txtPasswordEmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordEmKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordEmKeyTyped

    private void txtDniEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniEmActionPerformed

    private void txtTelefonoEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEmActionPerformed

    private void txtTelefonoEmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEmKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEmKeyTyped

    private void txtCorreoEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoEmActionPerformed

    private void txtCorreoEmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoEmKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoEmKeyTyped

    private void txtDireccionEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionEmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionEmActionPerformed

    private void txtDireccionEmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionEmKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionEmKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Panel_RegistroEmpleados;
    public javax.swing.JButton btnAceptarEm;
    public javax.swing.JButton btnBuscarEmpleado;
    public javax.swing.JButton btnBuscarReniecEm;
    public javax.swing.JButton btnCancelarEm;
    public javax.swing.JComboBox<String> cboxPuesto;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpanelContenidoEm;
    public javax.swing.JTable tablaEmpleados;
    public javax.swing.JTextField txtApellidoEm;
    public javax.swing.JTextField txtCorreoEm;
    public javax.swing.JTextField txtDireccionEm;
    public javax.swing.JTextField txtDniEm;
    public javax.swing.JTextField txtNombreEm;
    public javax.swing.JTextField txtPasswordEm;
    public javax.swing.JTextField txtSalario;
    public javax.swing.JTextField txtTelefonoEm;
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
        
        List<Roles> roles = new ArrayList<>();
        
        emVista.setDni(txtDniEm.getText());
       // emVista.setNombres(txtNombreEm.getText());
       // emVista.setApellidos(txtApellidoEm.getText());
        emVista.setDireccion(txtDireccionEm.getText());
        emVista.setCorreoElectronico(txtCorreoEm.getText());
        emVista.setPassword(txtPasswordEm.getText());
        
        Roles rol = new Roles();
                
        rol.setNombreRol((String) cboxPuesto.getSelectedItem()); 
        
        roles.add(rol);
        
        emVista.setRoles(roles);
    

        return emVista;
    }
}
