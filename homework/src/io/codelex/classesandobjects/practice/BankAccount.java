package io.codelex.classesandobjects.practice;

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public static void main(String[] args) {

        BankAccount benben = new BankAccount("Benson", 17.25);
        System.out.println(benben);
        benben.withdraw(34.75);
        System.out.println(benben);


    }

    public final void deposit(double amount) {
        this.balance += amount;
    }

    public final void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        if (this.balance >= 0) {
            return name + ", $" + String.format("%.2f", balance);
        } else {
            return name + ", -$" + String.format("%.2f", balance * -1);
        }
    }

}
