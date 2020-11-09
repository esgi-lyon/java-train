package exo1;

import java.util.ArrayList;
import java.util.Comparator;

public class Etudiant {
    public String name;
    public String lastname;
    private int socialNum;
    private int graduationYear;

    public Etudiant(String name, String lastname, int socialNum, int graduationYear) {
        this.name = name;
        this.lastname = lastname;
        this.socialNum = socialNum;
        this.graduationYear = graduationYear;
    }

    public int getRegisterCost() {
        return this.graduationYear * 150;
    }

    public static ArrayList<Etudiant> compareListByRegisterCost(ArrayList<Etudiant> listE) {
        listE.sort(Comparator.comparing(o -> o.getRegisterCost()));

        return listE;
    }

    public static Etudiant getHigherRegisterCost(ArrayList<Etudiant> listE) {
        return compareListByRegisterCost(listE).get(listE.size() - 1);
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", socialNum=" + socialNum +
                ", graduationYear=" + graduationYear +
                '}';
    }
}
