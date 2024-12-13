/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.Empleado;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import java.awt.Color;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.Empleado.paneles.PanelClientesAdm;

import vista.Empleado.paneles.PanelRecervarHabitaciones;
import vista.Empleado.paneles.PanelInicio;
import vista.Empleado.paneles.PanelPerfil;
import vista.Empleado.paneles.PanelReservas;

public class JfrmEmpleado extends javax.swing.JFrame {

    public PanelRecervarHabitaciones panelRecervaHabitaciones = new PanelRecervarHabitaciones();
    private static final String IMAGE_PATH = "C:\\Users\\FranDev\\Pictures\\Saved Pictures\\avatarusuario.jpg";
    public PanelInicio panelInicio = new PanelInicio();
    public PanelPerfil panelPerfil = new PanelPerfil();
    public PanelReservas panelReservas = new PanelReservas();

    public PanelClientesAdm panelClientes = new PanelClientesAdm();

    public JfrmEmpleado() {
        initComponents();

        setVisible(false);
        panelPrincipal.removeAll();
        panelPrincipal.add(panelInicio);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();

        loadAvatar();

    }

    public static JLabel getIconUser() {
        if (iconUser == null) {
            iconUser = new JLabel(); // Inicializa solo una vez
        }
        return iconUser;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        jBInicio = new javax.swing.JButton();
        jBPerfil = new javax.swing.JButton();
        jBAsiHabitacion = new javax.swing.JButton();
        jBHistorial = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        empleadopng = new javax.swing.JLabel();

        iconUser = new javax.swing.JLabel();

        btnClientes = new javax.swing.JButton();

        panelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBInicio.setBackground(new java.awt.Color(204, 204, 204));
        jBInicio.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jBInicio.setForeground(new java.awt.Color(51, 51, 51));
        jBInicio.setText("Inicio");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });
        menu.add(jBInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 194, 140, 41));

        jBPerfil.setBackground(new java.awt.Color(204, 204, 204));
        jBPerfil.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBPerfil.setForeground(new java.awt.Color(51, 51, 51));
        jBPerfil.setText("Perfil");
        jBPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPerfilActionPerformed(evt);
            }
        });
        menu.add(jBPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 247, 140, 41));

        jBAsiHabitacion.setBackground(new java.awt.Color(204, 204, 204));
        jBAsiHabitacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBAsiHabitacion.setForeground(new java.awt.Color(51, 51, 51));
        jBAsiHabitacion.setText("Habitaciones");
        jBAsiHabitacion.setActionCommand("");
        jBAsiHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAsiHabitacionActionPerformed(evt);
            }
        });
        menu.add(jBAsiHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 300, 140, 41));

        jBHistorial.setBackground(new java.awt.Color(204, 204, 204));
        jBHistorial.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jBHistorial.setForeground(new java.awt.Color(51, 51, 51));
        jBHistorial.setText("Reservaciones");
        jBHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHistorialActionPerformed(evt);
            }
        });
        menu.add(jBHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 353, 140, 42));

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        menu.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 80, 25));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empleado");
        menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        menu.add(empleadopng, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 136, -1, -1));


        iconUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser.setIcon(new javax.swing.ImageIcon("D:\\PROYECTOS UNI\\Proyectos-Desktop\\SystemHotelReservas\\src\\main\\resources\\usuario.png")); // NOI18N
        menu.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 120));



        btnClientes.setBackground(new java.awt.Color(204, 204, 204));
        btnClientes.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(51, 51, 51));
        btnClientes.setText("Clientes");
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        menu.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 405, 140, 42));

        jPanel1.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 660));

        panelPrincipal.setPreferredSize(new java.awt.Dimension(523, 480));
        panelPrincipal.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 850, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 660));

        jMenu2.setText("Themes");

        jMenuItem1.setText("White");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Black");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        // TODO add your handling code here:
// Asegúrate de usar GridLayout con una sola celda (1 fila, 1 columna)
        panelPrincipal.removeAll();
        panelPrincipal.add(panelInicio);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();


    }//GEN-LAST:event_jBInicioActionPerformed

    private void jBPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPerfilActionPerformed
        // TODO add your handling code here:

// Asegúrate de usar GridLayout con una sola celda (1 fila, 1 columna)
        panelPrincipal.removeAll();
        panelPrincipal.add(panelPerfil);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }//GEN-LAST:event_jBPerfilActionPerformed

    private void jBHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHistorialActionPerformed
        // TODO add your handling code here:

        panelPrincipal.removeAll();
        panelPrincipal.add(panelReservas);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();

    }//GEN-LAST:event_jBHistorialActionPerformed

    private void jBAsiHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAsiHabitacionActionPerformed
        // TODO 

        panelPrincipal.removeAll();
        panelPrincipal.add(panelRecervaHabitaciones);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();

    }//GEN-LAST:event_jBAsiHabitacionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSalirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(JfrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(JfrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesMouseClicked

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        interacionBontenes(btnClientes);
        this.panelPrincipal.removeAll();
        this.panelPrincipal.add(panelClientes);
        this.panelPrincipal.revalidate();
        this.panelPrincipal.repaint();
    }//GEN-LAST:event_btnClientesActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        try {
            FlatLightLaf.setup();
            //FlatDarkLaf.setup();
            UIManager.put("TextComponent.arc", 10);
            UIManager.put("Button.arc", 20);
            UIManager.put("Componente.focusWidth", 0);
        } catch (Exception ex) {
            System.err.println("No se pudo inicializar el Look and Feel de FlatLaf.");
        }

        // Crear y mostrar la GUI de tu aplicación
        java.awt.EventQueue.invokeLater(() -> {
            // Inicializa y muestra tu ventana principal
            new JfrmEmpleado().setVisible(true);
        });

        /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmEmpleado().setVisible(true);
            }
        });*/
    }

    public void loadAvatar() {
        File imageFile = new File(IMAGE_PATH);
        if (imageFile.exists()) {
            try {
                // Leer la imagen desde el archivo guardado y mostrarla
                Image image = ImageIO.read(imageFile);
                ImageIcon icon = new ImageIcon(image.getScaledInstance(200, 200, Image.SCALE_SMOOTH));
                iconUser.setIcon(icon);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar la imagen", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel empleadopng;
    public static javax.swing.JLabel iconUser;
    private javax.swing.JButton jBAsiHabitacion;
    private javax.swing.JButton jBHistorial;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBPerfil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel menu;
    public static javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

    public void interacionBontenes(javax.swing.JButton button) {
        jBInicio.setBackground(Color.WHITE);
        jBInicio.setForeground(Color.BLACK);

        jBPerfil.setBackground(Color.WHITE);

        jBPerfil.setForeground(Color.BLACK);

        jBAsiHabitacion.setBackground(Color.WHITE);

        jBAsiHabitacion.setForeground(Color.BLACK);

        jBHistorial.setBackground(Color.WHITE);

        jBHistorial.setForeground(Color.BLACK);

        btnClientes.setBackground(Color.WHITE);

        btnClientes.setForeground(Color.BLACK);
    }
}
