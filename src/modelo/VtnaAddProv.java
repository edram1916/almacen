
package modelo;


public class VtnaAddProv extends javax.swing.JFrame {

    /**
     * Creates new form VtnaAddProv
     */
    private int indiceActual;
    private Almacen almacen;
   
    public VtnaAddProv( Almacen almacen ) {
        initComponents();
        this.almacen = almacen;
        setTitle("Proveedor");          // fijar titulo de la ventana
        setLocationRelativeTo(null);    // colocar en el centro de la pantalla
        indiceActual= -1; 
    }
    
    private void mostrar(){
        if(indiceActual != -1){
        Proveedor p = almacen.getProveedor(indiceActual);
        NombreCl.setText("" + p.getNombre());
        DirCl.setText("" + p.getDireccion());
        TelCl.setText("" + p.getTelefono());
        MailCl.setText("" + p.getMail());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreCl = new javax.swing.JLabel();
        TelCl = new javax.swing.JLabel();
        DirCl = new javax.swing.JLabel();
        MailCl = new javax.swing.JLabel();
        txttelCl = new javax.swing.JTextField();
        txtnombreCl = new javax.swing.JTextField();
        txtdirCl = new javax.swing.JTextField();
        txtmailCl = new javax.swing.JTextField();
        btnGuardarProv = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NombreCl.setText("Nombre");

        TelCl.setText("Teléfono");

        DirCl.setText("Direccion");

        MailCl.setText("Mail");

        btnGuardarProv.setText("Guardar");
        btnGuardarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProvActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MailCl)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DirCl)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreCl)
                            .addComponent(TelCl))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnombreCl, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelCl, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdirCl, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmailCl, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarProv)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreCl)
                    .addComponent(txtnombreCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelCl)
                    .addComponent(txttelCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirCl)
                    .addComponent(txtdirCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MailCl)
                    .addComponent(txtmailCl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarProv)
                    .addComponent(jButton2))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false); 
        // new Main().setVisible(true); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProvActionPerformed

        // TODO add your handling code here:
        if(indiceActual == -1) {
            indiceActual= 0 ;
            
        }else {
            ++indiceActual;
        }

        Proveedor p = new Proveedor(txtnombreCl.getText(), TelCl.getText(), DirCl.getText(), MailCl.getText());
        this.almacen.agregarProveedor(p);
        
        // Proveedor p = new Proveedor(NombreCl.getText(), TelCl.getText(), DirCl.getText(), MailCl.getText());
        // System.out.println(p.getNombre());
        // almacen.agregarProveedor(p);
        /*
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Proveedor p = new Proveedor("el nombre", "el telefono", "la direccion", "el mail");
                almacen.agregarProveedor(p);
            }
        });
        */
       
    }//GEN-LAST:event_btnGuardarProvActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DirCl;
    private javax.swing.JLabel MailCl;
    private javax.swing.JLabel NombreCl;
    private javax.swing.JLabel TelCl;
    private javax.swing.JButton btnGuardarProv;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField txtdirCl;
    private javax.swing.JTextField txtmailCl;
    private javax.swing.JTextField txtnombreCl;
    private javax.swing.JTextField txttelCl;
    // End of variables declaration//GEN-END:variables
}