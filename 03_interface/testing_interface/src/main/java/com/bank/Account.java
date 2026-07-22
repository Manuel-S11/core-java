package com.bank;

import java.math.BigDecimal;

public class Account {

    private Long id;
    private String userName;
    private BigDecimal balance;

    private static Long idGenerator = 0l;

    private Long idGenerator() {
        idGenerator++;
        return idGenerator;
    }

    public Account(String userName, BigDecimal balance){
        this.id = idGenerator();
        this.balance = balance;
        this.userName = userName;
    }


    public String getUserName() {
        return userName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {

        this.balance = this.balance.subtract(amount);
    }


}
