package com.protek.app.challenge1;

import com.protek.app.MyDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaffTest {
    @Test
    public void testStaffClass() {
        final String name = "John Doe";
        final String address = "7821 Rutherford Ave. #121, Paris, Texas";
        final String phoneNumber = "(212)678-1234";
        final String emailAddress = "johnDoe1239@hotmail.com";
        final String office = "Big office";
        final double salary = 12321.21;
        final MyDate dateHired = new MyDate(2021, 2, 1);
        final String title = "Vice Principal";

        final Staff testStaff = new Staff(
                name, address, phoneNumber, emailAddress, office, salary, dateHired, title
        );

        final String expectedValue = "John Doe(Staff.class)";
        assertEquals(expectedValue, testStaff.toString());
        assertEquals(name, testStaff.getName());
        assertEquals(address, testStaff.getAddress());
        assertEquals(phoneNumber, testStaff.getPhoneNumber());
        assertEquals(emailAddress, testStaff.getEmailAddress());
        assertEquals(office, testStaff.getOffice());
        assertEquals(salary, testStaff.getSalary());
        assertEquals(dateHired, testStaff.getDateHired());
        assertEquals(title, testStaff.getTitle());
    }
}
