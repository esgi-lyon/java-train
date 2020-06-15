import javax.swing.JFrame;

public class app extends JFrame {
    public static void main(String[] Args) {
        JFrame f = new JFrame();
        f.setBounds(0,0,300,400);
        f.setTitle("Première fenêtre Java");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}