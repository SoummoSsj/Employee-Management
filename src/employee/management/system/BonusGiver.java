/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee.management.system;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Asus
 */
public class BonusGiver extends javax.swing.JFrame {

    /**
     * Creates new form BonusGiver
     */
    public BonusGiver() {
        initComponents();
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
        id = new javax.swing.JTextField();
        bonus1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bonusset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        id.setBackground(new java.awt.Color(255, 204, 255));
        id.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(153, 153, 153));
        id.setText("Enter ID");
        id.setToolTipText("Enter ID");
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });

        bonus1.setBackground(new java.awt.Color(255, 204, 255));
        bonus1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bonus1.setForeground(new java.awt.Color(0, 0, 0));
        bonus1.setToolTipText("");
        bonus1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bonus1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bonus1FocusLost(evt);
            }
        });
        bonus1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bonus1KeyPressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("To");

        bonusset.setBackground(new java.awt.Color(51, 51, 51));
        bonusset.setForeground(new java.awt.Color(255, 255, 255));
        bonusset.setText("Set");
        bonusset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonussetActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Set Bonus :");

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
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bonus1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bonusset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bonus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bonusset))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
        // TODO add your handling code here:

        if(id.getText().equals("Enter ID"))
        {
            id.setText("");
            id.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_idFocusGained

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost
        // TODO add your handling code here:
        if(id.getText().equals(""))
        {
            id.setText("Enter ID");
            id.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_idFocusLost

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyCode()== KeyEvent.VK_ENTER))
        
                
        {
             int a=0,bs=0,cd=0;
      
         try
        {
           
    String b= bonus1.getText();
            String i=id.getText();
            java.sql.Connection c;
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","1907105");
            String sql= "update employee set Bonus='"+b+"'where id='"+i+"'";
            PreparedStatement st = c.prepareStatement(sql);
            st.executeUpdate();
             String ql= "select * from employee where id='"+i+"'";
          PreparedStatement t=c.prepareStatement(ql);
          //t.setString(1, id.getText());
        
        ResultSet rs =t.executeQuery();
        while(rs.next())
        {
          
            a=rs.getInt(15);
            bs=rs.getInt(16);
            
             cd=a+bs;
            String ssql= "update employee set AnnualSal='"+cd+"'where id='"+i+"'";
            PreparedStatement sst = c.prepareStatement(ssql);
            sst.executeUpdate();
        }
            
            

           JOptionPane.showMessageDialog(this, "Bonus successfully set!!");

            
            c.close();

    }                                    
catch(SQLException ex)
    { //Logger.getLogger(employee.class.getName()).log(Level.SEVERE,null,ex);
    JOptionPane.showMessageDialog(null,ex);
    }    
    }//GEN-LAST:event_idKeyPressed
   
        } 


    private void bonus1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bonus1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_bonus1FocusGained

    private void bonus1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bonus1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_bonus1FocusLost

    private void bonus1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bonus1KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()== KeyEvent.VK_ENTER)
         {
             id.requestFocus();
         }
    }//GEN-LAST:event_bonus1KeyPressed

    private void bonussetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonussetActionPerformed
        // TODO add your handling code here:
         int a=0,bs=0,cd=0;
      
         try
        {
           
    String b= bonus1.getText();
            String i=id.getText();
            java.sql.Connection c;
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","1907105");
            String sql= "update employee set Bonus='"+b+"'where id='"+i+"'";
            PreparedStatement st = c.prepareStatement(sql);
            st.executeUpdate();
             String ql= "select * from employee where id='"+i+"'";
          PreparedStatement t=c.prepareStatement(ql);
          //t.setString(1, id.getText());
        
        ResultSet rs =t.executeQuery();
        while(rs.next())
        {
          
            a=rs.getInt(15);
            bs=rs.getInt(16);
            
             cd=a+bs;
            String ssql= "update employee set AnnualSal='"+cd+"'where id='"+i+"'";
            PreparedStatement sst = c.prepareStatement(ssql);
            sst.executeUpdate();
        }
            
            

           JOptionPane.showMessageDialog(this, "Bonus successfully set!!");

            
            c.close();

    }                                    
catch(SQLException ex)
    { //Logger.getLogger(employee.class.getName()).log(Level.SEVERE,null,ex);
    JOptionPane.showMessageDialog(null,ex);
    }    
    }//GEN-LAST:event_bonussetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new member().setVisible(true);
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
            java.util.logging.Logger.getLogger(BonusGiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BonusGiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BonusGiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BonusGiver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BonusGiver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bonus1;
    private javax.swing.JButton bonusset;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}