package td1.exo1;

import java.util.ArrayList;
import java.util.Comparator;

public class Student extends Person {
    public String name;
    public String lastname;
    private int socialNum;
    private int graduationYear;

    public Student(int id, int socialNum, String name, String lastname, int graduationYear) {
        super(id, socialNum, name, lastname);
        this.name = name;
        this.lastname = lastname;
        this.socialNum = socialNum;
        this.graduationYear = graduationYear;
    }

    public int getRegisterCost() {
        return this.graduationYear * 150;
    }

    public static ArrayList<Student> compareListByRegisterCost(ArrayList<Student> listE) {
        listE.sort(Comparator.comparing(o -> o.getRegisterCost()));

        return listE;
    }

    public static Student getWithHigherRegisterCost(ArrayList<Student> listE) {
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
