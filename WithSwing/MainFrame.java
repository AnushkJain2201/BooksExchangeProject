package WithSwing;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
public class MainFrame extends JFrame{
    private JTabbedPane tb;
    private JPanel p1 , p2 , p3 , p4 , p5;
    private JLabel l1 , l2 , l3;
    private GridLayout gr;
    private AdminMainPanel amp ;
    private CustomerMainPanel cmp;
    private Border br1;


    public MainFrame(){
        super("BOOK EXCHANGE - Main Frame");

        l1 = new JLabel("Welcome To Our Book Exchange Application");
        l1.setFont(new Font("Arial", Font.BOLD, 20));

        l2 = new JLabel("Please Select Any Option From The Below Tabs"); 
        l2.setBorder(new EmptyBorder(0, 0, 50, 0));
        l2.setFont(new Font("Arial", Font.ITALIC, 16));

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.add(l1);
        p2.add(l2);

        br1 = BorderFactory.createLineBorder(Color.BLACK, 3);
        

        p3.add(p1);
        p3.add(p2);

        gr = new GridLayout(2 , 3);
        gr.setVgap(20);
        p3.setLayout(gr);
        p3.setBorder(br1);

        tb = new JTabbedPane();
        amp = new AdminMainPanel();
        cmp = new CustomerMainPanel();
        tb.setSize(500, 400);
        tb.setBorder(br1);
        tb.addTab("ADMIN" , new JScrollPane(amp));
        tb.addTab("CUSTOMER", new JScrollPane(cmp));

        p4 = new JPanel();
        l3 = new JLabel("CopyRights @Anushk_2201 2023");
        l3.setFont(new Font("Arial", Font.BOLD, 12));
        p4.setBorder(br1);
        p4.add(l3);

        p5 = new JPanel();
        p5.add(p4);
        p5.setLayout(new GridLayout(1 , 1));

    

        add(p3 , BorderLayout.NORTH);
        add(tb , BorderLayout.CENTER);
        add(p5 , BorderLayout.SOUTH);
        
        



    }

}