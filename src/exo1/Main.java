package exo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student e1 = new Student(1, 33, "Habibou", "de Debezede", 2019);
        Student e2 = new Student(2, 44, "Brad", "Pitre", 2017);

        ArrayList<Student> eList = new ArrayList<Student>();
        eList.add(e1);
        eList.add(e2);

        Student sWithHigherRegisterCost = Student.getWithHigherRegisterCost(eList);
        System.out.println("Student " + sWithHigherRegisterCost.name + " has higher register cost of : " + sWithHigherRegisterCost.getRegisterCost());

        System.out.println("=================");

        Teacher t1 = new Teacher(1, 30, "Ryan", "Grosseligne", 30);
        Teacher t2 = new Teacher(2, 20, "Britney", "Spritz", 13);
        Teacher t3 = new Teacher(2, 23, "le J", "c'est le S", 13);

        ArrayList<Teacher> tList = new ArrayList<Teacher>();
        tList.add(t1);
        tList.add(t2);
        tList.add(t3);
        Teacher tWithHighSalary = Teacher.getWithHigherSalary(tList);

        System.out.println("Teacher " + tWithHighSalary.name + " has higher salary of : " + tWithHighSalary.getSalary());
    }
}
