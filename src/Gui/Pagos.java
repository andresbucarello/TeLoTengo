package Gui;

// @author andresbucarello

import java.awt.Color;
import EDD.Helpers;

public class Pagos extends javax.swing.JFrame {
    
    Helpers f = new Helpers();
    
    public Pagos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        panelAtras = new javax.swing.JPanel();
        textAtras = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textZelle = new javax.swing.JLabel();
        textPagoMovil = new javax.swing.JLabel();
        textEfectivoBs = new javax.swing.JLabel();
        efectivoBs = new javax.swing.JLabel();
        textPunto = new javax.swing.JLabel();
        punto = new javax.swing.JLabel();
        textEfectivoUSD = new javax.swing.JLabel();
        efectivoUSD = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
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

        textAtras.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAtras.setText("Atras");
        textAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textAtrasMouseExited(evt);
            }
        });
        panelAtras.add(textAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 60));

        jPanel1.add(panelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 60));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 320, 340));

        textZelle.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textZelle.setForeground(new java.awt.Color(195, 70, 176));
        textZelle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textZelle.setText("Zelle");
        jPanel1.add(textZelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 310, 40));

        textPagoMovil.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textPagoMovil.setForeground(new java.awt.Color(195, 70, 176));
        textPagoMovil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPagoMovil.setText("Pago Movil");
        jPanel1.add(textPagoMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 310, 40));

        textEfectivoBs.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textEfectivoBs.setForeground(new java.awt.Color(195, 70, 176));
        textEfectivoBs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textEfectivoBs.setText("Efectivo Bs:");
        jPanel1.add(textEfectivoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 260, 40));

        efectivoBs.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        efectivoBs.setText("0");
        jPanel1.add(efectivoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 150, 40));

        textPunto.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textPunto.setForeground(new java.awt.Color(195, 70, 176));
        textPunto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textPunto.setText("Punto:");
        jPanel1.add(textPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 200, 40));

        punto.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        punto.setText("0");
        jPanel1.add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 160, 40));

        textEfectivoUSD.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textEfectivoUSD.setForeground(new java.awt.Color(195, 70, 176));
        textEfectivoUSD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        textEfectivoUSD.setText("Efectivo USD:");
        jPanel1.add(textEfectivoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 260, 40));

        efectivoUSD.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        efectivoUSD.setText("0");
        jPanel1.add(efectivoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 150, 40));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 320, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseEntered
        f.entrarRetroceder(textAtras, panelAtras);
    }//GEN-LAST:event_textAtrasMouseEntered

    private void textAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseExited
        f.salirRetroceder(textAtras, panelAtras);
    }//GEN-LAST:event_textAtrasMouseExited

    private void textAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseClicked
        f.volverMenu(this);
    }//GEN-LAST:event_textAtrasMouseClicked

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel efectivoBs;
    private javax.swing.JLabel efectivoUSD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel panelAtras;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel punto;
    private javax.swing.JLabel textAtras;
    private javax.swing.JLabel textEfectivoBs;
    private javax.swing.JLabel textEfectivoUSD;
    private javax.swing.JLabel textPagoMovil;
    private javax.swing.JLabel textPunto;
    private javax.swing.JLabel textTitulo;
    private javax.swing.JLabel textZelle;
    // End of variables declaration//GEN-END:variables

}
