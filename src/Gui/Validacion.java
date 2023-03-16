package Gui;

import EDD.Helpers;
// @author andresbucarello

public class Validacion extends javax.swing.JFrame {
    
    Helpers f = new Helpers();
    private boolean desicion;
    
    public Validacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        panelSi = new javax.swing.JPanel();
        textSi = new javax.swing.JLabel();
        panelNo = new javax.swing.JPanel();
        textNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(new java.awt.Color(195, 70, 176));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTitulo.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitulo.setText("Seguro?");
        panelTitulo.add(textTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 60));

        jPanel1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, 60));

        panelSi.setBackground(new java.awt.Color(195, 70, 176));
        panelSi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelSi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSi.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textSi.setForeground(new java.awt.Color(255, 255, 255));
        textSi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSi.setText("SI");
        textSi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textSiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textSiMouseExited(evt);
            }
        });
        panelSi.add(textSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 50));

        jPanel1.add(panelSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 90, 50));

        panelNo.setBackground(new java.awt.Color(255, 255, 255));
        panelNo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textNo.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textNo.setText("NO");
        textNo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textNoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textNoMouseExited(evt);
            }
        });
        panelNo.add(textNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 50));

        jPanel1.add(panelNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSiMouseClicked
        this.desicion = true;
    }//GEN-LAST:event_textSiMouseClicked

    private void textSiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSiMouseEntered
        f.entrarPanel(panelSi);
    }//GEN-LAST:event_textSiMouseEntered

    private void textSiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSiMouseExited
        f.salirPanel(panelSi);
    }//GEN-LAST:event_textSiMouseExited

    private void textNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textNoMouseClicked
        this.desicion = false;
    }//GEN-LAST:event_textNoMouseClicked

    private void textNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textNoMouseEntered
        f.entrarRetroceder(textNo, panelNo);
    }//GEN-LAST:event_textNoMouseEntered

    private void textNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textNoMouseExited
        f.salirRetroceder(textNo, panelNo);
    }//GEN-LAST:event_textNoMouseExited

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Validacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelNo;
    private javax.swing.JPanel panelSi;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel textNo;
    private javax.swing.JLabel textSi;
    private javax.swing.JLabel textTitulo;
    // End of variables declaration//GEN-END:variables

}
