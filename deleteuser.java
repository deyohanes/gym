
package gyma;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import  javax.swing.*;
public class deleteuser extends JFrame {
       
    private JPanel ap;
    private JLabel alg;
    private JLabel alu;
    private JLabel alps;
    private JLabel als;
    private JLabel alv;   
    private JLabel ala;
    private JLabel alc;
    private JButton alp;
    private JPasswordField aps;
    private JTextField at;
 
    
    public deleteuser(){
            
      
        JPanel ap = new JPanel(null);
        ap.setBounds(100, 200, 10, 10);
        ap.setBackground(Color.gray);
        
        Font n = new Font("Courier",Font.BOLD,35);
        Font n1 = new Font("Courier",Font.BOLD,18);
        
        JButton alp1= new JButton("<Back");
        alp1.setBounds(0, 10, 120, 30);
        alp1.setFont(n1);
        
        JLabel alc = new JLabel("USER ID here ");
        alc.setBounds(350, 200, 250, 40);
        alc.setFont(n);
        
        JButton alp= new JButton("Delete User");
        alp.setBounds(650, 300, 250, 50);
        alp.setFont(n);
        
        JTextField at2 = new JTextField();
        at2.setBounds(600, 200, 300, 40);
        at2.setFont(n1);
        
            alp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
       String id=at2.getText();
                String uname="root";
       String pass="jobs";
       String con="jdbc:Mysql://localhost:3306/gym";
       Connection  conn=null;
               try {

            conn=DriverManager.getConnection(con,uname,pass);
            Statement stmt=(Statement) conn.createStatement();
            Statement stmt2=(Statement) conn.createStatement();
            stmt.executeUpdate("DELETE FROM `gym`.`member` WHERE (`cust_id` = '"+id+"');");
            stmt2.executeUpdate("DELETE FROM `gym`.`logininfo` WHERE (`cust_id` = '"+id+"');");
            
            JOptionPane.showMessageDialog(null, "USER DELETED ","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
           conn.close();
           } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        }
                
                
                
            }
         });
            
            alp1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              new menu().setVisible(true);
              dispose();
               
            }
         });
        JLabel alc1 = new JLabel();
        alc1.setBounds(0, 0, 150, 30);
        alc1.setSize(1300,730);
        alc1.setIcon(new ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\dele.jpg")); 
     
        alc1.add(at2);
        alc1.add(alp);
        alc1.add(alc);
        alc1.add(alp1);
        ap.add(alc1);
        JFrame frame = new JFrame();
        add(ap);  
        setBounds(300, 100, 150, 30);
        setSize(1300, 720);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
   
}


 class rr3{
        public static void main(String[] args) {
            new deleteuser();
        }
    }