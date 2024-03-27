package com.protek.app.challenge1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MyDateTest {
    @Test
    public void testMyDateClass() {
        int year = 2001;
        int month = 3;
        int day = 29;

        final MyDate testDate = new MyDate(year, month, day);

        String expectedValue = "2001-3-29";

        assertEquals(expectedValue, testDate.toString());
        assertEquals(year, testDate.getYear());
        assertEquals(month, testDate.getMonth());
        assertEquals(day, testDate.getDay());

        year = 2020;
        month = 5;
        day = 12;
        expectedValue = "2020-5-12";

        testDate.setYear(year);
        testDate.setMonth(month);
        testDate.setDay(day);

        assertEquals(expectedValue, testDate.toString());
        assertEquals(year, testDate.getYear());
        assertEquals(month, testDate.getMonth());
        assertEquals(day, testDate.getDay());
    }

    @Test
    public void equalsMethodTest() {
        final MyDate testDate = new MyDate(2021, 2, 1);
        final MyDate testDateOtherObject = new MyDate(2021, 2, 1);

        final MyDate testDateYearNotEqual = new MyDate(2022, 2, 1);
        final MyDate testDateMonthNotEqual = new MyDate(2021, 1, 1);
        final MyDate testDateDayNotEqual = new MyDate(2021, 2, 4);

        assertEquals(testDate, testDate);
        assertEquals(testDateOtherObject, testDate);

        assertNotEquals(testDateYearNotEqual, testDate);
        assertNotEquals(testDateMonthNotEqual, testDate);
        assertNotEquals(testDateDayNotEqual, testDate);

        assertNotEquals(testDate, "differentObject");
    }
}
