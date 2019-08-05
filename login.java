
package gyma;

import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    public boolean check(){
        if(fpass.getText()==null || fuser.getText()==null){
            JOptionPane.showMessageDialog(null, "Empty! Enter Someting","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }
    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sign = new javax.swing.JLabel();
        tuser = new javax.swing.JLabel();
        eruser = new javax.swing.JLabel();
        fuser = new javax.swing.JTextField();
        tpass = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        signin = new javax.swing.JButton();
        back = new javax.swing.JButton();
        erpass = new javax.swing.JLabel();
        fpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        gym = new javax.swing.JLabel();
        foooo = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sign.setBackground(new java.awt.Color(204, 204, 204));
        sign.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        sign.setForeground(new java.awt.Color(204, 204, 204));
        sign.setText("Sign In");
        jPanel1.add(sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 200, 80));

        tuser.setBackground(new java.awt.Color(0, 0, 0));
        tuser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tuser.setForeground(new java.awt.Color(255, 0, 51));
        tuser.setText("username");
        jPanel1.add(tuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 100, 30));

        eruser.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(eruser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 180, 20));

        fuser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fuserKeyReleased(evt);
            }
        });
        jPanel1.add(fuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 260, 40));

        tpass.setBackground(new java.awt.Color(204, 204, 204));
        tpass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tpass.setForeground(new java.awt.Color(255, 51, 51));
        tpass.setText("pasword");
        jPanel1.add(tpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 90, 30));

        signup.setBackground(new java.awt.Color(0, 0, 0));
        signup.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Member");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 140, 40));

        signin.setBackground(new java.awt.Color(0, 0, 0));
        signin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        signin.setForeground(new java.awt.Color(255, 51, 51));
        signin.setText("Sign In");
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        jPanel1.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 260, 40));

        back.setBackground(new java.awt.Color(51, 51, 51));
        back.setForeground(new java.awt.Color(204, 204, 204));
        back.setText("<<");
        back.setContentAreaFilled(false);
        back.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backMouseDragged(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 100, 30));
        jPanel1.add(erpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 170, 20));

        fpass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fpassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fpassKeyTyped(evt);
            }
        });
        jPanel1.add(fpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 260, 40));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Powerd By CSE section 1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 660, 130, 20));

        gym.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        gym.setForeground(new java.awt.Color(204, 204, 204));
        gym.setText("GYM MANAGEMENT SYSTEM");
        jPanel1.add(gym, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 690, 110));

        foooo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        foooo.setForeground(new java.awt.Color(255, 51, 51));
        foooo.setText("For Admins , Employees And Users");
        jPanel1.add(foooo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 420, 60));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Create Account");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 170, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Version 1.0");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1153, 680, 110, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Linux(34).jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1300, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
                String uname =fuser.getText();
                String password =fpass.getText();
                  if(fuser.getText().trim().isEmpty()||fpass.getText().trim().isEmpty() ){
                           eruser.setText("Enter an ID");
                            erpass.setText("Enter a name");
           
                               }
                         else if(fuser.getText().trim().isEmpty()){
                               eruser.setText("Enter a username"); 
                                 }
                         else if(fpass.getText().trim().isEmpty()){
                             erpass.setText("Enter a password");
                                   }
                         else if(fuser.getText().equals("jobs") || fpass.getText().equals("jobs")){
                                    new menu().setVisible(true);
                                    dispose();
                                    }
                         else{
                             JOptionPane.showMessageDialog(null, "Check your password or username","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                         }

    }//GEN-LAST:event_signinActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
               new userlogin().setVisible(true);
               dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_signupActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
              new gym().setVisible(true);
              dispose();
       
    }//GEN-LAST:event_backActionPerformed

    private void fuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fuserKeyReleased
                    eruser.setText("");
        
    }//GEN-LAST:event_fuserKeyReleased

    private void fpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fpassKeyTyped
        // TODO add your handling code here:
   
    }//GEN-LAST:event_fpassKeyTyped

    private void fpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fpassKeyReleased
            erpass.setText("");
        
    }//GEN-LAST:event_fpassKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new signup().setVisible(true);
dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseDragged
    // TODO add your handling code here:
    }//GEN-LAST:event_backMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     new About().setVisible(true);  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel erpass;
    private javax.swing.JLabel eruser;
    private javax.swing.JLabel foooo;
    private javax.swing.JPasswordField fpass;
    private javax.swing.JTextField fuser;
    private javax.swing.JLabel gym;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sign;
    private javax.swing.JButton signin;
    private javax.swing.JButton signup;
    private javax.swing.JLabel tpass;
    private javax.swing.JLabel tuser;
    // End of variables declaration//GEN-END:variables
}
