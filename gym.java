
package gyma;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class gym extends JFrame {
    //declared some variables
    private JPanel ap;
    private JLabel alc1;
    private Font n;
    private Font n1;
    private Font n2;
    gym(){
       //making a custom size font 
        Font n = new Font("Courier",Font.BOLD,45);
        Font n1 = new Font("Courier",Font.BOLD,21);
        Font n2 = new Font("Courier",Font.BOLD,12);

         //cutomizing a some components
         
        JLabel alg = new JLabel();
        alg.setText("GYM MANAGEMENT SYSTEM");
        alg.setBounds(300, 50, 800, 40);
        alg.setFont(n);
        alg.setBackground(Color.LIGHT_GRAY);
        
        
        JLabel ala = new JLabel("Vesrsion 1.0");
        ala.setBounds(1140, 620, 150, 30);
        ala.setFont(n1);
        JLabel alc = new JLabel("Powerd By CSE Section 1");
        alc.setBounds(1120, 600, 150, 30);
        alc.setFont(n2);
        
        JPanel ap=new JPanel();
        
        JButton alp = new JButton("Start");
        alp.setBounds(1150, 300, 150, 80);
        alp.setFont(n1);
        alp.setBackground(Color.LIGHT_GRAY);
        alp.setForeground(Color.DARK_GRAY);
        JLabel alc1 =new JLabel();
        alc1.setIcon(new ImageIcon("C:\\Users\\JOBS\\Documents\\gyma\\src\\images\\1main.jpg")); 
        
        //adding action listner to the jbuttom
        alp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){        
                  new login().setVisible(true);
                  dispose();      
            }
         });
//adding components to the jlable then to the jpanal then to the jframe
        alc1.add(alg);
        alc1.add(alc);
        alc1.add(ala);
        alc1.add(alp);
        ap.add(alc1);
        add(ap);
        setBounds(300, 100, 150, 30);
        setSize(1300, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
      }
}
class main{
      public static void main(String[] args){
        new gym();    
    }
}    
