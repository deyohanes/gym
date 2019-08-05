/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyma;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JOBS
 */
public class manemp extends javax.swing.JFrame {

    /**
     * Creates new form manemp
     */
    public manemp() {
        initComponents();
    }
private Connection getConnection() throws ClassNotFoundException {
                
               Connection con = null;
                
      Class.forName("com.mysql.cj.jdbc.Driver");
          try{
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","jobs");
            JOptionPane.showMessageDialog(null, "Connected","MESSAGE", JOptionPane.INFORMATION_MESSAGE); 
            return con;
            }
             catch(SQLException e){
            Logger.getLogger(manemp.class.getName()).log(Level.SEVERE, null,e);
            JOptionPane.showMessageDialog(null, "Error!");
            return null;
             } 
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        rid = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        shift = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        con = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Sex");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Work.type");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 130, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Add Trainer");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 260, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 60, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("Manage");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 210, -1));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 210, 30));

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 210, 30));

        rid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(rid, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 400, 180, 40));

        sex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 130, 30));

        add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 150, 40));

        remove.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 0, 51));
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, -1, -1));

        type.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Shift" }));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 120, 30));

        shift.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        shift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Shift 1", "Shift 2" }));
        jPanel1.add(shift, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 110, 30));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 200, 30));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 430, 330));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Remove Trainer");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 280, -1));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 540, 610));

        con.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\fitness-1882721_1280.jpg")); // NOI18N
        con.setToolTipText("");
        jPanel1.add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1300, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new manegemp().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
        String dat=dtf.format(localDate);
        String ids=id.getText();
       String na=name.getText();
       String se=(String) sex.getSelectedItem();
      // String e=(String)ex.getSelectedItem();
       //String w=(String) type.getSelectedItem();
       String s=(String) shift.getSelectedItem();
      // String u=username.getText();
       String p=password.getText();
       String uname="root";
       String pass="jobs";
        
       String con="jdbc:Mysql://localhost:3306/gym";
       Connection conn = null;        
           
        try {
            
            conn=DriverManager.getConnection(con,uname,pass);
            Statement stmt=(Statement) conn.createStatement();
            Statement stmt2=(Statement) conn.createStatement();   
             stmt.executeUpdate("INSERT INTO `gym`.`trainer` "+ "values('"+ids+"', '"+na+"', '"+se+"', '"+dat+"','"+s+"')");
            stmt2.executeUpdate("INSERT INTO `gym`.`logininfo` "+ "VALUES('"+ids+"','"+ids+"','"+p+"')");
            JOptionPane.showMessageDialog(null, " added successfully","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException  ex) {
            JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed

        String id =rid.getText();
        String con="jdbc:Mysql://localhost:3306/gym";
       Connection conn = null;   
        
        String uname="root";
       String pass="jobs";
        try {
           
            conn=DriverManager.getConnection(con,uname,pass);
            Statement stmt=(Statement) conn.createStatement();
           
            stmt.executeUpdate("DELETE FROM `gym`.`trainer` WHERE (`trainer_id` = '"+id+"');");
       
            JOptionPane.showMessageDialog(null, "Deleted successfully","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(manemp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(manemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manemp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel con;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton remove;
    private javax.swing.JTextField rid;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JComboBox<String> shift;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
