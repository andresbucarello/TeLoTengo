package Gui;

// @author andresbucarello

public class RegistrarCliente extends javax.swing.JFrame {

    public RegistrarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textRegistrarCompra = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        tituloCedula = new javax.swing.JLabel();
        panelCedula = new javax.swing.JPanel();
        textCedula = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        panelBuscar = new javax.swing.JPanel();
        textBuscar = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        tituloNombre = new javax.swing.JLabel();
        panelNombre = new javax.swing.JPanel();
        textNombre = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        tituloApellido = new javax.swing.JLabel();
        panelApellido = new javax.swing.JPanel();
        textApellido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        panelRetroceder = new javax.swing.JPanel();
        textRetroceder = new javax.swing.JLabel();
        panelSiguiente = new javax.swing.JPanel();
        textSiguiente = new javax.swing.JLabel();

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
        textTitulo.setText("REGISTRAR CLIENTE");
        panelTitulo.add(textTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 60));

        jPanel1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        tituloCedula.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        tituloCedula.setText("Cedula:");
        jPanel1.add(tituloCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 30));

        textCedula.setForeground(new java.awt.Color(204, 204, 204));
        textCedula.setText("Ingrese la cedula");
        textCedula.setBorder(null);
        textCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCedulaLayout = new javax.swing.GroupLayout(panelCedula);
        panelCedula.setLayout(panelCedulaLayout);
        panelCedulaLayout.setHorizontalGroup(
            panelCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        panelCedulaLayout.setVerticalGroup(
            panelCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 260, 30));

        separador1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 260, 20));

        panelBuscar.setBackground(new java.awt.Color(195, 70, 176));
        panelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textBuscar.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        textBuscar.setForeground(new java.awt.Color(255, 255, 255));
        textBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBuscar.setText("Buscar");
        panelBuscar.add(textBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jPanel1.add(panelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 130, 30));

        separador2.setForeground(new java.awt.Color(195, 70, 176));
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 550, 10));

        tituloNombre.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        tituloNombre.setText("Nombre:");
        jPanel1.add(tituloNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        textNombre.setForeground(new java.awt.Color(204, 204, 204));
        textNombre.setText("Ingrese el nombre");
        textNombre.setBorder(null);
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNombreLayout = new javax.swing.GroupLayout(panelNombre);
        panelNombre.setLayout(panelNombreLayout);
        panelNombreLayout.setHorizontalGroup(
            panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        panelNombreLayout.setVerticalGroup(
            panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 410, 30));

        separador3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 410, 20));

        tituloApellido.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        tituloApellido.setText("Apellido:");
        jPanel1.add(tituloApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 30));

        textApellido.setForeground(new java.awt.Color(204, 204, 204));
        textApellido.setText("Ingrese el apellido");
        textApellido.setBorder(null);
        textApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelApellidoLayout = new javax.swing.GroupLayout(panelApellido);
        panelApellido.setLayout(panelApellidoLayout);
        panelApellidoLayout.setHorizontalGroup(
            panelApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        panelApellidoLayout.setVerticalGroup(
            panelApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 410, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 410, 20));

        panelRetroceder.setBackground(new java.awt.Color(255, 255, 255));
        panelRetroceder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textRetroceder.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textRetroceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textRetroceder.setText("Retroceder");
        panelRetroceder.add(textRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        jPanel1.add(panelRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, 40));

        panelSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        panelSiguiente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSiguiente.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        textSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSiguiente.setText("Siguiente");
        panelSiguiente.add(textSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel1.add(panelSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -5, 590, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCedulaActionPerformed

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreActionPerformed

    private void textApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelApellido;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelCedula;
    private javax.swing.JPanel panelNombre;
    private javax.swing.JPanel panelRetroceder;
    private javax.swing.JPanel panelSiguiente;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JTextField textApellido;
    private javax.swing.JLabel textBuscar;
    private javax.swing.JTextField textCedula;
    private javax.swing.JTextField textNombre;
    private javax.swing.JLabel textRegistrarCompra;
    private javax.swing.JLabel textRetroceder;
    private javax.swing.JLabel textSiguiente;
    private javax.swing.JLabel textTitulo;
    private javax.swing.JLabel tituloApellido;
    private javax.swing.JLabel tituloCedula;
    private javax.swing.JLabel tituloNombre;
    // End of variables declaration//GEN-END:variables

}
