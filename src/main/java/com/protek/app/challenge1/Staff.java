package com.protek.app.challenge1;

import java.util.List;

public class Staff extends Employee {
    private String title;

    public Staff(
            final String name, final String address, final String phoneNumber,
            final String emailAddress, final String office, final double salary,
            final MyDate dateHired, final String title
    ) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    /**
     * TODO: Right now there are now validations in the setter method but in future they can be added as needed.
     * */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * TODO: Right now, 2 methods are missing: equals and hashCode which are important methods for classes.
     * But they have been removed for the sake of simplicity and can be added later if needed.
     * See this article for more details - https://www.baeldung.com/java-equals-hashcode-contracts
     * */
}
