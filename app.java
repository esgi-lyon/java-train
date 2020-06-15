import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class app extends JFrame {
    private static JFrame f;
    private static JButton b1;
    private static JButton b2;
    private static JButton b3;
    private static JButton b4;
    private static JButton b5;
    private static JPanel panneau;
    private static JProgressBar proBar;

    public static void main(String[] Args) {
        f = new JFrame();
        f.setBounds(400,200,300,400);
        f.setTitle("Première fenêtre Java");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        b1 = new JButton("ROUGE");
        b1.setBackground(Color.RED);
        b2 = new JButton("BLEU");
        b2.setBackground(Color.BLUE);
        b3 = new JButton("JAUNE");
        b3.setBackground(Color.YELLOW);
        b4 = new JButton("MODIFICATION");
        b5 = new JButton("LECTURE");
        
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getSource()== b1) {
                    System.out.println("Clic sur b1");
                } else if (e.getSource()== b2) {
                    b1.setBackground(Color.BLACK);
                    System.out.println("Clic sur b2");
                } else if (e.getSource()== b3) {
                    b2.setBackground(new Color(
                        new Random().nextInt(255),
                        new Random().nextInt(255),
                        new Random().nextInt(255)
                    ));
                    System.out.println("Clic sur b3");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {}
            
            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getSource() == b4) {
                    avancementBarre();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getSource() == b2) {
                    System.out.println("Rentre dans b2");
                    b2.setLocation(new Random().nextInt(f.getSize().height),new Random(f.getSize().width).nextInt(200));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Sortie de bouton");
                panneau.setBackground(new Color(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255)));
            }
        };
        
        b1.addMouseListener(mouseListener);
        b2.addMouseListener(mouseListener);
        b3.addMouseListener(mouseListener);
        b5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // A finir pour appeler la nouvelle fenêtre
            }
        });

        proBar = new JProgressBar();
        proBar.setMinimum(0);
        proBar.setMaximum(100);

        JMenuBar bMenu = new JMenuBar();
        JMenu menu1 = new JMenu("Menu");
        JMenu menu2 = new JMenu("Options");
        JMenu menu3 = new JMenu("Quitter");
        bMenu.add(menu1);
        bMenu.add(menu2);
        bMenu.add(menu3);
        f.setJMenuBar(bMenu);

        panneau = new JPanel();
        panneau.setLayout(new GridBagLayout());
        //panneau.add(b1);
        //panneau.add(b2);
        //panneau.add(b3);
        //panneau.add(b4);
        //panneau.add(b5);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;

        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.gridy = 0;
        panneau.add(b1, gbc);

        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridy = 2;
        panneau.add(b2, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridy = 2;
        panneau.add(b3, gbc);

        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.gridy = 1;
        panneau.add(b4, gbc);

        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.gridy = 3;
        panneau.add(b5, gbc);

        f.getContentPane().add(panneau);
        
        f.setVisible(true);
    }

    public static void avancementBarre() {
        int i=0;
        while (i<100) {
            proBar.setValue(i);
            System.out.println(i);
            try {
                Thread.sleep(1000);
                i += 10;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}