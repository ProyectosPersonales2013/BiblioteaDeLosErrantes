/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import Clases.Conexiones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static ventanas.Login.Username;

/**
 *
 * @author MINEDUCYT
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {

        initComponents();
        try {
            String titulo;
            int ID;
            ID = (int) (Math.random() * 9);
            Connection cn = Conexiones.conexion();
            PreparedStatement pst = cn.prepareStatement(
                    "select frases from frase where ID = '" + ID + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                titulo = rs.getString("frases");
                setTitle(titulo);
            } else {
                setTitle("Bliblioteca de los Herrantes");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        setResizable(false);
        this.setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ImageIcon Lgo = new ImageIcon("src/images/libroslibres.png");
        Icon icono = new ImageIcon(Lgo.getImage().getScaledInstance(Logo.getWidth(),
                Logo.getHeight(), Image.SCALE_DEFAULT));

        Logo.setIcon(icono);
        this.repaint();

        ImageIcon foto = new ImageIcon("src/images/letras.png");
        Icon icon = new ImageIcon(foto.getImage().getScaledInstance(Text.getWidth(),
                Text.getHeight(), Image.SCALE_DEFAULT));

        Text.setIcon(icon);
        this.repaint();

        ImageIcon book = new ImageIcon("src/images/libros.png");
        Icon Icon = new ImageIcon(book.getImage().getScaledInstance(libros.getWidth(),
                libros.getHeight(), Image.SCALE_DEFAULT));

        libros.setIcon(Icon);
        this.repaint();

        ImageIcon wallpape = new ImageIcon("src/images/wallpaper.jpg");
        Icon fondo = new ImageIcon(wallpape.getImage().getScaledInstance(wallpaper.getWidth(),
                wallpaper.getHeight(), Image.SCALE_DEFAULT));

        wallpaper.setIcon(fondo);
        this.repaint();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(
                "images/icon.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Logo = new javax.swing.JLabel();
        libros = new javax.swing.JLabel();
        Text = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 70, 70));
        getContentPane().add(libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, 140));
        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 560, 180));

        jButton1.setText("Registrarse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 180, 50));

        jButton2.setText("Iniciar Seción");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 180, 50));
        getContentPane().add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Register().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel libros;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}