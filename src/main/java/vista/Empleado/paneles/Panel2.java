/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.Empleado.paneles;

/**
 *
 * @author Lesli
 */
public class Panel2 extends javax.swing.JPanel {

    /**
     * Creates new form Panel2
     */
    public Panel2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jTxtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        NuevaContra = new javax.swing.JPasswordField();
        jBGuardar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(523, 480));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(523, 480));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos personales");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Completo");

        jTxtNombre.setBackground(new java.awt.Color(51, 51, 51));
        jTxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTxtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTxtDireccion.setBackground(new java.awt.Color(51, 51, 51));
        jTxtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jTxtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dirección");

        jTxtCorreo.setBackground(new java.awt.Color(51, 51, 51));
        jTxtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jTxtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo Electronico");

        jTxtDni.setBackground(new java.awt.Color(51, 51, 51));
        jTxtDni.setForeground(new java.awt.Color(255, 255, 255));
        jTxtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DNI");

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña");

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Nueva Contraseña");

        contraseña.setBackground(new java.awt.Color(51, 51, 51));
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        NuevaContra.setBackground(new java.awt.Color(51, 51, 51));
        NuevaContra.setForeground(new java.awt.Color(255, 255, 255));
        NuevaContra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jBGuardar.setBackground(new java.awt.Color(153, 0, 0));
        jBGuardar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBGuardar.setText("Guardar");
        jBGuardar.setBorder(null);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBModificar.setBackground(new java.awt.Color(153, 0, 0));
        jBModificar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBModificar.setForeground(new java.awt.Color(255, 255, 255));
        jBModificar.setText("Modificar");
        jBModificar.setBorder(null);
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(NuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(272, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NuevaContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(354, Short.MAX_VALUE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 434, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField NuevaContra;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTxtCorreo;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtDni;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
