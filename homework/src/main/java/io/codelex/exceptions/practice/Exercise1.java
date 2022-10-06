package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator");
            int numerator = 0;
            try {
                numerator = scanner.nextInt();
            } catch (InputMismatchException e) {
                String input = scanner.nextLine();
                if (input.toLowerCase().startsWith("q")) {
                    break;
                } else {
                    System.out.println("You entered bad data.\nPlease try again.\n");
                    continue;
                }
            }
            System.out.println("Enter the divisor");
            int divisor = scanner.nextInt();
            try {
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException a) {
                System.out.println("No division by zero, OK?");
            }
        }
    }
}
