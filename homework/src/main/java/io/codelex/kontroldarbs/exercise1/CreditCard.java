package io.codelex.kontroldarbs.exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(String cardNumber, String owner, String cvv, BigDecimal balance) {
        super(cardNumber, owner, cvv, balance);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        super.withdraw(amount);
        if (getBalance().compareTo(BigDecimal.valueOf(100)) < 0) {
            System.out.println("Warning: Low funds! SMSCredit.lv - tavs draugs neparedzētiem gadījumiem!");
        }
    }
}
