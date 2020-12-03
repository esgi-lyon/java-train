package tp2;

import javax.swing.*;

public class Medoc {
    private String nom;
    private double prix;
    private int stock;
    // fields
    static JTextField inputNom = new JTextField(1);
    static JTextField inputPrix = new JTextField(1);
    static JTextField inputStockIncrement = new JTextField("Stock à add : ");
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

    @Override
    public String toString() {
        return "Medoc{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", stock=" + stock +
                '}';
    }
}
