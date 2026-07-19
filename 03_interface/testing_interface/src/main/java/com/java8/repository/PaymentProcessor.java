package com.java8.repository;

import com.java8.ExceptionHandler.InvalidPaymentException;
import com.java8.dto.PaymentRequest;

public interface PaymentProcessor {

    boolean processPayment(PaymentRequest paymentRequest);

    default void logTransaction(PaymentRequest request, boolean success) {

        String status = success ? "Payment Succeed" : "Payment Failed";
        System.out.printf("[%s] Transaction %s for amount: %.2f, Order: %S%n",
                this.getClass().getSimpleName(),
                status,
                request.getAmount(),
                request.getOrderId()
        );
    }

    default boolean validateRequest(PaymentRequest request) {

        if (request.getAmount().doubleValue() <= 0) {
            throw new InvalidPaymentException("Invalid Payment Request");

        }
        if(request.getOrderId() ==  null) {
            throw new InvalidPaymentException("Order ID is Required");
        }
        return true;
    }


}