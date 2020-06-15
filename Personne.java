import java.util.GregorianCalendar;


public class Personne extends EtreVivant implements Classable{
    //Attributes
    private String nom;
    private String prenom;
    private GregorianCalendar date_naiss;
    private static int NbInstance;
    {NbInstance ++;}
    private int numero;

    //Methods
    public long calculAge() {
        long age;
        date_naiss = this.getDate_naiss();
        age = new GregorianCalendar().getTimeInMillis() - date_naiss.getTimeInMillis();
        age = age/1000/60/60/24/365;

        return age;
    }

    public void affichage() {
        System.out.println("Nom :"+getNom());
        System.out.println("Prénom :"+getPrenom());
        System.out.println("Âge :"+calculAge());
    }

    public void affichage(boolean francais) {
        if(francais) {
            affichage();
        } else {
            System.out.println("Nom :"+getNom());
            System.out.println("Prénom :"+getPrenom());
            System.out.println("Age :"+calculAge());
        }
    }
    protected void seDeplacer() {
        System.out.println("je fait quelques pas !!");
    }

    //Constructor
    public Personne() {
        System.out.println("Création d'une personne");
        this.nom = "";
        this.prenom = "";
        this.date_naiss = null;
    }
    public Personne(String nom, String prenom, GregorianCalendar date_naiss) {
        System.out.println("Création d'une personne");
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
    }

    //Getters and setters
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
    public void finalize() throws Throwable{
        System.out.println("suppréssion de l'objet personne");
    }
    public int getNbInstance() {
        return NbInstance;
    }

    public void setNumero() {
        while(numero<1000) {
            numero = (int)(10000*Math.random());
        }
    }
    public int getNumero() {
        return numero;
    }

    @Override
    public int Compare(Object o) {
        Personne p;
        if(o instanceof Personne) {
            p =  (Personne)o;
        } else {
            return Classable.ERREUR;
        }
        if(getNom().compareTo(p.getNom()) > 0) {
            return Classable.INFERIEUR;
        } else if(getNom().compareTo(p.getNom()) < 0) {
            return Classable.SUPERIEUR;
        }
        return Classable.EGAL;
    }
}