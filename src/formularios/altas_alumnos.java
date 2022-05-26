

package formularios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilerias.conexion;


public class altas_alumnos extends javax.swing.JFrame {

   
    public altas_alumnos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtControl = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        cboCarrera = new javax.swing.JComboBox();
        diafecha = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        jLabel1.setText("Control");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 114, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 158, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        jLabel3.setText("Paterno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 196, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        jLabel4.setText("Carrera");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 336, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        jLabel5.setText("Materno");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 234, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        jLabel6.setText("Domicilio");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 272, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14));
        jLabel7.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 298, -1, -1));

        txtControl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtControlFocusLost(evt);
            }
        });
        getContentPane().add(txtControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 114, 110, -1));

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 158, 137, -1));

        txtPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaternoActionPerformed(evt);
            }
        });
        txtPaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPaternoFocusLost(evt);
            }
        });
        txtPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaternoKeyReleased(evt);
            }
        });
        getContentPane().add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 196, 137, -1));

        txtMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaternoActionPerformed(evt);
            }
        });
        txtMaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaternoFocusLost(evt);
            }
        });
        txtMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaternoKeyReleased(evt);
            }
        });
        getContentPane().add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 234, 137, -1));

        txtDomicilio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDomicilioFocusLost(evt);
            }
        });
        getContentPane().add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 272, 137, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12));
        btnCancelar.setForeground(new java.awt.Color(255, 0, 51));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 215, 110, -1));

        cboCarrera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCarreraActionPerformed(evt);
            }
        });
        cboCarrera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cboCarreraFocusLost(evt);
            }
        });
        getContentPane().add(cboCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 336, 137, -1));

        diafecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                diafechaFocusLost(evt);
            }
        });
        getContentPane().add(diafecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 298, 130, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 48));
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("ITSSMO");

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 51));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12));
        btnGuardar.setForeground(new java.awt.Color(255, 0, 51));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel8)
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(414, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(77, 77, 77)
                .addComponent(btnSalir)
                .addGap(117, 117, 117))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void Limpiar(){
         txtControl.setText("");
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtDomicilio.setText("");
        diafecha.setDate(null);
        cboCarrera.setSelectedIndex(0);
        txtControl.requestFocus();
     }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
txtControl.requestFocus();
        try{
    cboCarrera.removeAllItems();
    cboCarrera.addItem("Selecciona la carrera");
    conexion.conectar("jdbc:mysql://localhost:3306/escuela","root","");
ResultSet resultado;
resultado = conexion.sentencia.executeQuery("select * from carreras");
while(resultado.next()){
    String c=resultado.getString("clave");

    String n=resultado.getString("nombrecarrera");
    cboCarrera.addItem(c+"-"+n);

}
     }catch(SQLException ex){
         Logger.getLogger(altas_alumnos.class.getName()).log(Level.SEVERE,null,ex);
     }
    }//GEN-LAST:event_formWindowOpened

    private void cboCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCarreraActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cboCarreraActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtControl.setText("");
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtDomicilio.setText("");
        diafecha.setDate(null);
        cboCarrera.setSelectedIndex(0);
        txtControl.requestFocus();
}//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            String c = txtControl.getText();
            String nom = txtNombre.getText();
            String pat = txtPaterno.getText();
            String mat = txtMaterno.getText();
            String dom = txtDomicilio.getText();
            java.util.Date f = diafecha.getDate();
            int a = f.getYear() + 1900;
            int m = f.getMonth() + 1;
            String mes = m + "";
            if (m < 10) {
                mes = "0" + m;
            }
            int d = f.getDay();
            String dia = d + "";
            if (d < 10) {
                dia = "0" + d;
            }
            String fecha = a + "-" + mes + "-" + dia;
            String car = (String) cboCarrera.getSelectedItem();
            car = car.substring(0, 13);
            ResultSet resultado;
            resultado = conexion.sentencia.executeQuery("select * from alumnos where Control='" + c + "'");
            if(resultado.next()){
                JOptionPane.showMessageDialog(null, "EL REGISTRO YA EXISTE");
                txtControl.requestFocus();
                return;
            }
            conexion.sentencia.execute("insert into alumnos values('"+c+"','"+nom+"','"+pat+"','"+mat+"','"+dom+"','"+fecha+"','"+car+"')");
            JOptionPane.showMessageDialog(null,"EL REGISTRO FUE INSERTADO CON EXITO");
            Limpiar();
        } catch (SQLException ex) {
            Logger.getLogger(altas_alumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_btnGuardarActionPerformed

    private void txtMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaternoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtMaternoActionPerformed

    private void txtPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaternoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtPaternoActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        txtNombre.setText(txtNombre.getText().toUpperCase());
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtPaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoKeyReleased
        // TODO add your handling code here:
        txtPaterno.setText(txtPaterno.getText().toUpperCase());
    }//GEN-LAST:event_txtPaternoKeyReleased

    private void txtMaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoKeyReleased
        // TODO add your handling code here:
        txtMaterno.setText(txtMaterno.getText().toUpperCase());
    }//GEN-LAST:event_txtMaternoKeyReleased

    private void txtControlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtControlFocusLost
        // TODO add your handling code here:
        txtNombre.requestFocus();
    }//GEN-LAST:event_txtControlFocusLost

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        txtPaterno.requestFocus();
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtPaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaternoFocusLost
        // TODO add your handling code here:
        txtMaterno.requestFocus();
    }//GEN-LAST:event_txtPaternoFocusLost

    private void txtMaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaternoFocusLost
        // TODO add your handling code here:
        txtDomicilio.requestFocus();
    }//GEN-LAST:event_txtMaternoFocusLost

    private void txtDomicilioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDomicilioFocusLost
        // TODO add your handling code here:
        diafecha.requestFocus();
    }//GEN-LAST:event_txtDomicilioFocusLost

    private void diafechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diafechaFocusLost
        // TODO add your handling code here:
        cboCarrera.requestFocus();
    }//GEN-LAST:event_diafechaFocusLost

    private void cboCarreraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cboCarreraFocusLost
        // TODO add your handling code here:
        btnGuardar.requestFocus();
    }//GEN-LAST:event_cboCarreraFocusLost

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new altas_alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboCarrera;
    private com.toedter.calendar.JDateChooser diafecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtControl;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    // End of variables declaration//GEN-END:variables

}
