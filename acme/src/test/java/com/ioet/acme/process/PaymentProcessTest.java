package com.ioet.acme.process;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PaymentProcessTest {

    @Test
    public void amountAstrid() {
        String line = "ASTRID=MO10:00-12:00,TH12:00-14:00,SU20:00-21:00";
        PaymentProcess paymentProcess = new PaymentProcess(line);
        String result = paymentProcess.calculate();

        Assertions.assertThat(result).isEqualTo("The amount to pay ASTRID is: 85 USD");
    }

    @Test
    public void amountRene() {
        String line = "RENE=MO10:00-12:00,TU10:00-12:00,TH01:00-03:00,SA14:00-18:00,SU20:00-21:00";
        PaymentProcess paymentProcess = new PaymentProcess(line);
        String result = paymentProcess.calculate();

        Assertions.assertThat(result).isEqualTo("The amount to pay RENE is: 215 USD");
    }

}
