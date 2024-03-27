package com.protek.app.challenge2;

import com.protek.app.MyDate;

public class ProductionWorker extends Employee {
    private int shift;
    private double hourlyRate;

    public ProductionWorker(
            final String employeeName, final String employeeNumber, final MyDate hireDate,
            final int shift, final double hourlyRate
    ) {
        super(employeeName, employeeNumber, hireDate);
        setShift(shift);
        setHourlyRate(hourlyRate);
    }

    public int getShift() {
        return shift;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * TODO: Right now there are now validations in the setter method but in future they can be added as needed.
     * */
    public void setShift(final int shift) {
        this.shift = shift;
    }

    public void setHourlyRate(final double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * TODO: Right now, 3 methods are missing: toString, equals and hashCode which are important methods for classes.
     * But they have been removed for the sake of simplicity and can be added later if needed.
     * See this article for more details - https://www.baeldung.com/java-equals-hashcode-contracts
     * */
}
