
package Seguridad;

import Conexion.Conexion;
import static Main.Main.jDesktopPane1;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LPermisoUsuario extends javax.swing.JInternalFrame {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getRootLogger();

    java.sql.Connection cn;
    PreparedStatement cts;
    ResultSet r;
    Conexion conectar = new Conexion();

    public LPermisoUsuario() {
        initComponents();
        logger.info("Se ha abierto la ventana lista Permisi-Usuario.");
        this.setTitle("Usuario - Permiso");
        conectar = new Conexion();
        cn = conectar.getCn();
        centrarventtana();
        cargarTabla();
    }

    public void centrarventtana() {
        logger.info("Centrando ventana.");
        this.setLocation((Main.Main.jDesktopPane1.getWidth() / 2) - (this.getWidth() / 2), (Main.Main.jDesktopPane1.getHeight() / 2) - (this.getHeight() / 2));
    }

    public void cargarTabla() {
        try {
            logger.info("Cargando tabla PermisoUsuario.");
            DefaultTableModel tabla = new DefaultTableModel();
            tabla.addColumn("ID");
            tabla.addColumn("USUARIO");
            tabla.addColumn("PERMISO");
            cts = cn.prepareStatement("SELECT * FROM selectPermisoUsuario()");
            r = cts.executeQuery();
            while (r.next()) {
                Object dato[] = new Object[3];
                for (int i = 0; i < 3; i++) {
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
            cts = cn.prepareStatement("exec dbo.deletePermisoUsuario ?");
            cts.setString(1, id);
            int c = cts.executeUpdate();
            if (c == 1) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado.");
                logger.info("Seha eliminado PermisoUsuario. id: " + id);
            }
        } catch (Exception e) {
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();

        setClosable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
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

        botonEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonEliminar.setText("Eliminar asignacion");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonRegistrar.setText("Registrar nuevo");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        try {
            int fila = jTable1.getSelectedRow();
            String id = (String) jTable1.getValueAt(fila, 0);
            eliminar(id);
            cargarTabla();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        try {
            logger.info("Llamando ventana para registrar PermisoUsuario.");
            RPermisoUsuario RegistroPermisoUsuario = new RPermisoUsuario();
            jDesktopPane1.add(RegistroPermisoUsuario);
            RegistroPermisoUsuario.show();
            RegistroPermisoUsuario.setLocation(null);
            RegistroPermisoUsuario.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    public static javax.swing.JButton botonRegistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
