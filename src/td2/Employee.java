package td2;

import java.util.*;

abstract class Employee {
    private String firstName;
    private String lastname;
    private String phoneNumber;
    private GregorianCalendar hiredAt;
    private GregorianCalendar dateOfBirth;
    private double salary;

    public Employee(
            String firstName,
            String lastname,
            String phoneNumber,
            GregorianCalendar dateOfBirth,
            GregorianCalendar hiredAt
    ) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.hiredAt = hiredAt;
        this.salary = 0;
    }

    public void calculateSalaryWithBonus() {
        this.computeSalary();
        this.salary = this.computeSeniority() >= 5
                ? this.salary * 1.7
                : this.salary * 1.2;
    }

    public int computeSeniority() {
        int seniority = (new GregorianCalendar()).get(GregorianCalendar.YEAR)
                - this.hiredAt.get(GregorianCalendar.YEAR);

        return seniority > 0 ? seniority : 1;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract public void computeSalary();
}