package Gui;

// @author andresbucarello

import EDD.EfectivoBs;
import EDD.EfectivoUSD;
import javax.swing.JOptionPane;
import EDD.Helpers;
import EDD.ListaPagoMovil;
import EDD.ListaProductos;
import EDD.ListaZelle;
import EDD.Punto;
import static Gui.Checkout.efectivoBs;
import static Gui.Checkout.efectivoUSD;
import static Gui.Checkout.frame;
import static Gui.Checkout.pagosMoviles;
import static Gui.Checkout.pagosPuntos;
import static Gui.Checkout.tasa;
import static Gui.Checkout.ttlBs;
import static Gui.Checkout.ttlUSD;
import static Gui.Checkout.zelles;
import javax.swing.JFrame;

public class GestionVuelto extends javax.swing.JFrame {
    
    Helpers f = new Helpers();
    
    static JFrame frame;
    static float tasa;
    static ListaZelle zelles;
    static ListaPagoMovil pagosMoviles;
    static Punto pagosPuntos;
    static EfectivoUSD efectivoUSD;
    static EfectivoBs efectivoBs;
    
    public GestionVuelto(JFrame frame, float tasa, ListaZelle listaZelle, ListaPagoMovil listaPagoMovil, Punto montoPunto, EfectivoUSD montoEfectivoUSD, EfectivoBs montoEfectivoBs) {
        initComponents();
        this.setLocationRelativeTo(null);
        
//        this.montoBs.setText(Float.toString(ttlBs));
//        this.montoUSD.setText(Float.toString(ttlUSD));
        
        this.frame = frame;
        this.tasa = tasa;
        this.zelles = listaZelle;
        this.pagosMoviles = listaPagoMovil;
        this.pagosPuntos = montoPunto;
        this.efectivoUSD = montoEfectivoUSD;
        this.efectivoBs = montoEfectivoBs;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        textMontoUSD = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        panelPagoMovil = new javax.swing.JPanel();
        textPagoMovil = new javax.swing.JLabel();
        textMontoBs = new javax.swing.JLabel();
        panelZelle = new javax.swing.JPanel();
        textZelle = new javax.swing.JLabel();
        panelEfectivoUSD = new javax.swing.JPanel();
        textEfectivoUSD = new javax.swing.JLabel();
        panelEfectivoBs = new javax.swing.JPanel();
        textEfectivoBs = new javax.swing.JLabel();
        panelAtras = new javax.swing.JPanel();
        textAtras = new javax.swing.JLabel();
        panelSiguiente = new javax.swing.JPanel();
        textSiguiente = new javax.swing.JLabel();
        montoUSD1 = new javax.swing.JLabel();
        separador3 = new javax.swing.JSeparator();
        montoBs2 = new javax.swing.JLabel();

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
        textTitulo.setText("VUELTO");
        panelTitulo.add(textTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        jPanel1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        textMontoUSD.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textMontoUSD.setText("Monto Faltante USD:");
        jPanel1.add(textMontoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 270, 30));

        separador2.setForeground(new java.awt.Color(195, 70, 176));
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 390, 10));

        panelPagoMovil.setBackground(new java.awt.Color(195, 70, 176));
        panelPagoMovil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textPagoMovil.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textPagoMovil.setForeground(new java.awt.Color(255, 255, 255));
        textPagoMovil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPagoMovil.setText("PAGO MOVIL");
        textPagoMovil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textPagoMovil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textPagoMovilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textPagoMovilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textPagoMovilMouseExited(evt);
            }
        });
        panelPagoMovil.add(textPagoMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanel1.add(panelPagoMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 150, 70));

        textMontoBs.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textMontoBs.setText("Monto Faltante BS:");
        jPanel1.add(textMontoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 30));

        panelZelle.setBackground(new java.awt.Color(195, 70, 176));
        panelZelle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textZelle.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textZelle.setForeground(new java.awt.Color(255, 255, 255));
        textZelle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textZelle.setText("ZELLE");
        textZelle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textZelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textZelleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textZelleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textZelleMouseExited(evt);
            }
        });
        panelZelle.add(textZelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanel1.add(panelZelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 70));

        panelEfectivoUSD.setBackground(new java.awt.Color(195, 70, 176));
        panelEfectivoUSD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textEfectivoUSD.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textEfectivoUSD.setForeground(new java.awt.Color(255, 255, 255));
        textEfectivoUSD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textEfectivoUSD.setText("EFECTIVO USD");
        textEfectivoUSD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textEfectivoUSD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textEfectivoUSDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textEfectivoUSDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textEfectivoUSDMouseExited(evt);
            }
        });
        panelEfectivoUSD.add(textEfectivoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanel1.add(panelEfectivoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, 70));

        panelEfectivoBs.setBackground(new java.awt.Color(195, 70, 176));
        panelEfectivoBs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textEfectivoBs.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textEfectivoBs.setForeground(new java.awt.Color(255, 255, 255));
        textEfectivoBs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textEfectivoBs.setText("EFECTIVO BS");
        textEfectivoBs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textEfectivoBs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textEfectivoBsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textEfectivoBsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textEfectivoBsMouseExited(evt);
            }
        });
        panelEfectivoBs.add(textEfectivoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanel1.add(panelEfectivoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 150, 70));

        panelAtras.setBackground(new java.awt.Color(255, 255, 255));
        panelAtras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAtras.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAtras.setText("Retroceder");
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
        panelAtras.add(textAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        jPanel1.add(panelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 160, 40));

        panelSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        panelSiguiente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSiguiente.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSiguiente.setText("Siguiente");
        textSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textSiguienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textSiguienteMouseExited(evt);
            }
        });
        panelSiguiente.add(textSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel1.add(panelSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 150, 40));

        montoUSD1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        montoUSD1.setText("0");
        jPanel1.add(montoUSD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 120, 30));

        separador3.setForeground(new java.awt.Color(195, 70, 176));
        jPanel1.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 390, 10));

        montoBs2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        montoBs2.setText("0");
        jPanel1.add(montoBs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseEntered
        f.entrarRetroceder(textAtras, panelAtras);
    }//GEN-LAST:event_textAtrasMouseEntered

    private void textAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseExited
        f.salirRetroceder(textAtras, panelAtras);
    }//GEN-LAST:event_textAtrasMouseExited

    private void textAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseClicked
