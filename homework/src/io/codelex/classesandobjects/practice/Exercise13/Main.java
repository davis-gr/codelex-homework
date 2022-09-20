package io.codelex.classesandobjects.practice.Exercise13;

public class Main {
    public static void main(String[] args) {


        //Part 1
        Account dgAccount = new Account("DG's account", 100);
        dgAccount.deposit(20);
        System.out.println(dgAccount);
        //Part 2
        Account mattAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0); //I'm so poor
        mattAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattAccount);
        System.out.println(myAccount);
        // Part 3
        Account a = new Account("A", 100);
        Account b = new Account("B", 0);
        Account c = new Account("C", 0);
        transfer(a, b, 50);
        transfer(b, c, 25);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

}
