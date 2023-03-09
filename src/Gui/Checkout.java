package Gui;

// @author andresbucarello

public class Checkout extends javax.swing.JFrame {

    public Checkout() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textRegistrarCompra = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        textMontoBs = new javax.swing.JLabel();
        textMontoUSD = new javax.swing.JLabel();
        montoUSD = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        panelZelle = new javax.swing.JPanel();
        textZelle = new javax.swing.JLabel();
        panelPagoMovil = new javax.swing.JPanel();
        textPagoMovil = new javax.swing.JLabel();
        panelPunto = new javax.swing.JPanel();
        textPunto = new javax.swing.JLabel();
        panelEfectivoUSD = new javax.swing.JPanel();
        textEfectivoUSD = new javax.swing.JLabel();
        panelEfectivoBs = new javax.swing.JPanel();
        textEfectivoBs = new javax.swing.JLabel();
        tituloNombre = new javax.swing.JLabel();
        panelRetroceder = new javax.swing.JPanel();
        textRetroceder = new javax.swing.JLabel();
        panelSiguiente = new javax.swing.JPanel();
        textSiguiente = new javax.swing.JLabel();
        tituloNombre1 = new javax.swing.JLabel();
        montoBs1 = new javax.swing.JLabel();
        montoUSD1 = new javax.swing.JLabel();
        montoBs2 = new javax.swing.JLabel();
        separador3 = new javax.swing.JSeparator();

        textRegistrarCompra.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textRegistrarCompra.setForeground(new java.awt.Color(255, 255, 255));
        textRegistrarCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textRegistrarCompra.setText("Registrar compra");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(new java.awt.Color(195, 70, 176));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTitulo.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitulo.setText("CHECKOUT");
        panelTitulo.add(textTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        jPanel1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        textMontoBs.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textMontoBs.setText("Monto Faltante BS:");
        jPanel1.add(textMontoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 30));

        textMontoUSD.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textMontoUSD.setText("Monto Faltante USD:");
        jPanel1.add(textMontoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 270, 30));

        montoUSD.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        montoUSD.setText("0");
        jPanel1.add(montoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 310, 30));

        separador2.setForeground(new java.awt.Color(195, 70, 176));
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 470, 10));

        panelZelle.setBackground(new java.awt.Color(195, 70, 176));
        panelZelle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textZelle.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textZelle.setForeground(new java.awt.Color(255, 255, 255));
        textZelle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textZelle.setText("ZELLE");
        panelZelle.add(textZelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanel1.add(panelZelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 70));

        panelPagoMovil.setBackground(new java.awt.Color(195, 70, 176));
        panelPagoMovil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textPagoMovil.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textPagoMovil.setForeground(new java.awt.Color(255, 255, 255));
        textPagoMovil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPagoMovil.setText("PAGO MOVIL");
        panelPagoMovil.add(textPagoMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanel1.add(panelPagoMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 150, 70));

        panelPunto.setBackground(new java.awt.Color(195, 70, 176));
        panelPunto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textPunto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textPunto.setForeground(new java.awt.Color(255, 255, 255));
        textPunto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPunto.setText("PUNTO");
        panelPunto.add(textPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanel1.add(panelPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 150, 70));

        panelEfectivoUSD.setBackground(new java.awt.Color(195, 70, 176));
        panelEfectivoUSD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textEfectivoUSD.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textEfectivoUSD.setForeground(new java.awt.Color(255, 255, 255));
        textEfectivoUSD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textEfectivoUSD.setText("EFECTIVO USD");
        panelEfectivoUSD.add(textEfectivoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanel1.add(panelEfectivoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 70));

        panelEfectivoBs.setBackground(new java.awt.Color(195, 70, 176));
        panelEfectivoBs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textEfectivoBs.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textEfectivoBs.setForeground(new java.awt.Color(255, 255, 255));
        textEfectivoBs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textEfectivoBs.setText("EFECTIVO BS");
        panelEfectivoBs.add(textEfectivoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanel1.add(panelEfectivoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 150, 70));

        tituloNombre.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        tituloNombre.setText("Vuelto USD:");
        jPanel1.add(tituloNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, 30));

        panelRetroceder.setBackground(new java.awt.Color(255, 255, 255));
        panelRetroceder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textRetroceder.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textRetroceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textRetroceder.setText("Retroceder");
        panelRetroceder.add(textRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        jPanel1.add(panelRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 160, 40));

        panelSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        panelSiguiente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSiguiente.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSiguiente.setText("Siguiente");
        panelSiguiente.add(textSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 150, 40));

        jPanel1.add(panelSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 150, 40));

        tituloNombre1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        tituloNombre1.setText("Vuelto Bs:");
        jPanel1.add(tituloNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, 30));

        montoBs1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        montoBs1.setText("0");
        jPanel1.add(montoBs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 310, 30));

        montoUSD1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        montoUSD1.setText("0");
        jPanel1.add(montoUSD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 120, 30));

        montoBs2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        montoBs2.setText("0");
        jPanel1.add(montoBs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 120, 30));

        separador3.setForeground(new java.awt.Color(195, 70, 176));
        jPanel1.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 470, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -5, 510, 560));

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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel montoBs1;
    private javax.swing.JLabel montoBs2;
    private javax.swing.JLabel montoUSD;
    private javax.swing.JLabel montoUSD1;
    private javax.swing.JPanel panelEfectivoBs;
    private javax.swing.JPanel panelEfectivoUSD;
    private javax.swing.JPanel panelPagoMovil;
    private javax.swing.JPanel panelPunto;
    private javax.swing.JPanel panelRetroceder;
    private javax.swing.JPanel panelSiguiente;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelZelle;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JLabel textEfectivoBs;
    private javax.swing.JLabel textEfectivoUSD;
    private javax.swing.JLabel textMontoBs;
    private javax.swing.JLabel textMontoUSD;
    private javax.swing.JLabel textPagoMovil;
    private javax.swing.JLabel textPunto;
    private javax.swing.JLabel textRegistrarCompra;
    private javax.swing.JLabel textRetroceder;
    private javax.swing.JLabel textSiguiente;
    private javax.swing.JLabel textTitulo;
    private javax.swing.JLabel textZelle;
    private javax.swing.JLabel tituloNombre;
    private javax.swing.JLabel tituloNombre1;
    // End of variables declaration//GEN-END:variables

}
