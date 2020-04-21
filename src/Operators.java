public class Operators {
    static final String D = " ==]";
    static final String S = "[== ";

    public static void main(String[] args) {
        System.out.println(S + "Opérateurs" + D);
        int i = 3;
        System.out.println(i++); // notation post fixé (passe à 4 après l'affichage)
        System.out.println(++i); // notation préfixée (passe à 5 puis affiche)

        System.out.println(S + "Modulo" + D);
        System.out.println(5 % 3);
        System.out.println(5 % (-3));
        // modulo inexact avec des valeurs négatives
        // System.out.println((-5) % 3);
        // System.out.println((-5) % (-3));

        // System.out.println(S + "Perte précision (float/double)" + D);
        // play with float errors
        // for (float j = 0.0f; j < 1.0f; j += 0.1f) {
        // System.out.println("float : " + j);
        // System.out.println((double) j);
        // }

        System.out.println(S + "instruction ternaire" + D);
        int num = 8;
        if (num < 10) {
            System.out.println("n < 10");
        } else {
            System.out.println("n > 10");
        }
        // version ternaire
        String msg = num < 10 ? "n < 10" : "n > 10";

        System.out.println(msg);

        System.out.println(S + "Switch" + D);
        switch (num) {
            case 8:
                System.out.println("8");
                break;
            case 10:
                System.out.println("10");
                break;
            case 12:
                System.out.println("12");
                break;
            default:
                System.out.println("def");
        }

        System.out.println(S + "Foreach" + D);
        int[] tablo = { 0, 2, 4, 6, 8, 10, 12 };

        for (int retour : tablo) {
            System.out.println(retour);
        }

        String[] tablo2 = { "a", "b", "c" };

        for (String retour : tablo2) {
            System.out.println(retour);
        }
    }
}
