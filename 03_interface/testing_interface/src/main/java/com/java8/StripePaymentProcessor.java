package com.java8;

import com.java8.dto.PaymentRequest;
import com.java8.repository.PaymentProcessor;

public class StripePaymentProcessor implements PaymentProcessor {


    @Override
    public boolean processPayment(PaymentRequest paymentRequest) {
        this.validateRequest(paymentRequest);

        boolean success = callStripeApi(paymentRequest);

        this.logTransaction(paymentRequest, success);
        return success;
    }

    private boolean callStripeApi(PaymentRequest paymentRequest) {
        return true;
    }

    @Override
    public void logTransaction(PaymentRequest request, boolean success) {

    }

}
