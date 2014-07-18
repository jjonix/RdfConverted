/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.ConexionSGBD;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.omg.CORBA.Bounds;

/**
 *
 * @author JohnJairo
 */
public class Capa2 extends javax.swing.JFrame {

    /**
     * Creates new form Capa2
     */
    public Capa2() {
        initComponents();
        jl_ImgCorrecto.setVisible(false);
        jl_ImgError.setVisible(false);
        jb_Continuar1.setEnabled(false);
        jcb_SeleccionarBD.setEnabled(false);
    }
    ConexionSGBD conSGBD = new ConexionSGBD();
    Connection con;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtf_UsuarioBD = new javax.swing.JTextField();
        jpf_ClaveBD = new javax.swing.JPasswordField();
        jb_Conectar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcb_SeleccionarBD = new javax.swing.JComboBox();
        jb_Continuar1 = new javax.swing.JButton();
        jb_Salir1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jl_ImgError = new javax.swing.JLabel();
        jl_ImgCorrecto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcb_Sgbd = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jtf_Host = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtf_Puerto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtf_Sid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conexión a Base de Datos");
        setResizable(false);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Conectar a  Base de Datos");

        jpf_ClaveBD.setText("jPasswordField1");
        jpf_ClaveBD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpf_ClaveBDFocusGained(evt);
            }
        });

        jb_Conectar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cog_go.png"))); // NOI18N
        jb_Conectar1.setText("Conectar");
        jb_Conectar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Conectar1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccione la BD:");

        jcb_SeleccionarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_SeleccionarBDActionPerformed(evt);
            }
        });

        jb_Continuar1.setText("Continuar");
        jb_Continuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Continuar1ActionPerformed(evt);
            }
        });

        jb_Salir1.setText("Salir");
        jb_Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_Salir1ActionPerformed(evt);
            }
        });

        jl_ImgError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N

        jl_ImgCorrecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/accept.png"))); // NOI18N

        jLabel5.setText("SGBD:");

        jcb_Sgbd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MySQL", "ORACLE" }));
        jcb_Sgbd.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_SgbdItemStateChanged(evt);
            }
        });

        jLabel6.setText("Host:");

        jtf_Host.setEditable(false);
        jtf_Host.setText("localhost");

        jLabel7.setText("Puerto:");

        jtf_Puerto.setEditable(false);
        jtf_Puerto.setText("1521");

        jLabel8.setText("SID:");

        jtf_Sid.setEditable(false);
        jtf_Sid.setText("xe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Continuar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Salir1)
                .addGap(2, 2, 2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jcb_SeleccionarBD, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpf_ClaveBD, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_UsuarioBD)
                            .addComponent(jcb_Sgbd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_Host, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Puerto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_Sid, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb_Conectar1)
                                .addGap(7, 32, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_ImgError, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jl_ImgCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcb_Sgbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_ImgCorrecto)
                            .addComponent(jl_ImgError))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Conectar1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtf_UsuarioBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jpf_ClaveBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jtf_Host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_Puerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_Sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcb_SeleccionarBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Continuar1)
                    .addComponent(jb_Salir1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_SeleccionarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_SeleccionarBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_SeleccionarBDActionPerformed

    private void jpf_ClaveBDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_ClaveBDFocusGained

        //Seleccionar todo el texto al hacer click
        jpf_ClaveBD.selectAll();

    }//GEN-LAST:event_jpf_ClaveBDFocusGained

    private void jb_Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Salir1ActionPerformed

        //Cerrar ventana
        this.dispose();


    }//GEN-LAST:event_jb_Salir1ActionPerformed

    private void jb_Conectar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Conectar1ActionPerformed

        String UsuarioDB = "";
        String ClaveDB = "";
        String HostDB = "";
        String PuertoDB = "";
        String SidDB = "";
        Boolean conexion = false;
        ArrayList db = new ArrayList();
        //Obtener datos ingresados
        UsuarioDB = jtf_UsuarioBD.getText();
        ClaveDB = jpf_ClaveBD.getText();
        HostDB = jtf_Host.getText();
        PuertoDB = jtf_Puerto.getText();
        SidDB = jtf_Sid.getText();
        //Ocultar imagenes correcto / Error
        jl_ImgCorrecto.setVisible(false);
        jl_ImgError.setVisible(false);
        if (jcb_Sgbd.getSelectedIndex() == 0) {
            conSGBD.setSGBD(0);
            conexion = conSGBD.crearConexionMySQL(UsuarioDB, ClaveDB);
            con = conSGBD.getConexionMySQL();
            jcb_SeleccionarBD.setEnabled(true);

        } else {
            conSGBD.setSGBD(1);
            conexion = conSGBD.crearConexionOracle(UsuarioDB, HostDB, PuertoDB, SidDB, ClaveDB);
            con = conSGBD.getConexionOracle();
            jcb_SeleccionarBD.setEnabled(false);
        }

        //Clases.ConexionMysql nuevo = new Clases.ConexionMysql();
        if (conexion) {
            jl_ImgCorrecto.setVisible(true);
            jb_Continuar1.setEnabled(true);
            if (conSGBD.getSGBD() == 0) {
                if (conSGBD.todasBD(con)) {
                    db = conSGBD.getTodasBD();
                    for (int i = 0; i < db.size(); i++) {
                        jcb_SeleccionarBD.addItem(db.get(i));
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error al cargar las Bases de Datos");
                }
            }

        } else {
            jl_ImgError.setVisible(true);
            JOptionPane.showMessageDialog(rootPane, "Error al conectar");

        }


    }//GEN-LAST:event_jb_Conectar1ActionPerformed

    private void jb_Continuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_Continuar1ActionPerformed

        if(conSGBD.getSGBD()==0){
            conSGBD.setBaseDatos(jcb_SeleccionarBD.getSelectedItem().toString());
        }
        //Seleccionara la  base de datos
        this.conSGBD.todasTablas();
        Clases.VariablesGlobales.conMySqlGlobal = this.conSGBD;
        //ir a seleccionar la tabla
        Interfaz.Capa3 tablas = new Capa3();
        this.dispose();
        tablas.setVisible(true);
    }//GEN-LAST:event_jb_Continuar1ActionPerformed

    private void jcb_SgbdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_SgbdItemStateChanged
        if (jcb_Sgbd.getSelectedIndex() == 0) {

            jtf_Host.setEditable(false);
            jtf_Puerto.setEditable(false);
            jtf_Sid.setEditable(false);
        } else {
            jtf_Host.setEditable(true);
            jtf_Puerto.setEditable(true);
            jtf_Sid.setEditable(true);
        }
    }//GEN-LAST:event_jcb_SgbdItemStateChanged

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
            java.util.logging.Logger.getLogger(Capa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capa2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JButton jb_Conectar1;
    private javax.swing.JButton jb_Continuar1;
    private javax.swing.JButton jb_Salir1;
    private javax.swing.JComboBox jcb_SeleccionarBD;
    private javax.swing.JComboBox jcb_Sgbd;
    private javax.swing.JLabel jl_ImgCorrecto;
    private javax.swing.JLabel jl_ImgError;
    private javax.swing.JPasswordField jpf_ClaveBD;
    private javax.swing.JTextField jtf_Host;
    private javax.swing.JTextField jtf_Puerto;
    private javax.swing.JTextField jtf_Sid;
    private javax.swing.JTextField jtf_UsuarioBD;
    // End of variables declaration//GEN-END:variables
}