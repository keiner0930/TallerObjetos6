/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cafetera;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author sony
 */
public class Principal6 extends javax.swing.JFrame {

    /**
     * Creates new form Principal6
     */
    Cafetera c;

    public Principal6() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCmaxima = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCactual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTazas = new javax.swing.JTextField();
        cmdServir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cmdLlenar = new javax.swing.JButton();
        cmdVaciar = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        txtAgregar = new javax.swing.JTextField();
        cmdCafe = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel1.setText("Cafetera");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 100, -1));

        jLabel2.setText("Capacidad Maxima:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        jPanel1.add(txtCmaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 90, 70, 30));

        jLabel3.setText("Cantidad Actual:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));
        jPanel1.add(txtCactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 70, 30));

        jLabel4.setText("No de Tazas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));
        jPanel1.add(txtTazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 30));

        cmdServir.setText("Servir Cafe");
        cmdServir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdServirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdServir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdLlenar.setText("Llenar Cafetera");
        cmdLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, -1));

        cmdVaciar.setText("Vaciar Cafetera");
        cmdVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVaciarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 130, 120));
        jPanel1.add(txtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 70, 30));

        cmdCafe.setText("Agregar Cafe");
        cmdCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCafeActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 110, -1));

        jLabel5.setText("Cafe");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVaciarActionPerformed
        c.vaciar();
    }//GEN-LAST:event_cmdVaciarActionPerformed

    private void cmdServirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdServirActionPerformed
        int tazas;
        if (txtTazas.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Digite El Numero de Tazas", "Error", JOptionPane.ERROR_MESSAGE);
            txtTazas.requestFocusInWindow();
        } else {

            tazas = Integer.parseInt((txtTazas).getText());

            c.servir(tazas);
            txtTazas.setText("");
        }
    }//GEN-LAST:event_cmdServirActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        int capacidamaxima, cantidadactual;
        if (txtCmaxima.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Digite la Capacidad Maxima", "Error", JOptionPane.ERROR_MESSAGE);
            txtCmaxima.requestFocusInWindow();
        } else if (txtCactual.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Digite La Cantidad Actual", "Error", JOptionPane.ERROR_MESSAGE);
            txtCactual.requestFocusInWindow();
        } else {

            capacidamaxima = Integer.parseInt(txtCmaxima.getText());
            cantidadactual = Integer.parseInt(txtCactual.getText());

            c = new Cafetera(capacidamaxima, cantidadactual);
            JOptionPane.showMessageDialog(this, "Datos guardados exitosamente");
        }

    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCafeActionPerformed
        int nuevocafe;
        if (txtAgregar.getText().isEmpty()) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Digite la Cantidad a Agregar", "Error", JOptionPane.ERROR_MESSAGE);
            txtAgregar.requestFocusInWindow();
        } else {
            nuevocafe = Integer.parseInt(txtAgregar.getText());

            c.agregar(nuevocafe);
            txtAgregar.setText("");
        }
    }//GEN-LAST:event_cmdCafeActionPerformed

    private void cmdLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarActionPerformed

        c.llenar();

    }//GEN-LAST:event_cmdLlenarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCafe;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLlenar;
    private javax.swing.JButton cmdServir;
    private javax.swing.JButton cmdVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAgregar;
    private javax.swing.JTextField txtCactual;
    private javax.swing.JTextField txtCmaxima;
    private javax.swing.JTextField txtTazas;
    // End of variables declaration//GEN-END:variables
}