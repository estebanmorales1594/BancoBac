
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 * Esta es la clase principal, en la cual el programa va a funcionar
En la ventana vamos a encontrar:
    *Primero 2 cajas de texto, donde se van a ingresar los datos del cliente,
    seguido por una caja de lista en donde va a estar el tipo de cliente y 
    su respectivo boton para agregar.

    *Luego tenemos 4 Botones, 
    -Uno para pasar a cajas que lo que va a hacer es 
    eliminar de una cola de prioridad, este boton va a depender de la cantidad 
    de cajeros que se puede escoger a la derecha
    -Otro para mostrar una lista de clientes
    -Otro para Motrar las graficas de los clientes
    -Otro Para Salir de la ventana
 */

/**
 *
 * @author Jimmy
 */
public class interfazPrincipal extends javax.swing.JFrame {
    
    ColaClientesArray matriz=new ColaClientesArray();
    JFileChooser fileChooser = new JFileChooser(".");
    

     

    /**
     * Creates new form interfazPrincipal
     */
    public interfazPrincipal() {
        initComponents();
    }

    /**
     Inicializacion de la interfaz principal.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PasarACajas = new javax.swing.JButton();
        ErrorLabel = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CorreoText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ListaComboBox = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        PasarACajas1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        ErrorLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NumeroCajeros = new javax.swing.JSpinner();
        Salir = new javax.swing.JButton();
        txtHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFNO = new javax.swing.JTextField();

        PasarACajas.setText("Pasar a Caja");
        PasarACajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasarACajasActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblTitulo.setText("Bienvenido al BAC San Jose");

        jLabel2.setText("Nombre:");

        NombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Correo: ");

        CorreoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoTextActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo: ");

        ListaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "discapacitado", "adulto mayor", "embarazada", "corporativo", "normal", " " }));

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setText("Agregar la Informacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        PasarACajas1.setText("Pasar a Caja");
        PasarACajas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasarACajas1ActionPerformed(evt);
            }
        });

        jButton2.setText("Graficos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cambiar Nombre del Banco");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setText("Cambiar Logo del Banco");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnLista.setText("Lista Clientes");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero de  cajeros");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel6.setText("Hora");

        jLabel7.setText("Fecha");

        txtFNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(lblTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CorreoText, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(22, 22, 22)
                                        .addComponent(ListaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFNO, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                            .addComponent(txtHora))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PasarACajas1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(NumeroCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ErrorLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(CorreoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtFNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ListaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasarACajas1)
                    .addComponent(jLabel5)
                    .addComponent(NumeroCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(btnLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ErrorLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextActionPerformed

    private void CorreoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoTextActionPerformed
/**
 * Se agrega la lista.
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre= NombreText.getText();
        String correo= CorreoText.getText();
        String tipo= (String) ListaComboBox.getSelectedItem();
        String hora = txtHora.getText();
        String fecha= txtFNO.getText();
        
        try {
            matriz.agregarCola(nombre, correo, tipo,hora,fecha);
        } catch (MessagingException ex) {
            ErrorLabel1.setText("Error para enviar Correo");
            Logger.getLogger(interfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        NombreText.setText("");
        CorreoText.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void PasarACajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasarACajasActionPerformed
        int cont=NumeroCajeros.getValue().hashCode();
        if (cont==0){
            ErrorLabel1.setText("No hay clientes");
        }
        while (cont!=0){
            try {
                matriz.sacar();
            } catch (MessagingException ex) {
                Logger.getLogger(interfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            cont--;
        }
    }//GEN-LAST:event_PasarACajasActionPerformed

    private void PasarACajas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasarACajas1ActionPerformed
        int cont=NumeroCajeros.getValue().hashCode();
        if (cont==0){
            ErrorLabel1.setText("No hay clientes");
        }
        while (cont!=0){
            try {
                matriz.sacar();
            } catch (MessagingException ex) {
                Logger.getLogger(interfazPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            cont--;
        }
    }//GEN-LAST:event_PasarACajas1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cambiarNombre nombreNuevo= new cambiarNombre();
        nombreNuevo.setVisible(true);
        nombreNuevo.btnCambiar.getModel().setEnabled(true);
        nombreNuevo.btnCambiar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String nombre = nombreNuevo.txtNombre.getText();
                lblTitulo.setText("Bienvenidos al Banco "+nombre);

            }
        });
        nombreNuevo.btnVolver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                nombreNuevo.setVisible(false);
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed
/**
 * Se usa el filechoioser y se selecciona el logo
 * @param evt 
 */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String camino=null;

        int status = fileChooser.showOpenDialog (null);
        if (status == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            camino = selectedFile.getAbsolutePath();
        }
        else{
            if (status == JFileChooser.CANCEL_OPTION){
                System.out.println("CANCELAR");
            }

        }
        jLabel1.setIcon(new ImageIcon(camino));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        InterfazLista listaRegistrada = new InterfazLista();
        listaRegistrada.setVisible(true);
        InterfazLista lista= new InterfazLista();
        lista.NONONO.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
               lista.setVisible(false);
            }
        });
        
        
        

    }//GEN-LAST:event_btnListaActionPerformed
   /**
    * Boton salir.
    * @param evt 
    */
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void txtFNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNOActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CorreoText;
    private javax.swing.JLabel ErrorLabel;
    private javax.swing.JLabel ErrorLabel1;
    public static javax.swing.JComboBox ListaComboBox;
    private javax.swing.JTextField NombreText;
    private javax.swing.JSpinner NumeroCajeros;
    private javax.swing.JButton PasarACajas;
    private javax.swing.JButton PasarACajas1;
    private javax.swing.JButton Salir;
    public javax.swing.JButton btnLista;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtFNO;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
