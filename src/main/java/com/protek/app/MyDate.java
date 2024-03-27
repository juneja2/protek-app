package com.protek.app;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(final int year, final int month, final int day) {
        validate(year, month, day);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private void validate(final int year, final int month, final int day) {
        /** TODO: In future, add validations for the year, month and day combined */
    }

    public void setYear(final int year) {
        validate(year, month, day);
        this.year = year;
    }

    public void setMonth(final int month) {
        validate(year, month, day);
        this.month = month;
    }

    public void setDay(final int day) {
        validate(year, month, day);
        this.day = day;
    }

    public String toString() {
        return String.format("%d-%d-%d", year, month, day);
    }

    /**
     * TODO: Right now, 1 methods are missing: hashCode which are important methods for classes.
     * But they have been removed for the sake of simplicity and can be added later if needed.
     * See this article for more details - https://www.baeldung.com/java-equals-hashcode-contracts
     * */

    public boolean equals(final Object otherDateObject) {
        if (this == otherDateObject) {
            return true;
        }

        if (otherDateObject instanceof MyDate) {
            final MyDate otherDate = (MyDate) otherDateObject;
            return getYear() == otherDate.getYear() &&
                    getMonth() == otherDate.getMonth() &&
                    getDay() == otherDate.getDay();
        }

        return false;
    }
}
