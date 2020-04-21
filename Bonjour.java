import java.util.Arrays;
import java.util.Collections;

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
		// manipulation de tableau
		System.out.println("Le matrice comporte "
			+ matrice2.length
			+ " tableaux sur "+matrice2[0].length
			+ " cases");
		// création du tableau pour utiliser binarySearch
		Integer[] tableau1 = {1234,456,789,453,459,786,78,259,45,23,56,85,78};
		// tri du tableau
		Arrays.sort(tableau1);
		// Recherche d'une valeur dans le tableau
		System.out.println(Arrays.binarySearch(tableau1, 23));
		System.out.println(Arrays.toString(tableau1));
		for(int i = 0; i<tableau1.length;i++){
			System.out.println(tableau1[i] + "\t");
		}
		// inversion du tableau
		Arrays.sort(tableau1, Collections.reverseOrder());
		System.out.println(Arrays.deepToString(tableau1));
		// copier tableau1
		Integer[] copieTableau1 = Arrays.copyOf(tableau1, 13);
		Arrays.sort(copieTableau1);
		System.out.println(Arrays.toString(copieTableau1));
		// Copie d'une partie d'un tableau
		Integer[] copieTableauPart3;
		copieTableauPart3 = Arrays.copyOfRange(copieTableau1, 0, 3);
		System.out.println(Arrays.toString(copieTableauPart3));
		// methode fill
		Arrays.fill(copieTableau1, 9);
		System.out.println(Arrays.toString(copieTableau1));
		// chaînes de caractères
		String chaine1 = "chaine1";
		String chaine2 = new String("chaine");
		chaine1 = "il a dit : \"ça suffit !\"";
		// utilisation methode length
		System.out.println("La chaine1 contient "
			+chaine1.length() + " caractères");
		chaine1 += "test";
		System.out.println(chaine1);
		// utilisation de charAt
		System.out.println("Le troisième caractère de la chaine est : "
			+ chaine1.charAt(0));
		// utilisation de la méthode substring
		System.out.println("Un morceau de la chaine "
			+chaine1.substring(5, chaine1.length()));
		// utilisation  de equals
		if(chaine1.equals(chaine2)){
			System.out.println("Les chaines de caractère sont identiques");
		}
		else{
			System.out.println("Les chaines sont différentes");
		}
		// ================================
		// non conforme, compare les emplacements mémoire
		if(chaine1 == chaine2){
			System.out.println("Les chaines de caractère sont identiques");
		}
		else{
			System.out.println("Les chaines sont différentes");
		}
		// ================================
		String chaine3 = "ma chaine3";
		String chaine4 = "ma chaiNe3";
		if(chaine3.equals(chaine4)){
			System.out.println("les chaines sont identiques");
		}
		else{
			System.out.println("les chaines	sont différentes");
		}
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