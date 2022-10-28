package io.codelex.classesandobjects.practice.Exercise8;

import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How much money is in the account? ");
        SavingsAccount account = new SavingsAccount(input.nextDouble());

        System.out.print("Enter the annual interest rate: ");
        account.setInterestRate(input.nextDouble());

        System.out.print("How long has the account been opened? ");
        int months = input.nextInt();

        calculateBalance(account, months);
    }

    private static void calculateBalance(SavingsAccount account, int months) {
        double totalDeposit = 0;
        double totalWithdrawn = 0;
        double totalInterest = 0;
        for (int i = 1; i <= months; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter amount deposited for month " + i + ": ");
            double deposited = scan.nextDouble();
            account.deposit(deposited);
            totalDeposit += deposited;
            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double withdrawn = scan.nextDouble();
            account.withdraw(withdrawn);
            totalWithdrawn += withdrawn;
            totalInterest += account.compound();
        }
        System.out.printf("Total deposited: $" + "%,.2f \n", totalDeposit);
        System.out.printf("Total withdrawn: $" + "%,.2f \n", totalWithdrawn);
        System.out.printf("Interest earned: $" + "%,.2f \n", totalInterest);
        System.out.printf("Ending balance: $" + "%,.2f \n", account.getBalance());
    }


}