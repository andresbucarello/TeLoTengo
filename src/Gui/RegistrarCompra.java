package Gui;

// @author andresbucarello
import java.awt.Color;
import EDD.Helpers;

public class RegistrarCompra extends javax.swing.JFrame {

    Helpers f = new Helpers();

    public RegistrarCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelAtras = new javax.swing.JPanel();
        textAtras = new javax.swing.JLabel();
        panelTituloProductos = new javax.swing.JPanel();
        textTituloProductos = new javax.swing.JLabel();
        panelChuche1 = new javax.swing.JPanel();
        botonChuche1 = new javax.swing.JButton();
        panelChuche2 = new javax.swing.JPanel();
        botonChuche2 = new javax.swing.JButton();
        panelChuche3 = new javax.swing.JPanel();
        botonChuche3 = new javax.swing.JButton();
        panelChuche4 = new javax.swing.JPanel();
        botonChuche4 = new javax.swing.JButton();
        panelChuche5 = new javax.swing.JPanel();
        botonChuche5 = new javax.swing.JButton();
        panelChuche6 = new javax.swing.JPanel();
        botonChuche6 = new javax.swing.JButton();
        panelChuche7 = new javax.swing.JPanel();
        botonChuche7 = new javax.swing.JButton();
        panelChuche8 = new javax.swing.JPanel();
        botonChuche8 = new javax.swing.JButton();
        panelChuche9 = new javax.swing.JPanel();
        botonChuche9 = new javax.swing.JButton();
        panelChuche10 = new javax.swing.JPanel();
        botonChuche10 = new javax.swing.JButton();
        panelChuche11 = new javax.swing.JPanel();
        botonChuche11 = new javax.swing.JButton();
        panelChuche12 = new javax.swing.JPanel();
        botonChuche12 = new javax.swing.JButton();
        panelChuche13 = new javax.swing.JPanel();
        botonChuche13 = new javax.swing.JButton();
        panelChuche14 = new javax.swing.JPanel();
        botonChuche14 = new javax.swing.JButton();
        panelChuche15 = new javax.swing.JPanel();
        botonChuche15 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        panelTituloCompra = new javax.swing.JPanel();
        textTituloCompra = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCompra = new javax.swing.JList<>();
        textSubtotal = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        textIVA = new javax.swing.JLabel();
        IVA = new javax.swing.JLabel();
        textTotalBs = new javax.swing.JLabel();
        totalBs = new javax.swing.JLabel();
        textTotalUSD = new javax.swing.JLabel();
        totalUSD = new javax.swing.JLabel();
        panelVaciar = new javax.swing.JPanel();
        textVaciar = new javax.swing.JLabel();
        panelCheckout = new javax.swing.JPanel();
        textCheckout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panelTituloProductos.setBackground(new java.awt.Color(195, 70, 176));
        panelTituloProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTituloProductos.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        textTituloProductos.setForeground(new java.awt.Color(255, 255, 255));
        textTituloProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTituloProductos.setText("PRODUCTOS");
        panelTituloProductos.add(textTituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 60));

        jPanel1.add(panelTituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 440, 60));

        panelChuche1.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cacaoPolvo.png"))); // NOI18N
        botonChuche1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche1Layout = new javax.swing.GroupLayout(panelChuche1);
        panelChuche1.setLayout(panelChuche1Layout);
        panelChuche1Layout.setHorizontalGroup(
            panelChuche1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche1Layout.setVerticalGroup(
            panelChuche1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 130));

        panelChuche2.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carre.png"))); // NOI18N
        botonChuche2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche2Layout = new javax.swing.GroupLayout(panelChuche2);
        panelChuche2.setLayout(panelChuche2Layout);
        panelChuche2Layout.setHorizontalGroup(
            panelChuche2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche2Layout.setVerticalGroup(
            panelChuche2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 170, 130));

        panelChuche3.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/charge.png"))); // NOI18N
        botonChuche3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche3Layout = new javax.swing.GroupLayout(panelChuche3);
        panelChuche3.setLayout(panelChuche3Layout);
        panelChuche3Layout.setHorizontalGroup(
            panelChuche3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche3Layout.setVerticalGroup(
            panelChuche3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 170, 130));

        panelChuche4.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chocolateLechepng.png"))); // NOI18N
        botonChuche4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche4Layout = new javax.swing.GroupLayout(panelChuche4);
        panelChuche4.setLayout(panelChuche4Layout);
        panelChuche4Layout.setHorizontalGroup(
            panelChuche4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche4Layout.setVerticalGroup(
            panelChuche4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 130));

        panelChuche5.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chocolateTaza.png"))); // NOI18N
        botonChuche5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche5Layout = new javax.swing.GroupLayout(panelChuche5);
        panelChuche5.setLayout(panelChuche5Layout);
        panelChuche5Layout.setHorizontalGroup(
            panelChuche5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche5Layout.setVerticalGroup(
            panelChuche5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, 130));

        panelChuche6.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chokito.png"))); // NOI18N
        botonChuche6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche6Layout = new javax.swing.GroupLayout(panelChuche6);
        panelChuche6.setLayout(panelChuche6Layout);
        panelChuche6Layout.setHorizontalGroup(
            panelChuche6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChuche6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonChuche6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelChuche6Layout.setVerticalGroup(
            panelChuche6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChuche6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonChuche6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelChuche6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 170, 130));

        panelChuche7.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cocosette.png"))); // NOI18N
        botonChuche7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche7Layout = new javax.swing.GroupLayout(panelChuche7);
        panelChuche7.setLayout(panelChuche7Layout);
        panelChuche7Layout.setHorizontalGroup(
            panelChuche7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche7Layout.setVerticalGroup(
            panelChuche7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 170, 130));

        panelChuche8.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cricri.png"))); // NOI18N
        botonChuche8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche8Layout = new javax.swing.GroupLayout(panelChuche8);
        panelChuche8.setLayout(panelChuche8Layout);
        panelChuche8Layout.setHorizontalGroup(
            panelChuche8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche8Layout.setVerticalGroup(
            panelChuche8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 170, 130));

        panelChuche9.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/galak.png"))); // NOI18N
        botonChuche9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche9Layout = new javax.swing.GroupLayout(panelChuche9);
        panelChuche9.setLayout(panelChuche9Layout);
        panelChuche9Layout.setHorizontalGroup(
            panelChuche9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche9Layout.setVerticalGroup(
            panelChuche9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 170, 130));

        panelChuche10.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/kitkat.png"))); // NOI18N
        botonChuche10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche10Layout = new javax.swing.GroupLayout(panelChuche10);
        panelChuche10.setLayout(panelChuche10Layout);
        panelChuche10Layout.setHorizontalGroup(
            panelChuche10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche10Layout.setVerticalGroup(
            panelChuche10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 170, 130));

        panelChuche11.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prestigio.png"))); // NOI18N
        botonChuche11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche11Layout = new javax.swing.GroupLayout(panelChuche11);
        panelChuche11.setLayout(panelChuche11Layout);
        panelChuche11Layout.setHorizontalGroup(
            panelChuche11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche11Layout.setVerticalGroup(
            panelChuche11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 170, 130));

        panelChuche12.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rikiti.png"))); // NOI18N
        botonChuche12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche12Layout = new javax.swing.GroupLayout(panelChuche12);
        panelChuche12.setLayout(panelChuche12Layout);
        panelChuche12Layout.setHorizontalGroup(
            panelChuche12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche12Layout.setVerticalGroup(
            panelChuche12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 170, 130));

        panelChuche13.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/samba.png"))); // NOI18N
        botonChuche13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche13Layout = new javax.swing.GroupLayout(panelChuche13);
        panelChuche13.setLayout(panelChuche13Layout);
        panelChuche13Layout.setHorizontalGroup(
            panelChuche13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChuche13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonChuche13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelChuche13Layout.setVerticalGroup(
            panelChuche13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelChuche13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonChuche13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(panelChuche13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 170, 130));

        panelChuche14.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/susy.png"))); // NOI18N
        botonChuche14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche14Layout = new javax.swing.GroupLayout(panelChuche14);
        panelChuche14.setLayout(panelChuche14Layout);
        panelChuche14Layout.setHorizontalGroup(
            panelChuche14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche14, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche14Layout.setVerticalGroup(
            panelChuche14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 700, 170, 130));

        panelChuche15.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/toronto.png"))); // NOI18N
        botonChuche15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelChuche15Layout = new javax.swing.GroupLayout(panelChuche15);
        panelChuche15.setLayout(panelChuche15Layout);
        panelChuche15Layout.setHorizontalGroup(
            panelChuche15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche15, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChuche15Layout.setVerticalGroup(
            panelChuche15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChuche15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonChuche15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panelChuche15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 700, 170, 130));

        jSeparator1.setForeground(new java.awt.Color(195, 70, 176));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 10, 800));

        panelTituloCompra.setBackground(new java.awt.Color(195, 70, 176));
        panelTituloCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTituloCompra.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        textTituloCompra.setForeground(new java.awt.Color(255, 255, 255));
        textTituloCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTituloCompra.setText("COMPRA");
        panelTituloCompra.add(textTituloCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 350, 60));

        jPanel1.add(panelTituloCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 350, 60));

        listaCompra.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaCompra);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 350, 580));

        textSubtotal.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        textSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textSubtotal.setText("SubTotal:");
        jPanel1.add(textSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 680, 140, 30));

        Subtotal.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Subtotal.setText("0");
        jPanel1.add(Subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 680, 140, 30));

        textIVA.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        textIVA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textIVA.setText("IVA:");
        jPanel1.add(textIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 700, 140, 30));

        IVA.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        IVA.setText("0");
        jPanel1.add(IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 700, 140, 30));

        textTotalBs.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textTotalBs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textTotalBs.setText("Total Bs:");
        jPanel1.add(textTotalBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 730, 140, 30));

        totalBs.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        totalBs.setText("0");
        jPanel1.add(totalBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 730, 140, 30));

        textTotalUSD.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textTotalUSD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textTotalUSD.setText("Total $:");
        jPanel1.add(textTotalUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 750, 140, 30));

        totalUSD.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        totalUSD.setText("0");
        jPanel1.add(totalUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 750, 140, 30));

        panelVaciar.setBackground(new java.awt.Color(255, 255, 255));
        panelVaciar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textVaciar.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textVaciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textVaciar.setText("Vaciar");
        textVaciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textVaciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textVaciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textVaciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textVaciarMouseExited(evt);
            }
        });
        panelVaciar.add(textVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel1.add(panelVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 790, 150, 40));

        panelCheckout.setBackground(new java.awt.Color(255, 255, 255));
        panelCheckout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textCheckout.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textCheckout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textCheckout.setText("Checkout");
        textCheckout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCheckoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textCheckoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textCheckoutMouseExited(evt);
            }
        });
        panelCheckout.add(textCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel1.add(panelCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 790, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 840));

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

    private void textVaciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textVaciarMouseEntered
        f.entrarRetroceder(textVaciar, panelVaciar);
    }//GEN-LAST:event_textVaciarMouseEntered

    private void textVaciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textVaciarMouseExited
        f.salirRetroceder(textVaciar, panelVaciar);
    }//GEN-LAST:event_textVaciarMouseExited

    private void textVaciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textVaciarMouseClicked
        // vaciar();
    }//GEN-LAST:event_textVaciarMouseClicked

    private void textCheckoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCheckoutMouseEntered
        f.entrarBoton(textCheckout, panelCheckout);
    }//GEN-LAST:event_textCheckoutMouseEntered

    private void textCheckoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCheckoutMouseExited
        f.salirBoton(textCheckout, panelCheckout);
    }//GEN-LAST:event_textCheckoutMouseExited

    private void textCheckoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCheckoutMouseClicked
        f.irCheckout(this);
    }//GEN-LAST:event_textCheckoutMouseClicked

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
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IVA;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JButton botonChuche1;
    private javax.swing.JButton botonChuche10;
    private javax.swing.JButton botonChuche11;
    private javax.swing.JButton botonChuche12;
    private javax.swing.JButton botonChuche13;
    private javax.swing.JButton botonChuche14;
    private javax.swing.JButton botonChuche15;
    private javax.swing.JButton botonChuche2;
    private javax.swing.JButton botonChuche3;
    private javax.swing.JButton botonChuche4;
    private javax.swing.JButton botonChuche5;
    private javax.swing.JButton botonChuche6;
    private javax.swing.JButton botonChuche7;
    private javax.swing.JButton botonChuche8;
    private javax.swing.JButton botonChuche9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listaCompra;
    private javax.swing.JPanel panelAtras;
    private javax.swing.JPanel panelCheckout;
    private javax.swing.JPanel panelChuche1;
    private javax.swing.JPanel panelChuche10;
    private javax.swing.JPanel panelChuche11;
    private javax.swing.JPanel panelChuche12;
    private javax.swing.JPanel panelChuche13;
    private javax.swing.JPanel panelChuche14;
    private javax.swing.JPanel panelChuche15;
    private javax.swing.JPanel panelChuche2;
    private javax.swing.JPanel panelChuche3;
    private javax.swing.JPanel panelChuche4;
    private javax.swing.JPanel panelChuche5;
    private javax.swing.JPanel panelChuche6;
    private javax.swing.JPanel panelChuche7;
    private javax.swing.JPanel panelChuche8;
    private javax.swing.JPanel panelChuche9;
    private javax.swing.JPanel panelTituloCompra;
    private javax.swing.JPanel panelTituloProductos;
    private javax.swing.JPanel panelVaciar;
    private javax.swing.JLabel textAtras;
    private javax.swing.JLabel textCheckout;
    private javax.swing.JLabel textIVA;
    private javax.swing.JLabel textSubtotal;
    private javax.swing.JLabel textTituloCompra;
    private javax.swing.JLabel textTituloProductos;
    private javax.swing.JLabel textTotalBs;
    private javax.swing.JLabel textTotalUSD;
    private javax.swing.JLabel textVaciar;
    private javax.swing.JLabel totalBs;
    private javax.swing.JLabel totalUSD;
    // End of variables declaration//GEN-END:variables

}
