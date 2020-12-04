package tp2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Medoc {
    private String nom;
    private double prix;
    private int stock;
    // fields
    static JTextField inputNom = new JTextField(5);
    static JTextField inputPrix = new JTextField(5);
    static JTextField inputStockIncrement = new JTextField(1);
    // fields label
    static JLabel labelNom = new JLabel("Nom : ");
    static JLabel labelPrix = new JLabel("Prix : ");
    static JLabel labelStockIncrement = new JLabel("Stock à add : ");
    // event mapping
    static JButton add = new JButton("Ajoute un medoc");

    public Medoc(String nom, double prix, int stock) {
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Add medoc in list and don't repeat same, just increment stocl
     *
     * @param medocs
     * @return
     */
    public ArrayList<Medoc> addMedoc(ArrayList<Medoc> medocs) {
        medocs.add(this);
        return new ArrayList<Medoc>(
                medocs.stream().map(o -> {
                    if (this.getNom() != o.getNom()) {
                        return o;
                    }
                    o.setStock(o.getStock() + this.getStock());
                    return o;
                }).collect(Collectors.toList())
        );
    }

    public static Medoc create() {
        String newNom = inputNom.getText();
        int newStock = Integer.parseInt(inputStockIncrement.getText());
        double newPrix = Double.parseDouble(inputPrix.getText());

        return new Medoc(newNom, newPrix, newStock);
    }

    public static String viewToString() {
        return "Nouveau Medoc : {" +
                "nom='" + inputNom.getText() + '\'' +
                ", prix=" + inputPrix.getText() +
                ", stock=" + inputStockIncrement.getText() +
                '}';
    }

    @Override
    public String toString() {
        return "Medoc{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", stock=" + stock +
                '}';
    }
}
