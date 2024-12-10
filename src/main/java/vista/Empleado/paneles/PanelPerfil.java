/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.Empleado.paneles;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import modelo.entity.Empleado;

/**
 *
 * @author FranDev
 */
public class PanelPerfil extends javax.swing.JPanel {

    /**
     * Creates new form PanelPerfil
     */
    public PanelPerfil() {
        initComponents();
        Panel_RegistroEmpleados.setVisible(false);
        bloquearComponnentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel25 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Panel_RegistroEmpleados = new javax.swing.JPanel();
        btnAceptarCambiarPasswordEm = new javax.swing.JButton();
        btnCancelarEm = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtPasswordActual = new javax.swing.JTextField();
        txtNuevoPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TXTCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXTDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TXTTelefono = new javax.swing.JTextField();
        TXTNombre = new javax.swing.JTextField();
        TXTApellido = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TXTRol = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnEditarPerfil = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtUsuarioLoged1 = new javax.swing.JLabel();
        panelDatos1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        btnEditarPerfil1 = new javax.swing.JButton();

        jLabel25.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel25.setText("Correo Electronico");

        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 27, 118, -1));

        Panel_RegistroEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        Panel_RegistroEmpleados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Panel_RegistroEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_RegistroEmpleados.setEnabled(false);
        Panel_RegistroEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarCambiarPasswordEm.setBackground(new java.awt.Color(0, 255, 0));
        btnAceptarCambiarPasswordEm.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAceptarCambiarPasswordEm.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarCambiarPasswordEm.setText("ACEPTAR");
        btnAceptarCambiarPasswordEm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarCambiarPasswordEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarCambiarPasswordEmActionPerformed(evt);
            }
        });
        Panel_RegistroEmpleados.add(btnAceptarCambiarPasswordEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 30));

        btnCancelarEm.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarEm.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelarEm.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEm.setText("CANCELAR");
        btnCancelarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmActionPerformed(evt);
            }
        });
        Panel_RegistroEmpleados.add(btnCancelarEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 140, 30));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Contraseña Actual");
        Panel_RegistroEmpleados.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 20));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        Panel_RegistroEmpleados.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Nueva Contraseña");
        Panel_RegistroEmpleados.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, 20));

        txtPasswordActual.setBackground(new java.awt.Color(255, 255, 255));
        txtPasswordActual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPasswordActual.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActualActionPerformed(evt);
            }
        });
        txtPasswordActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordActualKeyTyped(evt);
            }
        });
        Panel_RegistroEmpleados.add(txtPasswordActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 30));

        txtNuevoPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtNuevoPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNuevoPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtNuevoPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoPasswordActionPerformed(evt);
            }
        });
        txtNuevoPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevoPasswordKeyTyped(evt);
            }
        });
        Panel_RegistroEmpleados.add(txtNuevoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 140, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cambiar Contraseña");
        Panel_RegistroEmpleados.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 370, 50));

        add(Panel_RegistroEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 370, 270));

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Correo Electrónico");
        panelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        TXTCorreo.setBackground(new java.awt.Color(255, 255, 255));
        TXTCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTCorreo.setForeground(new java.awt.Color(0, 0, 0));
        TXTCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTCorreoActionPerformed(evt);
            }
        });
        panelDatos.add(TXTCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección");
        panelDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        TXTDireccion.setBackground(new java.awt.Color(255, 255, 255));
        TXTDireccion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTDireccion.setForeground(new java.awt.Color(0, 0, 0));
        TXTDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDireccionActionPerformed(evt);
            }
        });
        panelDatos.add(TXTDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Telefóno");
        panelDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        TXTTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TXTTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTTelefono.setForeground(new java.awt.Color(0, 0, 0));
        TXTTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTTelefonoActionPerformed(evt);
            }
        });
        panelDatos.add(TXTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 150, -1));

        TXTNombre.setEditable(false);
        TXTNombre.setBackground(new java.awt.Color(255, 255, 255));
        TXTNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTNombre.setForeground(new java.awt.Color(0, 0, 0));
        TXTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreActionPerformed(evt);
            }
        });
        panelDatos.add(TXTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 150, -1));

        TXTApellido.setBackground(new java.awt.Color(255, 255, 255));
        TXTApellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTApellido.setForeground(new java.awt.Color(0, 0, 0));
        TXTApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTApellidoActionPerformed(evt);
            }
        });
        panelDatos.add(TXTApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 150, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Apellido");
        panelDatos.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 120, -1));

        TXTRol.setBackground(new java.awt.Color(255, 255, 255));
        TXTRol.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTRol.setForeground(new java.awt.Color(0, 0, 0));
        TXTRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTRolActionPerformed(evt);
            }
        });
        panelDatos.add(TXTRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 150, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Rol");
        panelDatos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Nombre");
        panelDatos.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        btnEditarPerfil.setBackground(new java.awt.Color(0, 0, 0));
        btnEditarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil.setText("Actualizar Contraseña");
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });
        panelDatos.add(btnEditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, 32));

        add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 480, 430));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuarioLoged1.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuarioLoged1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        txtUsuarioLoged1.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarioLoged1.setText("PerfPerfil de Usuarioil");
        jPanel1.add(txtUsuarioLoged1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 410, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 790, 70));

        panelDatos1.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelDatos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Avatar");
        panelDatos1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        btnEditarPerfil1.setBackground(new java.awt.Color(0, 0, 0));
        btnEditarPerfil1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarPerfil1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil1.setText("Cambiar Avatar");
        btnEditarPerfil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfil1ActionPerformed(evt);
            }
        });
        panelDatos1.add(btnEditarPerfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 120, 32));

        add(panelDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 300, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        Panel_RegistroEmpleados.setVisible(true);
        bloquear(panelDatos);
        FormEditarPerfil();
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void btnAceptarCambiarPasswordEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarCambiarPasswordEmActionPerformed
       

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
    }//GEN-LAST:event_btnAceptarCambiarPasswordEmActionPerformed

    private void btnCancelarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmActionPerformed
        desbloquear(panelDatos);
        bloquearComponnentes();
        Panel_RegistroEmpleados.setVisible(false);

    }//GEN-LAST:event_btnCancelarEmActionPerformed

    private void txtPasswordActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActualActionPerformed

    private void txtPasswordActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordActualKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActualKeyTyped

    private void txtNuevoPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoPasswordActionPerformed

    private void txtNuevoPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevoPasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoPasswordKeyTyped

    private void TXTCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTCorreoActionPerformed

    private void TXTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNombreActionPerformed

    private void TXTApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTApellidoActionPerformed

    private void btnEditarPerfil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarPerfil1ActionPerformed

    private void TXTDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTDireccionActionPerformed

    private void TXTRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTRolActionPerformed

    private void TXTTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTTelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Panel_RegistroEmpleados;
    public javax.swing.JTextField TXTApellido;
    public javax.swing.JTextField TXTCorreo;
    public javax.swing.JTextField TXTDireccion;
    public javax.swing.JTextField TXTNombre;
    public javax.swing.JTextField TXTRol;
    public javax.swing.JTextField TXTTelefono;
    public javax.swing.JButton btnAceptarCambiarPasswordEm;
    public javax.swing.JButton btnCancelarEm;
    public javax.swing.JButton btnEditarPerfil;
    public javax.swing.JButton btnEditarPerfil1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatos1;
    public javax.swing.JTextField txtNuevoPassword;
    public javax.swing.JTextField txtPasswordActual;
    public javax.swing.JLabel txtUsuarioLoged1;
    // End of variables declaration//GEN-END:variables

    public void bloquearComponnentes() {
        TXTNombre.setEnabled(false);
        TXTApellido.setEnabled(false);
        TXTCorreo.setEnabled(false);
        TXTTelefono.setEnabled(false);
        TXTDireccion.setEnabled(false);
        TXTRol.setEnabled(false);
        //   TXTPassword.setEnabled(false);
    }

    public void FormEditarPerfil() {
        //txtNombreEdit.setText(TXTNombre.getText());
        // txtApellidoEdit.setText(TXTApellido.getText());
        // txtCorreoEdit.setText(TXTCorreo.getText());
        // txtDireccionEdit.setText(TXTDireccion.getText());
        txtPasswordActual.setText(TXTTelefono.getText());
        //txtPasswordEdit.setText(TXTPassword.getText());
    }

    public void limpiarFormEditarPerfil() {
        // txtNombreEdit.setText("");
        // txtApellidoEdit.setText("");
        //  txtCorreoEdit.setText("");
        //  txtDireccionEdit.setText("");
        txtPasswordActual.setText("");
    }

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

    public Empleado datosUpdateEmpleadoPerfil() {
        Empleado empleadoUpdate = new Empleado();

       // empleadoUpdate.setNombre(txtNombreEdit.getText());
       // empleadoUpdate.setApellido(txtApellidoEdit.getText());
       // empleadoUpdate.setCorreoElectronico(txtCorreoEdit.getText());
       // empleadoUpdate.setTelefono(txtTelefonoEdit.getText());
       // empleadoUpdate.setDireccion(txtDireccionEdit.getText());
        empleadoUpdate.setPassword(txtPasswordActual.getText());

        return empleadoUpdate;
    }

}
