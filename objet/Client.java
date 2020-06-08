import java.util.GregorianCalendar;
public class Client extends Personne {

    private char type;

    public Client(String nom, String prenom, GregorianCalendar dateNaiss, char type) {
        super(nom, prenom, dateNaiss);
        System.out.println("Override constructor");
        this.type = type;
        
    }

	public char getType() {return this.type;}
	public void setType(char type) {this.type = type;}

    public void affichage(final boolean francais, int c) {
        this.affichage(francais);
        System.out.println(this.getType());
        System.out.println(c);
    }
}