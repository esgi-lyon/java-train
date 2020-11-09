package exo1;

import java.util.ArrayList;
import java.util.Comparator;

public class Teacher {
    public String name;
    public String lastname;
    private int socialNum;
    private int oldeness;

    public Teacher(String name, String lastname, int socialNum, int oldeness) {
        this.name = name;
        this.lastname = lastname;
        this.socialNum = socialNum;
        this.oldeness = oldeness;
    }

    public int getSalary() {
        return this.oldeness * 50 + 1600;
    }

    public static ArrayList<Teacher> compareListBySalary(ArrayList<Teacher> listE) {
        listE.sort(Comparator.comparing(o -> o.getSalary()));

        return listE;
    }

    public static Teacher getHigherSalary(ArrayList<Teacher> listE) {
        return compareListBySalary(listE).get(listE.size() - 1);
    }

    protected static Teacher compareBySalary(Teacher e1, Teacher e2) {
        return e1.getSalary() >= e2.getSalary()
                ? e1
                : e2;
    }

    public int getOldeness() {
        return oldeness;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", socialNum=" + socialNum +
                ", oldeness=" + oldeness +
                '}';
    }
}
