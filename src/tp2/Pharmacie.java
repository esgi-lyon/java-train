package tp2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Pharmacie extends Controller {

    protected Controller controller;

    private ArrayList<Client> clients = new ArrayList<Client>();
    private ArrayList<Medoc> medocs = new ArrayList<Medoc>();

    public Pharmacie() {
        super();
        this.routes.put("listAll", this.listView());
        // Fixtures
        this.clients.add(new Client("Aya Nakamurail", 80));
        this.clients.add(new Client("Ryan grosseligne", 200));
        this.clients.add(new Client("Britney Spritz", 450));

        this.medocs.add(new Medoc("Cocaine", 84.99, 3));
        this.medocs.add(new Medoc("Ganja", 24.99, 20));
        this.medocs.add(new Medoc("Cafeïne", 24.99, 20));
        this.medocs.add(new Medoc("Morphine", 104.99, 20));

        this.render();
    }

    public JPanel listView() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        // Partials
        JPanel top = new JPanel(new FlowLayout());
        JPanel middle = new JPanel(new FlowLayout());
        // Modules
        top.add(new JLabel("Liste clients"));
        top = this.show(top, this.getClients());
        middle.add(new JLabel("Liste Medocs"));
        middle = this.show(middle, this.getMedocs());
        // Attach to final layout
        panel.add(top);
        panel.add(middle);

        return panel;
    }

    public JPanel show(JPanel panel, ArrayList list) {
        // Clients
        list.forEach(item->{
            panel.add(new JLabel(item.toString()));
        });

        return panel;
    }

    public void addView() {

    }

    public void achatView() {

    }

    protected JPanel submit(JPanel panel, JButton btn) {
        panel.add(btn);
        btn.addActionListener(this.controller);
        panel.add(new JButton("Cancel"));

        return panel;
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getSource().equals(Medoc.add)) {
            System.out.println("ok");
            JOptionPane.showConfirmDialog(
                    this.controller,
                    Medoc.labelNom.getText()
                            + Medoc.inputNom.getText()
                            + Medoc.labelPrix.getText()
                            + Medoc.inputPrix.getText()
                            + Medoc.labelStockIncrement.getText()
                            + Medoc.inputStockIncrement.getText()
            );
        }
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Medoc> getMedocs() {
        return medocs;
    }

    public void setMedocs(ArrayList<Medoc> medocs) {
        this.medocs = medocs;
    }
}
