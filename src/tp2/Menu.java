package tp2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

class Menu extends JFrame implements ActionListener {
    Controller parentWindow;
    Map<String, JMenuItem> jmenuItems = new HashMap<String, JMenuItem>();
    JMenu menu;
    private String current = Pharmacie.LIST;
    static JButton quitter = new JButton("Quitter");

    Menu(Controller parentWindow) {
        this.parentWindow = parentWindow;
        this.menu = new JMenu("Actions");
        this.menu = this.buildRoutes(this.menu);
        this.menu.add(quitter);
    }

    public JMenu buildRoutes(JMenu jmenu) {
        this.parentWindow.routing().forEach((k, v)-> {
            JMenuItem menuItem = new JMenuItem(this.parentWindow.routesTranslations().get(k));
            menuItem.addActionListener(this);
            jmenuItems.put(k, menuItem);
            jmenu.add(menuItem);
        });

        return jmenu;
    }

    public JMenuBar getMenu() {
        JMenuBar mb = new JMenuBar();
        mb.add(this.menu);

        return mb;
    }

    public void actionPerformed(ActionEvent e) {
        // Exit program
        if (e.getSource().equals(quitter)) {
            System.out.println("exiting...");
            JOptionPane.showConfirmDialog(
                    this.parentWindow,
                    "sur ?"
            );
            System.exit(0);
        }
        // set Current route
        this.jmenuItems.forEach((k, v)-> {
            if (e.getSource().equals(v)) {
                this.setCurrent(k);

                return;
            }
        });

        // Re render window
        this.parentWindow.render();
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }
}