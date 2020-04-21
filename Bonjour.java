public class Bonjour
{
	static String message = "Bonjour tout le monde !";
	public static String terrible = "terrible";
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
	}
}