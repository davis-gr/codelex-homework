package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Product1ToN {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = myObj.nextInt();

        System.out.println(factorial(n));
    }

    public static int factorial(int number) {
        if (number >= 1) {
            return number * factorial(number - 1);
        } else {
            return 1;
        }
    }

    ;
}
