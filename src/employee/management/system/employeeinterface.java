/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee.management.system;

/**
 *
 * @author Asus
 */
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class employeeinterface extends javax.swing.JFrame {
        public static String userid;

    /**
     * Creates new form employeeinterface
     */
    public employeeinterface() {
        initComponents();
        
    }
     public employeeinterface(String id) {
        initComponents();
        userid=id;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        view1 = new javax.swing.JButton();
        cpass = new javax.swing.JButton();
        srch1 = new javax.swing.JButton();
        logout1 = new javax.swing.JButton();
        srch2 = new javax.swing.JButton();
        view2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tarea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/icons8-home-50 (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");

        home.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.setContentAreaFilled(false);
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        view1.setBackground(new java.awt.Color(255, 255, 255));
        view1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        view1.setForeground(new java.awt.Color(255, 255, 255));
        view1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/view.png"))); // NOI18N
        view1.setText("   Personal Info");
        view1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        view1.setBorderPainted(false);
        view1.setContentAreaFilled(false);
        view1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view1ActionPerformed(evt);
            }
        });

        cpass.setBackground(new java.awt.Color(255, 255, 255));
        cpass.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        cpass.setForeground(new java.awt.Color(255, 255, 255));
        cpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/icons8-password-key-26.png"))); // NOI18N
        cpass.setText("    Change Password");
        cpass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cpass.setBorderPainted(false);
        cpass.setContentAreaFilled(false);
        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });

        srch1.setBackground(new java.awt.Color(255, 255, 255));
        srch1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        srch1.setForeground(new java.awt.Color(255, 255, 255));
        srch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/search.png"))); // NOI18N
        srch1.setText("View Tasks");
        srch1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        srch1.setBorderPainted(false);
        srch1.setContentAreaFilled(false);
        srch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srch1ActionPerformed(evt);
            }
        });

        logout1.setBackground(new java.awt.Color(255, 255, 255));
        logout1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        logout1.setForeground(new java.awt.Color(255, 255, 255));
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/lgout.png"))); // NOI18N
        logout1.setText("    Logout");
        logout1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout1.setBorderPainted(false);
        logout1.setContentAreaFilled(false);
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        srch2.setBackground(new java.awt.Color(255, 255, 255));
        srch2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        srch2.setForeground(new java.awt.Color(255, 255, 255));
        srch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/icons8-checkmark-24.png"))); // NOI18N
        srch2.setText("Give Attendace");
        srch2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        srch2.setBorderPainted(false);
        srch2.setContentAreaFilled(false);
        srch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srch2ActionPerformed(evt);
            }
        });

        view2.setBackground(new java.awt.Color(255, 255, 255));
        view2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        view2.setForeground(new java.awt.Color(255, 255, 255));
        view2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/update.png"))); // NOI18N
        view2.setText("Update");
        view2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102), new java.awt.Color(0, 0, 102)));
        view2.setBorderPainted(false);
        view2.setContentAreaFilled(false);
        view2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srch1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(view1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(logout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(view2, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(srch2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(view1)
                .addGap(34, 34, 34)
                .addComponent(view2)
                .addGap(38, 38, 38)
                .addComponent(srch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(srch2)
                .addGap(33, 33, 33)
                .addComponent(cpass)
                .addGap(23, 23, 23)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Print or Save as Pdf");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2jButton1ActionPerformed(evt);
            }
        });

        tarea.setColumns(20);
        tarea.setRows(5);
        jScrollPane1.setViewportView(tarea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Pristina", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Write down and print/save as pdf");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/icons8-multiply-24.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 292, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new member().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void view1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view1ActionPerformed
        // TODO add your handling code here:
       
        new viewown(userid).setVisible(true);
    }//GEN-LAST:event_view1ActionPerformed

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        // TODO add your handling code here:
        
   new mempasschnge2(userid).setVisible(true);
    }//GEN-LAST:event_cpassActionPerformed

    private void srch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srch1ActionPerformed
        // TODO add your handling code here:
       
        new viewtask(userid).setVisible(true);
    }//GEN-LAST:event_srch1ActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new choice().setVisible(true);
    }//GEN-LAST:event_logout1ActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jButton2jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2jButton1ActionPerformed
        // TODO add your handling code here:
        printRecord(tarea);
    }//GEN-LAST:event_jButton2jButton1ActionPerformed

    private void srch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srch2ActionPerformed
        // TODO add your handling code here:
      
        new stattendance(userid).setVisible(true);
    }//GEN-LAST:event_srch2ActionPerformed

    private void view2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view2ActionPerformed
        // TODO add your handling code here:
      
        new updatemployee(userid).setVisible(true);
    }//GEN-LAST:event_view2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       System.exit(0);
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
            java.util.logging.Logger.getLogger(employeeinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeinterface(userid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cpass;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton logout1;
    private javax.swing.JButton srch1;
    private javax.swing.JButton srch2;
    private javax.swing.JTextArea tarea;
    private javax.swing.JButton view1;
    private javax.swing.JButton view2;
    // End of variables declaration//GEN-END:variables
private void printRecord(JTextArea t1)
{
    PrinterJob printerJob=PrinterJob.getPrinterJob();
    printerJob.setJobName("Print");
    printerJob.setPrintable(new Printable()
    {
        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException
        {
           if(pageIndex >0)
           {
               return Printable.NO_SUCH_PAGE;
           }
           Graphics2D graphics2D=(Graphics2D)graphics;
           graphics2D.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
           graphics2D.scale(0.5,1);
           t1.paint(graphics2D);
           return Printable.PAGE_EXISTS;
        }
    }
    );
  boolean r=printerJob.printDialog();
  if(r)
  {
      try{
          printerJob.print();
      }
      catch(PrinterException printerException)
      {
          JOptionPane.showMessageDialog(this,"Printer Error: "+ printerException.getMessage());
      }
  }}
}