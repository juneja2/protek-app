package com.protek.app.challenge2;

import com.protek.app.MyDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductionWorkerTest {
    @Test
    public void testProductionWorkerClass() {
        final String name = "John Doe";
        final String employeeNumber = "123-D";
        final MyDate hireDate = new MyDate(2021, 2, 1);
        final int shift = 1;
        final double hourlyRate = 15.89;

        final ProductionWorker testProductionWorker = new ProductionWorker(
                name, employeeNumber, hireDate, shift, hourlyRate
        );
        assertEquals(name, testProductionWorker.getName());
        assertEquals(employeeNumber, testProductionWorker.getNumber());
        assertEquals(hireDate, testProductionWorker.getHireDate());
        assertEquals(shift, testProductionWorker.getShift());
        assertEquals(hourlyRate, testProductionWorker.getHourlyRate());
        assertTrue(testProductionWorker instanceof Employee);
    }
}
