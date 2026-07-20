package com.java9.interfaceastype;

public class Main {

    static void main() {

        CheckOutService chekOut = new CheckOutService();

        CreditCartProcessor creditCartProcessor = new CreditCartProcessor();
        chekOut.setPaymentType(creditCartProcessor);
        chekOut.checkOut(100);

        PayPalProcessor payPalProcessor = new PayPalProcessor();
        chekOut.setPaymentType(payPalProcessor);
        chekOut.checkOut(-1);


    }
}
