package Main;

import Doctor.Doctor;
import Insertar.Citas;
import Insertar.ConsultasBD;
import Paciente.Paciente;
import Seguridad.LPermiso;
import Seguridad.LPermisoUsuario;
import Seguridad.LUsuario;
import Seguridad.RUsuario;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.JFrame;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public final class Main extends javax.swing.JFrame {

//   private static final Logger logger = Logger.getRootLogger();

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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jMenuItem2 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmenuDoctor = new javax.swing.JMenuItem();
        jmenuPaciente = new javax.swing.JMenuItem();
        jmenuEspecialidades = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 860));

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 153));
        jDesktopPane1.setForeground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );

        jMenu1.setText("Sistema");

        jMenuItem1.setText("Acerca del Sistema");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registro");

        jmenuDoctor.setText("Doctor");
        jmenuDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuDoctorActionPerformed(evt);
            }
        });
        jMenu2.add(jmenuDoctor);

        jmenuPaciente.setText("Pacientes");
        jmenuPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuPacienteActionPerformed(evt);
            }
        });
        jMenu2.add(jmenuPaciente);

        jmenuEspecialidades.setText("Especialidades");
        jmenuEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuEspecialidadesActionPerformed(evt);
            }
        });
        jMenu2.add(jmenuEspecialidades);

        jMenuItem3.setText("Citas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Consulta Citas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

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

    private void jmenuDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuDoctorActionPerformed
        try {
            Doctor doctor = new Doctor();
            jDesktopPane1.add(doctor);
            doctor.show();
            doctor.setLocation(50, 5);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmenuDoctorActionPerformed

    private void jmenuPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuPacienteActionPerformed
        try {
            Paciente paciente = new Paciente();
            jDesktopPane1.add(paciente);
            paciente.show();
            paciente.setLocation(50, 5);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmenuPacienteActionPerformed

    private void ItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUsuariosActionPerformed
        try {
            LUsuario listaUsuario = new LUsuario();
            jDesktopPane1.add(listaUsuario);
            listaUsuario.show();
            listaUsuario.setLocation(null);
            listaUsuario.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ItemUsuariosActionPerformed

    private void itemPermisoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPermisoUsuarioActionPerformed
        try {
            LPermisoUsuario listaPermisoUsuario = new LPermisoUsuario();
            jDesktopPane1.add(listaPermisoUsuario);
            listaPermisoUsuario.show();
            listaPermisoUsuario.setLocation(null);
            listaPermisoUsuario.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemPermisoUsuarioActionPerformed

    private void ItemPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPermisosActionPerformed
        try {
            LPermiso listaPermiso = new LPermiso();
            jDesktopPane1.add(listaPermiso);
            listaPermiso.show();
            listaPermiso.setLocation(null);
            listaPermiso.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ItemPermisosActionPerformed

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

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            ConsultasBD listaPermiso = new ConsultasBD();
            jDesktopPane1.add(listaPermiso);
            listaPermiso.show();
            listaPermiso.setLocation(null);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            Citas listaPermiso = new Citas();
            jDesktopPane1.add(listaPermiso);
            listaPermiso.show();
            listaPermiso.setLocation(null);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {
        
//        String resource = "/auditoria.properties";
//        URL configFileResource;
//        configFileResource = Main.class.getResource(resource);
//        PropertyConfigurator.configure(configFileResource);
//        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jmenuDoctor;
    private javax.swing.JMenuItem jmenuEspecialidades;
    private javax.swing.JMenuItem jmenuPaciente;
    // End of variables declaration//GEN-END:variables
}
