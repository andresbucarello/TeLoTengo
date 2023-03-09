package Gui;

// @author andresbucarello

public class Pagos extends javax.swing.JFrame {

    public Pagos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        panelAtras = new javax.swing.JPanel();
        textAtras1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textAtras = new javax.swing.JLabel();
        textAtras2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        tituloNombre1 = new javax.swing.JLabel();
        tituloNombre2 = new javax.swing.JLabel();
        textAtras3 = new javax.swing.JLabel();
        textAtras4 = new javax.swing.JLabel();
        textAtras5 = new javax.swing.JLabel();
        tituloNombre3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTitulo.setBackground(new java.awt.Color(195, 70, 176));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTitulo.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitulo.setText("PAGOS");
        panelTitulo.add(textTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 60));

        jPanel1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 580, 60));

        panelAtras.setBackground(new java.awt.Color(255, 255, 255));
        panelAtras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAtras1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textAtras1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAtras1.setText("Atras");
        panelAtras.add(textAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 60));

        jPanel1.add(panelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 310, 340));

        textAtras.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textAtras.setForeground(new java.awt.Color(195, 70, 176));
        textAtras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textAtras.setText("Efectivo USD:");
        jPanel1.add(textAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 260, 40));

        textAtras2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textAtras2.setForeground(new java.awt.Color(195, 70, 176));
        textAtras2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAtras2.setText("Pago Movil");
        jPanel1.add(textAtras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 310, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 310, 340));

        tituloNombre1.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        tituloNombre1.setText("0");
        jPanel1.add(tituloNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 150, 40));

        tituloNombre2.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        tituloNombre2.setText("0");
        jPanel1.add(tituloNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 150, 40));

        textAtras3.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textAtras3.setForeground(new java.awt.Color(195, 70, 176));
        textAtras3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAtras3.setText("Zelle");
        jPanel1.add(textAtras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 310, 40));

        textAtras4.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textAtras4.setForeground(new java.awt.Color(195, 70, 176));
        textAtras4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textAtras4.setText("Efectivo Bs:");
        jPanel1.add(textAtras4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 260, 40));

        textAtras5.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textAtras5.setForeground(new java.awt.Color(195, 70, 176));
        textAtras5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textAtras5.setText("Punto:");
        jPanel1.add(textAtras5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 200, 40));

        tituloNombre3.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        tituloNombre3.setText("0");
        jPanel1.add(tituloNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));

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
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel panelAtras;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel textAtras;
    private javax.swing.JLabel textAtras1;
    private javax.swing.JLabel textAtras2;
    private javax.swing.JLabel textAtras3;
    private javax.swing.JLabel textAtras4;
    private javax.swing.JLabel textAtras5;
    private javax.swing.JLabel textTitulo;
    private javax.swing.JLabel tituloNombre1;
    private javax.swing.JLabel tituloNombre2;
    private javax.swing.JLabel tituloNombre3;
    // End of variables declaration//GEN-END:variables

}
