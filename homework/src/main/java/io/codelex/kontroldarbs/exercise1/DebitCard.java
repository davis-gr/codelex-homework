package io.codelex.kontroldarbs.exercise1;

import java.math.BigDecimal;

public class DebitCard extends CreditCard{

    public DebitCard(String cardNumber, String owner, String cvv, BigDecimal balance) {
        super(cardNumber, owner, cvv, balance);
    }

    @Override
    public void deposit(BigDecimal amount) {
        super.deposit(amount);
        if (getBalance().compareTo(BigDecimal.valueOf(10000)) > 0) {
            System.out.println("Warning: Too much money! Be sure to try your luck by placing it all on red!");
        }

    }
}
