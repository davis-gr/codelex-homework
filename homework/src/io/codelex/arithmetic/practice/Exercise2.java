package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = myObj.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        System.out.println("bye!");
    }
}
