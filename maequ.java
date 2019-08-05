/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JOBS
 */
public class maequ extends javax.swing.JFrame {

    /**
     * Creates new form maequ
     */
    public maequ() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        remove = new javax.swing.JButton();
        item_name = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        item_id = new javax.swing.JTextField();
        nof_item = new javax.swing.JTextField();
        rid = new javax.swing.JTextField();
        uno = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        us = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        con = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 540, 120, 40));

        item_name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(item_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 180, 30));

        add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 550, 130, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Item Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 150, 30));

        item_id.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(item_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 180, 30));

        nof_item.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(nof_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 180, 30));

        rid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(rid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 470, 180, 30));

        uno.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 180, 30));

        status.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 180, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Item Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 150, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NofItem");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item Id");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 110, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Update Item");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 190, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NofItem");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 110, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Item Id");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, 110, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Status");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 110, 40));
        jPanel1.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 180, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Status");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 110, 40));

        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 120, 40));

        us.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 180, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 102));
        jLabel11.setText("Remove Item");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, 190, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 102));
        jLabel12.setText("Add Item");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 150, 50));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("<<");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 50, -1, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 470, 470));

        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 380, 470));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 400, 470));

        con.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Dark_Ivy.jpg")); // NOI18N
        con.setText("con");
        con.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
      String id=rid.getText();
          String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
       Connection  conn=null;
        try {
            conn=DriverManager.getConnection(con,uname,pass);
            Statement stmt=(Statement) conn.createStatement();
           
            stmt.executeUpdate("DELETE FROM `gym`.`equipment` WHERE (`item_id` = '"+id+"')");
             JOptionPane.showMessageDialog(null, "Item Deleted successfully","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_removeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String id=uid.getText();
        int p=Integer.parseInt(uno.getText()); 
        String stat=us.getText();
        String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
              Connection  conn=null;
        try {
            conn=DriverManager.getConnection(con,uname,pass);
            Statement stmt=(Statement) conn.createStatement();
            stmt.executeUpdate("UPDATE equipment SET nof_item='"+p+"',status='"+stat+"' WHERE item_id ='"+id+"'"); 
            JOptionPane.showMessageDialog(null, "Update  successfully","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            new equipment().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(maequ.class.getName()).log(Level.SEVERE, null, ex);
        }
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       String id=item_id.getText();
       String name=item_name.getText();
       int no=Integer.parseInt(nof_item.getText());
       String sts=status.getText();
       String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
       Connection  conn=null;
        try {
            
            conn=DriverManager.getConnection(con,uname,pass);
            Statement stmt=(Statement) conn.createStatement();
            JOptionPane.showMessageDialog(null, "Item added successfully","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            //String insert ="INSERT INTO equipment "+ "VALUES('"+id+"','"+name+"','"+no+"','"+sts+"')";
            stmt.executeUpdate("INSERT INTO equipment "+ "VALUES('"+id+"','"+name+"','"+no+"','"+sts+"')");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
       
   
         
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(maequ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maequ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maequ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maequ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maequ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel con;
    private javax.swing.JTextField item_id;
    private javax.swing.JTextField item_name;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nof_item;
    private javax.swing.JButton remove;
    private javax.swing.JTextField rid;
    private javax.swing.JTextField status;
    private javax.swing.JTextField uid;
    private javax.swing.JTextField uno;
    private javax.swing.JButton update;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
