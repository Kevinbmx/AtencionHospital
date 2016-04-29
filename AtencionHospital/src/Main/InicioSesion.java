/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Conexion.Conexion;
import java.awt.BorderLayout;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.PropertyConfigurator;


public class InicioSesion extends javax.swing.JFrame {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getRootLogger();

    java.sql.Connection cn;
    PreparedStatement cts;
    ResultSet r;
    Conexion conectar = new Conexion();

    private String idActual = "", usuarioActual = "", contrasenaActual = "";
    private String doctor = "Doctor";
    private String paciente = "Paciente";
    private String usuario = "Usuario";
    private String permiso = "Permiso";
    private String permisoUsuario = "PermisoUsuario";
    private String citas = "Citas";
    private String oonsultaCitas = "Consulta Citas";
    
    private Main ventanaPrograma;

    public InicioSesion() throws IOException, ClassNotFoundException {
        initComponents();
        logger.info("Se inicio la venta de Inicio de sesion");
        conectar = new Conexion();
        cn = conectar.getCn();
        init();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        botonEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Inicio de sesion");

        jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Usuario:");

        jLabel6.setText("Contrasena:");

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonEntrar.setText("Entrar");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField)
                            .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(botonEntrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        try {
            String u = jTextField.getText().trim().toLowerCase();
            String c = jPasswordField.getText().trim().toLowerCase();
            validarUsuario(u, c);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args[]) {
        String resource = "/auditoria.properties";
        URL configFileResource;
        configFileResource = InicioSesion.class.getResource(resource);
        PropertyConfigurator.configure(configFileResource);
        
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InicioSesion().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setTitle("Inicio de sesion");
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void validarUsuario(String u, String c) throws IOException, ClassNotFoundException, SQLException {
        logger.info("Se esta validando el usuario.");
        boolean inicio = false;
        cts = cn.prepareStatement("select * from buscarUsuario('" + u + "')");
        r = cts.executeQuery();
        Object dato[] = new Object[3];
        while (r.next()) {
            for (int i = 0; i < 3; i++) {
                dato[i] = r.getString(i + 1);
            }
        }
        idActual = (String) dato[0];
        usuarioActual = (String) dato[1];
        contrasenaActual = (String) dato[2];
//        System.out.println(id + " - " + usuario + " - " + contrasena);
        if (c.equals(contrasenaActual)) {
            inicio = true;
        }
        if (inicio) {
            logger.info("Ha iniciado sesion. Usuario: "+u+" - Contrasena: "+c);
            cargarPermisos();            
            this.dispose();
        }else{
            logger.info("Se ha intentado ingresar con un usuario y/o contrasena erroneos. Usuario: "+u+" - Contrasena: "+c);
            JOptionPane.showMessageDialog(null, "Su usuario o contrasena es incorrecto.");
        }
    }
    
    private void cargarPermisos() throws SQLException{
        logger.info("Cargando permisos del usuario.");
        ventanaPrograma = new Main();
        cts = cn.prepareStatement("select * from cargarPermisoDeUsuario(" + Integer.parseInt(idActual) + ")");
        r = cts.executeQuery();
        while (r.next()) {
            if (r.getString(1).equals(doctor)) {
                ventanaPrograma.menuRegistro.setVisible(true);
                ventanaPrograma.itemDoctor.setVisible(true);
                logger.info("Se ha habilitado el apartado de: "+doctor);
            }
            if (r.getString(1).equals(paciente)) {
                ventanaPrograma.menuRegistro.setVisible(true);
                ventanaPrograma.itemPaciente.setVisible(true);
                logger.info("Se ha habilitado el apartado de: "+paciente);
            }
            if (r.getString(1).equals(citas)) {
                ventanaPrograma.menuRegistro.setVisible(true);
                ventanaPrograma.itemCitas.setVisible(true);
                logger.info("Se ha habilitado el apartado de: "+citas);
            }
            if (r.getString(1).equals(oonsultaCitas)) {
                ventanaPrograma.menuRegistro.setVisible(true);
                ventanaPrograma.itemConsultas.setVisible(true);
                logger.info("Se ha habilitado el apartado de: "+oonsultaCitas);
            }
            if (r.getString(1).equals(usuario)) {
                ventanaPrograma.menuSeguridad.setVisible(true);
                ventanaPrograma.itemUsuario.setVisible(true);
                logger.info("Se ha habilitado el apartado de: "+usuario);
            }
            if (r.getString(1).equals(permiso)) {
                ventanaPrograma.menuSeguridad.setVisible(true);
                ventanaPrograma.itemPermisos.setVisible(true);
                logger.info("Se ha habilitado el apartado de: "+permiso);
            }
            if (r.getString(1).equals(permisoUsuario)) {
                ventanaPrograma.menuSeguridad.setVisible(true);
                ventanaPrograma.itemPermisos.setVisible(true);
                logger.info("Se ha habilitado el apartado de: "+permisoUsuario);
            }
        }
    }
}