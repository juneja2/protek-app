package com.protek.app.challenge1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacultyTest {
    @Test
    public void testFacultyClass() {
        final String name = "John Doe";
        final String address = "7821 Rutherford Ave. #121, Paris, Texas";
        final String phoneNumber = "(212)678-1234";
        final String emailAddress = "johnDoe1239@hotmail.com";
        final String office = "Big office";
        final double salary = 12321.21;
        final MyDate dateHired = new MyDate(2021, 2, 1);
        final List<String> officeHours = List.of(
                "9:00 am - 10:00 am",
                "4:30 pm - 5:30 pm"
        );
        final String rank = "Professor";

        final Faculty testFaculty = new Faculty(
                name, address, phoneNumber, emailAddress, office, salary, dateHired, officeHours, rank
        );

        final String expectedValue = "John Doe(Faculty.class)";
        assertEquals(expectedValue, testFaculty.toString());
        assertEquals(name, testFaculty.getName());
        assertEquals(address, testFaculty.getAddress());
        assertEquals(phoneNumber, testFaculty.getPhoneNumber());
        assertEquals(emailAddress, testFaculty.getEmailAddress());
        assertEquals(office, testFaculty.getOffice());
        assertEquals(salary, testFaculty.getSalary());
        assertEquals(dateHired, testFaculty.getDateHired());
        assertEquals(officeHours, testFaculty.getOfficeHours());
        assertEquals(rank, testFaculty.getRank());
    }
}
