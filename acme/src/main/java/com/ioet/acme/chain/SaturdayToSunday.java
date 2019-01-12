package com.ioet.acme.chain;

import com.ioet.acme.data.Period;

public class SaturdayToSunday implements PaymentRule {

    private final Period period;

    public SaturdayToSunday(Period period) {
        this.period = period;
    }

    @Override
    public boolean isInPeriod() {
        return period.day().order() > 5;
    }

    @Override
    public double amount() {
        if (isInPeriod()) {
            return valuePerHour() * period.workedHours();
        }
        return 0;
    }

    private double valuePerHour() {
        if (period.from() > 1800 && (period.to() <= 2359 || period.to() == 0)) {
            return 25;
        }
        if (period.from() > 901 && period.to() <= 1800) {
            return 20;
        }
        if (period.from() > 0 && period.to() <= 900) {
            return 30;
        }
        return 0;
    }
}
