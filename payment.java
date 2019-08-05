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

public class payment extends javax.swing.JFrame {

    public payment() {
        initComponents();
       String s="Select pack_name from package";
      // String sa="Select daily_price,monthly_price,3 month from package";
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
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        updateinfo = new javax.swing.JButton();
        display = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        dur = new javax.swing.JComboBox<>();
        bal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        pack = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("<<");
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, 40));

        updateinfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateinfo.setText("Update info");
        updateinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateinfoActionPerformed(evt);
            }
        });
        jPanel1.add(updateinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 170, 40));

        display.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        display.setText("Display");
        display.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 70, 130, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, 60));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 200, 30));

        dur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Monthly", "3 Month", "6 Month" }));
        dur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                durMouseReleased(evt);
            }
        });
        dur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durActionPerformed(evt);
            }
        });
        jPanel1.add(dur, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 110, 40));

        bal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bal.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 130, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Account no");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 200, 30));

        pack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packActionPerformed(evt);
            }
        });
        jPanel1.add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 250, 200, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Fee");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Package");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\gettyimages-863848724-2048x2048.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        jMenu1.setText("Options");

        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-home-50.png")); // NOI18N
        jMenuItem6.setText("Home");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-file-50.png")); // NOI18N
        jMenuItem1.setText("Display");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-delete-50.png")); // NOI18N
        jMenuItem2.setText("Delete");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-box-50.png")); // NOI18N
        jMenuItem7.setText("Equipment");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-synchronize-50.png")); // NOI18N
        jMenuItem8.setText("Trainer");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-about-50.png")); // NOI18N
        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-info-50.png")); // NOI18N
        jMenuItem4.setText("Help");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-delete-50.png")); // NOI18N
        jMenuItem5.setText("Log Out");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        try {
            new display().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
        }
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
new menu().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            new display().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
        }
  dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        try {
            new display().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
        }
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            new equipment().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
        }
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
new login().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new menu().setVisible(true);
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

    private void updateinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateinfoActionPerformed

        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
        String ids=id.getText();
        String a=(String) dur.getSelectedItem();
        String d=(String) pack.getSelectedItem();
        String b = null;
        String day=dtf.format(localDate);
          String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
       
       Connection  conn=null;
       
        try {
            
             conn=DriverManager.getConnection(con,uname,pass); 
            Statement st=conn.createStatement();
            
            st.executeUpdate("INSERT INTO payment "+ "VALUES('"+day+"','"+ids+"','"+d+"','"+a+"')");
            JOptionPane.showMessageDialog(null, "added","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
               st.close();
               conn.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_updateinfoActionPerformed

    private void durMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_durMouseReleased
   
        // TODO add your handling code here:
    }//GEN-LAST:event_durMouseReleased

    private void packActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        new About().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel bal;
    private javax.swing.JButton display;
    private javax.swing.JComboBox<String> dur;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> pack;
    private javax.swing.JButton updateinfo;
    // End of variables declaration//GEN-END:variables
}
