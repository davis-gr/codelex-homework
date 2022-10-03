package io.codelex.loops.practice;

import java.util.Scanner;
import static org.apache.commons.lang3.RandomUtils.nextInt;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Desired input: ");
        int desiredInput = in.nextInt();

        int rollDice1 = rollDice();
        int rollDice2 = rollDice();;

        while (rollDice1 + rollDice2 != desiredInput) {
            System.out.printf("%d and %d = %d\n", rollDice1, rollDice2, rollDice1+rollDice2);
            rollDice1 = rollDice();
            rollDice2 = rollDice();
        }
        System.out.printf("%d and %d = %d", rollDice1, rollDice2, rollDice1+rollDice2);
    }

    private static int rollDice() {
        return nextInt(1, 7);
    }
}
