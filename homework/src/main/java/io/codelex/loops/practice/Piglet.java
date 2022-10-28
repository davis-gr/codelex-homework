package io.codelex.loops.practice;

import java.util.Scanner;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class Piglet {
    public static void main(String[] args) {

        System.out.println("Welcome to Piglet!");
        int rollingSum = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            int rollDice = nextInt(1, 7);
            if (rollDice != 1) {
                System.out.println("You rolled a " + rollDice + "!");
                rollingSum += rollDice;
                System.out.println("Roll again?");
                String yesno = in.nextLine();
                if (yesno.equalsIgnoreCase("n") || yesno.equalsIgnoreCase("no")) {
                    System.out.printf("You got %d points.", rollingSum);
                    break;
                }
            } else {
                System.out.println("You rolled a " + rollDice + "!");
                System.out.println("You got 0 points!");
                break;
            }
        }

    }
}
