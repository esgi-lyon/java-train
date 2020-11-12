package td2;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new ProductionEmployee(
                "Manuel",
                "Mentautomatiquement",
                "09090090901",
                new GregorianCalendar(1999, 1, 18),
                new GregorianCalendar(2019, 12, 23),
                340
        );

        Employee e2 = new SellEmployee(
                "Habibou",
                "de debezede",
                "09090090909",
                new GregorianCalendar(1990, 8, 1),
                new GregorianCalendar(2009, 10, 8),
                9000
        );

        e1.calculateSalaryWithBonus();
        e2.calculateSalaryWithBonus();

        System.out.println("ProductionEmployee 1 win : " + e1.getSalary() + " / month");
        System.out.println("SellEmployee 2 win : " + e2.getSalary() + " / month");
    }
}
