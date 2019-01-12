package com.ioet.acme.chain;

public interface PaymentRule {

    boolean isInPeriod();

    double amount();

}
