package com.protek.app.challenge1;

import com.protek.app.MyDate;

import java.util.List;

public class Faculty extends Employee {
    private List<String> officeHours;
    private String rank;

    public Faculty(
            final String name, final String address, final String phoneNumber,
            final String emailAddress, final String office, final double salary,
            final MyDate dateHired, final List<String> officeHours, final String rank
    ) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        setOfficeHours(officeHours);
        setRank(rank);
    }

    public List<String> getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    /**
     * TODO: Right now there are now validations in the setter method but in future they can be added as needed.
     * */
    public void setOfficeHours(final List<String> officeHours) {
        this.officeHours = officeHours;
    }

    public void setRank(final String rank) {
        this.rank = rank;
    }

    /**
     * TODO: Right now, 2 methods are missing: equals and hashCode which are important methods for classes.
     * But they have been removed for the sake of simplicity and can be added later if needed.
     * See this article for more details - https://www.baeldung.com/java-equals-hashcode-contracts
     * */
}
