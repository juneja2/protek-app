package com.protek.app.challenge1;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(
            final String name, final String address, final String phoneNumber,
            final String emailAddress, final String office, final double salary, final MyDate dateHired
    ) {
        super(name, address, phoneNumber, emailAddress);
        setOffice(office);
        setSalary(salary);
        setDateHired(dateHired);
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    /**
     * TODO: Right now there are now validations in the setter method but in future they can be added as needed.
     * */

    public void setOffice(final String office) {
        this.office = office;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public void setDateHired(final MyDate dateHired) {
        this.dateHired = dateHired;
    }

    /**
     * TODO: Right now, 2 methods are missing: equals and hashCode which are important methods for classes.
     * But they have been removed for the sake of simplicity and can be added later if needed.
     * See this article for more details - https://www.baeldung.com/java-equals-hashcode-contracts
     * */
}
