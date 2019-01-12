package com.ioet.acme.chain;

import com.ioet.acme.data.Period;

public class PaymentChain {

    private final PaymentRule payment;

    public PaymentChain(Period period) {
        payment = new MondayToFriday(period,
                new SaturdayToSunday(period));
    }

    public double amount() {
        return payment.amount();
    }

}
