/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.Administrador.paneles;

import java.awt.Component;
import java.awt.Container;
import modelo.entity.Empleado;
import vista.Empleado.paneles.*;

/**
 *
 * @author FranDev
 */
public class PanelPerfilAdm extends javax.swing.JPanel {

    /**
     *
     * Creates new form PanelPerfil
     */
    public PanelPerfilAdm() {
        initComponents();
        Panel_EditPerfil.setVisible(false);
        bloquearComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_EditPerfil = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtNombreEditPerf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtApellidoEditPerf = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCorreoElectronicoEditPerf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefonoEditPerf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDireccionEditPerf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPasswordEditPerf = new javax.swing.JTextField();
        btnCancelarEditHabitacion = new javax.swing.JButton();
        btnAceptarEditHabitacion = new javax.swing.JButton();
        jpanelInfoPerf = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCorreoUsPerfil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccionUsPerfil = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefonoUsPerfil = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnEditarPerfil = new javax.swing.JButton();
        txtUsuarioLoged1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoUsLoged = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtRolEmpleadoUsPerfil = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNombreUsLoged = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPasswordEmpleadoUsPerfil = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_EditPerfil.setBackground(new java.awt.Color(255, 255, 255));
        Panel_EditPerfil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Panel_EditPerfil.setEnabled(false);
        Panel_EditPerfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Editar Datos Personales");
        Panel_EditPerfil.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 320, 50));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("NOMBRE");
        Panel_EditPerfil.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 70, 20));

        txtNombreEditPerf.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreEditPerf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombreEditPerf.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreEditPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEditPerfActionPerformed(evt);
            }
        });
        txtNombreEditPerf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEditPerfKeyTyped(evt);
            }
        });
        Panel_EditPerfil.add(txtNombreEditPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 150, -1));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("APELLIDO");
        Panel_EditPerfil.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 80, 20));

        txtApellidoEditPerf.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoEditPerf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtApellidoEditPerf.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoEditPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoEditPerfActionPerformed(evt);
            }
        });
        txtApellidoEditPerf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEditPerfKeyTyped(evt);
            }
        });
        Panel_EditPerfil.add(txtApellidoEditPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 150, -1));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("CORREO ELECTRONICO");
        Panel_EditPerfil.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 20));

        txtCorreoElectronicoEditPerf.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoElectronicoEditPerf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCorreoElectronicoEditPerf.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreoElectronicoEditPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoEditPerfActionPerformed(evt);
            }
        });
        txtCorreoElectronicoEditPerf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoElectronicoEditPerfKeyTyped(evt);
            }
        });
        Panel_EditPerfil.add(txtCorreoElectronicoEditPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 320, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("TELEFONO");
        Panel_EditPerfil.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 130, 20));

        txtTelefonoEditPerf.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoEditPerf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefonoEditPerf.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoEditPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoEditPerfActionPerformed(evt);
            }
        });
        txtTelefonoEditPerf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEditPerfKeyTyped(evt);
            }
        });
        Panel_EditPerfil.add(txtTelefonoEditPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("DIRECCION");
        Panel_EditPerfil.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 90, 20));

        txtDireccionEditPerf.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionEditPerf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDireccionEditPerf.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccionEditPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionEditPerfActionPerformed(evt);
            }
        });
        txtDireccionEditPerf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionEditPerfKeyTyped(evt);
            }
        });
        Panel_EditPerfil.add(txtDireccionEditPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 320, -1));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("CONTRASEÑA:");
        Panel_EditPerfil.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 120, 20));

        txtPasswordEditPerf.setBackground(new java.awt.Color(255, 255, 255));
        txtPasswordEditPerf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPasswordEditPerf.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordEditPerf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordEditPerfActionPerformed(evt);
            }
        });
        txtPasswordEditPerf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordEditPerfKeyTyped(evt);
            }
        });
        Panel_EditPerfil.add(txtPasswordEditPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 320, -1));

        btnCancelarEditHabitacion.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarEditHabitacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelarEditHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEditHabitacion.setText("CANCELAR");
        btnCancelarEditHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditHabitacionActionPerformed(evt);
            }
        });
        Panel_EditPerfil.add(btnCancelarEditHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 140, 30));

        btnAceptarEditHabitacion.setBackground(new java.awt.Color(0, 255, 0));
        btnAceptarEditHabitacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAceptarEditHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarEditHabitacion.setText("ACEPTAR");
        btnAceptarEditHabitacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarEditHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEditHabitacionActionPerformed(evt);
            }
        });
        Panel_EditPerfil.add(btnAceptarEditHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 140, 30));

        add(Panel_EditPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 430, 470));

        jpanelInfoPerf.setBackground(new java.awt.Color(255, 255, 255));
        jpanelInfoPerf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jpanelInfoPerf.setForeground(new java.awt.Color(0, 0, 0));
        jpanelInfoPerf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("APELLIDO");
        jpanelInfoPerf.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        txtCorreoUsPerfil.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoUsPerfil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCorreoUsPerfil.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreoUsPerfil.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreoUsPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoUsPerfilActionPerformed(evt);
            }
        });
        jpanelInfoPerf.add(txtCorreoUsPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 270, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ROL");
        jpanelInfoPerf.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        txtDireccionUsPerfil.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionUsPerfil.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccionUsPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionUsPerfilActionPerformed(evt);
            }
        });
        jpanelInfoPerf.add(txtDireccionUsPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 270, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("TELEFONO");
        jpanelInfoPerf.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        txtTelefonoUsPerfil.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefonoUsPerfil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTelefonoUsPerfil.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoUsPerfil.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefonoUsPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoUsPerfilActionPerformed(evt);
            }
        });
        jpanelInfoPerf.add(txtTelefonoUsPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 270, -1));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditarPerfil.setBackground(new java.awt.Color(51, 51, 51));
        btnEditarPerfil.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnEditarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPerfil.setText("Editar Perfil");
        btnEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 130, 30));

        txtUsuarioLoged1.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuarioLoged1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        txtUsuarioLoged1.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuarioLoged1.setText("Perfil del Administrador");
        jPanel1.add(txtUsuarioLoged1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 410, 50));

        jpanelInfoPerf.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CORREO ELECTRONICO");
        jpanelInfoPerf.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txtApellidoUsLoged.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidoUsLoged.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtApellidoUsLoged.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoUsLoged.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoUsLoged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoUsLogedActionPerformed(evt);
            }
        });
        jpanelInfoPerf.add(txtApellidoUsLoged, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 270, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("DIRECCION");
        jpanelInfoPerf.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        txtRolEmpleadoUsPerfil.setBackground(new java.awt.Color(255, 255, 255));
        txtRolEmpleadoUsPerfil.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpanelInfoPerf.add(txtRolEmpleadoUsPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 270, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("NOMBRE");
        jpanelInfoPerf.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        txtNombreUsLoged.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreUsLoged.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombreUsLoged.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreUsLoged.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreUsLoged.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsLogedActionPerformed(evt);
            }
        });
        jpanelInfoPerf.add(txtNombreUsLoged, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 270, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("CONTRASEÑA");
        jpanelInfoPerf.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        txtPasswordEmpleadoUsPerfil.setEditable(false);
        txtPasswordEmpleadoUsPerfil.setBackground(new java.awt.Color(255, 255, 255));
        txtPasswordEmpleadoUsPerfil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPasswordEmpleadoUsPerfil.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPasswordEmpleadoUsPerfil.setAutoscrolls(false);
        txtPasswordEmpleadoUsPerfil.setEnabled(false);
        jpanelInfoPerf.add(txtPasswordEmpleadoUsPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 270, -1));

        add(jpanelInfoPerf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 740, 540));

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPerfilActionPerformed
        
        Panel_EditPerfil.setVisible(true);
        llenearFormEditarPerfilUs();
    }//GEN-LAST:event_btnEditarPerfilActionPerformed

    private void txtTelefonoUsPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoUsPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoUsPerfilActionPerformed

    private void txtDireccionUsPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionUsPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionUsPerfilActionPerformed

    private void txtCorreoUsPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoUsPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoUsPerfilActionPerformed

    private void btnAceptarEditHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEditHabitacionActionPerformed
        
        desbloquear(jpanelInfoPerf);
        bloquearComponentes();
        Panel_EditPerfil.setVisible(false);
    }//GEN-LAST:event_btnAceptarEditHabitacionActionPerformed

    private void btnCancelarEditHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditHabitacionActionPerformed
        
        desbloquear(jpanelInfoPerf);
        Panel_EditPerfil.setVisible(false);
    }//GEN-LAST:event_btnCancelarEditHabitacionActionPerformed

    private void txtCorreoElectronicoEditPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoEditPerfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoEditPerfActionPerformed

    private void txtCorreoElectronicoEditPerfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoEditPerfKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoEditPerfKeyTyped

    private void txtTelefonoEditPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoEditPerfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEditPerfActionPerformed

    private void txtTelefonoEditPerfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEditPerfKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEditPerfKeyTyped

    private void txtDireccionEditPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionEditPerfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionEditPerfActionPerformed

    private void txtDireccionEditPerfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionEditPerfKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionEditPerfKeyTyped

    private void txtApellidoUsLogedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoUsLogedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoUsLogedActionPerformed

    private void txtNombreUsLogedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsLogedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsLogedActionPerformed

    private void txtNombreEditPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEditPerfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEditPerfActionPerformed

    private void txtNombreEditPerfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEditPerfKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEditPerfKeyTyped

    private void txtApellidoEditPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoEditPerfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEditPerfActionPerformed

    private void txtApellidoEditPerfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEditPerfKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEditPerfKeyTyped

    private void txtPasswordEditPerfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordEditPerfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordEditPerfActionPerformed

    private void txtPasswordEditPerfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordEditPerfKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordEditPerfKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Panel_EditPerfil;
    public javax.swing.JButton btnAceptarEditHabitacion;
    public javax.swing.JButton btnCancelarEditHabitacion;
    public javax.swing.JButton btnEditarPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanelInfoPerf;
    public javax.swing.JTextField txtApellidoEditPerf;
    public javax.swing.JTextField txtApellidoUsLoged;
    public javax.swing.JTextField txtCorreoElectronicoEditPerf;
    public javax.swing.JTextField txtCorreoUsPerfil;
    public javax.swing.JTextField txtDireccionEditPerf;
    public javax.swing.JTextField txtDireccionUsPerfil;
    public javax.swing.JTextField txtNombreEditPerf;
    public javax.swing.JTextField txtNombreUsLoged;
    public javax.swing.JTextField txtPasswordEditPerf;
    public javax.swing.JTextField txtPasswordEmpleadoUsPerfil;
    public javax.swing.JTextField txtRolEmpleadoUsPerfil;
    public javax.swing.JTextField txtTelefonoEditPerf;
    public javax.swing.JTextField txtTelefonoUsPerfil;
    public javax.swing.JLabel txtUsuarioLoged1;
    // End of variables declaration//GEN-END:variables

    public void bloquearComponentes() {
        txtCorreoUsPerfil.setEnabled(false);
        txtTelefonoUsPerfil.setEnabled(false);
        txtDireccionUsPerfil.setEnabled(false);
        txtRolEmpleadoUsPerfil.setEnabled(false);
        txtNombreUsLoged.setEnabled(false);
        txtApellidoUsLoged.setEnabled(false);
    }

    public void llenearFormEditarPerfilUs() {
        txtNombreEditPerf.setText(txtNombreUsLoged.getText());
        txtApellidoEditPerf.setText(txtApellidoUsLoged.getText());
        txtCorreoElectronicoEditPerf.setText(txtCorreoUsPerfil.getText());
        txtTelefonoEditPerf.setText(txtTelefonoUsPerfil.getText());
        txtDireccionEditPerf.setText(txtDireccionUsPerfil.getText());
        txtPasswordEditPerf.setText(txtPasswordEmpleadoUsPerfil.getText());
    }

    public void limpiarFormEditarPerfilUs() {
        txtNombreEditPerf.setText("");
        txtApellidoEditPerf.setText("");
        txtCorreoElectronicoEditPerf.setText("");
        txtTelefonoEditPerf.setText("");
        txtDireccionEditPerf.setText("");
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

        empleadoUpdate.setNombre(txtNombreEditPerf.getText());
        empleadoUpdate.setApellido(txtApellidoEditPerf.getText());
        empleadoUpdate.setCorreoElectronico(txtCorreoElectronicoEditPerf.getText());
        empleadoUpdate.setTelefono(txtTelefonoEditPerf.getText());
        empleadoUpdate.setDireccion(txtDireccionEditPerf.getText());
        empleadoUpdate.setPassword(txtPasswordEditPerf.getText());

     
        return empleadoUpdate;
    }

}
