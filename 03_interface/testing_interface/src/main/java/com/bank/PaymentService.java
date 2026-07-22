package com.bank;

import java.math.BigDecimal;

public class PaymentService {


    public void transfer(PaymentTransfer transfer) {


        BigDecimal totalTransactionAmount = transfer.totalDeduction();

//        IO.println(transfer.getSender().getBalance());
//        IO.println(transfer.getReceiver().getBalance());
//        IO.println(totalTransactionAmount);
        if(transfer.getSender().getBalance().compareTo(transfer.getAmount()) > 0) {

            transfer.getSender().withdraw(totalTransactionAmount);
            transfer.getReceiver().deposit(transfer.getAmount());
            IO.println("Payment is Succeed");

            paymentReceipt(transfer.getSender().getUserName(),
                    transfer.getReceiver().getUserName(),
                    transfer.getAmount(),
                    transfer.transferFees(),
                    totalTransactionAmount);

        }else{
            throw new InvalidTransferException("Your amount is not Enough to make Transaction");
        }

    }

    private void paymentReceipt(String sender,
                                String receiver,
                                BigDecimal transferAmount,
                                BigDecimal transferFee, BigDecimal totalDeduction) {

        System.out.printf("""
                System.out.printf(""\"
                            ========================================
                                    PAYMENT TRANSFER RECEIPT
                            ========================================
                            Sender          : %s
                            Receiver        : %s
                            Transfer Amount : $%,.2f
                            Transfer Fee    : $%,.2f
                            ----------------------------------------
                            Total Deduction : $%,.2f
                            ========================================
                            ""\"
                """.formatted(
                        sender,
                        receiver,
                        transferAmount,
                        transferFee,
                        totalDeduction


        ));
    }

}
