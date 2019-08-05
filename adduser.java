package gyma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class adduser extends javax.swing.JFrame {

    public adduser() {
        initComponents();
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
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Package = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        accountno = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        pack = new javax.swing.JComboBox<>();
        dur = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        comp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD Member");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 200, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 110, 40));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 170, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Last Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Sex");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 50, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Height");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 70, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Weight");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 80, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Phone no.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 100, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Account No.");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 120, -1));

        Package.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Package.setForeground(new java.awt.Color(255, 255, 255));
        Package.setText("Package");
        jPanel1.add(Package, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 90, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Fee");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, 50, -1));

        bal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bal.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, 90, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("UserName");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 110, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("ID");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 50, -1));

        height.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });
        height.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heightKeyTyped(evt);
            }
        });
        jPanel1.add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 160, 30));

        weight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                weightKeyTyped(evt);
            }
        });
        jPanel1.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 160, 30));

        lastname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastnameKeyTyped(evt);
            }
        });
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 170, -1));

        accountno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        accountno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountnoKeyTyped(evt);
            }
        });
        jPanel1.add(accountno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 180, 170, -1));

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 160, -1));

        phoneno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });
        phoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonenoKeyTyped(evt);
            }
        });
        jPanel1.add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 160, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 170, 30));

        sex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Feamale" }));
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 100, 30));

        pack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packActionPerformed(evt);
            }
        });
        jPanel1.add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 250, 150, 30));

        dur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Monthly", "3 Month", "6 Month", "Full" }));
        dur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durActionPerformed(evt);
            }
        });
        jPanel1.add(dur, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 320, 150, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Password");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 110, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Address");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 80, -1));

        address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 160, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-home-50.png")); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 70, 40));

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 160, 30));

        comp.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\fit.jpg")); // NOI18N
        jPanel1.add(comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1310, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
String pac =(String) pack.getSelectedItem();
String a=(String) dur.getSelectedItem();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
           Date d = new Date();
       SimpleDateFormat format = new SimpleDateFormat("YYYY/MM/D");
        String dat=dtf.format(localDate);
        String ids=id.getText();
 String na=name.getText();
 String last=lastname.getText();
 na.concat(last);
 String se=(String) sex.getSelectedItem();
 Double h=Double.parseDouble(height.getText());
 Double w=Double.parseDouble(weight.getText()); 
 int p=Integer.parseInt(phoneno.getText()); 
 String ad=address.getText();
 String usrname=username.getText();
 String passwd=password.getText();
 String exer=(String) pack.getSelectedItem();
 String pa=(String) dur.getSelectedItem();
 Double BMI=w/(h*h);
  String bl="None";
        String em="None";
        int em_no=0;
        String his="None";
 String checkin="10/10/2019";
 String Stat = null;
 if(BMI<=18.0){
       Stat="Underweight";
 }else if(BMI >=18.0 ||BMI <= 26.0 ){
     Stat = "Normal";
 }else if(BMI>=26.0){
     Stat = "Overweight";
 }
 
       String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
       Connection  conn=null;
        try {
            
            conn=DriverManager.getConnection(con,uname,pass);
            Statement stmt=(Statement) conn.createStatement();
            Statement stmt2=(Statement) conn.createStatement();
            Statement stmt3=(Statement) conn.createStatement();
            
            //stmt2.executeUpdate("INSERT INTO logininfo  "+ "VALUES('"+ids+"' , '"+usrname+"','"+passwd+"')");
             
             stmt.executeUpdate("INSERT INTO `gym`.`member`"+ "VALUES('"+ids+"' , '"+na+"','"+se+"','"+w+"','"+h+"','"+p+"','"+ad+"','"+BMI+"','"+Stat+"','"+dat+"','"+bl+"','"+em+"','"+em_no+"','"+his+"')");
             stmt2.executeUpdate("INSERT INTO `gym`.`logininfo` "+ "VALUES('"+ids+"' , '"+ids+"','"+passwd+"')");
             stmt3.executeUpdate("INSERT INTO payment "+ "VALUES('"+dat+"','"+ids+"','"+pac+"','"+a+"')");
            JOptionPane.showMessageDialog(null, "info added successfully","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 new menu().setVisible(true);
 dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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

 else if(a.equals("Full")){
                  try {
             conn=DriverManager.getConnection(con,uname,pass);
            Statement st=conn.createStatement();
            ResultSet rs1 = st.executeQuery("select Full from package where pack_name='"+b+"' ");
             while ((rs1.next())) {
                bal.setText(rs1.getString(1));  
               }
               st.close();
               rs1.close(); 
               conn.close();
            
        } catch (Exception e) {
        } }        // TODO add your handling code here:
    }//GEN-LAST:event_durActionPerformed

    private void packActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_packActionPerformed

    private void heightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightKeyTyped

// TODO add your handling code here:
    }//GEN-LAST:event_heightKeyTyped

    private void phonenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenoKeyTyped
if (!Character.isDigit(evt.getKeyChar()))  {
    evt.consume();}
// TODO add your handling code here:
   
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoKeyTyped

    private void accountnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountnoKeyTyped
if (!Character.isDigit(evt.getKeyChar()))  {
    evt.consume();}// TODO add your handling code here:
   
        // TODO add your handling code here:
    }//GEN-LAST:event_accountnoKeyTyped

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed

      
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
if (!Character.isLetter(evt.getKeyChar()))  {
    evt.consume();}
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyTyped

    private void lastnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastnameKeyTyped

if (!Character.isLetter(evt.getKeyChar()))  {
    evt.consume();}        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameKeyTyped

    private void weightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_weightKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adduser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Package;
    private javax.swing.JTextField accountno;
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JLabel bal;
    private javax.swing.JLabel comp;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JComboBox<String> dur;
    private javax.swing.JTextField height;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> pack;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneno;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JTextField username;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
