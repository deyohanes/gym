
package gyma;

import com.mysql.cj.protocol.Resultset;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
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

public class display extends javax.swing.JFrame {

    public display() throws ClassNotFoundException {
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
                ch.addItem(rs1.getString(1));  
               }
               st.close();
               rs1.close(); 
               conn.close();
            
        } catch (Exception e) {
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        se = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        ch = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        searchfor2 = new javax.swing.JLabel();
        database = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Favorites\\icons8-home-50.png")); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, 40));

        se.setBackground(new java.awt.Color(0, 0, 0));
        se.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\icons\\SmallLogo.png")); // NOI18N
        se.setBorder(null);
        se.setContentAreaFilled(false);
        se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seActionPerformed(evt);
            }
        });
        jPanel1.add(se, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 80, 50));

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 210, 30));

        table.setBackground(new java.awt.Color(153, 153, 153));
        table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cust_id", "cust_name", "sex", "weight", "height", "phone_no", "address", "BMI", "checkin", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setEditingColumn(0);
        table.setEditingRow(0);
        table.setEnabled(false);
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 1220, 510));

        ch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Overweight", "Underweight", "Payment" }));
        ch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chActionPerformed(evt);
            }
        });
        jPanel1.add(ch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 120, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Display Members ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 230, 50));

        searchfor2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchfor2.setForeground(new java.awt.Color(240, 240, 240));
        searchfor2.setText("Search For");
        jPanel1.add(searchfor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 150, 80));

        database.setText("jLabel2");
        jPanel1.add(database, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\Linux(13).jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
    }//GEN-LAST:event_searchActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed

       DefaultTableModel model = new DefaultTableModel(new String[]{"cust_id", "cust_name", "sex","weight","height","phone_no","address","BMI","status","joined"}, 0);
       String se=search.getText();
       String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
       Connection  conn=null;
      
            try {
              
        conn=DriverManager.getConnection(con,uname,pass);
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select * from  member WHERE cust_id ='"+se+"'");
       while(rs.next()){
            String a = rs.getString("cust_id");
            String b = rs.getString("cust_name");
            String c = rs.getString("sex");
            String d = rs.getString("weight");
            String e = rs.getString("height");
            String f = rs.getString("phone_no");
            String g = rs.getString("address");
            String h = rs.getString("BMI");
            String i = rs.getString("status");
            String j = rs.getString("joined");
            model.addRow(new Object[]{a, b, c, d, e, f, g, h, i, j});
       }
       table.setModel(model);
                 //JOptionPane.showMessageDialog(null, "h","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                 }
    }//GEN-LAST:event_seActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                 new menu().setVisible(true);
                 dispose();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void chActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chActionPerformed

        
        String ab=(String) ch.getSelectedItem();
       
        String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
       Connection  conn=null;
        try {
                    
        conn=DriverManager.getConnection(con,uname,pass);
         Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select  from member");
        } catch (Exception e) {
        }
       
       if(ch.getSelectedItem().equals("All")){
           
           DefaultTableModel model = new DefaultTableModel(new String[]{"cust_id", "cust_name", "sex","weight","height","phone_no","address","BMI","joined","status"}, 0);
            try {
              
        conn=DriverManager.getConnection(con,uname,pass);
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select * from member");
       while(rs.next()){
            String a = rs.getString("cust_id");
            String b = rs.getString("cust_name");
            String c = rs.getString("sex");
            String d = rs.getString("weight");
            String e = rs.getString("height");
            String f = rs.getString("phone_no");
            String g = rs.getString("address");
            String h = rs.getString("BMI");
            String i = rs.getString("joined");
            String j = rs.getString("status");
            model.addRow(new Object[]{a, b, c, d, e, f, g, h, i, j});
       }
         rs.close(); 
               conn.close();
       table.setModel(model);
                 
        } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                Logger.getLogger(equipment.class.getName()).log(Level.SEVERE, null, ex); }}
       else if(ch.getSelectedItem().equals("Overweight")){
           DefaultTableModel model = new DefaultTableModel(new String[]{"cust_id", "cust_name", "sex","weight","height","BMI","status"}, 0);
           try {
               conn=DriverManager.getConnection(con,uname,pass);
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select cust_id,cust_name,sex,weight,height,phone_no,address,BMI,joined,status from member where status='Overweight'");
       while(rs.next()){
              String a = rs.getString("cust_id");
            String b = rs.getString("cust_name");
            String c = rs.getString("sex");
            String d = rs.getString("weight");
            String e = rs.getString("height");
            String f = rs.getString("phone_no");
            String g = rs.getString("address");
            String h = rs.getString("BMI");
            String i = rs.getString("joined");
            String j = rs.getString("status");
            model.addRow(new Object[]{a, b, c, d, e, h, j});
       }
         rs.close(); 
               conn.close();
       table.setModel(model);
               
           } catch (Exception e) {
           }
           
       }else if(ch.getSelectedItem().equals("Underweight")){
            
           DefaultTableModel model = new DefaultTableModel(new String[]{"cust_id", "cust_name", "sex","weight","height","BMI","status"}, 0);
           try {
                     conn=DriverManager.getConnection(con,uname,pass);
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select cust_id,cust_name,sex,weight,height,phone_no,address,BMI,joined,status from member where status='Underweight'");
       while(rs.next()){
              String a = rs.getString("cust_id");
            String b = rs.getString("cust_name");
            String c = rs.getString("sex");
            String d = rs.getString("weight");
            String e = rs.getString("height");
            String f = rs.getString("phone_no");
            String g = rs.getString("address");
            String h = rs.getString("BMI");
            String i = rs.getString("joined");
            String j = rs.getString("status");
            model.addRow(new Object[]{a, b, c, d, e, h, j});
       }
         rs.close(); 
               conn.close();
       table.setModel(model);
               
           } catch (Exception e) {
           }
       }else if(ch.getSelectedItem().equals("Payment")){
         
          
         
            String g = database.getText();
              DefaultTableModel model = new DefaultTableModel(new String[]{"payment", "Member ID", "Pack Name","Pack Type"}, 0);
           try {
                                     conn=DriverManager.getConnection(con,uname,pass); 
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select * from payment;");
       while(rs.next()){
            String a = rs.getString("payment_day");
            String b = rs.getString("cust_id");
            String c = rs.getString("pack_name");
            String d = rs.getString("pack_type"); 
            model.addRow(new Object[]{a, b, c, d});
       }
       table.setModel(model);
        st.close();
        
               rs.close(); 
               conn.close();
           } catch (Exception e) {
           }
           
       }else  {
         
           
           
            String s="Select pack_name from package";
    
          
         
            String g = database.getText();
              DefaultTableModel model = new DefaultTableModel(new String[]{"payment", "Member ID", "Pack Name","Pack Type"}, 0);
           try {
                                     conn=DriverManager.getConnection(con,uname,pass); 
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("select * from payment where pack_name ='"+ab+"';");
       while(rs.next()){
            String a = rs.getString("payment_day");
            String b = rs.getString("cust_id");
            String c = rs.getString("pack_name");
            String d = rs.getString("pack_type"); 
            model.addRow(new Object[]{a, b, c, d});
       }
       table.setModel(model);
        st.close();
        
               rs.close(); 
               conn.close();
           } catch (Exception e) {
           }
       }
   
       
    }//GEN-LAST:event_chActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new display().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);
                }
              
            }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> ch;
    private javax.swing.JLabel database;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton se;
    private javax.swing.JTextField search;
    private javax.swing.JLabel searchfor2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
