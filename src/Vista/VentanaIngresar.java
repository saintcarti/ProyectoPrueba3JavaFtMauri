/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.Comida;
import Controlador.ComidaDAO;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
public class VentanaIngresar extends javax.swing.JFrame {
    
    public VentanaIngresar() {
        initComponents();
        this.setTitle("Ventana de ingreso de datos(Comida).");
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/imagenPerfilLogin.png"));
        this.setIconImage(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jMenuItem1 = new javax.swing.JMenuItem();
        BtnVolver = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        TxtNombre = new javax.swing.JTextField();
        TxtCodigo = new javax.swing.JTextField();
        TxtCantidad = new javax.swing.JTextField();
        LbNombre = new javax.swing.JLabel();
        LbCodigo = new javax.swing.JLabel();
        LbCantidad = new javax.swing.JLabel();
        BtnIngresarSolicitud = new javax.swing.JButton();
        BtnComida = new javax.swing.JButton();
        BtnBebida = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTipoComida = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnVolver.setText("Volver Atras");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        BtnSalir.setText("Salir");
        BtnSalir.setMaximumSize(new java.awt.Dimension(91, 23));
        BtnSalir.setMinimumSize(new java.awt.Dimension(91, 23));
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        TxtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCantidadActionPerformed(evt);
            }
        });

        LbNombre.setText("Nombre de producto:");

        LbCodigo.setText("Codigo: ");

        LbCantidad.setText("Cantidad: ");

        BtnIngresarSolicitud.setText("Ingresar Solicitud");
        BtnIngresarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarSolicitudActionPerformed(evt);
            }
        });

        BtnComida.setText("Bebida");

        BtnBebida.setText("Comida");

        jLabel1.setText("Valor:");

        jLabel2.setText("Tipo de comida:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnIngresarSolicitud)))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTipoComida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(190, 190, 190))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LbNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnBebida)
                            .addComponent(BtnComida))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(BtnComida)
                        .addGap(46, 46, 46)
                        .addComponent(BtnBebida))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LbNombre)
                        .addGap(20, 20, 20)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(LbCodigo)
                        .addGap(20, 20, 20)
                        .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(LbCantidad)
                        .addGap(20, 20, 20)
                        .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(BtnIngresarSolicitud)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtTipoComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnVolver))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
       VentanaInicio ventInicio = new VentanaInicio();
       ventInicio.setLocationRelativeTo(null);
       ventInicio.setDefaultCloseOperation(EXIT_ON_CLOSE);
       ventInicio.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       ventInicio.setResizable(false);
       ventInicio.setVisible(true);
       dispose();
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        JOptionPane.showMessageDialog(this, "Gracias por usar nuestro programa");
        dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TxtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCantidadActionPerformed

    private void BtnIngresarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarSolicitudActionPerformed
        String codigo,nombre,tipoDeComida;
        int cantidad,valor;
        Comida co;
        
        codigo=TxtCodigo.getText();
        nombre=TxtNombre.getText();
        cantidad=Integer.parseInt(TxtCantidad.getText());
        valor=Integer.parseInt(txtValor.getText());
        tipoDeComida=txtTipoComida.getText();
        co=new Comida(valor, tipoDeComida, cantidad, codigo, nombre);
        ComidaDAO coDAO=new ComidaDAO();
        if(coDAO.buscarComida(codigo)==null){
            coDAO.ingresarComida(co);
            JOptionPane.showMessageDialog(this, "Se ha ingresado la comida con exito.");
        }else{
            JOptionPane.showMessageDialog(this, "Comida ya existe");
        }
    }//GEN-LAST:event_BtnIngresarSolicitudActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBebida;
    private javax.swing.JButton BtnComida;
    private javax.swing.JButton BtnIngresarSolicitud;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JLabel LbCantidad;
    private javax.swing.JLabel LbCodigo;
    private javax.swing.JLabel LbNombre;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField txtTipoComida;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
