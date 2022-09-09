package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter minutes:");

        long input = myObj.nextLong();

        double days = (double) input / 1440.0;
        int years = 0;

        while (days >= 365) {
            years++;
            days -= 365;
        }

        System.out.println(input + " minutes is " + years + " years and " + String.format("%.02f", days) + " days.");

    }
}
