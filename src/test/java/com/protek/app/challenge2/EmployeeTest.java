package com.protek.app.challenge2;

import com.protek.app.MyDate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    @ParameterizedTest
    @ValueSource(strings = {"012-D", "345-A", "678-M", "901-G"})
    public void testEmployeeClass(final String validEmployeeNumber) {
        final String name = "John Doe";
        final MyDate hireDate = new MyDate(2021, 2, 1);

        final Employee testEmployee = new Employee(name, validEmployeeNumber, hireDate);
        assertEquals(name, testEmployee.getName());
        assertEquals(validEmployeeNumber, testEmployee.getNumber());
        assertEquals(hireDate, testEmployee.getHireDate());
    }

    @ParameterizedTest
    @ValueSource(strings = { "A23-D", "345-d", "678-N", "123", "-G" })
    public void testEmployeeClassWithInvalidEmployeeNumber_throwsIllegalArgumentException(
            final String invalidEmployeeNumber
    ) {
        final String name = "John Doe";
        final MyDate hireDate = new MyDate(2021, 2, 1);

        final IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Employee(name, invalidEmployeeNumber, hireDate)
        );

        final String expectedErrorMessage = String.format(
                Employee.INVALID_EMPLOYEE_NUMBER_ERROR_MESSAGE, invalidEmployeeNumber
        );
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
}
