package com.protek.app.challenge2;

import com.protek.app.MyDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    @Test
    public void testEmployeeClass() {
        final String name = "John Doe";
        final String employeeNumber = "123-D";
        final MyDate hireDate = new MyDate(2021, 2, 1);

        final Employee testEmployee = new Employee(name, employeeNumber, hireDate);
        assertEquals(name, testEmployee.getName());
        assertEquals(employeeNumber, testEmployee.getNumber());
        assertEquals(hireDate, testEmployee.getHireDate());
    }

    @Test
    public void testEmployeeClassWithInvalidEmployeeNumber_throwsIllegalArgumentException() {
        final String name = "John Doe";
        final String employeeNumber = "A23-D";
        final MyDate hireDate = new MyDate(2021, 2, 1);

        final IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Employee(name, employeeNumber, hireDate)
        );

        final String expectedErrorMessage = String.format(
                Employee.INVALID_EMPLOYEE_NUMBER_ERROR_MESSAGE, employeeNumber
        );
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
}
