package Gui;

// @author andresbucarello

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        panelRegistrarCompra = new javax.swing.JPanel();
        textRegistrarCompra = new javax.swing.JLabel();
        panelGestionarInventario = new javax.swing.JPanel();
        textGestionarInventario = new javax.swing.JLabel();
        panelEstadisticas = new javax.swing.JPanel();
        textEstadisticas = new javax.swing.JLabel();
        panelSalir = new javax.swing.JPanel();
        textSalir = new javax.swing.JLabel();

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
        panelRegistrarCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textRegistrarCompra.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textRegistrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        textRegistrarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textRegistrarCompra.setText("Registrar compra");
        panelRegistrarCompra.add(textRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        jPanel2.add(panelRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 300, 30));

        panelGestionarInventario.setBackground(new java.awt.Color(195, 70, 176));
        panelGestionarInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textGestionarInventario.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textGestionarInventario.setForeground(new java.awt.Color(255, 255, 255));
        textGestionarInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textGestionarInventario.setText("Gestionar inventario");
        panelGestionarInventario.add(textGestionarInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        jPanel2.add(panelGestionarInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 300, 30));

        panelEstadisticas.setBackground(new java.awt.Color(195, 70, 176));
        panelEstadisticas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textEstadisticas.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        textEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textEstadisticas.setText("Estadisticas");
        panelEstadisticas.add(textEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 30));

        jPanel2.add(panelEstadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 300, 30));

        panelSalir.setBackground(new java.awt.Color(255, 255, 255));
        panelSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSalir.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSalir.setText("Salir");
        panelSalir.add(textSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jPanel2.add(panelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelEstadisticas;
    private javax.swing.JPanel panelGestionarInventario;
    private javax.swing.JPanel panelRegistrarCompra;
    private javax.swing.JPanel panelSalir;
    private javax.swing.JLabel textEstadisticas;
    private javax.swing.JLabel textGestionarInventario;
    private javax.swing.JLabel textRegistrarCompra;
    private javax.swing.JLabel textSalir;
    // End of variables declaration//GEN-END:variables

}
