package WithSwing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdminFunctionFrame extends JFrame{
    private JLabel l1 , l2;

    public AdminFunctionFrame(){
        super("BOOK EXCHANGE - Admin Function Frame");
        l1 = new JLabel("Login SucessFul");
        add(l1);
    }
}
