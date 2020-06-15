import java.util.GregorianCalendar;

public class Client extends Personne {
    // Determiner le type du client:
    // P -> particulier
    // E -> entreprise
    // A -> administration

    private char type;

    //constructeur
    public Client(String nom, String prenom, GregorianCalendar date_naiss, char type) {
        super(nom, prenom, date_naiss);
        this.type = type;
        this.setNumero();
        System.out.println("Création client");
    }
    public char gettype(){return this.type;}
    public void settype(char type){this.type = type;}

    public void affichage(Boolean francais, int c) {
        this.affichage(francais);
        System.out.println("");
    }
}