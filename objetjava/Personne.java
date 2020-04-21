package objetjava;

import java.util.GregorianCalendar;

public class Personne {
    private String nom;
    private String prenom;
    private GregorianCalendar date_naiss;

    public long calculAge(){
        long age;
        date_naiss = new GregorianCalendar(1999,11,16);
        age = new GregorianCalendar().getTimeInMillis() - date_naiss.getTimeInMillis();
        age = age/1000/60/60/24/365;
        return age;
    }

    public void affichage(){
        System.out.println("nom "+ nom);
        System.out.println("prenom "+ prenom);
        System.out.println("age "+ calculAge());
    }

    public void affichage(boolean français){
        if(français){
            affichage();
        }
        else
        {
            System.out.println("nom "+ nom);
            System.out.println("prenom "+ prenom);
            System.out.println("age "+ calculAge());
        }
    }


    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public GregorianCalendar getDate_naiss() {
        return this.date_naiss;
    }

    public void setDate_naiss(GregorianCalendar date_naiss) {
        this.date_naiss = date_naiss;
    }


}