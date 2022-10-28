package io.codelex.arithmetic.practice;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        calculatePay(1, 7.50, 35);
        calculatePay(2, 8.20, 47);
        calculatePay(3, 10.00, 73);

    }

    public static void calculatePay(int employeeNum, double basePay, int hours) {

        if (hours > 60) {
            System.out.println("Employee " + employeeNum + " has worked for more hours than is allowed by the State of Massachusetts, hence he is fired for not obeying the work law!");
        }
        if (basePay < 8.0) {
            System.out.println("Base pay for Employee " + employeeNum + " is less than is the minimum wage in the State of Massachusetts, we therefore cannot not pay him anything, we are very sorry.");
        }
        if (hours <= 60 && basePay >= 8.0) {
            int overtime = hours - 40;
            double totalPay = basePay * (hours - overtime);
            if (overtime > 0) {
                double overtimePay = overtime * basePay * 1.5;
                totalPay += overtimePay;
            }

            System.out.println("Employee " + employeeNum + " has earned $" + String.format("%.2f", totalPay) + ". Thanks for the service, come again!");


        }

    }

}

