
package Main;

import Citas.Citas;
import Citas.ConsultasBD;
import Doctor.DoctorEditar;
import Doctor.DoctorRegistro;
import Paciente.PacientesRegistrar;
import Seguridad.LPermiso;
import Seguridad.LPermisoUsuario;
import Seguridad.LUsuario;
import Seguridad.RUsuario;
import java.awt.Dimension;
import javax.swing.JFrame;


public class Main extends javax.swing.JFrame {

    public static RUsuario registarUsuario;
    private int idUsuarioActual = -1;

    public Main() {
        initComponents();
        this.setTitle("Atencion Hospital");
        Dimension dim = super.getToolkit().getScreenSize();
        this.setSize((int) dim.getWidth(), (int) dim.getHeight() - 40);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jDesktopPane1.setSize(getWidth(), getHeight() - 50);
        registarUsuario = new RUsuario();
    }

    public int getIdUsuarioActual() {
        return idUsuarioActual;
    }

    public void setIdUsuarioActual(int idUsuarioActual) {
        this.idUsuarioActual = idUsuarioActual;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuSistema = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuRegistro = new javax.swing.JMenu();
        itemDoctor = new javax.swing.JMenuItem();
        itemPaciente = new javax.swing.JMenuItem();
        itemCitas = new javax.swing.JMenuItem();
        itemConsultas = new javax.swing.JMenuItem();
        menuSeguridad = new javax.swing.JMenu();
        itemUsuario = new javax.swing.JMenuItem();
        intemPermisoUsuario = new javax.swing.JMenuItem();
        itemPermisos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 153));
        jDesktopPane1.setForeground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );

        menuSistema.setText("Sistema");

        jMenuItem1.setText("Acerca del Sistema");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuSistema.add(jMenuItem1);

        jMenuBar1.add(menuSistema);

        menuRegistro.setText("Registro");

        itemDoctor.setText("Doctor");
        itemDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDoctorActionPerformed(evt);
            }
        });
        menuRegistro.add(itemDoctor);

        itemPaciente.setText("Pacientes");
        itemPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPacienteActionPerformed(evt);
            }
        });
        menuRegistro.add(itemPaciente);

        itemCitas.setText("Citas");
        itemCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCitasActionPerformed(evt);
            }
        });
        menuRegistro.add(itemCitas);

        itemConsultas.setText("Consultas");
        itemConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultasActionPerformed(evt);
            }
        });
        menuRegistro.add(itemConsultas);

        menuSeguridad.setText("Seguridad");

        itemUsuario.setText("Usuarios");
        itemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuarioActionPerformed(evt);
            }
        });
        menuSeguridad.add(itemUsuario);

        intemPermisoUsuario.setText("Usuarios y permisos");
        intemPermisoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intemPermisoUsuarioActionPerformed(evt);
            }
        });
        menuSeguridad.add(intemPermisoUsuario);

        itemPermisos.setText("Permisos");
        itemPermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPermisosActionPerformed(evt);
            }
        });
        menuSeguridad.add(itemPermisos);

        menuRegistro.add(menuSeguridad);

        jMenuBar1.add(menuRegistro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            Acerca acerdaDe = new Acerca();
            jDesktopPane1.add(acerdaDe);
            acerdaDe.show();
            acerdaDe.setLocation(null);
            acerdaDe.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDoctorActionPerformed
        try {
            DoctorRegistro doctor = new DoctorRegistro();
            jDesktopPane1.add(doctor);
            doctor.show();
            doctor.setLocation(50, 5);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemDoctorActionPerformed

    private void itemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPacienteActionPerformed
        try {
            PacientesRegistrar paciente = new PacientesRegistrar();
            jDesktopPane1.add(paciente);
            paciente.show();
            paciente.setLocation(50, 5);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemPacienteActionPerformed

    private void itemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuarioActionPerformed
        try {
            LUsuario listaUsuario = new LUsuario();
            jDesktopPane1.add(listaUsuario);
            listaUsuario.show();
            listaUsuario.setLocation(null);
            listaUsuario.centrarventtana();
        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_itemUsuarioActionPerformed

    private void intemPermisoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intemPermisoUsuarioActionPerformed

        try {
            LPermisoUsuario listaPermisoUsuario = new LPermisoUsuario();
            jDesktopPane1.add(listaPermisoUsuario);
            listaPermisoUsuario.show();
            listaPermisoUsuario.setLocation(null);
            listaPermisoUsuario.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_intemPermisoUsuarioActionPerformed

    private void itemPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPermisosActionPerformed

        try {
            LPermiso listaPermiso = new LPermiso();
            jDesktopPane1.add(listaPermiso);
            listaPermiso.show();
            listaPermiso.setLocation(null);
            listaPermiso.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemPermisosActionPerformed

    private void itemCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCitasActionPerformed
        try {
            Citas citas = new Citas();
            jDesktopPane1.add(citas);
            citas.show();
            citas.setLocation(null);
            citas.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemCitasActionPerformed

    private void itemConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultasActionPerformed
          try {
              ConsultasBD consulta = new ConsultasBD();
            jDesktopPane1.add(consulta);
            consulta.show();
            consulta.setLocation(null);
            consulta.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemConsultasActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem intemPermisoUsuario;
    public static javax.swing.JMenuItem itemCitas;
    public static javax.swing.JMenuItem itemConsultas;
    public static javax.swing.JMenuItem itemDoctor;
    public static javax.swing.JMenuItem itemPaciente;
    public static javax.swing.JMenuItem itemPermisos;
    public static javax.swing.JMenuItem itemUsuario;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JMenu menuRegistro;
    public static javax.swing.JMenu menuSeguridad;
    private javax.swing.JMenu menuSistema;
    // End of variables declaration//GEN-END:variables
}
