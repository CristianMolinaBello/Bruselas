/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bruselas.login;

/**
 *
 * @author ASUS
 */
public class Entradaprofesores extends javax.swing.JFrame {

    /**
     * Creates new form Entradaprofesores
     */
    public Entradaprofesores() {
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
        jPanel2 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlAcceso = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblNombreusuario = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        lblContraseña = new javax.swing.JLabel();
        pswContraseña = new javax.swing.JPasswordField();
        btnVolver = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        lblOlvidar = new javax.swing.JLabel();
        lblBruselas = new javax.swing.JLabel();
        lblProfesor = new javax.swing.JLabel();
        pnlrellenoizquierda = new javax.swing.JPanel();
        pnlrellenoderecha = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(0, 122, 189));

        jPasswordField1.setText("jPasswordField1");

        jScrollPane2.setViewportView(jTextPane1);

        jLabel3.setText("Usuario");

        jLabel4.setText("Contraseña");

        jButton1.setBackground(new java.awt.Color(0, 50, 255));
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 50, 255));
        jButton2.setForeground(new java.awt.Color(242, 242, 242));
        jButton2.setText("Entrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 242));
        jLabel5.setText("Olvidaste la contraseña");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(27, 27, 27))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("FiraCode NF", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("IED Bruselas");

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Estudiante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(0, 122, 189));
        jPanel3.setLayout(new java.awt.BorderLayout());

        pnlAcceso.setLayout(new javax.swing.BoxLayout(pnlAcceso, javax.swing.BoxLayout.Y_AXIS));

        lblUsuario.setText("Usuario");
        pnlAcceso.add(lblUsuario);

        jTextPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextPane2MouseClicked(evt);
            }
        });
        lblNombreusuario.setViewportView(jTextPane2);

        pnlAcceso.add(lblNombreusuario);

        lblContraseña.setText("Contraseña");
        pnlAcceso.add(lblContraseña);

        pswContraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pswContraseña.setText("jPasswordField1");
        pswContraseña.setMargin(new java.awt.Insets(6, 4, 5, 3));
        pswContraseña.setPreferredSize(new java.awt.Dimension(6, 5));
        pnlAcceso.add(pswContraseña);

        btnVolver.setBackground(new java.awt.Color(0, 50, 255));
        btnVolver.setForeground(new java.awt.Color(242, 242, 242));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        pnlAcceso.add(btnVolver);

        btnEntrar.setBackground(new java.awt.Color(0, 50, 255));
        btnEntrar.setForeground(new java.awt.Color(242, 242, 242));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        pnlAcceso.add(btnEntrar);

        lblOlvidar.setForeground(new java.awt.Color(0, 0, 242));
        lblOlvidar.setText("Olvidaste la contraseña");
        pnlAcceso.add(lblOlvidar);

        jPanel3.add(pnlAcceso, java.awt.BorderLayout.CENTER);

        lblBruselas.setFont(new java.awt.Font("FiraCode NF", 1, 36)); // NOI18N
        lblBruselas.setForeground(new java.awt.Color(242, 242, 242));
        lblBruselas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBruselas.setText("IED Bruselas");
        jPanel3.add(lblBruselas, java.awt.BorderLayout.PAGE_START);

        lblProfesor.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        lblProfesor.setForeground(new java.awt.Color(242, 242, 242));
        lblProfesor.setText("Profesional");
        jPanel3.add(lblProfesor, java.awt.BorderLayout.PAGE_END);

        pnlrellenoizquierda.setBackground(new java.awt.Color(0, 122, 189));

        javax.swing.GroupLayout pnlrellenoizquierdaLayout = new javax.swing.GroupLayout(pnlrellenoizquierda);
        pnlrellenoizquierda.setLayout(pnlrellenoizquierdaLayout);
        pnlrellenoizquierdaLayout.setHorizontalGroup(
            pnlrellenoizquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlrellenoizquierdaLayout.setVerticalGroup(
            pnlrellenoizquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jPanel3.add(pnlrellenoizquierda, java.awt.BorderLayout.EAST);

        pnlrellenoderecha.setBackground(new java.awt.Color(0, 122, 189));

        javax.swing.GroupLayout pnlrellenoderechaLayout = new javax.swing.GroupLayout(pnlrellenoderecha);
        pnlrellenoderecha.setLayout(pnlrellenoderechaLayout);
        pnlrellenoderechaLayout.setHorizontalGroup(
            pnlrellenoderechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlrellenoderechaLayout.setVerticalGroup(
            pnlrellenoderechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jPanel3.add(pnlrellenoderecha, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jTextPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPane2MouseClicked

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
            java.util.logging.Logger.getLogger(Entradaprofesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entradaprofesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entradaprofesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entradaprofesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entradaprofesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel lblBruselas;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JScrollPane lblNombreusuario;
    private javax.swing.JLabel lblOlvidar;
    private javax.swing.JLabel lblProfesor;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlAcceso;
    private javax.swing.JPanel pnlrellenoderecha;
    private javax.swing.JPanel pnlrellenoizquierda;
    private javax.swing.JPasswordField pswContraseña;
    // End of variables declaration//GEN-END:variables
}
