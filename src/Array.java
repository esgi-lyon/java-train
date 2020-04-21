import java.util.Arrays;
import java.util.Collections;

public class Array {
    static final String D = " ==]";
    static final String S = "[== ";

    public static void main(String[] args) {
        System.out.println("Arrays");
        System.out.println(S+"Stockage et manipulation dans un tableau"+D);
        int[] ca;
        ca = new int[5];
        ca[0] = 25;
        System.out.println(Arrays.toString(ca));

        System.out.println(S+"One liner array"+D);
        int[] copieCa = {1,2,3,99};
        System.out.println(Arrays.toString(copieCa));  

        System.out.println(S+"Multi dimension array"+D);
        int[][] matrice; // déclaration tableau 2 dimensions
        matrice = new int [2][4]; // création
        matrice[0][0] = 99; // stockage 0 => 0 => 99
        System.out.println(Arrays.deepToString(matrice));
        int[][] matrice2={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrice2));

        System.out.println(S+"Manip tableau"+D);
        System.out.println("Matrice comporte "
            + matrice2.length
            + " tableaux sur "+matrice2[0].length
            + " cases");

        System.out.println(S+"Binary search"+D);
        Integer[] tableau1 = {1224,888, 986, 678, 123, 789, 325, 568, 987};
        Arrays.sort(tableau1); // tri du tableau
        System.out.println(Arrays.binarySearch(tableau1,123)); // binary search
        System.out.println(Arrays.toString(tableau1));

        //System.out.println(S+"Loop Array"+D);

        // for (int i=0;i< tableau1.length;i++) {
        //     System.out.println(tableau1[i]+"\t");
        // }

        System.out.println(S+"ASC array"+D);
        System.out.println(Arrays.toString(tableau1));
        Integer[] copieTableau1  = Arrays.copyOf(tableau1, tableau1.length);
        System.out.println(S+"DESC array"+D);
        Arrays.sort(copieTableau1, Collections.reverseOrder());
        System.out.println(Arrays.toString(copieTableau1));
        // copie un tableau
        Integer[] copieTableau3;
        System.out.println(S+"Show range"+D);
        copieTableau3  = Arrays.copyOfRange(tableau1, 0, 3);
        System.out.println(Arrays.toString(copieTableau3));
        // méthode fill array
        int[] videTab = {0, 1};
        Arrays.fill(videTab, 2);
        System.out.println(Arrays.toString(videTab));
    }
}