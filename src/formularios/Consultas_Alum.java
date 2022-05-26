

package formularios;

import com.mysql.jdbc.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilerias.conexion;

/**
 *
 * @author ITSSMO
 */
public class Consultas_Alum extends javax.swing.JFrame {

    /** Creates new form Consultas_Alum */
    public Consultas_Alum() {
        initComponents();
    }
    public void llenartabla(){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tblalumnos.setModel(modelo);
            modelo.addColumn("Control");
            modelo.addColumn("Nombre");
            modelo.addColumn("Paterno");
            modelo.addColumn("Materno");
            modelo.addColumn("Domicilio");
            modelo.addColumn("Fecha Nacimiento");
            modelo.addColumn("Carrera");
            conexion.conectar("jdbc:mysql://localhost:3306/escuela", "root", "");
            ResultSet resultado;
            resultado = (ResultSet) conexion.sentencia.executeQuery("select * from alumnos");
            while(resultado.next()){
                Object[] fila =new Object[7];
                for (int i=0; i<fila.length; i++){
                    fila[i]=resultado.getObject(i+1);
                }
                modelo.addRow(fila);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Consultas_Alum.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
    public void llenartabla(String c, String d){
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tblalumnos.setModel(modelo);
            modelo.addColumn("Control");
            modelo.addColumn("Nombre");
            modelo.addColumn("Paterno");
            modelo.addColumn("Materno");
            modelo.addColumn("Domicilio");
            modelo.addColumn("Fecha Nacimiento");
            modelo.addColumn("Carera");
            conexion.conectar("jdbc:mysql://localhost:3306/escuela", "root", "");
            ResultSet resultado;
            resultado = (ResultSet) conexion.sentencia.executeQuery("select * from alumnos where "+c+" like '%"+d+"%'");
            while(resultado.next()){
                Object[] fila =new Object[7];
                for (int i=0; i<fila.length; i++){
                    fila[i]=resultado.getObject(i+1);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Consultas_Alum.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btneliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtcarrera = new javax.swing.JTextField();
        txtmaterno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcontrol = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtdomicilio = new javax.swing.JTextField();
        txtpaterno = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnmodificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblalumnos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btneliminar.setFont(new java.awt.Font("Times New Roman", 1, 18));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 110, 30));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel9.setText("Carrera");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel10.setText("Domicilio");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel11.setText("Fecha de Nacimiento");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel12.setText("Control");

        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel13.setText("Apellido Paterno");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel15.setText("Apellido Materno");

        jLabel2.setFont(new java.awt.Font("Vani", 1, 24));
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("ITS");

        jLabel3.setFont(new java.awt.Font("Papyrus", 3, 18));
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("SMO");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18));
        jLabel14.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtcontrol, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtcarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))))
                        .addGap(290, 290, 290))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(499, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(560, 560, 560))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtcontrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtcarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 740, 260));

        btnmodificar.setFont(new java.awt.Font("Times New Roman", 1, 18));
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Consultas de Alumnos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 11, -1, 25));

        btncancelar.setFont(new java.awt.Font("Times New Roman", 1, 18));
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 110, 30));

        btnsalir.setFont(new java.awt.Font("Times New Roman", 1, 18));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 120, 30));

        tblalumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblalumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblalumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblalumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 590, 144));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtfechaActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
       String c=txtcontrol.getText();
       String nom=txtnombre.getText();
       String pat=txtpaterno.getText();
       String mat=txtmaterno.getText();
       String dom=txtdomicilio.getText();
       String fecha=txtfecha.getText();
       String car=txtcarrera.getText();
       int x=JOptionPane.showConfirmDialog(null, "Deseas Modificarlo", "Confirmar", JOptionPane.YES_NO_OPTION);
       if(x==JOptionPane.YES_OPTION){
            try {
                conexion.sentencia.executeUpdate("update alumnos set Nombre='" + nom + "', Paterno='" + pat + "', Materno='" + mat + "', Domicilio='" + dom + "', FechaNac='" + fecha + "', Carrera='" + car + "' where ID_producto='" + c + "'");
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                llenartabla();
            } catch (SQLException ex) {
                Logger.getLogger(Consultas_Alum.class.getName()).log(Level.SEVERE, null, ex);
            }

       }

}//GEN-LAST:event_btnmodificarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
}//GEN-LAST:event_btnsalirActionPerformed

    private void tblalumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblalumnosMouseClicked
       int r=tblalumnos.getSelectedRow();
       String c=(String)tblalumnos.getValueAt(r, 0);
       String nom=(String) tblalumnos.getValueAt(r, 1);
       String pat=(String) tblalumnos.getValueAt(r, 2);
       String mat=(String) tblalumnos.getValueAt(r, 3);
       String dom=(String)tblalumnos.getValueAt(r, 4);
       Object fecha=tblalumnos.getValueAt(r, 5);
       String fecha1=fecha.toString();
       String car=(String) tblalumnos.getValueAt(r, 6);
       txtcontrol.setText(c);
       txtnombre.setText(nom);
       txtpaterno.setText(pat);
       txtmaterno.setText(mat);
       txtdomicilio.setText(dom);
       txtfecha.setText(fecha1);
       txtcarrera.setText(car);
    }//GEN-LAST:event_tblalumnosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
llenartabla();
    }//GEN-LAST:event_formWindowOpened

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        String c=txtcontrol.getText();
        int x=JOptionPane.showConfirmDialog(null, "¿Deseas eliminar?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if(x==JOptionPane.YES_OPTION){
            try {
                conexion.sentencia.execute("delete from alumnos where control='" + c + "'");
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                llenartabla();
                btncancelar.doClick();
            } catch (SQLException ex) {
                Logger.getLogger(Consultas_Alum.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        txtcontrol.setText("");
        txtnombre.setText("");
        txtpaterno.setText("");
        txtmaterno.setText("");
        txtdomicilio.setText("");
        txtfecha.setText("");
        txtcarrera.setText("");
        txtcontrol.requestFocus();
    }//GEN-LAST:event_btncancelarActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas_Alum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblalumnos;
    private javax.swing.JTextField txtcarrera;
    private javax.swing.JTextField txtcontrol;
    private javax.swing.JTextField txtdomicilio;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtmaterno;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpaterno;
    // End of variables declaration//GEN-END:variables

}
