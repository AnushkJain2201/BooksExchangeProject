package WithSwing;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class AdminMainPanel extends JPanel {
    private JLabel l1 , l2 , l3;
    private JTextField tf1;
    private JPasswordField pf1;
    private JPanel p1 , p2 , p3 ;
    private GridLayout gr;
    private Border br1 , br2;
    private JButton b1;
    private String finCheckAdm;

    public AdminMainPanel(){
        l1 = new JLabel("Welcome To The Admin's Panel");
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        l1.setBorder(new EmptyBorder(50, 10, 40, 10));

        l2 = new JLabel("Name:  ");
        tf1 = new JTextField(10);
        tf1.setToolTipText("Enter Name!!");

        p1 = new JPanel();
        p1.add(l2);
        p1.add(tf1);
        br1 = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red, 1),"Enter Your Name", TitledBorder.CENTER, TitledBorder.TOP);

        p1.setBorder(br1);


        l3 = new JLabel("Password:  ");
        pf1 = new JPasswordField(10);
        pf1.setEchoChar('*');
        pf1.setToolTipText("Enter Password!!");

        
        p2 = new JPanel();
        p2.add(l3);
        p2.add(pf1);
        p2.setBorder(new EmptyBorder(50, 0, 0, 0));
        
        br2 = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red, 1),"Enter Your Password", TitledBorder.CENTER, TitledBorder.TOP);
        p2.setBorder(br2);
        
        b1 = new JButton("Log In");
        b1.setSize(50, 50);
        b1.addActionListener(new ButtonHandler());
        
        // p4 = new JPanel();
        // p4.add(b1);

        p3 = new JPanel();
        p3.add(l1);
        p3.add(p1);
        p3.add(p2);
        p3.add(b1);

        gr = new GridLayout(4 , 1);
        gr.setVgap(20);
        p3.setLayout(gr);
        // p3.setBorder(new EmptyBorder(50, 10, 10, 10));

        add(p3);
        // JScrollPane jp = new JScrollPane(this);
        
    }

   class ButtonHandler implements ActionListener{
     
        
        // public void actionPerformed(ActionEvent e) {
        public void actionPerformed(ActionEvent e) {
            System.out.println(
                "i"
            );
            String name = tf1.getText();
            String pass = String.valueOf(pf1.getPassword());
            finCheckAdm = name+pass;
            try{
                BufferedReader br = new BufferedReader(new FileReader(new File("WithSwing/admPass.txt")));
                String str = null;
                while ((str = br.readLine()) != null) {
                    
                }
            }catch(FileNotFoundException ex){
                ex.printStackTrace();
            }catch(IOException ex){
                ex.printStackTrace();
            }

            
            // if(finCheckAdm.equals()){
                AdminFunctionFrame amf = new AdminFunctionFrame();
                amf.setSize(800 , 800);
                amf.setVisible(true);
                // System.out.println(
                //     "skie"
                // );
                amf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // }
        }
        
    }


}
