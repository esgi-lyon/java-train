import java.util.GregorianCalendar;

public class Personne extends EtreVivant {
    private String nom;
    private String prenom;
    GregorianCalendar dateNaiss;
    private int nbInstances;
    private int numero;

    {nbInstances++;}

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
        this.setNumero();
    }

    public long calculAge() {
        long age;
        dateNaiss = this.getDateNaiss();
        age = new GregorianCalendar().getTimeInMillis() - dateNaiss.getTimeInMillis();
        age = age / 1000 / 60 / 60 / 24 / 365;

        return age;
    }

    @Deprecated
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

    @Override
    public String toString()
    {
        return (String) this.nom + this.prenom + this.dateNaiss;
    }

    public int getNbInstances() {
		return this.nbInstances;
	}

	public void setNbInstances(int nbInstances) {
		this.nbInstances = nbInstances;
    }
    
    public void setNumero () {
        while (this.numero < 1000) {
            this.numero += (int) (Math.random() * 10000);
        }
    }

    public int getNumero () {
        return this.numero;
    }

    //Gérer opar le GC dans les nouvelles version
    // @Override
    // public void finalize() throws Throwable {
    //     System.out.println("destroyed");
    // }
}