package com.protek.app.challenge1;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person(final String name, final String address, final String phoneNumber, final String emailAddress) {
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmailAddress(emailAddress);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    /**
     * TODO: Right now there are now validations in the setter method but in future they can be added as needed.
     * */

    public void setName(final String name) {
        this.name = name;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return String.format("%s(%s.class)", name, this.getClass().getSimpleName());
    }

    /**
     * TODO: Right now, 2 methods are missing: equals and hashCode which are important methods for classes.
     * But they have been removed for the sake of simplicity and can be added later if needed.
     * See this article for more details - https://www.baeldung.com/java-equals-hashcode-contracts
     * */
}
