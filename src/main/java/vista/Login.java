/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import javax.swing.UIManager;

//import com.sun.mail.imap.ACL;
/**
 *
 * @author Francisco
 */
public class Login extends javax.swing.JFrame {
    //Administrador  admi = new Administrador("", "", "", "", 0, "", "", "", "", "");
    // Autenticar val = new Autenticar();

    int yMouse, xMouse;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        txtUsuario.setText("cristianjosephav@gmail.com");
        txtpassword.setText("admin");
        panelAutenticacion.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelAutenticacion = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoVerificacion = new javax.swing.JTextField();
        btnVerificarCodigo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        principal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtpassword = new javax.swing.JPasswordField();
        pExit = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        jExit = new javax.swing.JLabel();
        favicom2 = new javax.swing.JLabel();
        favicom4 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContrasennaError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAutenticacion.setBackground(new java.awt.Color(255, 255, 255));
        panelAutenticacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        panelAutenticacion.setForeground(new java.awt.Color(255, 255, 255));
        panelAutenticacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese el código de verificación enviado a su correo electrónico");
        panelAutenticacion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 380, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Autenticación de dos pasos");
        panelAutenticacion.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtCodigoVerificacion.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigoVerificacion.setForeground(new java.awt.Color(51, 51, 51));
        txtCodigoVerificacion.setText("Ingrese el codigo de 6 digitos");
        panelAutenticacion.add(txtCodigoVerificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 40));

        btnVerificarCodigo.setBackground(new java.awt.Color(0, 0, 0));
        btnVerificarCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerificarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        btnVerificarCodigo.setText("Verificar");
        btnVerificarCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnVerificarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerificarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerificarCodigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVerificarCodigoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVerificarCodigoMousePressed(evt);
            }
        });
        btnVerificarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarCodigoActionPerformed(evt);
            }
        });
        panelAutenticacion.add(btnVerificarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 380, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Código de verificación");
        panelAutenticacion.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Volver al inicio de sesión");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        panelAutenticacion.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        getContentPane().add(panelAutenticacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 430, 250));

        panelLogin.setBackground(new java.awt.Color(0, 0, 0));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        principal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/costavelaImg.png"))); // NOI18N
        panelLogin.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 260, 480));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INCIAR SESION");
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 230, -1));

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Ingrese su usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        panelLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel2.setText("USUARIO");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        panelLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, 10));

        jLabel3.setText("Contraseña");
        panelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, -1));

        txtpassword.setBackground(new java.awt.Color(0, 0, 0));
        txtpassword.setForeground(new java.awt.Color(204, 204, 204));
        txtpassword.setText("********");
        txtpassword.setBorder(null);
        txtpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpasswordMousePressed(evt);
            }
        });
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        panelLogin.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 140, 20));

        pExit.setBackground(new java.awt.Color(0, 0, 0));
        pExit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pExitMouseDragged(evt);
            }
        });
        pExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pExitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pExitMouseReleased(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 0, 0));

        jExit.setBackground(new java.awt.Color(0, 0, 0));
        jExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jExit.setForeground(new java.awt.Color(255, 255, 255));
        jExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jExit.setText("X");
        jExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jExit.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jExitAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jExit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jExit, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pExitLayout = new javax.swing.GroupLayout(pExit);
        pExit.setLayout(pExitLayout);
        pExitLayout.setHorizontalGroup(
            pExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExitLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pExitLayout.setVerticalGroup(
            pExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExitLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelLogin.add(pExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 30));

        favicom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelLogin.add(favicom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 40, 40));

        favicom4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelLogin.add(favicom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 240, 80, 50));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 0));
        btnIniciarSesion.setText("INGRESAR");
        btnIniciarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMousePressed(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        panelLogin.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hola!");
        panelLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buenos Tardes");
        panelLogin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtContrasennaError.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 10)); // NOI18N
        txtContrasennaError.setForeground(new java.awt.Color(255, 0, 0));
        txtContrasennaError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContrasennaError.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtContrasennaError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelLogin.add(txtContrasennaError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, 20));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jExitAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jExitAncestorAdded

    }//GEN-LAST:event_jExitAncestorAdded

    private void pExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pExitMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pExitMousePressed

    private void pExitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pExitMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);


    }//GEN-LAST:event_pExitMouseDragged

    private void jExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jExitMouseClicked

    private void jExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitMouseEntered
        // TODO add your handling code here:
        btnExit.setBackground(Color.RED);

    }//GEN-LAST:event_jExitMouseEntered

    private void pExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pExitMouseReleased
        // TODO add your handling code here:


    }//GEN-LAST:event_pExitMouseReleased

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        // TODO add your handling code here:
        txtContrasennaError.setText("");
        if (txtUsuario.getText().equals("Ingrese su usuario")) {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.WHITE);

        }

        if (String.valueOf(txtpassword.getPassword()).isEmpty()) {
            txtpassword.setText("********");
            txtpassword.setForeground(Color.GRAY);
        }


    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMousePressed

        if (txtUsuario.getText().isEmpty()) {

            txtUsuario.setText("Ingrese su usuario");
            txtUsuario.setForeground(Color.GRAY);
        }

        if (String.valueOf(txtpassword.getPassword()).equals("********")) {
            txtpassword.setText("");
            txtpassword.setForeground(Color.WHITE);
        }

    }//GEN-LAST:event_txtpasswordMousePressed

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked


    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered


    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String usuario;
        String contraseña;
        //llamaos al metod registrarEmpleado

        //obtenemosos datos del login
        usuario = txtUsuario.getText();
        contraseña = String.valueOf(txtpassword.getPassword());

        //  bloquear(panelLogin);
        // panelAutenticacion.setVisible(true);
        ///txtUsuario.setVisible(false);
       // txtpassword.setVisible(false);
      //  btnIniciarSesion.setVisible(false);
        // llamamos la metodo buscar usuario

        //  boolean respuesta = val.buscarEmpleado(usuario, contraseña);
        /* if (respuesta) {
            txtContrasennaError.setText("");

        } else {
           txtContrasennaError.setText("Contraseña o usuario incorrecto");
           txtUsuario.setText("Ingrese su usuario");
           txtpassword.setText("********");
           txtUsuario.requestFocus();
        }
         */

    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSesionMousePressed

    private void jExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitMouseExited
        // TODO add your handling code here:
        btnExit.setBackground(Color.BLACK);
    }//GEN-LAST:event_jExitMouseExited

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnVerificarCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarCodigoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarCodigoMouseClicked

    private void btnVerificarCodigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarCodigoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarCodigoMouseEntered

    private void btnVerificarCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarCodigoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarCodigoMousePressed

    private void btnVerificarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarCodigoActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        panelAutenticacion.setVisible(false);

        txtUsuario.setVisible(true);
        txtpassword.setVisible(true);
        btnIniciarSesion.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /*
        ESTYLO BONITO
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
         */
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        try {
            FlatDarkLaf.setup();
            UIManager.put("TextComponent.arc", 10);
            UIManager.put("Button.arc", 20);
            UIManager.put("Componente.focusWidth", 0);
        } catch (Exception ex) {
            System.err.println("No se pudo inicializar el Look and Feel de FlatLaf.");
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnExit;
    public javax.swing.JButton btnIniciarSesion;
    public javax.swing.JButton btnVerificarCodigo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel favicom2;
    private javax.swing.JLabel favicom4;
    private javax.swing.JLabel jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pExit;
    public javax.swing.JPanel panelAutenticacion;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel principal;
    public javax.swing.JTextField txtCodigoVerificacion;
    private javax.swing.JLabel txtContrasennaError;
    public javax.swing.JTextField txtUsuario;
    public javax.swing.JPasswordField txtpassword;
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

}
