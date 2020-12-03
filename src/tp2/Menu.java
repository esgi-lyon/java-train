package tp2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Menu implements ActionListener {
    JFrame parentWindow;
    JMenu menu;
    JMenuItem addMedoc, approvisionner, listAll;
    private String current = "listAll";
    static JButton quitter = new JButton("Quitter");

    Menu(JFrame parentWindow) {
        this.parentWindow = parentWindow;
        this.menu = new JMenu("Actions");
        this.listAll = new JMenuItem("Liste");
        this.addMedoc = new JMenuItem("Approvisioner");
        this.approvisionner = new JMenuItem("Achat");
        this.menu.add(this.listAll);
        this.menu.add(this.addMedoc);
        this.menu.add(this.approvisionner);
        this.menu.add(quitter);
    }

    public JMenuBar getMenuBar() {
        JMenuBar mb = new JMenuBar();
        mb.add(menu);

        return mb;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.listAll)) {
            this.setCurrent("listAll");
        } else if (e.getSource().equals(this.quitter)) {
            System.out.println("exiting...");
            JOptionPane.showConfirmDialog(
                    this.parentWindow,
                    "T'es sur ?"
            );
            System.exit(0);
        }
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }
}