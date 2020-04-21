public class Strings {
    static final String D = " ==]";
    static final String S = "[== ";

    public static void main(String[] args) {
        System.out.println(S+"String"+D);
        String char1 = "Chaine 1";
        String char2 = new String("Chaine 2");
        char1 = "il a dit \"ça suffit\"";
        System.out.println("Lachaine contient"
            + char1.length() + " caractères");
        char1 += " test";
        System.out.println(char1);

        System.out.println(S+"CharAt"+D);
        System.out.println("Le troisième caractère de la chaîne '"
            + char1
            + "' est : "
            + char1.charAt(1));

        System.out.println(S+"Substring"+D);
        System.out.println("Morceau de la chaine '"
            + char2
            + "' est : "
            + char2.substring(5,8));

        System.out.println(S+"Equals"+D);
        // ====== WARNING ======
        // use equals instead the '==' (this compare memory address)
        if (isEqualsStrings(char1, char2)) {
            System.out.println("equals");
        } else {
            System.out.println("non equals");
        }

        System.out.println(S+"Equals no case"+D);
        // =====================
        String char3 = "toTo";
        String char4 = "toto";
        // use equalIgnoreCase to skip cap verif
        if (isEqualsStringsNoCase(char3, char4)) {
            System.out.println("equals");
        } else {
            System.out.println("non equals");
        }

        System.out.println(S+"Compare to"+D);
        if (char3.compareTo(char4) > 0) {
            System.out.println("ch3 > ch4");
        } else if (char3.compareTo(char4) < 0) {
            System.out.println("ch3 < ch4");
        } else {
            System.out.println("===");
        }

        System.out.println(S+"Start / End With"+D);
        String fichier = "Bonjour.java";
        
        if (fichier.endsWith(".java")) {
            System.out.println("The floor is java");
        }
        
        System.out.println(S+"Use Trim"+D);
        String chaineTrim = "  chaine  ";
        System.out.println("Longueur de la chaine "
            + chaineTrim.length());
        // trim whitespaces
        System.out.println("nettoyée "
            + chaineTrim.trim().length());

        System.out.println(S+"IndexOf"+D);
        String recherche;
        int position;
        recherche = "e";
        position = char1.indexOf(recherche);

        while (position >= 0) {
            System.out.println("Ch trouvée dans :\n"
                + char1
                + "\n à la position "
                + position);
            position = char1.indexOf(recherche, position+1);
            System.out.println(position);
        }
        System.out.println("Research done");

        System.out.println(S+"replace"+D);
        String chaine5 = "L'hiver sera pluvieux";
        chaine5.replace("hiver", "été");
        chaine5.replace("pluvieux", "chaud");
        System.out.println(chaine5);
    }

    protected static boolean isEqualsStrings(String str1, String  str2)
    {
        return str1.equals(str2);
    }

    protected static boolean isEqualsStringsNoCase(String str1, String  str2) {
        return str1.equalsIgnoreCase(str2);
    }

}