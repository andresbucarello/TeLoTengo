package Gui;

// @author andresbucarello

import EDD.ListaProductos;
import java.awt.Color;


public class Inicio extends javax.swing.JFrame {
    
    static ListaProductos productos;
    
    public Inicio() {
        initComponents();
        productos= new ListaProductos();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 200, 201));

        Menu.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu.setText("MENU");
        jPanel2.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 160, 60));

        panelRegistrarCompra.setBackground(new java.awt.Color(195, 70, 176));
        panelRegistrarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRegistrarCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textRegistrarCompra.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textRegistrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        textRegistrarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textRegistrarCompra.setText("Registrar compra");
        textRegistrarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRegistrarCompra.add(textRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        jPanel2.add(panelRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 300, 30));

        panelInventario.setBackground(new java.awt.Color(195, 70, 176));
        panelInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textInventario.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textInventario.setForeground(new java.awt.Color(255, 255, 255));
        textInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textInventario.setText("Inventario");
        textInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelInventario.add(textInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        jPanel2.add(panelInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 300, 30));

        panelPagos.setBackground(new java.awt.Color(195, 70, 176));
        panelPagos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textPagos.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textPagos.setForeground(new java.awt.Color(255, 255, 255));
        textPagos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPagos.setText("Pagos");
        textPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPagos.add(textPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        jPanel2.add(panelPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 300, 30));

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));
        panelSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSalir.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSalir.setText("Salir");
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
        panelSalir.add(textSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jPanel2.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 110, 40));

        jLabel1.setText("HOLa");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 477, 80, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseEntered
        textSalir.setBackground(Color.red);
    }//GEN-LAST:event_textSalirMouseEntered

    private void textSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseExited
        textSalir.setBackground(Color.white);
    }//GEN-LAST:event_textSalirMouseExited

    private void textSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_textSalirMouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        textSalir.setBackground(Color.red);
    }//GEN-LAST:event_jLabel1MouseEntered

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
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
