package Gui;

// @author andresbucarello
import EDD.EfectivoBs;
import EDD.EfectivoUSD;
import javax.swing.JOptionPane;
import EDD.Helpers;
import EDD.ListaPagoMovil;
import EDD.ListaProductos;
import EDD.ListaZelle;
import EDD.PagoMovil;
import EDD.Punto;
import EDD.Zelle;
import javax.swing.JFrame;

public class Checkout extends javax.swing.JFrame {

    Helpers f = new Helpers();

    static JFrame frame;
    static float ttlBs;
    static float ttlUSD;
    static float tasa;
    static ListaZelle zelles;
    static ListaPagoMovil pagosMoviles;
    static Punto pagosPuntos;
    static EfectivoUSD efectivoUSD;
    static EfectivoBs efectivoBs;
    static ListaProductos productos;

    public Checkout(JFrame frame, float ttlBs, float ttlUSD, float tasa, ListaZelle listaZelle, ListaPagoMovil listaPagoMovil, Punto montoPunto, EfectivoUSD montoEfectivoUSD, EfectivoBs montoEfectivoBs , ListaProductos lista) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.frame = frame;
        this.montoBs.setText(Float.toString(ttlBs));
        this.montoUSD.setText(Float.toString(ttlUSD));
        this.tasa = tasa;
        this.zelles = listaZelle;
        this.pagosMoviles = listaPagoMovil;
        this.pagosPuntos = montoPunto;
        this.efectivoUSD = montoEfectivoUSD;
        this.efectivoBs = montoEfectivoBs;
        this.productos = lista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        textMontoBs = new javax.swing.JLabel();
        montoBs = new javax.swing.JLabel();
        textMontoUSD = new javax.swing.JLabel();
        vueltoUSD = new javax.swing.JLabel();
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
        panelAtras = new javax.swing.JPanel();
        textAtras = new javax.swing.JLabel();
        tituloNombre1 = new javax.swing.JLabel();
        vueltoBs = new javax.swing.JLabel();
        montoUSD = new javax.swing.JLabel();
        separador3 = new javax.swing.JSeparator();
        panelSiguiente = new javax.swing.JPanel();
        textSiguiente = new javax.swing.JLabel();

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
        textTitulo.setText("CHECKOUT");
        panelTitulo.add(textTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        jPanel1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        textMontoBs.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textMontoBs.setText("Monto Faltante BS:");
        jPanel1.add(textMontoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 30));

