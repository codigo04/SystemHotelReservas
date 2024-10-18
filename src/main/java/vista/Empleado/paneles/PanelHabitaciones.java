/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.Empleado.paneles;


import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

/**
 *
 * @author FranDev
 */
public class PanelHabitaciones extends javax.swing.JPanel {

    /**
     * Creates new form PanelHabitaciones
     */
    public PanelHabitaciones() {
        initComponents();
         Panel_Reserva.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Reserva = new javax.swing.JPanel();
        btnAceptarEm = new javax.swing.JButton();
        btnCancelarEm = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        TxtNombrecliente = new javax.swing.JTextField();
        jTxtNroPersonas = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTxtTelefono = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTxtCorreo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTxtTipoHbi = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Txtllegada = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTxtfin = new javax.swing.JTextField();
        jTxtPrecio = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        TxtDniCliente = new javax.swing.JTextField();
        jBBuscar3 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jBBuscar4 = new javax.swing.JButton();
        TxtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Reserva.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Reserva.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        Panel_Reserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_Reserva.setEnabled(false);
        Panel_Reserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarEm.setBackground(new java.awt.Color(0, 0, 0));
        btnAceptarEm.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnAceptarEm.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptarEm.setText("ACTUALIZAR");
        btnAceptarEm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarEmActionPerformed(evt);
            }
        });
        Panel_Reserva.add(btnAceptarEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 180, 30));

        btnCancelarEm.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelarEm.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnCancelarEm.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEm.setText("CANCELAR");
        btnCancelarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmActionPerformed(evt);
            }
        });
        Panel_Reserva.add(btnCancelarEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 170, 30));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel25.setText(" Reserva");
        Panel_Reserva.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel32.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel32.setText("DNI");
        Panel_Reserva.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel33.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel33.setText("Nombre Completo");
        Panel_Reserva.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        TxtNombrecliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtNombrecliente.setForeground(new java.awt.Color(51, 51, 51));
        TxtNombrecliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtNombrecliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_Reserva.add(TxtNombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 315, 26));

        jTxtNroPersonas.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTxtNroPersonas.setForeground(new java.awt.Color(51, 51, 51));
        jTxtNroPersonas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTxtNroPersonas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_Reserva.add(jTxtNroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 83, 26));

        jLabel34.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel34.setText("N° de Personas");
        Panel_Reserva.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel35.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel35.setText("Telefono");
        Panel_Reserva.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jTxtTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTxtTelefono.setForeground(new java.awt.Color(51, 51, 51));
        jTxtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTxtTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_Reserva.add(jTxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, 26));

        jLabel26.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel26.setText("Correo Electronico");
        Panel_Reserva.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jTxtCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTxtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        jTxtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTxtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_Reserva.add(jTxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 210, 26));

        jLabel27.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("Tipo de Habitación");
        Panel_Reserva.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jTxtTipoHbi.setBackground(new java.awt.Color(153, 153, 153));
        jTxtTipoHbi.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTxtTipoHbi.setForeground(new java.awt.Color(51, 51, 51));
        jTxtTipoHbi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTxtTipoHbi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTxtTipoHbi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTipoHbijTxtTipoHbi2ActionPerformed(evt);
            }
        });
        Panel_Reserva.add(jTxtTipoHbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 139, 26));

        jLabel28.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel28.setText("Fecha de llegada");
        Panel_Reserva.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        Txtllegada.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Txtllegada.setForeground(new java.awt.Color(51, 51, 51));
        Txtllegada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Txtllegada.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_Reserva.add(Txtllegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 139, 26));

        jLabel29.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel29.setText("Fecha de fin");
        Panel_Reserva.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jTxtfin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTxtfin.setForeground(new java.awt.Color(51, 51, 51));
        jTxtfin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTxtfin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_Reserva.add(jTxtfin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 139, 26));

        jTxtPrecio.setBackground(new java.awt.Color(153, 153, 153));
        jTxtPrecio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTxtPrecio.setForeground(new java.awt.Color(51, 51, 51));
        jTxtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTxtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_Reserva.add(jTxtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 139, 26));

        jLabel30.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(153, 153, 153));
        jLabel30.setText("Precio");
        Panel_Reserva.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        TxtDniCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtDniCliente.setForeground(new java.awt.Color(51, 51, 51));
        TxtDniCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtDniCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_Reserva.add(TxtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 102, 26));

        jBBuscar3.setBackground(new java.awt.Color(0, 0, 0));
        jBBuscar3.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBBuscar3.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar3.setText("Buscar");
        jBBuscar3.setBorder(null);
        jBBuscar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscar3jBBuscarActionPerformed(evt);
            }
        });
        Panel_Reserva.add(jBBuscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 58, 22));

        jLabel37.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel37.setText("Código");
        Panel_Reserva.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jBBuscar4.setBackground(new java.awt.Color(0, 0, 0));
        jBBuscar4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jBBuscar4.setForeground(new java.awt.Color(255, 255, 255));
        jBBuscar4.setText("Buscar");
        jBBuscar4.setBorder(null);
        jBBuscar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBBuscar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscar4jBBuscarActionPerformed(evt);
            }
        });
        Panel_Reserva.add(jBBuscar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 58, 22));

        TxtCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        TxtCodigo.setForeground(new java.awt.Color(51, 51, 51));
        TxtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Panel_Reserva.add(TxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 102, 26));

        add(Panel_Reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 540, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestión de Habitaciones");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        PanelDatos.setBackground(new java.awt.Color(255, 255, 255));
        PanelDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        PanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Lista de Habitaciones");
        PanelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 30, -1, -1));
        PanelDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 7, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N°", "Tipo de Habitacion", "Caracteristicas", "Precio", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(30);
        }

        PanelDatos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 68, 608, 280));

        add(PanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 100, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reservar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 100, 107, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

   Panel_Reserva.setVisible(true);
        bloquear(PanelDatos);   

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jBBuscar4jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscar4jBBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscar4jBBuscarActionPerformed

    private void jBBuscar3jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscar3jBBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscar3jBBuscarActionPerformed

    private void jTxtTipoHbijTxtTipoHbi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTipoHbijTxtTipoHbi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTipoHbijTxtTipoHbi2ActionPerformed

    private void btnCancelarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmActionPerformed
        desbloquear(PanelDatos);
        Panel_Reserva.setVisible(false);
    }//GEN-LAST:event_btnCancelarEmActionPerformed

    private void btnAceptarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarEmActionPerformed
        desbloquear(PanelDatos);
        Panel_Reserva.setVisible(false);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatos;
    public javax.swing.JPanel Panel_Reserva;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtDniCliente;
    private javax.swing.JTextField TxtNombrecliente;
    private javax.swing.JTextField Txtllegada;
    public javax.swing.JButton btnAceptarEm;
    public javax.swing.JButton btnCancelarEm;
    private javax.swing.JButton jBBuscar3;
    private javax.swing.JButton jBBuscar4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCorreo;
    private javax.swing.JTextField jTxtNroPersonas;
    private javax.swing.JTextField jTxtPrecio;
    private javax.swing.JTextField jTxtTelefono;
    private javax.swing.JTextField jTxtTipoHbi;
    private javax.swing.JTextField jTxtfin;
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

