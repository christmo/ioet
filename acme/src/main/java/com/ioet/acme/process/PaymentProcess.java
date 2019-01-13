package com.ioet.acme.process;

import com.ioet.acme.chain.PaymentChain;
import com.ioet.acme.data.Period;

import java.util.List;

public class PaymentProcess {

    private final String line;

    public PaymentProcess(String line) {
        this.line = line;
    }

    public String calculate() {
        InputProcess processor = new InputProcess(line);
        String name = processor.name();
        List<Period> periods = processor.periods();
        double amount = 0;
        for (Period period : periods) {
            PaymentChain chain = new PaymentChain(period);
            amount += chain.amount();
        }
        return String.format("The amount to pay %s is: %.0f USD", name, amount);
    }
}
