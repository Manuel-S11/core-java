package com.java8.dto;

import java.math.BigDecimal;

public class PaymentRequest {

    private final BigDecimal amount;
    private final String orderId;
    private final String customerId;
    private final String currency;
    private final String description;
    private final String paymentToken;

    public PaymentRequest(BigDecimal amount, String orderId) {

        this(amount,orderId,null, "USD",null,null);
    }


    public PaymentRequest(BigDecimal amount,String orderId,String customerId,
                          String currency, String description,String paymentToken) {
        this.amount = amount;
        this.orderId = orderId;
        this.customerId = customerId;
        this.currency = currency;
        this.description = description;
        this.paymentToken = paymentToken;
    }

    public long getAmountIntoCents(){

        if(amount == null)
            return 0;
        Long cents =  amount.multiply(BigDecimal.valueOf(100)).longValueExact();
        return cents;
    }

    public BigDecimal getAmount() {

        return amount;
    }

    public String getOrderId() {

        return orderId;
    }

    public String getCurrency() {
        return currency;
    }
    public String getDescription() {
        return description;
    }
    public String getCustomerId() {
        return customerId;
    }

    public String getPaymentToken() {
        return paymentToken;
    }

    @Override
    public String toString() {
        return
                "================ PaymentRequest ================\nAmount: %d \nOrderId: %s \nCustomerId: %s \nCurrency: %s \nDescription: %s"
                        .formatted(
                                amount,
                                orderId,
                                customerId,
                                currency,
                                description
                        );

    }




}