//        f.irCheckout(this);
    }//GEN-LAST:event_textAtrasMouseClicked

    private void textSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSiguienteMouseEntered
        f.entrarBoton(textSiguiente, panelSiguiente);
    }//GEN-LAST:event_textSiguienteMouseEntered

    private void textSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSiguienteMouseExited
        f.salirBoton(textSiguiente, panelSiguiente);
    }//GEN-LAST:event_textSiguienteMouseExited

    private void textSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSiguienteMouseClicked
        JOptionPane.showMessageDialog(null, " COMPRA COMPLETADA CON EXITO ");
//        f.volverMenu(this);
    }//GEN-LAST:event_textSiguienteMouseClicked

    private void textZelleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textZelleMouseEntered
        f.entrarPanel(panelZelle);
    }//GEN-LAST:event_textZelleMouseEntered

    private void textZelleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textZelleMouseExited
        f.salirPanel(panelZelle);
    }//GEN-LAST:event_textZelleMouseExited

    private void textZelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textZelleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textZelleMouseClicked

    private void textPagoMovilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPagoMovilMouseEntered
        f.entrarPanel(panelPagoMovil);
    }//GEN-LAST:event_textPagoMovilMouseEntered

    private void textPagoMovilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPagoMovilMouseExited
        f.salirPanel(panelPagoMovil);
    }//GEN-LAST:event_textPagoMovilMouseExited

    private void textPagoMovilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPagoMovilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textPagoMovilMouseClicked

    private void textEfectivoUSDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoUSDMouseEntered
        f.entrarPanel(panelEfectivoUSD);
    }//GEN-LAST:event_textEfectivoUSDMouseEntered

    private void textEfectivoUSDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoUSDMouseExited
        f.salirPanel(panelEfectivoUSD);
    }//GEN-LAST:event_textEfectivoUSDMouseExited

    private void textEfectivoUSDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoUSDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textEfectivoUSDMouseClicked

    private void textEfectivoBsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoBsMouseEntered
        f.entrarPanel(panelEfectivoBs);
    }//GEN-LAST:event_textEfectivoBsMouseEntered

    private void textEfectivoBsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoBsMouseExited
        f.salirPanel(panelEfectivoBs);
    }//GEN-LAST:event_textEfectivoBsMouseExited

    private void textEfectivoBsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoBsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textEfectivoBsMouseClicked

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
            java.util.logging.Logger.getLogger(GestionVuelto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionVuelto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionVuelto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionVuelto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionVuelto(frame, tasa, zelles, pagosMoviles, pagosPuntos, efectivoUSD, efectivoBs).setVisible(true);    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel montoBs2;
    private javax.swing.JLabel montoUSD1;
    private javax.swing.JPanel panelAtras;
    private javax.swing.JPanel panelEfectivoBs;
    private javax.swing.JPanel panelEfectivoUSD;
    private javax.swing.JPanel panelPagoMovil;
    private javax.swing.JPanel panelSiguiente;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelZelle;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JLabel textAtras;
    private javax.swing.JLabel textEfectivoBs;
    private javax.swing.JLabel textEfectivoUSD;
    private javax.swing.JLabel textMontoBs;
    private javax.swing.JLabel textMontoUSD;
    private javax.swing.JLabel textPagoMovil;
    private javax.swing.JLabel textSiguiente;
    private javax.swing.JLabel textTitulo;
    private javax.swing.JLabel textZelle;
    // End of variables declaration//GEN-END:variables

}
