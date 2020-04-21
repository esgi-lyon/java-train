import java.util.Arrays;
import java.util.Collections;

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
		// Manipulation de tableaux
		System.out.println("La matrice comporte " + matrice2.length + " tableaux sur " + matrice2[0].length + " cases.");
		// Création du tableau1 pour utiliser binarySearch
		Integer[] tableau1 = {1234,888,986,678,564,123,789,352,987};
		Arrays.sort(tableau1); // tri du tableau
		// Recherche d'une valeur dans le tableau
		System.out.println(Arrays.binarySearch(tableau1, 123));
		System.out.println(Arrays.toString(tableau1));
		for (int i=0 ; i<tableau1.length; i++) {
			System.out.println(tableau1[i] + "\t");
		}
		// Inversion du tableau
		Arrays.sort(tableau1, Collections.reverseOrder());
		System.out.println(Arrays.deepToString(tableau1));
		// Copie d'un tableau
		Integer[] copieTableau1 = Arrays.copyOf(tableau1, tableau1.length);
		Arrays.sort(copieTableau1);
		System.out.println(Arrays.toString(copieTableau1));
		// Copie d'une partie d'un tableau
		Integer[] copieTableauPart3;
		copieTableauPart3 = Arrays.copyOfRange(copieTableau1, 0, 3);
		System.out.println(Arrays.toString(copieTableauPart3));
		// Méthode fill
		Arrays.fill(copieTableau1, 9);
		System.out.println(Arrays.toString(copieTableau1));
		// Chaines de caractères
		String chaine1 = "chaine";
		String chaine2 = new String("chaine");
		chaine1 = "il a dit : \"ça suffit !\"";
		// Utilisation mode length
		System.out.println("La chaine1 contient " + chaine1.length() + " caractères.");
		// Test de concaténation
		chaine1 += " test";
		System.out.println(chaine1);
		// Utilisation de charAt
		System.out.println("Le troisième caractère de la chaine est " + chaine1.charAt(0));
		// Utilisation de la méthode substring
		System.out.println("Un morceau de la chaine : " + chaine1.substring(5, chaine1.length()));
		// Utilisation de equals
		if(chaine1.equals(chaine2)){
			System.out.println("Les chaines sont identiques");
		} else {
			System.out.println("Les chaines sont différents");
		}
		String chaine3 = "ma chaine 3";
		String chaine4 = "ma ChainE 3";
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