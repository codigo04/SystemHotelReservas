/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;


import java.awt.Color;
import javax.swing.JOptionPane;

//import com.sun.mail.imap.ACL;
import java.util.ArrayList;

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
        jPanel3 = new javax.swing.JPanel();
        logoname = new javax.swing.JLabel();
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
        btnIngresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtContrasennaError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoname.setBackground(new java.awt.Color(0, 0, 0));
        logoname.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("NOMBRE DE LA EMPRESA");
        jPanel3.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 290, 30));

        principal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        principal.setIcon(new javax.swing.ImageIcon("E:\\Proyectos-Desktop\\SystemHotelReservas\\src\\main\\java\\Imagenes\\Proyecto nuevo.png")); // NOI18N
        jPanel3.add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 270, 480));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INCIAR SESION");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, -1));

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
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel2.setText("USUARIO");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 140, 10));

        jLabel3.setText("Contraseña");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, -1));

        txtpassword.setBackground(new java.awt.Color(0, 0, 0));
        txtpassword.setForeground(new java.awt.Color(204, 204, 204));
        txtpassword.setText("********");
        txtpassword.setBorder(null);
        txtpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpasswordMousePressed(evt);
            }
        });
        jPanel3.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 140, 20));

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

        jPanel3.add(pExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 30));

        favicom2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(favicom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 40, 40));

        favicom4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(favicom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 240, 80, 50));

        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 0));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngresarMousePressed(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel3.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 140, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hola!");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Buenos Dias");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtContrasennaError.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 10)); // NOI18N
        txtContrasennaError.setForeground(new java.awt.Color(255, 0, 0));
        txtContrasennaError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtContrasennaError.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtContrasennaError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(txtContrasennaError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 160, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 480));

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

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        

    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        

    }//GEN-LAST:event_btnIngresarMouseEntered

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuario;
        String contraseña;
        //llamaos al metod registrarEmpleado
        
         
        //obtenemosos datos del login
        usuario = txtUsuario.getText();
        contraseña = String.valueOf(txtpassword.getPassword());
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
  
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarMousePressed

    private void jExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExitMouseExited
        // TODO add your handling code here:
        btnExit.setBackground(Color.BLACK);
    }//GEN-LAST:event_jExitMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnExit;
    private javax.swing.JButton btnIngresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel favicom2;
    private javax.swing.JLabel favicom4;
    private javax.swing.JLabel jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoname;
    private javax.swing.JPanel pExit;
    private javax.swing.JLabel principal;
    private javax.swing.JLabel txtContrasennaError;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
