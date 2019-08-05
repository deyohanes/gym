/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class addex extends javax.swing.JFrame {

    /**
     * Creates new form addex
     */
    private String id;
    public addex(String id) {
        initComponents();
        this.id=id;
          String s="Select pack_name from package";
    
       String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
       Connection  conn=null;
        try {
             conn=DriverManager.getConnection(con,uname,pass);
            Statement st=conn.createStatement();
            ResultSet rs1 = st.executeQuery(s);
             while ((rs1.next())) {
                pack.addItem(rs1.getString(1));  
               
               }
               st.close();
               rs1.close(); 
               conn.close();
            
        } catch (Exception e) {
        }
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
            Logger.getLogger(addex.class.getName()).log(Level.SEVERE, null,e);
            JOptionPane.showMessageDialog(null, "Error!");
            return null;
             } 
            }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        account = new javax.swing.JTextField();
        bal = new javax.swing.JLabel();
        ac = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        dur = new javax.swing.JComboBox<>();
        fe = new javax.swing.JLabel();
        dis = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad = new javax.swing.JLabel();
        pack = new javax.swing.JComboBox<>();
        pc = new javax.swing.JLabel();
        join = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        ch = new javax.swing.JComboBox<>();
        con = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 260, 40));

        bal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bal.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 200, 40));

        ac.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ac.setText("Account no.");
        jPanel1.add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 150, 40));

        back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("<<");
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 40, 110, 40));

        dur.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Monthly", "3 Month", "6 Month" }));
        dur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durActionPerformed(evt);
            }
        });
        jPanel1.add(dur, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 150, 40));

        fe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fe.setText("Fee");
        jPanel1.add(fe, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 50, 40));

        dis.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        dis.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 150, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("choose Action");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 180, 40));

        ad.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ad.setText("JOIN");
        jPanel1.add(ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 250, 120));

        pack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 250, 40));

        pc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pc.setText("Package");
        jPanel1.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 160, 40));

        join.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        join.setText("JOIN");
        join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinActionPerformed(evt);
            }
        });
        jPanel1.add(join, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 170, 50));

        cancel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 170, 50));

        ch.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Join", "Cancel" }));
        ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chActionPerformed(evt);
            }
        });
        jPanel1.add(ch, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 270, 40));

        con.setForeground(new java.awt.Color(255, 255, 255));
        con.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\FootFall.png")); // NOI18N
        jPanel1.add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new user(id).setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void durActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durActionPerformed
    
          String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
         Connection  conn=null;
        String a=(String) dur.getSelectedItem();
        String b=(String) pack.getSelectedItem();
        
        if(a.equals("Daily")){
             try {
             conn=DriverManager.getConnection(con,uname,pass);
            Statement st=conn.createStatement();
            ResultSet rs1 = st.executeQuery("select daily_price from package where pack_name='"+b+"' ");
             while ((rs1.next())) {
                bal.setText(rs1.getString(1));  
               }
               st.close();
               rs1.close(); 
               conn.close();
           
        } catch (Exception e) {
        }
   
       }else if(a.equals("Monthly")){
                try {
             conn=DriverManager.getConnection(con,uname,pass);
            Statement st=conn.createStatement();
            ResultSet rs1 = st.executeQuery("select monthly_price from package where pack_name='"+b+"' ");
             while ((rs1.next())) {
                bal.setText(rs1.getString(1));  
               }
               st.close();
               rs1.close(); 
               conn.close();
            
        } catch (Exception e) {
        }
            }
       else if(a.equals("3 Month")){
                   try {
             conn=DriverManager.getConnection(con,uname,pass);
            Statement st=conn.createStatement();
            ResultSet rs1 = st.executeQuery("select 3_month_price from package where pack_name='"+b+"' ");
             while ((rs1.next())) {
                bal.setText(rs1.getString(1));  
               }
               st.close();
               rs1.close(); 
               conn.close();
            
        } catch (Exception e) {
        } }
       else if(a.equals("6 Month")){
                  try {
             conn=DriverManager.getConnection(con,uname,pass);
            Statement st=conn.createStatement();
            ResultSet rs1 = st.executeQuery("select 6_month_price from package where pack_name='"+b+"' ");
             while ((rs1.next())) {
                bal.setText(rs1.getString(1));  
               }
               st.close();
               rs1.close(); 
               conn.close();
            
        } catch (Exception e) {
        } }
        // TODO add your handling code here:
    }//GEN-LAST:event_durActionPerformed

    private void joinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinActionPerformed

        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
        String day=dtf.format(localDate);
          // String ids=id.getText();
        String a=(String) dur.getSelectedItem();
        String d=(String) pack.getSelectedItem();
       
        
          String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
       
       Connection  conn=null;
       
        try {
            
             conn=DriverManager.getConnection(con,uname,pass); 
            Statement st=conn.createStatement();
            
            st.executeUpdate("INSERT INTO payment "+ "VALUES('"+day+"','"+id+"','"+d+"','"+a+"')");
            JOptionPane.showMessageDialog(null, "added","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
               st.close();
               conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_joinActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

            String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
         Connection  conn=null;
        String a=(String) dur.getSelectedItem();
        String b=(String) pack.getSelectedItem();
        try {
             conn=DriverManager.getConnection(con,uname,pass);
            Statement st=conn.createStatement();
            st.executeUpdate("Delete from payment where cust_id='"+id+"' ");
            JOptionPane.showMessageDialog(null, "Canceled","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
             
               st.close();
              
               conn.close();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chActionPerformed

        String z=(String) ch.getSelectedItem();
        if(z.equals("Join")){
            ad.setText("Join");
            ac.setVisible(true);
            account.setVisible(true);
            fe.setVisible(true);
            dur.setVisible(true);
            bal.setVisible(true);
            join.setVisible(true);
            cancel.setVisible(false);
        }
        else if(z.equals("Cancel")){
            ad.setText("Cancel");
            ac.setVisible(false);
            account.setVisible(false);
            fe.setVisible(false);
            dur.setVisible(false);
            bal.setVisible(false);
            join.setVisible(false);
            cancel.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_chActionPerformed

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
            java.util.logging.Logger.getLogger(addex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addex("none").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ac;
    private javax.swing.JTextField account;
    private javax.swing.JLabel ad;
    private javax.swing.JButton back;
    private javax.swing.JLabel bal;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> ch;
    private javax.swing.JLabel con;
    private javax.swing.JLabel dis;
    private javax.swing.JComboBox<String> dur;
    private javax.swing.JLabel fe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton join;
    private javax.swing.JComboBox<String> pack;
    private javax.swing.JLabel pc;
    // End of variables declaration//GEN-END:variables
}
