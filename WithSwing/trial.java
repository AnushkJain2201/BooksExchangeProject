package WithSwing;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.BlockingQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class YFrame extends JFrame{
    YFrame(){
        JLabel l1 = new JLabel("Dekho Mai AA gya");
        add(l1);
    }
}

class XFrame extends JFrame implements ActionListener{
    XFrame(){
        JButton b1 = new JButton("Click Here");
        add(b1);

        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        YFrame yf = new YFrame();
        yf.setSize(500 , 500);
        yf.setVisible(true);
        yf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class Test{
    public static void main(String[] args) {
        XFrame xf = new XFrame();
        xf.setSize(500 , 500);
        xf.setVisible(true);
        xf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}