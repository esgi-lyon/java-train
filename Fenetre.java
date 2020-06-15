import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fenetre extends JFrame {
    JPanel panneau;
    JTextField text;
    JButton b1;

    public fenetre() {
        setBounds(0,0,300,400);
        setTitle("Nouvelle fenêtre Java");
        setResizable(false);

        panneau = new JPanel();

        b1 = new JButton("test");
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane jop = new JOptionPane();
                jop.showConfirmDialog(getContentPane(), "click", "Texte exemple", JOptionPane.OK_OPTION);
                text.setText("Clic OK");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        });

        text = new JTextField();
        text.setFont(new Font("Consolas", Font.BOLD, 20));
        
        panneau.add(text);
        panneau.add(b1);
        getContentPane().add(panneau);

        setVisible(true);
    }
}