package td2;

import java.util.*;

class ProductionEmployee extends Employee {

    public double producedUnits;

    public ProductionEmployee(
            String firstName,
            String lastname,
            String phoneNumber,
            GregorianCalendar dateOfBirth,
            GregorianCalendar hiredAt,
            double producedUnities
    ) {
        super(firstName, lastname, phoneNumber, dateOfBirth, hiredAt);
        this.producedUnits = producedUnities;
    }

    public void computeSalary() {
        this.setSalary(this.producedUnits * 4);
    }
}