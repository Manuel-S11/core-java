package com.java9.interfaceastype;

public class PayPalProcessor implements MorPhiPaymentProcessor{

    @Override
    public void processPayment(double amount) {

        double validatedAmount = validate(amount);
        IO.println("Processing $%s via PayPal API".formatted(amount));
    }
}
