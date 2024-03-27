package com.protek.app.challenge1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testPersonClass() {
        final String name = "John Doe";
        final String address = "7821 Rutherford Ave. #121, Paris, Texas";
        final String phoneNumber = "(212)678-1234";
        final String emailAddress = "johnDoe1239@hotmail.com";

        final Person testPerson = new Person(name, address, phoneNumber, emailAddress);

        final String expectedValue = "John Doe(Person.class)";
        assertEquals(expectedValue, testPerson.toString());
        assertEquals(name, testPerson.getName());
        assertEquals(address, testPerson.getAddress());
        assertEquals(phoneNumber, testPerson.getPhoneNumber());
        assertEquals(emailAddress, testPerson.getEmailAddress());
    }
}
