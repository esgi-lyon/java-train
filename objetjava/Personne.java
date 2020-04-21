package objetjava;

import java.util.GregorianCalendar;

public class Personne {
    private String nom;
    private String prenom;
    private GregorianCalendar date_naiss;

    // Constructeur basique

    public Personne() {
        System.out.println("Création d'une personne vide");
        this.nom = "";
        this.prenom = "";
        this.date_naiss = null;
    }

    // Constructeur surchargé

    public Personne(String n, String p, GregorianCalendar g) {
        System.out.println("Création d'une personne genrée");
        this.setNom(n);
        this.setPrenom(p);
        this.setDate_naiss(g);
    }

    // Méthode de classe

    public long calculAge(){
        long age;
        date_naiss = new GregorianCalendar(1983,10,8);
        age = new GregorianCalendar().getTimeInMillis() - date_naiss.getTimeInMillis();
        age = age/1000/60/60/24/365;
        return age;
    }

    public void affichage(){
        System.out.println("nom" + nom);
        System.out.println("prenom" + prenom);
        System.out.println("age" + calculAge());
    }

    public void affichage(boolean francais){
        if(francais){
            affichage();
        } else {
            System.out.println("name" + nom);
            System.out.println("firstname" + prenom);
            System.out.println("age" + calculAge());
        }
    }

    // Getteur et setters

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom.toLowerCase();
    }

    public GregorianCalendar getDate_naiss() {
        return this.date_naiss;
    }

    public void setDate_naiss(GregorianCalendar date_naiss) {
        this.date_naiss = date_naiss;
    }
}