        montoBs.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        montoBs.setText("0");
        jPanel1.add(montoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 200, 30));

        textMontoUSD.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textMontoUSD.setText("Monto Faltante USD:");
        jPanel1.add(textMontoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 270, 30));

        vueltoUSD.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        vueltoUSD.setText("0");
        jPanel1.add(vueltoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 310, 30));

        separador2.setForeground(new java.awt.Color(195, 70, 176));
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 470, 10));

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

        jPanel1.add(panelZelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 150, 70));

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

        jPanel1.add(panelPagoMovil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 150, 70));

        panelPunto.setBackground(new java.awt.Color(195, 70, 176));
        panelPunto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textPunto.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textPunto.setForeground(new java.awt.Color(255, 255, 255));
        textPunto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPunto.setText("PUNTO");
        textPunto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textPunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textPuntoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textPuntoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textPuntoMouseExited(evt);
            }
        });
        panelPunto.add(textPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 70));

        jPanel1.add(panelPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 150, 70));

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

        jPanel1.add(panelEfectivoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, 70));

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

        jPanel1.add(panelEfectivoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 150, 70));

        tituloNombre.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        tituloNombre.setText("Vuelto USD:");
        jPanel1.add(tituloNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 160, 30));

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

        jPanel1.add(panelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 160, 40));

        tituloNombre1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        tituloNombre1.setText("Vuelto Bs:");
        jPanel1.add(tituloNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, 30));

        vueltoBs.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        vueltoBs.setText("0");
        jPanel1.add(vueltoBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 310, 30));

        montoUSD.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        montoUSD.setText("0");
        jPanel1.add(montoUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 200, 30));

        separador3.setForeground(new java.awt.Color(195, 70, 176));
        jPanel1.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 470, 10));

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

        jPanel1.add(panelSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalizar() {
        if (Float.parseFloat(vueltoBs.getText()) == 0 && Float.parseFloat(montoBs.getText()) == 0) {
            JOptionPane.showMessageDialog(null, " COMPRA COMPLETADA CON EXITO ");
            this.setVisible(false);
            f.escribirTxt(productos);
            f.escribirZelles(zelles);
        }
    }

    private float validarFloat() {
        float cantidad;
        do {
            String num = JOptionPane.showInputDialog(null, " Ingrese el monto pagado ( EN CASO DE SER EN DECIMALES UTILIZAR PUNTO ' . ' ): ");
            cantidad = f.validarFloat(num);
            if (cantidad == Float.parseFloat(this.montoUSD.getText())) {
                JOptionPane.showMessageDialog(null, " MONTO COMPLETO PAGADO ");
            }
        } while (cantidad == 0);
        return cantidad;
    }

    private void agregarVuelto(float cantidad) {
        this.vueltoUSD.setText(Float.toString(cantidad - Float.parseFloat(montoUSD.getText())));
        this.vueltoBs.setText(Float.toString(cantidad * tasa - Float.parseFloat(montoBs.getText())));
    }

    private void textAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseEntered
        f.entrarRetroceder(textAtras, panelAtras);
    }//GEN-LAST:event_textAtrasMouseEntered

    private void textAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseExited
        f.salirRetroceder(textAtras, panelAtras);
    }//GEN-LAST:event_textAtrasMouseExited

    // VERIFICADO
    private void textAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseClicked
        this.setVisible(false);
        frame.setVisible(true);
    }//GEN-LAST:event_textAtrasMouseClicked

    private void textZelleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textZelleMouseEntered
        f.entrarPanel(panelZelle);
    }//GEN-LAST:event_textZelleMouseEntered

    private void textZelleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textZelleMouseExited
        f.salirPanel(panelZelle);
    }//GEN-LAST:event_textZelleMouseExited

    private void textZelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textZelleMouseClicked
        if (f.validacion()) {
            float monto = validarFloat();
            String nombre = JOptionPane.showInputDialog(null, " Ingrese el nombre de la persona que envia: ");
            String nro = JOptionPane.showInputDialog(null, " Ingrese el codigo de confirmacion de la transferencia: ");
            if (monto > Float.parseFloat(this.montoUSD.getText())) {
                agregarVuelto(monto);
            } else {
                float montoF = Float.parseFloat(montoUSD.getText()) - monto;
                montoUSD.setText(Float.toString(montoF));
                montoBs.setText(Float.toString(montoF * tasa));
            }
            Zelle zelle = new Zelle(monto, nombre, nro);
            zelles.agregar(true, zelle);
            f.escribirZelles(zelles);
            finalizar();
        }
    }//GEN-LAST:event_textZelleMouseClicked

    private void textPagoMovilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPagoMovilMouseEntered
        f.entrarPanel(panelPagoMovil);
    }//GEN-LAST:event_textPagoMovilMouseEntered

    private void textPagoMovilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPagoMovilMouseExited
        f.salirPanel(panelPagoMovil);
    }//GEN-LAST:event_textPagoMovilMouseExited

    private void textPagoMovilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPagoMovilMouseClicked
        if (f.validacion()) {
            float monto = validarFloat();
            String referenciaSTR = JOptionPane.showInputDialog(null, " Ingrese la referencia del pago movil: ");
            int referencia = f.validarInt(referenciaSTR);
            if (monto > Float.parseFloat(this.montoBs.getText())) {
                agregarVuelto(monto);
            } else {
                float montoF = Float.parseFloat(montoBs.getText()) - monto;
                montoUSD.setText(Float.toString(montoF / tasa));
                montoBs.setText(Float.toString(montoF));
            }
            PagoMovil pagoMovil = new PagoMovil(monto, referencia);
            pagosMoviles.agregar(true, pagoMovil);
            f.escribirPagosMoviles(pagosMoviles);
            finalizar();
        }
    }//GEN-LAST:event_textPagoMovilMouseClicked

    private void textPuntoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPuntoMouseEntered
        f.entrarPanel(panelPunto);
    }//GEN-LAST:event_textPuntoMouseEntered

    private void textPuntoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPuntoMouseExited
        f.salirPanel(panelPunto);
    }//GEN-LAST:event_textPuntoMouseExited

    private void textPuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPuntoMouseClicked
        if (f.validacion()) {
            float monto = validarFloat();
            float deuda = Float.parseFloat(this.montoBs.getText());
            if (monto > deuda) {
                agregarVuelto(monto);
            } else {
                float montoF = deuda - monto;
                montoUSD.setText(Float.toString(montoF / tasa));
                montoBs.setText(Float.toString(montoF));
            }
            pagosPuntos.setMonto(pagosPuntos.getMonto() + monto);
            f.escribirPunto(pagosPuntos);
            finalizar();
        }
    }//GEN-LAST:event_textPuntoMouseClicked

    private void textEfectivoUSDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoUSDMouseEntered
        f.entrarPanel(panelEfectivoUSD);
    }//GEN-LAST:event_textEfectivoUSDMouseEntered

    private void textEfectivoUSDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoUSDMouseExited
        f.salirPanel(panelEfectivoUSD);
    }//GEN-LAST:event_textEfectivoUSDMouseExited

    private void textEfectivoUSDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoUSDMouseClicked
        if (f.validacion()) {
            float monto = validarFloat();
            if (monto > Float.parseFloat(this.montoUSD.getText())) {
                agregarVuelto(monto);
            } else {
                float montoF = Float.parseFloat(montoUSD.getText()) - monto;
                montoUSD.setText(Float.toString(montoF));
                montoBs.setText(Float.toString(montoF * tasa));
            }
            efectivoUSD.setMonto(efectivoUSD.getMonto() + monto);
            f.escribirEfectivoUSD(efectivoUSD);
            finalizar();
        }
    }//GEN-LAST:event_textEfectivoUSDMouseClicked

    private void textEfectivoBsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoBsMouseEntered
        f.entrarPanel(panelEfectivoBs);
    }//GEN-LAST:event_textEfectivoBsMouseEntered

    private void textEfectivoBsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoBsMouseExited
        f.salirPanel(panelEfectivoBs);
    }//GEN-LAST:event_textEfectivoBsMouseExited

    private void textEfectivoBsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEfectivoBsMouseClicked
        if (f.validacion()) {
            float monto = validarFloat();
            if (monto > Float.parseFloat(this.montoBs.getText())) {
                agregarVuelto(monto);
            } else {
                float montoF = Float.parseFloat(montoBs.getText()) - monto;
                montoUSD.setText(Float.toString(montoF / tasa));
                montoBs.setText(Float.toString(montoF));
            }
            efectivoBs.setMonto(efectivoBs.getMonto() + monto);
            f.escribirEfectivoBs(efectivoBs);
            finalizar();
        }
    }//GEN-LAST:event_textEfectivoBsMouseClicked

    private void textSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSiguienteMouseClicked
        String[] array = {" No ", " Si "};
        int opcion = JOptionPane.showOptionDialog(null, "¿HA ENTREGADO EL VUELTO COMPLETO AL CLIENTE?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
        if (opcion == 1) {
            JOptionPane.showMessageDialog(null, " COMPRA COMPLETADA CON EXITO ");
            this.setVisible(false);
            f.escribirTxt(productos);
        } else{
            JOptionPane.showMessageDialog(null, " ENTREGUE EL VUELTO E INTENTE DE NUEVO ");
        }
    }//GEN-LAST:event_textSiguienteMouseClicked

    private void textSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSiguienteMouseEntered
        f.entrarBoton(textSiguiente, panelSiguiente);
    }//GEN-LAST:event_textSiguienteMouseEntered

    private void textSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSiguienteMouseExited
        f.salirBoton(textSiguiente, panelSiguiente);
    }//GEN-LAST:event_textSiguienteMouseExited

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout(frame, ttlBs, ttlUSD, tasa, zelles, pagosMoviles, pagosPuntos, efectivoUSD, efectivoBs, productos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel montoBs;
    private javax.swing.JLabel montoUSD;
    private javax.swing.JPanel panelAtras;
    private javax.swing.JPanel panelEfectivoBs;
    private javax.swing.JPanel panelEfectivoUSD;
    private javax.swing.JPanel panelPagoMovil;
    private javax.swing.JPanel panelPunto;
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
    private javax.swing.JLabel textPunto;
    private javax.swing.JLabel textSiguiente;
    private javax.swing.JLabel textTitulo;
    private javax.swing.JLabel textZelle;
    private javax.swing.JLabel tituloNombre;
    private javax.swing.JLabel tituloNombre1;
    private javax.swing.JLabel vueltoBs;
    private javax.swing.JLabel vueltoUSD;
    // End of variables declaration//GEN-END:variables

}
