/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emergentes;

/**
 *
 * @author Cris
 */
public class Ingresos_Informes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ingresos_Informes
     */
    public Ingresos_Informes() {
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
        nis = new javax.swing.JTextField();
        id1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        nombres = new javax.swing.JTextField();
        nombres1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ingresos Informes");

        jPanel1.setBackground(new java.awt.Color(229, 241, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nis.setForeground(new java.awt.Color(4, 51, 83));
        nis.setText("Numero de NIS");
        nis.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nis.setCaretColor(new java.awt.Color(4, 51, 83));
        nis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nisMouseClicked(evt);
            }
        });
        nis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nisKeyReleased(evt);
            }
        });
        jPanel1.add(nis, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, 30));

        id1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        id1.setForeground(new java.awt.Color(4, 51, 83));
        id1.setText("NIS");
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        id2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        id2.setForeground(new java.awt.Color(4, 51, 83));
        id2.setText("Demandado/Cliente");
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 30));

        nombres.setForeground(new java.awt.Color(4, 51, 83));
        nombres.setText("Apellidos");
        nombres.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombres.setCaretColor(new java.awt.Color(4, 51, 83));
        nombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombresMouseClicked(evt);
            }
        });
        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });
        nombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombresKeyReleased(evt);
            }
        });
        jPanel1.add(nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 150, 30));

        nombres1.setForeground(new java.awt.Color(4, 51, 83));
        nombres1.setText("Nombres");
        nombres1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombres1.setCaretColor(new java.awt.Color(4, 51, 83));
        nombres1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombres1MouseClicked(evt);
            }
        });
        nombres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombres1ActionPerformed(evt);
            }
        });
        nombres1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombres1KeyReleased(evt);
            }
        });
        jPanel1.add(nombres1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nisMouseClicked
        nis.setText("");
    }//GEN-LAST:event_nisMouseClicked

    private void nisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nisKeyReleased
        String texto = nis.getText();
        filtrado_user(texto);
    }//GEN-LAST:event_nisKeyReleased

    private void nombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresMouseClicked

    private void nombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombresKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresKeyReleased

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void nombres1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombres1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nombres1MouseClicked

    private void nombres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombres1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombres1ActionPerformed

    private void nombres1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombres1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nombres1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nis;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField nombres1;
    // End of variables declaration//GEN-END:variables
}
