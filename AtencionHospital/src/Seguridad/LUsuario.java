/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad;

import Conexion.Conexion;
import static Main.Main.jDesktopPane1;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toshiba
 */
public class LUsuario extends javax.swing.JInternalFrame {

    java.sql.Connection cn;
    PreparedStatement cts;
    ResultSet r;
    Conexion conectar = new Conexion();

    public LUsuario() {
        initComponents();
        conectar = new Conexion();
        cn = conectar.getCn();
        centrarventtana();
        cargarTabla();
    }

    public void centrarventtana() {
        this.setLocation((Main.Main.jDesktopPane1.getWidth() / 2) - (this.getWidth() / 2), (Main.Main.jDesktopPane1.getHeight() / 2) - (this.getHeight() / 2));
    }

    public void cargarTabla() {
        try {
            DefaultTableModel tabla = new DefaultTableModel();
            tabla.addColumn("ID");
            tabla.addColumn("NOMBRE");
            tabla.addColumn("APELLIDO");
            tabla.addColumn("USUARIO");
            tabla.addColumn("CONTRASEÑA");
            cts = cn.prepareStatement("SELECT * FROM selectUsuario()");
            r = cts.executeQuery();
            while (r.next()) {
                Object dato[] = new Object[5];
                for (int i = 0; i < 5; i++) {
                    dato[i] = r.getString(i + 1);
                }
                tabla.addRow(dato);
            }
            this.jTable1.setModel(tabla);

            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            jTable1.doLayout();
        } catch (Exception e) {
        }
    }

    private void eliminar(String id) {
        try {
            cts = cn.prepareStatement("exec dbo.deleteUsuario ?");
            cts.setString(1, id);
            int c = cts.executeUpdate();
            if (c == 1) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado.");
            }
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setClosable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Actualizar Vista");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        botonEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonEditar.setText("Editar seleccionado");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonRegistrar.setText("Registrar nuevo");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonEliminar.setText("Eliminar asignacion");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            cargarTabla();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        try {
            int fila = jTable1.getSelectedRow();
            String id = (String) jTable1.getValueAt(fila, 0);
            String nom = (String) jTable1.getValueAt(fila, 1);
            String ape = (String) jTable1.getValueAt(fila, 2);
            String usu = (String) jTable1.getValueAt(fila, 3);
            String con = (String) jTable1.getValueAt(fila, 4);

            if (!Main.Main.registarUsuario.isShowing()) {
                Main.Main.registarUsuario.setIdUpdate(id);
                Main.Main.registarUsuario.llenarEspacios(nom, ape, usu, con);
                Main.Main.jDesktopPane1.add(Main.Main.registarUsuario);
                Main.Main.registarUsuario.show();
            } else {
                Main.Main.registarUsuario.setSelected(true);
                Main.Main.registarUsuario.centrarventtana();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        try {
            RUsuario RegistroUsuario = new RUsuario();
            jDesktopPane1.add(RegistroUsuario);
            RegistroUsuario.show();
            RegistroUsuario.setLocation(null);
            RegistroUsuario.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try {
            int fila = jTable1.getSelectedRow();
            String id = (String) jTable1.getValueAt(fila, 0);
//            System.out.println("Este es: " + id);
            eliminar(id);
            cargarTabla();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    public static javax.swing.JButton botonRegistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
