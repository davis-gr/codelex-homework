package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        double randomDouble = Math.random() * 100 + 1;
        int randomNumber = (int) randomDouble;

        Scanner myObj = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int guess = myObj.nextInt();

        if (guess > randomNumber) {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomNumber);
        } else if (guess < randomNumber) {
            System.out.println("Sorry, you are too low.  I was thinking of " + randomNumber);
        } else {
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
