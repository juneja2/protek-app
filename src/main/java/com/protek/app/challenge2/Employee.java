package com.protek.app.challenge2;

import com.protek.app.MyDate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    public static final String INVALID_EMPLOYEE_NUMBER_ERROR_MESSAGE =
            "'%s' is an invalid employee number. The employee number should match XXX-L format where" +
            "each X represents a digit from 0-9 and L represents uppercase letter from A to M";

    private String name;
    private String number;
    private MyDate hireDate;

    public Employee(final String employeeName, final String employeeNumber, final MyDate hireDate) {
        setName(employeeName);
        setNumber(employeeNumber);
        setHireDate(hireDate);
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public MyDate getHireDate() {
        return hireDate;
    }

    /**
     * TODO: Right now there are now validations in the setter method except for setNumber method
     * but in future they can be added as needed.
     * */
    public void setName(final String employeeName) {
        this.name = employeeName;
    }

    private void validateNumber(final String employeeNumber) {
        final Pattern pattern = Pattern.compile("\\d{3}-[A-M]", Pattern.CASE_INSENSITIVE);
        final Matcher matcher = pattern.matcher(employeeNumber);
        final boolean matchFound = matcher.find();
        if (!matchFound) {
            throw new IllegalArgumentException(String.format(INVALID_EMPLOYEE_NUMBER_ERROR_MESSAGE, employeeNumber));
        }
    }

    public void setNumber(final String employeeNumber) {
        validateNumber(employeeNumber);
        this.number = employeeNumber;
    }

    public void setHireDate(final MyDate hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * TODO: Right now, 3 methods are missing: toString, equals and hashCode which are important methods for classes.
     * But they have been removed for the sake of simplicity and can be added later if needed.
     * See this article for more details - https://www.baeldung.com/java-equals-hashcode-contracts
     * */
}
