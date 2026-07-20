package com.java9.interfaceastype;

public class CheckOutService {

    private MorPhiPaymentProcessor paymentType;

//    public CheckOutService(MorPhiPaymentProcessor paymentProcessor) {
//        this.paymentType = paymentProcessor;
//    }

    public void setPaymentType(MorPhiPaymentProcessor paymentType) {
        this.paymentType = paymentType;
    }

    public void checkOut(double amount) {
        paymentType.processPayment(amount);
    }


}
