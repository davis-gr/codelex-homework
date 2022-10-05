package io.codelex.enums.practice.exercise2;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Let us begin...");
        int trials = 0;
        int computerWins = 0;
        int personWins = 0;
        while (true) {
            System.out.println("Scissor-Paper-Stone");
            Values turn;
            do {
                System.out.print("\tYour turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
                Scanner in = new Scanner(System.in);
                turn = Values.getValueByLetter(in.nextLine().toLowerCase());
                if (turn == null) {
                    System.out.println("\tInvalid input, try again...");
                }
            }
            while (turn == null);
            if (turn == Values.QUIT) {
                System.out.println("\nNumber of trials: " + trials);
                System.out.printf("I won " + computerWins + "(" + "%.2f" + "%%). You won " + personWins + "(" + "%.2f" + "%%).", ((double) computerWins / trials) * 100, ((double) personWins / trials) * 100);
                break;
            }
            Random random = new Random();
            Values computerTurn = Values.getValueByInt(random.nextInt(3));
            System.out.println("\tMy turn: " + computerTurn);

            if (turn == Values.PAPER && computerTurn == Values.SCISSOR) {
                System.out.println("\tScissor cuts paper, I won!\n");
                computerWins++;
            } else if (turn == Values.SCISSOR && computerTurn == Values.STONE) {
                System.out.println("\tStone breaks scissor, I won!\n");
                computerWins++;
            } else if (turn == Values.STONE && computerTurn == Values.PAPER) {
                System.out.println("\tPaper wraps around stone, I won!\n");
                computerWins++;
            } else if (turn == computerTurn) {
                System.out.println("\tTie!\n");
            } else {
                System.out.println("\tYou won!\n");
                personWins++;
            }
            trials++;
        }
    }
}
