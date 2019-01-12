package com.ioet.acme.chain;

import com.ioet.acme.data.Period;

public class MondayToFriday implements PaymentRule {

    private final Period period;
    private final PaymentRule next;

    public MondayToFriday(Period period, PaymentRule next) {
        this.period = period;
        this.next = next;
    }

    @Override
    public boolean isInPeriod() {
        return period.day().order() <= 5;
    }

    @Override
    public double amount() {
        if (isInPeriod()) {
            return valuePerHour() * period.workedHours();
        } else {
            return next.amount();
        }
    }

    private double valuePerHour() {
        if (period.from() > 1800 && (period.to() <= 2359 || period.to() == 0)) {
            return 20;
        }
        if (period.from() > 900 && period.to() <= 1800) {
            return 15;
        }
        if ((period.from() > 0 && period.to() <= 900)) {
            return 25;
        }
        return 0;
    }
}
