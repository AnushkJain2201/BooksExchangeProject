package WithSwing;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        MainFrame mfr = new MainFrame();
        mfr.setSize(800 , 800);
        mfr.setVisible(true);
        mfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
