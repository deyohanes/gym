

package gyma;
//THIS IS A CLASS FOR MENU
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import  javax.swing.*;
public class men extends JFrame {
    private JPanel ap;
    private JLabel alu;
    private JButton alp;
    private JButton alp2;
    private JButton alp3;
    private JButton alp4;
    private JPasswordField aps;
    private JTextField at;
    public men(){
        Font n = new Font("Courier",Font.BOLD,45);
        Font n1 = new Font("Courier",Font.BOLD,18);
        Font n2 = new Font("Courier",Font.BOLD,12);
        
        JPanel ap = new JPanel();
        ap.setBounds(100, 200, 10, 10);
        ap.setSize(1300,730);
        ap.setBackground(Color.white);
        
        
        
        JButton alp= new JButton("ADD USER");
        alp.setBounds(200, 150, 300, 150);
        alp.setFont(n1);
        JButton alp2= new JButton("DISPLAY");
        alp2.setBounds(800, 150, 300, 150);
        alp2.setFont(n1);
        JButton alp3= new JButton("PAYMENT");
        alp3.setBounds(200, 400, 300, 150);
        alp3.setFont(n1);
        JButton alp4= new JButton("DELETE USER");
        alp4.setBounds(800, 400, 300, 150);
        alp4.setFont(n1);
        alp4.setBackground(Color.red);
        
        
        JLabel alu = new JLabel("MENU");
        //alu.setBounds(600, 50, 200, 40);
        //alu.setFont(n);
        
          
        JLabel alc1 = new JLabel();
        alc1.setBounds(0, 0, 150, 30);
        alc1.setSize(1300,730);
        alc1.setIcon(new ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\1main.jpg")); 
        
       
       
        JButton all= new JButton("LOG OUT");
        all.setBounds(1150, 10, 150, 30);
        all.setFont(n1);
        all.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               JOptionPane.showMessageDialog(null, "LOGOUT SUCESSFUL","MESSAGE", JOptionPane.INFORMATION_MESSAGE);
               login login= new login();
                dispose();
               
            }
         });
        
        alp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new adduser();
                dispose();
               
            }
         });
      
            alp3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           new payment();
           dispose();
                   }
         });
             alp4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               new deleteuser();
               dispose();
                   }
         });
               alp2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    new display().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(men.class.getName()).log(Level.SEVERE, null, ex);
                }
               dispose();
                   }
         });
        
        ap.add(all);
        ap.add(alp);
        ap.add(alp2);
        ap.add(alp3);
        ap.add(alp4);
        alc1.add(alu);
        alc1.add(alp4);
        alc1.add(alp3);
        alc1.add(alp2);
        alc1.add(alp);
        alc1.add(all);
         ap.add(alc1);
        
      
        add(ap);
        setBounds(300, 100, 150, 30);
        setSize(1300, 720); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
}  
    
    }

 class rqr{
        public static void main(String[] args) {
            new men();
        }
    }