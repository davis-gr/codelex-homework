package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter minutes:");

        long input = myObj.nextLong();

        double totalDays = (double) input / 1440.0;
        double years = totalDays / 365;
        double days = totalDays % 365;

        System.out.println(input + " minutes is " + (int) years + " years and " + String.format("%.02f", days) + " days.");

    }
}
