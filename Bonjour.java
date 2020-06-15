import java.util.Arrays;

public class Bonjour {
	static String message  = "Bonjour tout le monde!";
	static Jours jours;
	public static void main(String[] args) {
		System.out.println(message);
		Integer a = 0;

		float b = 0.25f;

		float surface;
		surface = 2358.8f;
		surface = (float) 2358.8f;
		int aprox;
		aprox = (int) surface;
		
		double PrixHt = 152;
		String montant = "Le montant est: "+ PrixHt; 
		String montant2 = "Le montant est: "+ String.valueOf(PrixHt); 

		String prix = "500";
		double dprix = Double.parseDouble(prix);
		float fprix = Float.parseFloat(prix);
		//byte bprix = Byte.parseByte(prix); impossible car 128 est le max donc out of range

		final double tauxTVA = 1.192;
		double prixTTC = PrixHt*tauxTVA;

		double radius = 15;
		double len = 15; 
		double disque = Math.PI*radius*radius;
		double volume = disque*len;

		System.out.println("Le volume de mon cercle fait: "+ volume);

		
		System.out.println(jours.MARDI);

		int[] chiffreAffaire;
		chiffreAffaire = new int[5];
		chiffreAffaire[0]=25;

		int[] copyChiffreAffaire= {25,26,27,28,29};

		int[][] matrice;
		matrice = new int [2][3];
		matrice[0][0]=99;

		int[][] matrice2= {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(matrice2));
		System.out.println("Le tab comporte "+ matrice2.length + " case sur "+ matrice2[0].length + " cases");
		Integer[] tableau1 = {1234,568,675,921,368,695,836,475,816,581};
		Arrays.sort(tableau1);
		System.out.println(Arrays.binarySearch(tableau1, 568));
		System.out.println(Arrays.toString(tableau1));
		for(int i=0; i<tableau1.length;i++) {
			System.out.println(tableau1[i] + "\t");
		}
		Integer[]copietab1 = Arrays.copyOf(tableau1, 10);
		System.out.println(copietab1);

		Integer[]copytabpart3=Arrays.copyOfRange(copietab1, 0, 3);
		System.out.println(Arrays.toString(copytabpart3));

		Arrays.fill(tableau1, 9);
		System.out.println(Arrays.toString(tableau1));

		String chaine1 = "chaine";
		chaine1 = "il a dis: \"ca suffit!\"";
		System.out.println("La chaine1 contient " +chaine1.length() + "caractères");

		chaine1 += " test";
		System.out.println(chaine1);

		System.out.println("le troisième caract de la chaine est "+ chaine1.charAt(3));

		System.out.println("un morceau de la chaine est "+ chaine1.substring(5,chaine1.length()));

		if(chaine1.equals(prix)) {//Compare emplacement mémoire
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		String ChaineT= "N";
		String ChaineB ="n";
		
		if(ChaineT.equals(ChaineB)) {//Compare emplacement mémoire
			System.out.println("True");
		} else {
			System.out.println("False");
		}
			//Compare emplacement mémoire
		if(ChaineT.compareTo(ChaineB)>0) {
			System.out.println("Diff > 0");
		} else if(ChaineT.compareTo(ChaineB)<0) {
			System.out.println("Diff < 0");
		} else {
			System.out.println("equal");
		}
		String chaineTrim = "   chaine   ";
		System.out.println("longeur de la chaine: "+chaineTrim.length());
		System.out.println("longeur de la chaine netoyé: "+chaineTrim.trim().length());

		System.out.println(ChaineT.toLowerCase());
		System.out.println(ChaineT.toUpperCase());

		String search = "e";
		int position = chaine1.indexOf(search);
		while(position>=0) {
			System.out.println("Chaine trouver a la position "+ position);
			position = chaine1.indexOf(search, position+1);
		}
		System.out.println("End");

		String chaine5 = "l'hiver il fé froid";
		chaine5.replace("hiver", "été");
		chaine5.replace("froid", "chaud");
		System.out.println(chaine5);

		System.out.println(5%3);
		System.out.println(5%(-3));
		System.out.println((-5)%3);
		System.out.println((-5)%(-3));
	 
	}
}
enum Jours{
	DIMANCHE ("C'est 1"),
	LUNDI ("C'est 2"),
	MARDI ("C'est 3"),
	MERCREDI ("C'est 4"),
	JEUDI ("C'est 5"),
	VENDREDI ("C'est 6"),
	SAMEDI ("C'est 7");

	private String jour = "";
	Jours(String jour) {
		this.jour = jour;
	} 
	public String toString() {
		return jour;
	}
}