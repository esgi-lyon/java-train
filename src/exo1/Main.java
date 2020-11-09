package exo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("Habibou", "de Debezede", 3, 2019);
        Etudiant e2 = new Etudiant("Brad", "Pitre", 2, 2017);

        ArrayList<Etudiant> eList = new ArrayList<Etudiant>();
        eList.add(e1);
        eList.add(e2);

        System.out.println(
                Etudiant.getHigherRegisterCost(eList).getRegisterCost()
        );

        Teacher t1 = new Teacher("Ryan", "Grosseligne", 30, 30);
        Teacher t2 = new Teacher("Britney", "Spritz", 22, 13);
        Teacher t3 = new Teacher("Ba ba baw", "le J", 29, 10);

        ArrayList<Teacher> tList = new ArrayList<Teacher>();
        tList.add(t1);
        tList.add(t2);
        tList.add(t3);
        System.out.println(Teacher.getHigherSalary(tList).getSalary());
    }
}
