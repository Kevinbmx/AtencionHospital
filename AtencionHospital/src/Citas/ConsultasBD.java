/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citas;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class ConsultasBD extends javax.swing.JInternalFrame {

    Connection cc;
    ResultSet r;
    Conexion conectar;
    private Conexion conexion;
    String doctorId = "";
    String pacienteId = "";
    String usuarioId;

    public ConsultasBD() {
        initComponents();
        conexion = new Conexion();
        conectar = new Conexion();
        cc = conectar.getCn();
        llenarDoctor();
        llenarPaciente();
        llenarUsuario();
        llenarFecha();
        mostrardatos("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        cmbUser = new javax.swing.JComboBox<>();
        cmbPaciente = new javax.swing.JComboBox<>();
        cmbDoctor = new javax.swing.JComboBox<>();
        btnInsertar = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbHora = new javax.swing.JComboBox<>();
        cmbMinuto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        labelMostrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        detalle = new javax.swing.JTable();
        cmbFecha = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("Doctor :");

        jLabel2.setText("Paciente :");

        jLabel3.setText("Usuario :");

        jLabel4.setText("Observacion :");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        cmbUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserActionPerformed(evt);
            }
        });

        cmbPaciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPacienteActionPerformed(evt);
            }
        });

        cmbDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctorActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        calendario.setDateFormatString("yyyy-MM-dd");

        jLabel5.setText("Fecha :");

        jLabel6.setText("Hora");

        cmbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        cmbMinuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        labelMostrar.setText("Mostrar");
        labelMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMostrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInsertar)
                                .addGap(31, 31, 31)
                                .addComponent(btneliminar)
                                .addGap(38, 38, 38)
                                .addComponent(labelMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cmbHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btneliminar)
                    .addComponent(labelMostrar))
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Insertar", jPanel1);

        detalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(detalle);

        cmbFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFechaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(cmbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnBuscar)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Detalles", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserActionPerformed
        try {
            Statement sent = cc.createStatement();
            ResultSet rs = sent.executeQuery("select usuarioId from tbl_usuario where nombreUsuario= '" + this.cmbUser.getSelectedItem() + "'");
            rs.next();
            //txtid.setText(String.valueOf(rs.getInt("pacienteId")));
            usuarioId = String.valueOf(rs.getInt("usuarioId"));
            System.out.println("usua" + usuarioId);
        } catch (SQLException e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_cmbUserActionPerformed

    private void cmbPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPacienteActionPerformed
        try {
            Statement sent = cc.createStatement();
            ResultSet rs = sent.executeQuery("select PacienteId from tbl_paciente where nombre= '" + this.cmbPaciente.getSelectedItem() + "'");
            rs.next();
            //txtid.setText(String.valueOf(rs.getInt("pacienteId")));
            pacienteId = String.valueOf(rs.getInt("pacienteId"));
            System.out.println("paciente" + pacienteId);
        } catch (SQLException e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_cmbPacienteActionPerformed

    private void cmbDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctorActionPerformed
        try {
            Statement sent = cc.createStatement();
            ResultSet rs = sent.executeQuery("select doctorId from tbl_doctor where nombre= '" + this.cmbDoctor.getSelectedItem() + "'");
            rs.next();
            //txtid.setText(String.valueOf(rs.getInt("doctorId")));
            doctorId = String.valueOf(rs.getInt("doctorId"));
            System.out.println("doctorid" + doctorId);
        } catch (SQLException e) {
            System.out.print(e);
        }
    }//GEN-LAST:event_cmbDoctorActionPerformed
    public void llenarUsuario() {
        this.cmbUser.removeAllItems();
        try {
            Statement sent = cc.createStatement();
            ResultSet rs = sent.executeQuery("Select usuarioId,nombreUsuario from tbl_usuario");
            while (rs.next()) {
                this.cmbUser.addItem(rs.getString("nombreUsuario"));
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
    }

    public void llenarPaciente() {
        this.cmbPaciente.removeAllItems();
        try {
            Statement sent = cc.createStatement();
            ResultSet rs = sent.executeQuery("Select pacienteId,nombre from tbl_paciente");
            while (rs.next()) {
                this.cmbPaciente.addItem(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.print(e);
        }
    }

    public void llenarDoctor() {
        this.cmbDoctor.removeAllItems();
        try {
            Statement sent = cc.createStatement();
            ResultSet rs = sent.executeQuery("Select doctorId,nombre from tbl_doctor");
            while (rs.next()) {
                this.cmbDoctor.addItem(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.print(e);

        }
    }

    void mostrardatos(String valor) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Doctor");
        modelo.addColumn("Paciente");
        modelo.addColumn("Observacion");

        tabla.setModel(modelo);
        detalle.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "select citaId ,fecha,hora,d.nombre,p.nombre,observaciones from tbl_cita c,tbl_doctor d, tbl_paciente p where c.doctorId=d.doctorId and c.pacienteId=p.pacienteId";
        } else {
            sql = "select citaId ,fecha,hora,d.nombre,p.nombre,observaciones from tbl_cita c,tbl_doctor d, tbl_paciente p where c.doctorId=d.doctorId and c.pacienteId=p.pacienteId and c.fecha='"+valor+"'";
        }
        String[] datos = new String[6];
        try {
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);

                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            detalle.setModel(modelo);
        } catch (SQLException ex) {
            System.out.print(ex);
        }
    }

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        int doctor = Integer.parseInt(doctorId);
        int paciente = Integer.parseInt(pacienteId);
        int user = Integer.parseInt(usuarioId);

        /////fecha///
        int año = calendario.getCalendar().get(Calendar.YEAR);
        int mes = calendario.getCalendar().get(Calendar.MONTH) + 1;
        int dia = calendario.getCalendar().get(Calendar.DAY_OF_MONTH);

        String hora = (String) cmbHora.getSelectedItem();
        String min = (String) cmbMinuto.getSelectedItem();
        String horacompleta = (hora + ":" + min);
        String fechacompleta = (año + "-" + mes + "-" + dia);

        try {
            PreparedStatement pst = cc.prepareStatement("insert into tbl_cita values (?,?,?,?,?,?)");
            pst.setString(1, fechacompleta);
            pst.setString(2, horacompleta);
            pst.setInt(3, doctor);
            pst.setInt(4, paciente);
            pst.setString(5, txtArea.getText());
            pst.setInt(6, user);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Inserto correctamente");
            mostrardatos("");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error");
            System.out.print(e);

        }
        llenarFecha();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int fila = tabla.getSelectedRow();
        String id = "";
        if (fila >= 0) {
            id = (tabla.getValueAt(fila, 0).toString());
            System.out.println("//////////////" + id);
            jPanel1.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "no selecciono fila");
        }

        try {
            // TODO add your handling code here:
            PreparedStatement pst = cc.prepareStatement("delete from tbl_cita where citaId= " + id + "");
            pst.executeUpdate();
            mostrardatos("");
        } catch (SQLException ex) {
            System.out.printf(ex.getMessage());
        }


    }//GEN-LAST:event_btneliminarActionPerformed

    private void cmbFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFechaActionPerformed
        // System.out.println("fechaaaa"+cmbFecha.getSelectedItem().toString());
//        mostrardatos(cmbFecha.getSelectedItem().toString());
    }//GEN-LAST:event_cmbFechaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String fecha = (String) cmbFecha.getSelectedItem();
        mostrardatos(fecha);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void labelMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMostrarMouseClicked
        mostrardatos("");
    }//GEN-LAST:event_labelMostrarMouseClicked
    public void llenarFecha() {
        this.cmbFecha.removeAllItems();
        try {
            Statement sent = cc.createStatement();
            ResultSet rs = sent.executeQuery("Select fecha from tbl_cita");
            while (rs.next()) {
                this.cmbFecha.addItem(rs.getString("fecha"));
            }
        } catch (SQLException e) {
            System.out.print(e);

        }
    }

    public final void centrarventtana() {
//        logger.info("Centrando ventana");
        this.setLocation((Main.Main.jDesktopPane1.getWidth() / 2) - (this.getWidth() / 2), (Main.Main.jDesktopPane1.getHeight() / 2) - (this.getHeight() / 2));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btneliminar;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JComboBox<String> cmbDoctor;
    private javax.swing.JComboBox<String> cmbFecha;
    private javax.swing.JComboBox<String> cmbHora;
    private javax.swing.JComboBox<String> cmbMinuto;
    private javax.swing.JComboBox<String> cmbPaciente;
    private javax.swing.JComboBox<String> cmbUser;
    private javax.swing.JTable detalle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelMostrar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
