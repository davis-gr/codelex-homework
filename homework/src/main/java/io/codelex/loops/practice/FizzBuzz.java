package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        int lowerBound = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");

        int upperBound = in.nextInt();

        for (int i = lowerBound; i <= upperBound; i++) {

            StringBuilder fizzBuzz = new StringBuilder();

            if (i % 3 == 0) {
                fizzBuzz.append("Fizz");
            }

            if (i % 5 == 0) {
                fizzBuzz.append("Buzz");
            }

            String outputString = fizzBuzz.toString();

            if (!outputString.equals("")) {
                System.out.print(outputString + " ");
            } else {
                System.out.print(i + " ");
            }

            if (i % 20 == 0) {
                System.out.println();
            }

        }

    }
}
