package intro;

import java.util.ArrayList;

public class Etudiant {
    private int num_Etu;
    private String nom, prenom;

    public Etudiant() {

    }

    public Etudiant(int num_Etu, String nom, String prenom) {
        super();
        this.num_Etu = num_Etu;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getNum_Etu() {
        return num_Etu;
    }

    public void setNum_Etu(int num_Etu) {
        this.num_Etu = num_Etu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void affichage() {
        System.out.println(
                "\nPrenom : " + this.prenom + " Nom : " + this.nom + " Num etu : " + this.num_Etu
        );
    }

    public static void affichageList(ArrayList<Etudiant> listE) {
        int j = 0;
        while (j < listE.size()) {
            listE.get(j).affichage();
            j++;
        }
    }
}
