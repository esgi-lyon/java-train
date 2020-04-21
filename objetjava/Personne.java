package objetjava;

import java.util.GregorianCalendar;

public class Personne {
    // variable de class
    private String nom;
    private String prenom;
    private GregorianCalendar date_naiss;

    // constructeur basic
    public Personne() {
        System.out.println("Création d'une personne");
        nom = "";
        prenom = "";
        date_naiss = null;
    }
    //constructeur surchargé
    public Personne(String n, String p, GregorianCalendar g){
        this.nom = n;
        this.prenom = p;
        this.date_naiss = g;
    }
    // méthode de class
    public long calculAge(){
        long age;
        date_naiss = new GregorianCalendar(1999,11,16);
        age = new GregorianCalendar().getTimeInMillis() - date_naiss.getTimeInMillis();
        age = age/1000/60/60/24/365;
        return age;
    }
    public void affichage(){
        System.out.println("nom "+ getNom());
        System.out.println("prenom "+ getPrenom());
        System.out.println("age "+ calculAge());
    }
    public void affichage(boolean francais){
        if(francais){
            affichage();
        }
        else
        {
            System.out.println("nom "+ getNom());
            System.out.println("prenom "+ getPrenom());
            System.out.println("age "+ calculAge());
        }
    }

    // getteur setteur
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