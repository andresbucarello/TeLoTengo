package Gui;

// @author andresbucarello
import EDD.Helpers;
import EDD.ListaProductos;
import EDD.Producto;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import EDD.Producto;
import javax.swing.JOptionPane;

public class ModificarStock extends javax.swing.JFrame {

    static ListaProductos productos;
    static JFrame frame;
    private Producto productoSeleccionado;
    Helpers f = new Helpers();

    public ModificarStock(JFrame frame, ListaProductos productos) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.productos = productos;
        this.frame = frame;
        cargarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        listaProductos = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        fieldCantidad = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        panelTitulo = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        panelAtras = new javax.swing.JPanel();
        textAtras = new javax.swing.JLabel();
        textZelle = new javax.swing.JLabel();
        textZelle1 = new javax.swing.JLabel();
        panelSiguiente = new javax.swing.JPanel();
        textSiguiente = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(770, 450));
        setPreferredSize(new java.awt.Dimension(770, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaProductos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        listaProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaProductos.setToolTipText("");
        listaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 13))); // NOI18N
        listaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProductosActionPerformed(evt);
            }
        });
        jPanel1.add(listaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 350, 60));

        jSeparator2.setForeground(new java.awt.Color(195, 70, 176));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 720, 20));

        fieldCantidad.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        fieldCantidad.setToolTipText("");
        fieldCantidad.setBorder(null);
        jPanel1.add(fieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 150, 40));

        jSeparator3.setForeground(new java.awt.Color(195, 70, 176));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 720, 20));

        panelTitulo.setBackground(new java.awt.Color(195, 70, 176));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTitulo.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(255, 255, 255));
        textTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitulo.setText("MODIFICAR STOCK");
        panelTitulo.add(textTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 60));

        jPanel1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 600, 60));

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

        textZelle.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textZelle.setForeground(new java.awt.Color(195, 70, 176));
        textZelle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textZelle.setText("Ingrese la nueva cantidad del producto: ");
        jPanel1.add(textZelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 580, 40));

        textZelle1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textZelle1.setForeground(new java.awt.Color(195, 70, 176));
        textZelle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textZelle1.setText("Seleccione el producto: ");
        jPanel1.add(textZelle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 350, 40));

        panelSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        panelSiguiente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSiguiente.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        textSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSiguiente.setText("Modificar");
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

        jPanel1.add(panelSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 150, 40));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 160, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarComboBox() {
        //Se crea una combobox para los warehouse
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        listaProductos.removeAllItems();
        Producto aux = productos.getPrimero();
        for (int i = 0; i < productos.getCantidad(); i++) {
            comboBoxModel.addElement(aux.getNombre());
            aux = aux.getSiguiente();
        }
        this.listaProductos.setSelectedIndex(-1);
        this.listaProductos.setModel(comboBoxModel);
    }
    
    private void listaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProductosActionPerformed
        int pIndex = this.listaProductos.getSelectedIndex();
        
        Producto aux = productos.getPrimero();
        for (int i = 0; i < productos.getCantidad(); i++) {
            if (i == pIndex){
                this.productoSeleccionado = aux;
            }
            aux = aux.getSiguiente();
        }
    }//GEN-LAST:event_listaProductosActionPerformed

    private void textAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseClicked
        this.setVisible(false);
        this.frame.setVisible(true);
    }//GEN-LAST:event_textAtrasMouseClicked

    private void textAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseEntered
        f.entrarRetroceder(textAtras, panelAtras);
    }//GEN-LAST:event_textAtrasMouseEntered

    private void textAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAtrasMouseExited
        f.salirRetroceder(textAtras, panelAtras);
    }//GEN-LAST:event_textAtrasMouseExited

    private void textSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textSiguienteMouseClicked
        if (this.productoSeleccionado == null){
            JOptionPane.showMessageDialog(this,
                String.format("Ningun producto fue seleccionado, seleccione uno por favor"), "ERROR",
                JOptionPane.ERROR_MESSAGE);
        }else{
            String num = fieldCantidad.getText();
            int stock = f.validarInt(num);
            if (stock == 0){
                fieldCantidad.setText("");
            }else{
                Producto aux = productos.getPrimero();
                for (int i = 0; i < productos.getCantidad(); i++) {
                    if (aux.getNombre().equalsIgnoreCase(productoSeleccionado.getNombre())) {
                        aux.setCantidad(stock);
                        fieldCantidad.setText("");
                        f.escribirTxt(productos);
                        break;
                    }
                    aux = aux.getSiguiente();
                }
            }
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
            java.util.logging.Logger.getLogger(ModificarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarStock(frame, productos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldCantidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> listaProductos;
    private javax.swing.JPanel panelAtras;
    private javax.swing.JPanel panelSiguiente;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel textAtras;
    private javax.swing.JLabel textSiguiente;
    private javax.swing.JLabel textTitulo;
    private javax.swing.JLabel textZelle;
    private javax.swing.JLabel textZelle1;
    // End of variables declaration//GEN-END:variables

}
