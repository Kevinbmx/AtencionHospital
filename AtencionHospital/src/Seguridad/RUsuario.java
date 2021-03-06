
package Seguridad;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class RUsuario extends javax.swing.JInternalFrame {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getRootLogger();

    java.sql.Connection cn;
    PreparedStatement cts;
    ResultSet r;
    Conexion conectar = new Conexion();

    private String idUpdate;

    public RUsuario() {
        initComponents();
        logger.info("Se ha abierto la ventana RUsuario.");
        this.setTitle("Usuario");
        conectar = new Conexion();
        cn = conectar.getCn();
        centrarventtana();
    }

    public String getIdUpdate() {
        return idUpdate;
    }

    public void setIdUpdate(String idUpdate) {
        this.idUpdate = idUpdate;
    }

    public void centrarventtana() {
        logger.info("Centrando ventana.");
        this.setLocation((Main.Main.jDesktopPane1.getWidth() / 2) - (this.getWidth() / 2), (Main.Main.jDesktopPane1.getHeight() / 2) - (this.getHeight() / 2));
    }

    private void insertar(String nombre, String apellido, String usuario, String contrasena) throws SQLException {
        PreparedStatement cts = cn.prepareStatement("exec insertarUsuario ?, ?, ?, ?");
        cts.setString(1, nombre);
        cts.setString(2, apellido);
        cts.setString(3, usuario);
        cts.setString(4, contrasena);
        int rpt = cts.executeUpdate();
        cts.getMoreResults();
        if (rpt == 1) {
            JOptionPane.showMessageDialog(this, "Se ha insertado");
            this.dispose();
        }
    }

    public Boolean noNulls() {
        if (txtNombre1.getText().trim().equals("")
                || txtApellido.getText().trim().equals("")
                || txtUsuario.getText().trim().equals("")
                || txtContraseña.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos correctamente, no se permiten espacios vacios.");
            return false;
        } else {
            return true;
        }
    }

    public void llenarEspacios(String nombre, String apellido, String usuario, String contrasena) {
        txtNombre1.setText(nombre);
        txtApellido.setText(apellido);
        txtUsuario.setText(usuario);
        txtContraseña.setText(contrasena);
    }

    private void editar(String nombre, String apellido, String usuario, String contrasena) {
        try {
            PreparedStatement cts = cn.prepareStatement("EXEC dbo.updateUsuario  ?, ?, ?, ?,?");
            cts.setString(1, "" + idUpdate);
            cts.setString(2, nombre);
            cts.setString(3, apellido);
            cts.setString(4, usuario);
            cts.setString(5, contrasena);
            int rpt = cts.executeUpdate();
            cts.getMoreResults();
            if (rpt != 5) {
                JOptionPane.showMessageDialog(this, "Se ha editado.");
                this.dispose();
            }
        } catch (Exception e) {
        }
    }

    public void limpiarCasillas(){
        txtNombre1.setText("");
        txtApellido.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        txtContraseña = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        botonEditar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setClosable(true);

        jLabel7.setText("Apellido:");

        jLabel8.setText("Nombre:");

        jLabel10.setText("Usuario:");

        botonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        jLabel11.setText("Contrasena:");

        botonEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(botonRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtContraseña)
                            .addComponent(txtUsuario)
                            .addComponent(txtApellido)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrar)
                    .addComponent(botonEditar)
                    .addComponent(botonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        try {
            if (noNulls()) {
                String nom = txtNombre1.getText();
                String ape = txtApellido.getText();
                String usu = txtUsuario.getText();
                String con = txtContraseña.getText();
                insertar(nom, ape, usu, con);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        try {
            if (noNulls()) {
                String nom = txtNombre1.getText();
                String ape = txtApellido.getText();
                String usu = txtUsuario.getText();
                String con = txtContraseña.getText();
                editar(nom, ape, usu, con);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    public static javax.swing.JButton botonEditar;
    public static javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
