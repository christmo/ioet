package com.ioet.acme.chain;

import com.ioet.acme.data.Period;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PaymentChainTest {

    @Test
    public void monday10to12() {
        Period period = new Period("MO10:00-12:00");
        PaymentChain chain = new PaymentChain(period);

        double amount = chain.amount();

        Assertions.assertThat(amount).isEqualTo(30);
    }

    @Test
    public void tuesday10to12() {
        Period period = new Period("TU10:00-12:00");
        PaymentChain chain = new PaymentChain(period);

        double amount = chain.amount();

        Assertions.assertThat(amount).isEqualTo(30);
    }

    @Test
    public void thursday1to3() {
        Period period = new Period("TH01:00-03:00");
        PaymentChain chain = new PaymentChain(period);

        double amount = chain.amount();

        Assertions.assertThat(amount).isEqualTo(50);
    }

    @Test
    public void friday18to19() {
        Period period = new Period("FR18:01-19:00");
        PaymentChain chain = new PaymentChain(period);

        double amount = chain.amount();

        Assertions.assertThat(amount).isEqualTo(20);
    }

    @Test
    public void friday23to00() {
        Period period = new Period("FR23:00-00:00");
        PaymentChain chain = new PaymentChain(period);

        double amount = chain.amount();

        Assertions.assertThat(amount).isEqualTo(20);
    }

    @Test
    public void thursday12to14() {
        Period period = new Period("TH12:00-14:00");
        PaymentChain chain = new PaymentChain(period);

        double amount = chain.amount();

        Assertions.assertThat(amount).isEqualTo(30);
    }


    @Test
    public void saturday14to18() {
        Period period = new Period("SA14:00-18:00");
        PaymentChain chain = new PaymentChain(period);

        double amount = chain.amount();

        Assertions.assertThat(amount).isEqualTo(80);
    }


    @Test
    public void saturday1to6() {
        Period period = new Period("SA01:00-06:00");
        PaymentChain chain = new PaymentChain(period);

        double amount = chain.amount();

        Assertions.assertThat(amount).isEqualTo(150);
    }

    @Test
    public void sunday20to21() {
        Period period = new Period("SU20:00-21:00");
        PaymentChain chain = new PaymentChain(period);

        double amount = chain.amount();

        Assertions.assertThat(amount).isEqualTo(25);
    }

    @Test
    public void sunday23to00() {
        Period period = new Period("SU23:00-00:00");
        PaymentChain chain = new PaymentChain(period);

        double amount = chain.amount();

        Assertions.assertThat(amount).isEqualTo(25);
    }

}
