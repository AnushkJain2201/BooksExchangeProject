package WithSwing;

// import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
// import java.awt.GridBagLayoutInfo;  
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class CustomerMainPanel extends JPanel{
    private JPanel p1 , p2 , p3;
    private JLabel l1 , l2 , l3;
    private JTextField tf1 , tf2;
    private JButton b1;
    private Border br1 , br2;
    private GridLayout gr;

    public CustomerMainPanel(){
        l1 = new JLabel("Welcome To Customer's Panel");
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        l1.setBorder(new EmptyBorder(50, 10, 40, 10));
        
        l2 = new JLabel("Name: ");
        tf1 = new JTextField(10);
        tf1.setToolTipText("Enter Name!!");

        p1 = new JPanel();
        p1.add(l2);
        p1.add(tf1);

        br1 = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red, 1)  , "Enter Your Name",TitledBorder.CENTER , TitledBorder.TOP);
        p1.setBorder(br1);

        l3 = new JLabel("Phone Number: ");
        tf2 = new JTextField(10);
        tf2.setToolTipText("Enter Phone Number!!");

        p2 = new JPanel();
        p2.add(l3);
        p2.add(tf2);
        p2.setBorder(new EmptyBorder(50, 0, 0, 0));

        br2 = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red, 1)  , "Enter Your Phone Number",TitledBorder.CENTER , TitledBorder.TOP);
        p2.setBorder(br2);

        b1 = new JButton("Submit");
        b1.setSize(50, 50);

        p3 = new JPanel();
        p3.add(l1);
        p3.add(p1);
        p3.add(p2);
        p3.add(b1);

        gr = new GridLayout(4 , 1);
        gr.setVgap(20);
        p3.setLayout(gr);

        
        
        add(p3);
        






        

    }
    
    
}
