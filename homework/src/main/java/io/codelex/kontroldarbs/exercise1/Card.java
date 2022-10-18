package io.codelex.kontroldarbs.exercise1;

import java.math.BigDecimal;

public abstract class Card {

    private String cardNumber;
    private String owner;
    private String cvv;
    private BigDecimal balance;

    public Card(String cardNumber, String owner, String cvv, BigDecimal balance) {
        if (!cvv.matches("\\d{3}")) {
            throw new IllegalArgumentException("not a valid CVV!");
        } else {
            this.cardNumber = cardNumber;
            this.owner = owner;
            this.cvv = cvv;
            this.balance = balance;
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void withdraw(BigDecimal amount) {
        BigDecimal newBalance = getBalance().subtract(amount);
        if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
            throw new NotEnoughFundsException("You're bankrupt!");
        } else {
            setBalance(newBalance);
        }
    }

    public void deposit(BigDecimal amount) {
        setBalance(getBalance().add(amount));
    }


}
