package tp2;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;

public abstract class Controller extends JFrame implements ActionListener{
    protected Menu menu;
    HashMap<String, JPanel> routes;

    public Controller() {}

    public void bootstrap(HashMap<String, JPanel> routes) {
        this.routes = routes;
        setVisible(true);
        setTitle("Pharmacie");
        setLocationRelativeTo(null);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.menu = new Menu(this);
        setJMenuBar(this.menu.getMenu());
    }

    public void render() {
        // this.debugRoutes();
        setContentPane(this.routing().get(menu.getCurrent()));
        setVisible(true);
    }

    public void setRoutes(HashMap<String, JPanel> routes) {
        this.routes = routes;
    }

    abstract HashMap<String, String> routesTranslations();
    abstract HashMap<String, JPanel> routing();

    void debugRoutes() {
        Iterator iter = this.routing().entrySet().iterator();
        while (iter.hasNext()) {
            HashMap.Entry mEntry = (HashMap.Entry) iter.next();
            System.out.println(mEntry.getKey() + " : " + mEntry.getValue());
        }
    }
}
