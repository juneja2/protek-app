package com.protek.app.challenge1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @ParameterizedTest
    @ValueSource(strings = {"FRESHMAN", "SOPHOMORE", "JUNIOR", "SENIOR"})
    public void testStudentClass(final String statusStr) {
        final String name = "John Doe";
        final String address = "7821 Rutherford Ave. #121, Paris, Texas";
        final String phoneNumber = "(212)678-1234";
        final String emailAddress = "johnDoe1239@hotmail.com";
        final Student.Status status = Student.Status.valueOf(statusStr);

        final Student testStudent = new Student(name, address, phoneNumber, emailAddress, status);

        final String expectedValue = "John Doe(Student.class)";
        assertEquals(expectedValue, testStudent.toString());
        assertEquals(name, testStudent.getName());
        assertEquals(address, testStudent.getAddress());
        assertEquals(phoneNumber, testStudent.getPhoneNumber());
        assertEquals(emailAddress, testStudent.getEmailAddress());
        assertEquals(status, testStudent.getStatus());
    }
}
