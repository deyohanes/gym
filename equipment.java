
package gyma;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class equipment extends javax.swing.JFrame {

    public equipment() throws ClassNotFoundException {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        back = new javax.swing.JButton();
        remove1 = new javax.swing.JButton();
        search = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "item_id", "item_name", "Nof_item", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setEditingRow(0);
        table.setRowSelectionAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 930, 370));

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-home-50.png")); // NOI18N
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        remove1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        remove1.setText("Man");
        remove1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remove1.setContentAreaFilled(false);
        remove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove1ActionPerformed(evt);
            }
        });
        jPanel1.add(remove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 130, 60));

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Maintainable", "Not Maintainable" }));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 210, 180, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\barbell-bodybuilding-effort-703016.jpg")); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, 1320, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\barbell-bodybuilding-effort-703016.jpg")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1300, 720));

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-plus-50.png")); // NOI18N
        jMenuItem1.setText("ADD User");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-contacts-50.png")); // NOI18N
        jMenuItem2.setText("Display");
        jMenu1.add(jMenuItem2);

        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-bookmark-50.png")); // NOI18N
        jMenuItem6.setText("Equpment");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-box-50.png")); // NOI18N
        jMenuItem7.setText("Employe's");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-support-50.png")); // NOI18N
        jMenuItem8.setText("Delete");
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

        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-info-50.png")); // NOI18N
        jMenuItem5.setText("Help");
        jMenu2.add(jMenuItem5);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-delete-50.png")); // NOI18N
        jMenuItem4.setText("Log Out");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
new menu().setVisible(true);
dispose();
        
    }//GEN-LAST:event_backActionPerformed

    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
new login().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
DefaultTableModel model = new DefaultTableModel(new String[]{"item_id", "item_name", "nof_item","status"}, 0);   
        String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
       Connection  conn=null;
     
       
       if(search.getSelectedItem().equals("All")){
            try {
              
        conn=DriverManager.getConnection(con,uname,pass);
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select * from equipment");
       while(rs.next()){
            String d = rs.getString("item_id");
            String e = rs.getString("item_name");
            String f = rs.getString("nof_item");
            String h = rs.getString("status");
            model.addRow(new Object[]{d, e, f,h});
       }
       table.setModel(model);
                 //JOptionPane.showMessageDialog(null, "connected","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                Logger.getLogger(equipment.class.getName()).log(Level.SEVERE, null, ex);
            }
           
       }else if(search.getSelectedItem().equals("Maintainable")){
            try {
                 conn=DriverManager.getConnection(con,uname,pass);
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select item_id,item_name,nof_item,status from equipment where status='Maintainable'");
       while(rs.next()){
           String d = rs.getString("item_id");
            String e = rs.getString("item_name");
            String f = rs.getString("nof_item");
            String h = rs.getString("status");
            model.addRow(new Object[]{d, e, f,h});
       }
       table.setModel(model);
                 
                 //JOptionPane.showMessageDialog(null, "connected","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                Logger.getLogger(equipment.class.getName()).log(Level.SEVERE, null, ex);
            }
               
       }else if(search.getSelectedItem().equals("Not Maintainable")){
            try {
                       
        conn=DriverManager.getConnection(con,uname,pass);
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select item_id,item_name,nof_item,status from equipment where status='Not Maintainable'");
       while(rs.next()){
            String d = rs.getString("item_id");
            String e = rs.getString("item_name");
            String f = rs.getString("nof_item");
            String h = rs.getString("status");
            model.addRow(new Object[]{d, e, f,h});
       }
       table.setModel(model);
                
                 //JOptionPane.showMessageDialog(null, "connected","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                Logger.getLogger(equipment.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
           
       }
      
    }//GEN-LAST:event_searchActionPerformed

    private void remove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove1ActionPerformed
new maequ().setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_remove1ActionPerformed

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
            java.util.logging.Logger.getLogger(equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new equipment().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(equipment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton remove1;
    private javax.swing.JComboBox<String> search;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
