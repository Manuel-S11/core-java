package com.bank;

import java.math.BigDecimal;

public class PaymentTransfer {

    private Account sender;
    private Account receiver;
    private BigDecimal amount;

    public PaymentTransfer(Account sender, Account receiver, BigDecimal amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
    }

    protected BigDecimal transferFees() {

        return amount.multiply(new BigDecimal("0.02"));
    }

    protected BigDecimal totalDeduction() {

        return amount.add(transferFees());
    }

    public Account getSender() {
        return sender;
    }

    public Account getReceiver() {
        return receiver;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
