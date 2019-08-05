package gyma;
//THIS CLASS IS FOR ADDING INFO

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;
public class adduserb extends JFrame {
   
    private JPanel ap;
    private JLabel alu;
    private JLabel al;
    private JLabel alu2;
    private JLabel alp3;
    private JLabel al4;
    private JLabel al5;
    private JLabel alp6;
    private JLabel al7;
    private JLabel al8;
    private JButton alp;
    private JButton alp1;
    private JComboBox cb;
    private JPasswordField aps;
    private JTextField at1;
    private JTextField at2;
    private JTextField at3;
    private JTextField at4;
    private JTextField at5;
    private JTextField at6;
    private JTextField at7;
    private JTextField at8;
    
    public adduserb(){
        Font n = new Font("Courier",Font.BOLD,45);
        Font n1 = new Font("Courier",Font.BOLD,18);
       
        JPanel ap = new JPanel(null);
        ap.setBounds(100, 200, 10, 10);
        ap.setBackground(Color.gray);
        
        
        
        JButton alp= new JButton("SAVE");
        
        alp.setBounds(550, 500, 150, 50);
        alp.setFont(n1);
        alp.setIcon(new ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\icons\\save.jpg")); 
        JButton alp1= new JButton("<Back");
        alp1.setBounds(0, 10, 120, 30);
        alp1.setFont(n1);
        
          alp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new menu().setVisible(true);
                dispose();
               
            }
         });
            alp1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new menu().setVisible(true);
                dispose();
                
               
            }
         });
        
        JTextField at1 = new JTextField();
        at1.setBounds(250, 100, 200, 30);
        at1.setFont(n1);
        JTextField at2 = new JTextField();
        at2.setBounds(250, 200, 200, 30);
        at2.setFont(n1);
        JTextField at3 = new JTextField();
        at3.setBounds(250, 400, 200, 30);
        at3.setFont(n1);
        JTextField at4 = new JTextField();
        at4.setBounds(800, 400, 200, 30);
        at4.setFont(n1);
        JTextField at5 = new JTextField();
        at5.setBounds(800, 200,200, 30);
        at5.setFont(n1);
        JTextField at6 = new JTextField();
        at6.setBounds(800, 100, 200, 30);
        at6.setFont(n1);
        JTextField at7 = new JTextField();
        at7.setBounds(800, 300, 200, 30);
        at7.setFont(n1);
        JComboBox cb = new JComboBox();
        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cb.setBounds(300, 300, 120, 30);
        cb.setFont(n1);

        
        
         JLabel alu = new JLabel("First Name");
         alu.setBounds(150, 100, 100, 40);
         alu.setFont(n1);
         alu.setForeground(Color.LIGHT_GRAY);
         JLabel alu2 = new JLabel("Last Name");
         alu2.setBounds(700, 100, 100, 40);
         alu2.setFont(n1);
         alu2.setForeground(Color.LIGHT_GRAY);
         JLabel alu3 = new JLabel("ID");
         alu3.setBounds(150, 200, 100, 40);
         alu3.setFont(n1);
         alu3.setForeground(Color.LIGHT_GRAY);
         JLabel alu4 = new JLabel("SEX");
         alu4.setBounds(150, 300, 100, 40);   
         alu4.setFont(n1);
         alu4.setForeground(Color.LIGHT_GRAY);
         JLabel alu5 = new JLabel("WEGHIT");
         alu5.setBounds(150, 400, 100, 40);
         alu5.setFont(n1);
         alu5.setForeground(Color.LIGHT_GRAY);
         JLabel alu6 = new JLabel("HEIGHT");
         alu6.setBounds(700, 200, 100, 40);
         alu6.setFont(n1);
         alu6.setForeground(Color.LIGHT_GRAY);
         JLabel alu7 = new JLabel("PAYMENT");
         alu7.setBounds(700, 300, 100, 40);
         alu7.setFont(n1);
         alu7.setForeground(Color.LIGHT_GRAY);
         JLabel alu8 = new JLabel("PHONE N.");
         alu8.setBounds(700, 400, 100, 40);
         alu8.setFont(n1);
         alu8.setForeground(Color.LIGHT_GRAY);
        
         
        JLabel alc1 = new JLabel();
        alc1.setBounds(0, 0, 150, 30);
        alc1.setSize(1300,730);
        alc1.setIcon(new ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\athletes-endurance-energy-685534.jpg")); 
  
        
        alc1.add(alu);
        alc1.add(alu2);
        alc1.add(alu3);
        alc1.add(alu4);
        alc1.add(alu5);
        alc1.add(alu6);
        alc1.add(alu7);
        alc1.add(alu8);
        alc1.add(at1);
        alc1.add(at2);
        alc1.add(at3);
        alc1.add(at4);
        alc1.add(at5);
        alc1.add(at6);
        alc1.add(at7);
        alc1.add(cb);
        alc1.add(alp);
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
 
 class rr1{
        public static void main(String[] args) {
            new adduserb();
        }
    }