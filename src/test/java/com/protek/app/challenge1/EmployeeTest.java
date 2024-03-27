package com.protek.app.challenge1;

import com.protek.app.MyDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
    public void testEmployeeClass() {
        final String name = "John Doe";
        final String address = "7821 Rutherford Ave. #121, Paris, Texas";
        final String phoneNumber = "(212)678-1234";
        final String emailAddress = "johnDoe1239@hotmail.com";
        final String office = "Big office";
        final double salary = 12321.21;
        final MyDate dateHired = new MyDate(2021, 2, 1);

        final Employee testEmployee = new Employee(
                name, address, phoneNumber, emailAddress,
                office, salary, dateHired
        );

        final String expectedValue = "John Doe(Employee.class)";
        assertEquals(expectedValue, testEmployee.toString());
        assertEquals(name, testEmployee.getName());
        assertEquals(address, testEmployee.getAddress());
        assertEquals(phoneNumber, testEmployee.getPhoneNumber());
        assertEquals(emailAddress, testEmployee.getEmailAddress());
        assertEquals(office, testEmployee.getOffice());
        assertEquals(salary, testEmployee.getSalary());
        assertEquals(dateHired, testEmployee.getDateHired());
    }
}
