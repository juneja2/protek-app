package com.protek.app.challenge1;

public class Student extends Person {
    enum Status {
        FRESHMAN,
        SOPHOMORE,
        JUNIOR,
        SENIOR
    }

    private final Status status;

    public Student(
            final String name, final String address, final String phoneNumber,
            final String emailAddress, final Status status
    ) {
        super(name, address, phoneNumber, emailAddress);
        /** TODO: Add validation for status if necessary */
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    /**
     * TODO: Right now, 2 methods are missing: equals and hashCode which are important methods for classes.
     * But they have been removed for the sake of simplicity and can be added later if needed.
     * See this article for more details - https://www.baeldung.com/java-equals-hashcode-contracts
     * */
}
