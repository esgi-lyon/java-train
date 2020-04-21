import java.util.Arrays;

public class Bonjour
{
	static String message = "Bonjour tout le monde !";
	public static String terrible = "terrible";
	static Jours jours;

	public static void main(String[] args)
	{
		System.out.println(message);
		// Integer a = new Integer(25);
		Integer b = 25;
		System.out.println(b);
		float c = 2.3f;
		float surface;
		surface = 2358.6f;
		// surface = (float)2385.6f; // Aussi faisable
		int approximation;
		approximation = (int)surface;
		System.out.println(approximation);
		double prixHT = 152;
		// Conversion implicite
		String recap = "le montant est " + prixHT;
		// Conversion explicite
		String recap1 = "le montant est " + String.valueOf(prixHT);
		String prix = "500";
		double dprix = Double.parseDouble(prix);
		float fprix = Float.parseFloat(prix);
		// byte bprix = Byte.parseByte(prix);
		// System.out.println(prix);

		System.out.println(terrible);

		// Constante
		final double tauxTVA = 1.196;
		double prixTTC = prixHT * tauxTVA;
		System.out.println(prixTTC);

		double rayon = 15;
		double len = 15;
		double disque;
		// Calcule la surface du cercle
		disque = Math.PI*rayon*rayon;
		// Calcule le volume du cercle
		double volume = disque*len;
		System.out.println("Le volume de mon cercle fait " + volume);

		// Utilisation de l'énumération
		System.out.println(Jours.MARDI);

		// Utilisation des tableaux
		int[] chiffreAffaire;
		chiffreAffaire = new int[5];
		chiffreAffaire[0] = 25;
		// Initialisation d'un tableau sur une ligne
		int[] copieChiffreAffaire = {25,26,27,28,29};
		// Tableau à plusieurs dimensions
		int[][] matrice;
		matrice = new int[2][3]; // Création
		matrice[0][0] = 99; // Stockage d'une valeur pos 0,0
		int[][] matrice2 = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(matrice2));
	}
}

enum Jours {
	// Déclaration de l'énumération
	DIMANCHE ("c'est dimanche"),
	LUNDI ("c'est lundi"),
	MARDI ("c'est mardi"),
	MERCREDI ("c'est mercredi"),
	JEUDI ("c'est jeudi"),
	VENDREDI ("c'est vendredi"),
	SAMEDI ("c'est samedi");

	// Déclaration de la variable jour
	private String jour = "";
	// Déclaration du constructeur
	Jours(String jour){
		this.jour = jour;
	}
	// Surcharge de la méthode toString
	public String toString(){
		return jour;
	}
}