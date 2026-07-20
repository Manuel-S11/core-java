package com.java9.interfaceastype;

public interface MorPhiPaymentProcessor {


    void processPayment(double amount);

    default double validate(double amount) {

        if(amount > 0 )
            return amount;
        throw new InvalidAmountException("Amount must be positive");
    }
}






