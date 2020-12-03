package tp2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class Controller extends JFrame implements ActionListener {
    protected Menu menu;
    Map<String, JPanel> routes = new HashMap<String, JPanel>();

    public Controller() {
        setVisible(true);
        setTitle("Pharmacie");
        setLocationRelativeTo(null);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.menu = new Menu(this);
        setJMenuBar(this.menu.getMenuBar());
    }

    public void render() {
        // this.debugRoutes();
        setContentPane(routes.get(menu.getCurrent()));
        setVisible(true);
    }

    public Map<String, JPanel> getRoutes() {
        return routes;
    }

    public void setRoutes(Map<String, JPanel> routes) {
        this.routes = routes;
    }

    public void actionPerformed (ActionEvent e) {
        System.out.println("zinfzii");
    }

    void debugRoutes() {
        Iterator iter = routes.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry mEntry = (Map.Entry) iter.next();
            System.out.println(mEntry.getKey() + " : " + mEntry.getValue());
        }
    }
}
