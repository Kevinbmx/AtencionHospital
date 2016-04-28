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

   private static final Logger logger = Logger.getRootLogger();

    public static RUsuario registarUsuario;
    private int idUsuarioActual = -1;

    public Main() {
        logger.info("Se inicio laventana principal.");
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
        //SI QUIERES TENER DISPONIBLE TODAS LA OPCION COMENTALAS SIGUIENTES LINEAS 
        //-->
        menuSeguridad.setVisible(false);
        itemUsuarios.setVisible(false);
        itemPermisos.setVisible(false);
        itemPermisoUsuario.setVisible(false);
        menuRegistro.setVisible(false);
        itemDoctor.setVisible(false);
        itemPaciente.setVisible(false);
        itemCitas.setVisible(false);
        itemConsultaCitas.setVisible(false);
        //<--
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
        menuRegistro = new javax.swing.JMenu();
        itemDoctor = new javax.swing.JMenuItem();
        itemPaciente = new javax.swing.JMenuItem();
        itemCitas = new javax.swing.JMenuItem();
        itemConsultaCitas = new javax.swing.JMenuItem();
	menuSeguridad = new javax.swing.JMenu();
        itemUsuarios = new javax.swing.JMenuItem();
        itemPermisoUsuario = new javax.swing.JMenuItem();
        itemPermisos = new javax.swing.JMenuItem();

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

        itemConsultaCitas.setText("Consulta Citas");
        itemConsultaCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultaCitasActionPerformed(evt);
            }
        });
        menuRegistro.add(itemConsultaCitas);

        jMenuBar1.add(menuRegistro);

	menuSeguridad.setText("Seguridad");

        itemUsuarios.setText("Usuarios");
        itemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuariosActionPerformed(evt);
            }
        });
        menuSeguridad.add(itemUsuarios);

        itemPermisoUsuario.setText("Usuarios y permisos");
        itemPermisoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPermisoUsuarioActionPerformed(evt);
            }
        });
        menuSeguridad.add(itemPermisoUsuario);

        itemPermisos.setText("Permisos");
        itemPermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPermisosActionPerformed(evt);
            }
        });
        menuSeguridad.add(itemPermisos);

        jMenuBar1.add(menuSeguridad);

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
            logger.info("Llamando a ventana Acerca.");
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
            logger.info("Llamando a ventana Doctor.");
            Doctor doctor = new Doctor();
            jDesktopPane1.add(doctor);
            doctor.show();
            doctor.setLocation(50, 5);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemDoctorActionPerformed

    private void itemPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPacienteActionPerformed
        try {
            logger.info("Llamando a ventana Paciente.");
            Paciente paciente = new Paciente();
            jDesktopPane1.add(paciente);
            paciente.show();
            paciente.setLocation(50, 5);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemPacienteActionPerformed

    private void ItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemUsuariosActionPerformed
        try {
            logger.info("Llamando a ventana listaUsuario.");
            LUsuario listaUsuario = new LUsuario();
            jDesktopPane1.add(listaUsuario);
            listaUsuario.show();
            listaUsuario.setLocation(null);
            listaUsuario.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ItemUsuariosActionPerformed

    private void itemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPermisoUsuarioActionPerformed
        try {
            logger.info("Llamando a ventana listaUsuario.");
            LUsuario usuario = new LUsuario();
            jDesktopPane1.add(usuario);
            usuario.show();
            usuario.setLocation(null);
            usuario.centrarventtana();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemPermisoUsuarioActionPerformed

    private void ItemPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPermisosActionPerformed
        try {
            logger.info("Llamando a ventana listaPermiso.");
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
            logger.info("Llamando a ventana listaUsuario.");
            LUsuario listaUsuario = new LUsuario();
            jDesktopPane1.add(listaUsuario);
            listaUsuario.show();
            listaUsuario.setLocation(null);
            listaUsuario.centrarventtana();
        } catch (Exception e) {
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_itemUsuarioActionPerformed

    private void itemPermisoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intemPermisoUsuarioActionPerformed
        try {
            logger.info("Llamando a ventana listaPermisoUsuario.");
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
            logger.info("Llamando a ventana listaPermiso.");
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
            logger.info("Llamando a ventana citas.");
            ConsultasBD listaPermiso = new ConsultasBD();
            jDesktopPane1.add(listaPermiso);
            listaPermiso.show();
            listaPermiso.setLocation(null);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemCitasActionPerformed

    private void itemConsultaCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaCitasActionPerformed
        try {
            logger.info("Llamando a ventana Consulta citas.");
            Citas listaPermiso = new Citas();
            jDesktopPane1.add(listaPermiso);
            listaPermiso.show();
            listaPermiso.setLocation(null);
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_itemConsultaCitasActionPerformed

    public static void main(String args[]) {
        
        String resource = "/auditoria.properties";
        URL configFileResource;
        configFileResource = Main.class.getResource(resource);
        PropertyConfigurator.configure(configFileResource);
        
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
    public static javax.swing.JMenuItem itemCitas;
    public static javax.swing.JMenuItem itemConsultaCitas;
    public static javax.swing.JMenuItem itemDoctor;
    public static javax.swing.JMenuItem itemPaciente;
    public static javax.swing.JMenuItem itemPermisoUsuario;
    public static javax.swing.JMenuItem itemPermisos;
    public static javax.swing.JMenuItem itemUsuarios;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JMenu menuRegistro;
    public static javax.swing.JMenu menuSeguridad;
    // End of variables declaration//GEN-END:variables
}
