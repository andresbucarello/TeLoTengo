package Gui;

// @author andresbucarello

import EDD.Helpers;

public class Menu extends javax.swing.JFrame {
    
    Helpers f = new Helpers();
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        panelRegistrarCompra = new javax.swing.JPanel();
        textRegistrarCompra = new javax.swing.JLabel();
        panelInventario = new javax.swing.JPanel();
        textInventario = new javax.swing.JLabel();
        panelPagos = new javax.swing.JPanel();
        textPagos = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        textSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 200, 201));

        Menu.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu.setText("MENU");
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 160, 60));

        panelRegistrarCompra.setBackground(new java.awt.Color(195, 70, 176));
        panelRegistrarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRegistrarCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textRegistrarCompra.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textRegistrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        textRegistrarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textRegistrarCompra.setText("Registrar compra");
        textRegistrarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textRegistrarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textRegistrarCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textRegistrarCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textRegistrarCompraMouseExited(evt);
            }
        });
        panelRegistrarCompra.add(textRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        jPanel1.add(panelRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 300, 40));

        panelInventario.setBackground(new java.awt.Color(195, 70, 176));
        panelInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textInventario.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textInventario.setForeground(new java.awt.Color(255, 255, 255));
        textInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textInventario.setText("Inventario");
        textInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textInventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textInventarioMouseExited(evt);
            }
        });
        panelInventario.add(textInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        jPanel1.add(panelInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 300, 40));

        panelPagos.setBackground(new java.awt.Color(195, 70, 176));
        panelPagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textPagos.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textPagos.setForeground(new java.awt.Color(255, 255, 255));
        textPagos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPagos.setText("Pagos");
        textPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textPagosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textPagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textPagosMouseExited(evt);
            }
        });
        panelPagos.add(textPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        jPanel1.add(panelPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 300, 40));

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));
        panelSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSalir.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSalir.setText("X");
        textSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textSalirMouseExited(evt);
            }
        });
        panelSalir.add(textSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jPanel1.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void textSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_textSalirMouseClicked

    private void textSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseEntered
        f.entrarRetroceder(textSalir, panelSalir);
    }//GEN-LAST:event_textSalirMouseEntered

    private void textSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseExited
        f.salirRetroceder(textSalir, panelSalir);
    }//GEN-LAST:event_textSalirMouseExited

    private void textRegistrarCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegistrarCompraMouseEntered
        f.entrarPanel(panelRegistrarCompra);
    }//GEN-LAST:event_textRegistrarCompraMouseEntered

    private void textRegistrarCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegistrarCompraMouseExited
        f.salirPanel(panelRegistrarCompra);
    }//GEN-LAST:event_textRegistrarCompraMouseExited

    private void textRegistrarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegistrarCompraMouseClicked
        f.registrarCompra(this);
    }//GEN-LAST:event_textRegistrarCompraMouseClicked

    private void textInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textInventarioMouseEntered
        f.entrarPanel(panelInventario);
    }//GEN-LAST:event_textInventarioMouseEntered

    private void textInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textInventarioMouseExited
        f.salirPanel(panelInventario);
    }//GEN-LAST:event_textInventarioMouseExited

    private void textInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textInventarioMouseClicked
        f.inventario(this);
    }//GEN-LAST:event_textInventarioMouseClicked

    private void textPagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPagosMouseEntered
        f.entrarPanel(panelPagos);
    }//GEN-LAST:event_textPagosMouseEntered

    private void textPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPagosMouseExited
        f.salirPanel(panelPagos);
    }//GEN-LAST:event_textPagosMouseExited

    private void textPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPagosMouseClicked
        f.pagos(this);
    }//GEN-LAST:event_textPagosMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelInventario;
    private javax.swing.JPanel panelPagos;
    private javax.swing.JPanel panelRegistrarCompra;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JLabel textInventario;
    private javax.swing.JLabel textPagos;
    private javax.swing.JLabel textRegistrarCompra;
    private javax.swing.JLabel textSalir;
    // End of variables declaration//GEN-END:variables

}
