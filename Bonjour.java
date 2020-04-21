import java.util.Arrays;

public class Bonjour {
	private static String message = "Bonjour tout le monde!";
	private static String terrible = "terrible";
	public static void main(String[] args)
	{
		System.out.println(message);
		// Integer a = new Integer(25);
		int b = 25;
		System.out.println(b);
		float c = 2.3f;
		float surface;
		surface = 156.8f;
		surface = (float)156.8;
		int aproximation = (int)surface;
		System.out.println(aproximation);
		double prixHT = 152;
		// Conversion implicite
		String recap = "Le montant est "+prixHT;
		// Conversion explicite
		String recap1 = "Le montant est "+String.valueOf(prixHT);
		System.out.println(recap);
		System.out.println(recap1);
		// Parse d'un string en double
		String prix = "500";
		double dprix = Double.parseDouble(prix);
		float fprix = Float.parseFloat(prix);
		//byte bprix = Byte.parseByte(prix);
		//System.out.println(bprix);

		System.out.println(terrible);

		// utilisation d'une constante
		final double tauxTVA = 1.196;
		double prixTTC = prixHT*tauxTVA;
		System.out.println(prixTTC);

		double rayon = 15;
		double hauteur = 15;
		double disque;
		// Calcul la surface du cercle
		disque = Math.PI*rayon*rayon;
		System.out.println("La suface de mon cercle est "+surface);
		// Calcul le volume du cercle
		double volume = disque*hauteur;
		System.out.println("le volume de mon cercle est "+volume);

		// utilisation de l'énumération
		System.out.println(Jours.MARDI);

		// utilisation des tableaux
		// déclaration de la variable
		int[] chiffreAffaire;
		// création  du tableau
		chiffreAffaire = new int[5];
		// stockage et manipulation des éléments
		chiffreAffaire[0] = 25;
		// initialisation d'un tableau sur une ligne
		int[] copieChiffreAffaire = {25,26,27,28,29};
		//tableau à plusieurs dimensions
		int [][] matrice; // déclaration tableaux deux dimensions
		matrice = new int [2][3]; // création
		matrice[0][0] = 99; // stockage d'une valeur position 0,0
		int[][] matrice2 = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(matrice2)); 
	}
}

enum Jours {
	// déclaration de l'énumération
	DIMANCHE ("c'est dimanche"),
	LUNDI ("c'est lundi"),
	MARDI ("c'est mardi"),
	MERCREDI ("c'est mercredi"),
	JEUDI ("c'est jeudi"),
	VENDREDI ("c'est vendredi"),
	SAMEDI ("c'est samedi");
	// déclaration de la variable jour
	private String jour = "";
	// déclaration du constructeur
	Jours(String jour){
		this.jour = jour;
	}
	// surcharge de la méthode toString
	public String toString(){
		return jour;
	} 



}	