package td2;

import java.util.*;

class SellEmployee extends Employee {
    public int revenue;

    public SellEmployee(
            String firstName,
            String lastname,
            String phoneNumber,
            GregorianCalendar dateOfBirth,
            GregorianCalendar hiredAt,
            int revenue
    ) {
        super(firstName, lastname, phoneNumber, dateOfBirth, hiredAt);
        this.revenue = revenue;
    }

    public void computeSalary() {
        this.setSalary((this.revenue * 0.25) + 400);
    }
}