package tp2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;

public class Pharmacie extends Controller {

    private ArrayList<Client> clients = new ArrayList<Client>();
    private ArrayList<Medoc> medocs = new ArrayList<Medoc>();

    protected boolean actionFinished = false;

    final static String LIST = "listAll";
    final static String ACHAT = "achat";
    final static String APPROVISIONNER = "approvisionner";

    public HashMap<String, String> routesTranslations() {
        HashMap<String, String> ts = new HashMap<String, String>();
        ts.put(LIST, "Liste");
        ts.put(ACHAT, "Acheter");
        ts.put(APPROVISIONNER, "Approvisioner");

        return ts;
    }

    public HashMap<String, JPanel> routing() {
        HashMap<String, JPanel> rs = new HashMap<String, JPanel>();

        rs.put(LIST, this.listView());
        rs.put(APPROVISIONNER, this.addView());
        rs.put(ACHAT, this.achatView());

        return rs;
    }

    public Pharmacie() {
        super();
        // Always call it before fixtures and render
        this.bootstrap(this.routing());
        // Fixtures
        this.clients.add(new Client("Aya Nakamurail", 80));
        this.clients.add(new Client("Ryan grosseligne", 200));
        this.clients.add(new Client("Britney Spritz", 450));

        this.medocs.add(new Medoc("Cocaine", 84.99, 3));
        this.medocs.add(new Medoc("Ganja", 24.99, 20));
        this.medocs.add(new Medoc("Cafeïne", 24.99, 20));
        this.medocs.add(new Medoc("Morphine", 104.99, 20));

        // Render window
        this.render();
    }

    public JPanel listView() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        // Partials
        JPanel top = new JPanel(new FlowLayout());
        JPanel middle = new JPanel(new FlowLayout());
        // Modules
        top.add(new JLabel("Liste clients"));
        top = this.show(top, this.clients);
        middle.add(new JLabel("Liste Medocs"));
        middle = this.show(middle, this.medocs);
        // Attach to final layout
        panel.add(top);
        panel.add(middle);

        return panel;
    }

    public JPanel addView() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        // Partials
        JPanel top = new JPanel(new FlowLayout());
        top.add(new JLabel("Approvisionner"));
        panel.add(top);
        // Form
        JPanel middle = new JPanel(new FlowLayout());
        middle.add(Medoc.labelNom);
        middle.add(Medoc.inputNom);
        middle.add(Medoc.labelPrix);
        middle.add(Medoc.inputPrix);
        panel.add(middle);

        JPanel middle2 = new JPanel(new FlowLayout());
        middle2.add(Medoc.labelStockIncrement);
        middle2.add(Medoc.inputStockIncrement);
        middle2 = submit(middle2, Medoc.add);
        panel.add(middle2);

        return panel;
    }

    public JPanel achatView() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        // Partials
        JPanel top = new JPanel(new FlowLayout());

        return panel;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Medoc.add)) {
            /* JOptionPane.showConfirmDialog(
                    this,
                    Medoc.viewToString()
            ); */
            this.handleAdd();
        }
    }

    public void handleAdd() {
        Medoc newMedoc = Medoc.create();

        this.medocs = newMedoc.addMedoc(this.medocs);
    }

    protected JPanel submit(JPanel panel, JButton btn) {
        panel.add(btn);
        btn.addActionListener(this);

        return panel;
    }

    protected JPanel show(JPanel panel, ArrayList list) {
        // Clients
        list.forEach(item -> {
            panel.add(new JLabel(item.toString()));
        });

        return panel;
    }
}
