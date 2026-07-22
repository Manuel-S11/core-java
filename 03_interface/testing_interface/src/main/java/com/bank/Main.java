package com.bank;

import java.math.BigDecimal;

public class Main {

    public static void main() {

        Account manuel = new Account("Manuel", new BigDecimal("5000"));
        Account mary = new Account("Mary", new BigDecimal("1500"));

        PaymentTransfer paymentTransfer =
                new PaymentTransfer(manuel,mary,new BigDecimal("500"));

        PaymentService paymentService = new PaymentService();

        paymentService.transfer(paymentTransfer);


    }
}
