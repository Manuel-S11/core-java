package com.java9.interfaceastype;

public class CreditCartProcessor implements MorPhiPaymentProcessor{

    @Override
    public void processPayment(double amount) {

        double validatedAmount = validate(amount);

        IO.println("Processing $%s via Credit Cart API".formatted(amount));

    }
}
