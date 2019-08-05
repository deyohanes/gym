package gyma;

import static gyma.cusex.validate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.*;

public class signup extends JFrame {

    public signup() {
        initComponents();
    }

    public boolean check() {
        if (id.getText() == null) {
            return false;
        } else {
            return true;

        }
    }

    ;
    private static java.sql.Date getCurrentDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conpan = new javax.swing.JPanel();
        signUPt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        weightlabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        last = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        sex = new javax.swing.JComboBox<>();
        signupb = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        nopeid = new javax.swing.JLabel();
        nopename = new javax.swing.JLabel();
        nopeaccount2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lastn = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        address = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lcont = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GYM MANEGMENT SYSYEM");
        setBounds(new java.awt.Rectangle(200, 100, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        conpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signUPt.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        signUPt.setForeground(new java.awt.Color(153, 153, 153));
        signUPt.setText("Sign Up");
        conpan.add(signUPt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 160, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Last Name");
        conpan.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 120, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("sex");
        conpan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 100, 40));

        weightlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        weightlabel.setForeground(new java.awt.Color(204, 204, 204));
        weightlabel.setText("weight");
        conpan.add(weightlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 100, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Height");
        conpan.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 100, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("phone No.");
        conpan.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 100, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("ID");
        conpan.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 40, 40));

        weight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });
        conpan.add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 170, 30));

        last.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });
        last.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastKeyTyped(evt);
            }
        });
        conpan.add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 170, 30));

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
        conpan.add(phoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 170, 30));

        name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        conpan.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 170, 30));

        sex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        conpan.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, 30));

        signupb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signupb.setForeground(new java.awt.Color(255, 51, 51));
        signupb.setText("Save info");
        signupb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbActionPerformed(evt);
            }
        });
        conpan.add(signupb, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 590, 230, 60));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        conpan.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 170, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("First Name");
        conpan.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 100, 40));

        height.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });
        conpan.add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 170, 30));

        nopeid.setForeground(new java.awt.Color(255, 0, 0));
        conpan.add(nopeid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 130, 20));

        nopename.setForeground(new java.awt.Color(255, 0, 0));
        conpan.add(nopename, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 130, 20));

        nopeaccount2.setForeground(new java.awt.Color(255, 0, 0));
        conpan.add(nopeaccount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, 130, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("<<");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        conpan.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 40, -1, -1));

        lastn.setForeground(new java.awt.Color(255, 51, 51));
        conpan.add(lastn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 100, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Password");
        conpan.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, 100, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Address");
        conpan.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 100, 40));

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        conpan.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 330, 170, 30));

        address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        conpan.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login Info");
        conpan.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 110, 30));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        conpan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 440, 230));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText(">>");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        conpan.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 510, 70, 130));

        lcont.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\pick.jpg")); // NOI18N
        conpan.add(lcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        getContentPane().add(conpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        getAccessibleContext().setAccessibleName("Sign Up");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        // TODO add your handling code here:
        nopeid.setText("");
    }//GEN-LAST:event_idKeyReleased

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        // TODO add your handling code here:
        nopename.setText("");
    }//GEN-LAST:event_nameKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new login().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void signupbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbActionPerformed

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("YYYY/MM/D");
        String dat = dtf.format(localDate);
        String ids = id.getText();
        String na = name.getText();
        String lasta = last.getText();
        na.concat(lasta);
        String se = (String) sex.getSelectedItem();
        Double h = Double.parseDouble(height.getText());
        Double w = Double.parseDouble(weight.getText());
        int p = Integer.parseInt(phoneno.getText());
        String ad = address.getText();
        //String usrname=username.getText();
        String passwd = password.getText();
        Double BMI = w / (h * h);
        String bl = "None";
        String em = "None";
        int em_no = 0;
        String his = "None";
        //String checki=checkin.getText();
        String Stat = null;
        if (BMI <= 18.0) {
            Stat = "Underweight";
        } else if (BMI >= 26.0) {
            Stat = "Overweight";
        } else if (BMI >= 18.0 || BMI <= 25.0) {
            Stat = "Normal";
        }
        
        try {
          
            
        } catch (Exception ex) {
        }

        String uname = "root";
        String pass = "jobs";
        String con = "jdbc:Mysql://localhost:3306/gym";
        Connection conn = null;

        try {

            conn = DriverManager.getConnection(con, uname, pass);
            Statement stmt2 = (Statement) conn.createStatement();
            Statement stmt = (Statement) conn.createStatement();

            stmt.executeUpdate("INSERT INTO `gym`.`member`" + "VALUES('" + ids + "' , '" + na + "','" + se + "','" + w + "','" + h + "','" + p + "','" + ad + "','" + BMI + "','" + Stat + "','" + dat + "','" + bl + "','" + em + "','" + em_no + "','" + his + "')");
            stmt2.executeUpdate("INSERT INTO `gym`.`logininfo` " + "VALUES('" + ids + "' , '" + ids + "','" + passwd + "')");

            /* PreparedStatement my =conn.prepareStatement("INSERT INTO member  VALUES(?,?,?,?,?,?,?,?,?)");
            my.setString(1, ids);
            my.setString(2, na);
            my.setString(3, se);
            my.setDouble(4, w);
            my.setDouble(5, h);
            my.setInt(6, p);
            my.setString(7, ad); 
            my.setDouble(8, BMI);
             my.setString(9, Stat);
           // my.setString(10, dat);
            my.executeQuery();*/
 /*Statement stmt=(Statement) conn.createStatement();
            
             */  // stmt.executeUpdate("INSERT INTO member     "+  "VALUES('"+ids+"' , '"+na+"','"+se+"','"+w+"','"+h+"','"+p+"','"+ad+"','"+BMI+"','"+Stat+"')");
            JOptionPane.showMessageDialog(null, "info added successfully", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);

            conn.close();
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "error", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }

        //          display a=new display();
        // TODO add your handling code here:
    }//GEN-LAST:event_signupbActionPerformed

    private void phonenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenoKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoKeyTyped

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyTyped

    private void lastKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastKeyTyped

        // TODO add your handling code here:
    }//GEN-LAST:event_lastKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new program().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[])  throws ex{

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JPanel conpan;
    private javax.swing.JTextField height;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField last;
    private javax.swing.JLabel lastn;
    private javax.swing.JLabel lcont;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nopeaccount2;
    private javax.swing.JLabel nopeid;
    private javax.swing.JLabel nopename;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneno;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JLabel signUPt;
    private javax.swing.JButton signupb;
    private javax.swing.JTextField weight;
    private javax.swing.JLabel weightlabel;
    // End of variables declaration//GEN-END:variables
}
