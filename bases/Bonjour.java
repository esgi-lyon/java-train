package bases;

public class Bonjour {
    static final String D = " ==]";
    static final String S = "[== ";
    static String message = "Bonjour tout le monde !";

    public static void main(String[] args) {
        System.out.println(S + "Bjr" + D);
        System.out.println(message);
        int b = 25;
        System.out.println(S + "Int" + D);
        System.out.println(b);
        System.out.println(S + "Instanciation des types+" + D);
        float c = 2.3F;
        System.out.println(c);
        System.out.println(S + "jeu types" + D);
        float surface = 1222.2f;
        surface = 230.6f;
        surface = (float) 230.6f;
        System.out.println(surface);
        System.out.println(S + "Conv types" + D);
        int aproximation;
        aproximation = (int) surface;
        System.out.println(aproximation);
        System.out.println(S + "Double conv" + D);
        double prixHT = 152;
        System.out.println(S + "Conversion implicite" + D);
        String recap = "Le montant est" + prixHT;
        System.out.println(recap);
        System.out.println(S + "Conversion explicite" + D);
        String recap1 = "Le montant est " + String.valueOf(prixHT);
        System.out.println(recap1);
        System.out.println(S + "Double" + D);
        String prix = "500";
        double dprix = Double.parseDouble(prix);
        System.out.println(dprix);
        // BREAKING CODE (Out of byte range number)
        // System.out.println("== terrible ==");
        // Throw error prix > 500 > limit range of type byte
        // byte bprix = Byte.parseByte(prix);
        // System.out.println(bprix);
        final double tauxTVA = 1.196;
        System.out.println(S + "Constantes" + D);
        double prixTTC = prixHT * tauxTVA;
        System.out.println(prixTTC);
        System.out.println(S + "Constantes préféfinies (cercle)" + D);
        double radius = 15;
        double len = 15;
        double area;
        // surface cercle
        area = Math.PI * radius * radius;
        System.out.println(area);
        // volume cercle
        double volume = area * len;
        System.out.println(volume);
        System.out.println(S + "Enumerations" + D);
        System.out.println(Jours.MARDI);
    }
}

enum Jours {
    // decla
    DIMANCHE("it\" DIM"), LUNDI("LUN"), MARDI("MON"), MERCREDI("MER"), JEUDI("JEU"), VENDREDI("VEND"), SAMEDI("SAM");

    // dec var jour
    private String jour = "";

    // Constructeur
    Jours(String jour) {
        this.jour = jour;
    }

    public String toString() {
        return jour;
    }
}