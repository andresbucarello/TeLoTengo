package Gui;

// @author andresbucarello
import EDD.EfectivoBs;
import EDD.EfectivoUSD;
import EDD.Helpers;
import EDD.ListaPagoMovil;
import EDD.ListaProductos;
import EDD.ListaZelle;
import EDD.Producto;
import EDD.Punto;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistrarCompra extends javax.swing.JFrame {

    static JFrame frame;
    static ListaProductos productos;
    static ListaZelle zelles;
    static ListaPagoMovil pagosMoviles;
    static Punto pagosPuntos;
    static EfectivoUSD efectivoUSD;
    static EfectivoBs efectivoBs;
    static float tasa;

    private Producto productoSeleccionado;

    DefaultTableModel modelo = new DefaultTableModel();
    Helpers f = new Helpers();

    public RegistrarCompra(JFrame frame, ListaProductos lista_productos, ListaZelle listaZelle, ListaPagoMovil listaPagoMovil, Punto montoPunto, EfectivoUSD montoEfectivoUSD, EfectivoBs montoEfectivoBs, float tasa) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.tasa = tasa;

        this.frame = frame;
        this.productos = lista_productos;
        this.zelles = listaZelle;
        this.pagosMoviles = listaPagoMovil;
        this.pagosPuntos = montoPunto;
        this.efectivoUSD = montoEfectivoUSD;
        this.efectivoBs = montoEfectivoBs;

        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        carrito.setModel(modelo);
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
        scrollPane = new javax.swing.JScrollPane();
        carrito = new javax.swing.JTable();

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

        jPanel1.add(panelAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 60));

        panelTituloProductos.setBackground(new java.awt.Color(195, 70, 176));
        panelTituloProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTituloProductos.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        textTituloProductos.setForeground(new java.awt.Color(255, 255, 255));
        textTituloProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTituloProductos.setText("PRODUCTOS");
        panelTituloProductos.add(textTituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 60));

        jPanel1.add(panelTituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 440, 60));

        panelChuche1.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/doritos.png"))); // NOI18N
        botonChuche1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche1MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, 130));

        panelChuche2.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deTodito.png"))); // NOI18N
        botonChuche2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche2MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 170, 130));

        panelChuche3.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/platanitos.png"))); // NOI18N
        botonChuche3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche3MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 170, 130));

        panelChuche4.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bigBom.png"))); // NOI18N
        botonChuche4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche4MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 130));

        panelChuche5.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trululu.png"))); // NOI18N
        botonChuche5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche5MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 170, 130));

        panelChuche6.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chocolateLechepng.png"))); // NOI18N
        botonChuche6.setToolTipText("");
        botonChuche6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche6MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 170, 130));

        panelChuche7.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cricri.png"))); // NOI18N
        botonChuche7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche7MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 170, 130));

        panelChuche8.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rikiti.png"))); // NOI18N
        botonChuche8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche8MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 170, 130));

        panelChuche9.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/galak.png"))); // NOI18N
        botonChuche9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche9MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 170, 130));

        panelChuche10.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pringles.png"))); // NOI18N
        botonChuche10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche10MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 170, 130));

        panelChuche11.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nescafe.png"))); // NOI18N
        botonChuche11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche11MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 170, 130));

        panelChuche12.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cocosette.png"))); // NOI18N
        botonChuche12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche12MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 170, 130));

        panelChuche13.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carre.png"))); // NOI18N
        botonChuche13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche13MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 170, 130));

        panelChuche14.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/oreo.png"))); // NOI18N
        botonChuche14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche14MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 680, 170, 130));

        panelChuche15.setBackground(new java.awt.Color(195, 70, 176));

        botonChuche15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/otros.png"))); // NOI18N
        botonChuche15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonChuche15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonChuche15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonChuche15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonChuche15MouseExited(evt);
            }
        });

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

        jPanel1.add(panelChuche15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, 170, 130));

        jSeparator1.setForeground(new java.awt.Color(195, 70, 176));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 10, 800));

        panelTituloCompra.setBackground(new java.awt.Color(195, 70, 176));
        panelTituloCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTituloCompra.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        textTituloCompra.setForeground(new java.awt.Color(255, 255, 255));
        textTituloCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTituloCompra.setText("COMPRA");
        panelTituloCompra.add(textTituloCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 350, 60));

        jPanel1.add(panelTituloCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 350, 60));

        textSubtotal.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        textSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textSubtotal.setText("SubTotal:");
        jPanel1.add(textSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 660, 140, 30));

        Subtotal.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        Subtotal.setText("0");
        jPanel1.add(Subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, 140, 30));

        textIVA.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        textIVA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textIVA.setText("IVA:");
        jPanel1.add(textIVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 680, 140, 30));

        IVA.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        IVA.setText("0");
        jPanel1.add(IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 680, 140, 30));

        textTotalBs.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textTotalBs.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textTotalBs.setText("Total Bs:");
        jPanel1.add(textTotalBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 710, 140, 30));

        totalBs.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        totalBs.setText("0");
        jPanel1.add(totalBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 710, 140, 30));

        textTotalUSD.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textTotalUSD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textTotalUSD.setText("Total $:");
        jPanel1.add(textTotalUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 730, 140, 30));

        totalUSD.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        totalUSD.setText("0");
        jPanel1.add(totalUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 730, 140, 30));

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

        jPanel1.add(panelVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 770, 150, 40));

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

        jPanel1.add(panelCheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 770, 150, 40));

        carrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPane.setViewportView(carrito);

        jPanel1.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 350, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionProducto(String name, ListaProductos lista_productos) {
        productoSeleccionado = f.buscarProducto(name, lista_productos);
        int cantidad;
        if (productoSeleccionado.getCantidad() == 0) {
            JOptionPane.showMessageDialog(null, " ERROR! EL PRODUCTO YA NO SE ENCUENTRA DISPONIBLE ");
            return;
        }
        do {
            String num = JOptionPane.showInputDialog(null, " Ingrese la cantidad de " + productoSeleccionado.getNombre() + " que desea: ");
            cantidad = f.validarInt(num);
            if (!validarCantidad(cantidad, productoSeleccionado)) {
                JOptionPane.showMessageDialog(null, " ERROR! LA CANTIDAD ES MAYOR AL INVENTARIO DISPONIBLE ");
                cantidad = 0;
            }
        } while (cantidad == 0);
        productoSeleccionado.setCantidad(productoSeleccionado.getCantidad() - cantidad);
        Object[] datos = new Object[3];
        datos[0] = productoSeleccionado.getNombre();
        datos[1] = cantidad;
        datos[2] = productoSeleccionado.getPrecio();
        modelo.addRow(datos);
//        float numero1 = 19.5f; // o float numero = (float)19.5;
        float ttlUSD = Float.parseFloat(totalUSD.getText());
        ttlUSD += productoSeleccionado.getPrecio() * cantidad;
        String[] promos = {"Trululu", "Samba 32gr", "Cocosette maxi", "Susy maxi", "Oreo Americana", "Chocolate de Leche 30gr", "Cri-Cri 27gr", "Galak 30gr"};
        for (String promo : promos) {
            if (promo.equalsIgnoreCase(productoSeleccionado.getNombre())) {
                if (productoSeleccionado.getNombre().equalsIgnoreCase("Oreo Americana")) {
                    if (cantidad % 3 == 0) {
                        int rest = cantidad / 3;
                        ttlUSD -= rest;
                    }
                } else {
                    if (cantidad % 2 == 0) {
                        int rest = cantidad / 2;
                        ttlUSD -= rest;
                    }
                }

            }
        }

        String ttl = String.valueOf((double) Math.round((double) ttlUSD * 100d) / 100);
        ttlUSD = Float.parseFloat(ttl);

        totalUSD.setText(Float.toString(ttlUSD));

        float ttlBs = ttlUSD * tasa;
        String tlbs = String.valueOf((double) Math.round((double) ttlBs * 100d) / 100);
        ttlBs = Float.parseFloat(tlbs);

        totalBs.setText(Float.toString(ttlBs));
        float impuesto = ttlUSD * 0.16f;
        IVA.setText(Float.toString(impuesto));
        float subttl = ttlUSD - impuesto;
        Subtotal.setText(Float.toString(subttl));
    }

    private boolean validarCantidad(int cantidad, Producto productoSelected) {
        if (cantidad > productoSelected.getCantidad()) {
            return false;
        } else {
            return true;
        }
    }

    private void llenar(String nombre, int cantidad, ListaProductos lista_productos) {
        Producto producto = f.buscarProducto(nombre, lista_productos);
        producto.setCantidad(producto.getCantidad() + cantidad);
    }

    private void vaciar(ListaProductos lista_productos) {
        if (f.validacion()) {
            if (carrito.getRowCount() > 0) {
                DefaultTableModel tm = (DefaultTableModel) carrito.getModel();
                int i = 0;
                while (i < carrito.getRowCount()) {
                    String nombre = String.valueOf(tm.getValueAt(i, 0));
                    int cantidad = Integer.parseInt(String.valueOf(tm.getValueAt(i, 1)));
                    llenar(nombre, cantidad, lista_productos);
                    i++;
                }

                float ttlUSD = 0;
                totalUSD.setText(Float.toString(ttlUSD));
                float ttlBs = ttlUSD * tasa;
                totalBs.setText(Float.toString(ttlBs));
                float impuesto = ttlUSD * 0.16f;
                IVA.setText(Float.toString(impuesto));
                float subttl = ttlUSD - impuesto;
                Subtotal.setText(Float.toString(subttl));
                modelo.getDataVector().removeAllElements();
                carrito.updateUI();
            } else {
                JOptionPane.showMessageDialog(null, " EL CARRITO ESTA VACIO ");
            }
        }

    }

    private void textAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseEntered
        f.entrarRetroceder(textAtras, panelAtras);
    }//GEN-LAST:event_textAtrasMouseEntered

    private void textAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseExited
        f.salirRetroceder(textAtras, panelAtras);
    }//GEN-LAST:event_textAtrasMouseExited

    private void textAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseClicked
        if (f.validacion()) {
            vaciar(productos);
            this.setVisible(false);
            this.frame.setVisible(true);
        }
    }//GEN-LAST:event_textAtrasMouseClicked

    private void textVaciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textVaciarMouseEntered
        f.entrarRetroceder(textVaciar, panelVaciar);
    }//GEN-LAST:event_textVaciarMouseEntered

    private void textVaciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textVaciarMouseExited
        f.salirRetroceder(textVaciar, panelVaciar);
    }//GEN-LAST:event_textVaciarMouseExited

    private void textVaciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textVaciarMouseClicked
        vaciar(productos);

    }//GEN-LAST:event_textVaciarMouseClicked

    private void textCheckoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCheckoutMouseEntered
        f.entrarBoton(textCheckout, panelCheckout);
    }//GEN-LAST:event_textCheckoutMouseEntered

    private void textCheckoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCheckoutMouseExited
        f.salirBoton(textCheckout, panelCheckout);
    }//GEN-LAST:event_textCheckoutMouseExited
    // VERIFICADO
    private void textCheckoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCheckoutMouseClicked
        if (Float.parseFloat(totalUSD.getText()) > 0) {
            float ttlBs = Float.parseFloat(totalBs.getText());
            float ttlUSD = Float.parseFloat(totalUSD.getText());
            f.irCheckout(this, frame, ttlBs, ttlUSD, tasa, zelles, pagosMoviles, pagosPuntos, efectivoUSD, efectivoBs, productos);
        } else {
            JOptionPane.showMessageDialog(null, " ERROR! Debe ingreesar al menos un producto ");
        }
    }//GEN-LAST:event_textCheckoutMouseClicked

    private void botonChuche1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche1MouseEntered
        f.entrarPanel(panelChuche1);
    }//GEN-LAST:event_botonChuche1MouseEntered

    private void botonChuche1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche1MouseExited
        f.salirPanel(panelChuche1);
    }//GEN-LAST:event_botonChuche1MouseExited

    private void botonChuche1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche1MouseClicked
        if (f.validacion()) {
            String name;
            String[] array = {" Pepito ", " Cheese Tris ", " Doritos "};
            int opcion = JOptionPane.showOptionDialog(null, "¿Cual desea?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
            if (opcion == 2) {
                name = "Doritos";
            } else if (opcion == 1) {
                name = "Chesee Tris";
            } else {
                name = "Pepito";
            }
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche1MouseClicked

    private void botonChuche2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche2MouseEntered
        f.entrarPanel(panelChuche2);
    }//GEN-LAST:event_botonChuche2MouseEntered

    private void botonChuche2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche2MouseExited
        f.salirPanel(panelChuche2);
    }//GEN-LAST:event_botonChuche2MouseExited

    private void botonChuche2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche2MouseClicked
        if (f.validacion()) {
            String name = "De Todito";
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche2MouseClicked

    private void botonChuche3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche3MouseEntered
        f.entrarPanel(panelChuche3);
    }//GEN-LAST:event_botonChuche3MouseEntered

    private void botonChuche3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche3MouseExited
        f.salirPanel(panelChuche3);
    }//GEN-LAST:event_botonChuche3MouseExited

    private void botonChuche3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche3MouseClicked
        if (f.validacion()) {
            String name = "Platanitos";
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche3MouseClicked

    private void botonChuche4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche4MouseClicked
        if (f.validacion()) {
            String name = "Big Bom";
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche4MouseClicked

    private void botonChuche4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche4MouseEntered
        f.entrarPanel(panelChuche4);
    }//GEN-LAST:event_botonChuche4MouseEntered

    private void botonChuche4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche4MouseExited
        f.salirPanel(panelChuche4);
    }//GEN-LAST:event_botonChuche4MouseExited

    private void botonChuche5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche5MouseEntered
        f.entrarPanel(panelChuche5);
    }//GEN-LAST:event_botonChuche5MouseEntered

    private void botonChuche5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche5MouseExited
        f.salirPanel(panelChuche5);
    }//GEN-LAST:event_botonChuche5MouseExited

    private void botonChuche5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche5MouseClicked
        if (f.validacion()) {
            String name = "Trululu";
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche5MouseClicked

    private void botonChuche6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche6MouseEntered
        f.entrarPanel(panelChuche6);
    }//GEN-LAST:event_botonChuche6MouseEntered

    private void botonChuche6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche6MouseExited
        f.salirPanel(panelChuche6);
    }//GEN-LAST:event_botonChuche6MouseExited

    private void botonChuche6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche6MouseClicked
        if (f.validacion()) {
            String name;
            String[] array = {" 130gr ", " 30gr "};
            int opcion = JOptionPane.showOptionDialog(null, "¿Cual desea?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
            if (opcion == 1) {
                name = "Chocolate de Leche 30gr";
            } else {
                name = "Chocolate de Leche 130gr";
            }
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche6MouseClicked

    private void botonChuche7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche7MouseEntered
        f.entrarPanel(panelChuche7);
    }//GEN-LAST:event_botonChuche7MouseEntered

    private void botonChuche7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche7MouseExited
        f.salirPanel(panelChuche7);
    }//GEN-LAST:event_botonChuche7MouseExited

    private void botonChuche7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche7MouseClicked
        if (f.validacion()) {
            String name;
            String[] array = {" 123gr ", " 27gr "};
            int opcion = JOptionPane.showOptionDialog(null, "¿Cual desea?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
            if (opcion == 1) {
                name = "Cri-Cri 27gr";
            } else {
                name = "Cri-Cri 123gr";
            }
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche7MouseClicked

    private void botonChuche8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche8MouseEntered
        f.entrarPanel(panelChuche8);
    }//GEN-LAST:event_botonChuche8MouseEntered

    private void botonChuche8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche8MouseExited
        f.salirPanel(panelChuche8);
    }//GEN-LAST:event_botonChuche8MouseExited

    private void botonChuche8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche8MouseClicked
        if (f.validacion()) {
            String name;
            String[] array = {" 130gr ", " 30gr "};
            int opcion = JOptionPane.showOptionDialog(null, "¿Cual desea?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
            if (opcion == 1) {
                name = "Rikiti 30gr";
            } else {
                name = "Rikiti 130gr";
            }
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche8MouseClicked

    private void botonChuche9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche9MouseEntered
        f.entrarPanel(panelChuche9);
    }//GEN-LAST:event_botonChuche9MouseEntered

    private void botonChuche9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche9MouseExited
        f.salirPanel(panelChuche9);
    }//GEN-LAST:event_botonChuche9MouseExited

    private void botonChuche9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche9MouseClicked
        if (f.validacion()) {
            String name;
            String[] array = {" 130gr ", " 30gr "};
            int opcion = JOptionPane.showOptionDialog(null, "¿Cual desea?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
            if (opcion == 1) {
                name = "Galak 30gr";
            } else {
                name = "Galak 130gr";
            }
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche9MouseClicked

    private void botonChuche10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche10MouseEntered
        f.entrarPanel(panelChuche10);
    }//GEN-LAST:event_botonChuche10MouseEntered

    private void botonChuche10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche10MouseExited
        f.salirPanel(panelChuche10);
    }//GEN-LAST:event_botonChuche10MouseExited

    private void botonChuche10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche10MouseClicked
        if (f.validacion()) {
            String name;
            String[] array = {" Crema y Cebolla ", " Queso ", " Original "};
            int opcion = JOptionPane.showOptionDialog(null, "¿Cual desea?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
            if (opcion == 2) {
                name = "Pringle Original";
            } else if (opcion == 1) {
                name = "Pringle Queso";
            } else {
                name = "Pringle Crema y Cebolla";
            }
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche10MouseClicked

    private void botonChuche11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche11MouseEntered
        f.entrarPanel(panelChuche11);
    }//GEN-LAST:event_botonChuche11MouseEntered

    private void botonChuche11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche11MouseExited
        f.salirPanel(panelChuche11);
    }//GEN-LAST:event_botonChuche11MouseExited

    private void botonChuche11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche11MouseClicked
        if (f.validacion()) {
            String name;
            String[] array = {" Tradicional ", " Achocolatado ", " Mocachino ", " Vainilla ", " Capuchino "};
            int opcion = JOptionPane.showOptionDialog(null, "¿Cual desea?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
            if (opcion == 0) {
                name = "Nescafe Tradicional";
            } else if (opcion == 1) {
                name = "Nescafe Achocolatado";
            } else if (opcion == 2) {
                name = "Nescafe Mocachino";
            } else if (opcion == 3) {
                name = "Nescafe Vainilla";
            } else {
                name = "Nescafe Capuchino";
            }
            seleccionProducto(name, productos);
        }

    }//GEN-LAST:event_botonChuche11MouseClicked

    private void botonChuche12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche12MouseEntered
        f.entrarPanel(panelChuche12);
    }//GEN-LAST:event_botonChuche12MouseEntered

    private void botonChuche12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche12MouseExited
        f.salirPanel(panelChuche12);
    }//GEN-LAST:event_botonChuche12MouseExited

    private void botonChuche12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche12MouseClicked
        if (f.validacion()) {
            String name;
            String[] array = {" Samba 32gr ", " Susy maxi ", " Cocosette maxi "};
            int opcion = JOptionPane.showOptionDialog(null, "¿Cual desea?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
            if (opcion == 2) {
                name = "Cocosette maxi";
            } else if (opcion == 1) {
                name = "Susy maxi";
            } else {
                name = "Samba 32gr";
            }
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche12MouseClicked

    private void botonChuche13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche13MouseEntered
        f.entrarPanel(panelChuche13);
    }//GEN-LAST:event_botonChuche13MouseEntered

    private void botonChuche13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche13MouseExited
        f.salirPanel(panelChuche13);
    }//GEN-LAST:event_botonChuche13MouseExited

    private void botonChuche13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche13MouseClicked
        if (f.validacion()) {
            String name = "Carre Avellana 25gr";
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche13MouseClicked

    private void botonChuche14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche14MouseEntered
        f.entrarPanel(panelChuche14);
    }//GEN-LAST:event_botonChuche14MouseEntered

    private void botonChuche14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche14MouseExited
        f.salirPanel(panelChuche14);
    }//GEN-LAST:event_botonChuche14MouseExited

    private void botonChuche14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche14MouseClicked
        if (f.validacion()) {
            String name = "Oreo Americana";
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche14MouseClicked

    private void botonChuche15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche15MouseEntered
        f.entrarPanel(panelChuche15);
    }//GEN-LAST:event_botonChuche15MouseEntered

    private void botonChuche15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche15MouseExited
        f.salirPanel(panelChuche15);
    }//GEN-LAST:event_botonChuche15MouseExited

    private void botonChuche15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonChuche15MouseClicked
        if (f.validacion()) {
            String name;
            String[] array = {" Merei ", " Galletas Craqueladas ", " Chocolate Duo "};
            int opcion = JOptionPane.showOptionDialog(null, "¿Cual desea?", "Seleciona...", 0, JOptionPane.QUESTION_MESSAGE, null, array, null);
            if (opcion == 0) {
                name = "Merei";
            } else if (opcion == 1) {
                name = "Galletas Craqueladas";
            } else {
                name = "Chocolate Duo";
            }
            seleccionProducto(name, productos);
        }
    }//GEN-LAST:event_botonChuche15MouseClicked

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
                new RegistrarCompra(frame, productos, zelles, pagosMoviles, pagosPuntos, efectivoUSD, efectivoBs, tasa).setVisible(true);
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
    private javax.swing.JTable carrito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JScrollPane scrollPane;
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
