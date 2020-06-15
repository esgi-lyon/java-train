import java.util.GregorianCalendar;

public class OldMain{
    public static void main(String[] args){
        //System.out.println("test");
        Personne p = new Personne();
        p.setNom("MAN");
        p.setPrenom("Jul");
        p.setDate_naiss(new GregorianCalendar(1983,10,8));
        System.out.println(p.getNom() + " " + p.getPrenom() + " " + p.calculAge());
        Personne p2 = new Personne("MAN2","JUL2", new GregorianCalendar(1983,10,8));
        p.affichage();
        p.affichage(true);
        p.affichage(false);

        if(p.getNbInstance() > 1){
        System.out.println(p.getNbInstance() + " instances de personne ont été créés");
        }else{
        System.out.println(p.getNbInstance() + " instance de personne");
        }
        System.out.println(p.getNumero() + " est le numero de la personne");
        System.out.println(p2.getNumero() + " est le numero de la personne");

        //iencli
        Client iencli = new Client("nom", "prenom", new GregorianCalendar(1983,10,8),'P');
        iencli.affichage(true, 1);

        iencli.setPoids(90);
        System.out.println(iencli.getPoids());
        iencli.seDeplacer();
        System.out.println(iencli.getNbInstance());
    }
}

class Personne extends EtreVivant{
    //Attributes
    private String nom;
    private String prenom;
    private GregorianCalendar date_naiss;
    private static int nbInstance;
    {nbInstance++;}
    private int numero;

    //Methods
    public long calculAge() {
        long age;
        date_naiss = this.getDate_naiss();
        age = new GregorianCalendar().getTimeInMillis() - date_naiss.getTimeInMillis();
        age = age/1000/60/60/24/365;
        return age;
    }
    @Deprecated
    public void affichage(){
        System.out.println("Nom :"+getNom());
        System.out.println("Prénom :"+getPrenom());
        System.out.println("Âge :"+calculAge());
    }
    public void affichage(boolean francais) {
        if(francais){
            affichage();
        }else{
            System.out.println("Last name :"+getNom());
            System.out.println("First name :"+getPrenom());
            System.out.println("Age :"+calculAge());
        }
    }
    protected void seDeplacer() {
        System.out.println("Je fais quelques pas !!");
    }

    //Constructor
    public Personne() {
        System.out.println("Création d'une personne");
        this.nom = "";
        this.prenom = "";
        this.date_naiss = null;
        this.setNumero();
    }
    public Personne(String nom, String prenom, GregorianCalendar date_naiss) {
        System.out.println("Création d'une personne");
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.setNumero();
    }
    //Destructeur (à ne pas ajouter car java le gère avec le garbage collector)
    @Override
    public void finalize() throws Throwable {
        System.out.println("suppréssion de l'objet personne");
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
    public int getNbInstance(){
        return nbInstance;
    }
    public void setNumero(){
        while (numero<1000){
            numero = (int)(10000*Math.random());
        }
    }
    public int getNumero(){
        return numero;
    }
}

abstract class EtreVivant{
    private double taille;
    private double poids;

    //getter setter
    public double getTaille() {return this.taille;}
    public void setTaille(double taille) {this.taille = taille;}
    public double getPoids() {return this.poids;}
    public void setPoids(double poids) {this.poids = poids;}

    //methode abstraite qui doit être obligatoirement implémentée dans les classes dérivées
    protected abstract void seDeplacer();
}

class Client extends Personne{
    //déterminer le type du iencli :
    // P -> particulier
    // E -> entreprise
    // A -> administration
    private char type;

    //constructeur
    public Client(String nom, String prenom, GregorianCalendar date_naiss, char type){
        super(nom, prenom, date_naiss);
        this.type = type;
        this.setNumero();
        System.out.println("Création d'un iencli");
    }
    //getter setter
    public char getType() {return this.type;}
    public void setType(char type) {this.type = type;}

    //methode surchargée
    public void affichage(Boolean francais, int c){
        this.affichage(francais);
        System.out.println("Type = " +this.getType());
    }
}