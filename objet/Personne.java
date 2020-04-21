package objet;

import java.util.GregorianCalendar;

public class Personne {
    private String nom;
    private String prenom;
    GregorianCalendar dateNaiss;

    public Personne() {
        System.out.println("Création de ce genre");
        this.nom = "";
        this.prenom = "";
        this.dateNaiss = null;
    }

    public Personne(String nom, String prenom, GregorianCalendar dateNaiss) {
        System.out.println("Override constructor");
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
    }

    public long calculAge() {
        long age;
        dateNaiss = new GregorianCalendar(1999, 10, 8);
        age = new GregorianCalendar().getTimeInMillis() - dateNaiss.getTimeInMillis();
        age = age / 1000 / 60 / 60 / 24 / 365;

        return age;
    }

    public void affichage() {
        System.out.println("nom" + getNom());
        System.out.println("prenom" + getPrenom());
        System.out.println("age " + calculAge());
    }

    public void affichage(final boolean francais) {
        if (francais) {
            affichage();
        } else {
            System.out.println("nom" + nom);
            System.out.println("prenom" + prenom);
            System.out.println("age " + calculAge());
        }
    }

    public String getNom() {
        return this.nom.toUpperCase();
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom.toLowerCase();
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public GregorianCalendar getDateNaiss() {
        return this.dateNaiss;
    }

    public void setDateNaiss(final GregorianCalendar dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String toString()
    {
        return (String) this.nom + this.prenom + this.dateNaiss;
    }
}