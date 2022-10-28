package io.codelex.classesandobjects.practice.Exercise8;

public class SavingsAccount {

    private double balance;
    private double interestRate;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        if (this.balance - amount < 0) {
            this.balance = 0;
        } else {
            this.balance -= amount;
        }
    }

    double compound() {
        double earnedInterest = this.balance * interestRate / 100 / 12;
        deposit(earnedInterest);
        return earnedInterest;
    }

}
