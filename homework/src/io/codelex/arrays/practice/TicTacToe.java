package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];
    private static final int MAX_MOVES = 9;

    public static void main(String[] args) {

        initBoard();
        displayBoard();
        int moveCounter = 0;
        while (moveCounter < MAX_MOVES) {
            moveCounter = move(moveCounter);
            if (getWinner() != 'N') {
                displayBoard();
                System.out.println("The winner is " + getWinner() + "!");
                break;
            }
        }
        if (getWinner() == 'N') {
            displayBoard();
            System.out.println("The game is tied!");
        }
    }

    private static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    private static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    private static int move(int moveCounter) {

        Scanner keyboard = new Scanner(System.in);
        char symbol = ' ';
        if (moveCounter % 2 == 0) {
            symbol = 'X';
            System.out.println("'" + symbol + ", choose your location (row, column): ");
        } else {
            symbol = 'O';
            System.out.println("'" + symbol + "', choose your location (row, column): ");
        }
        String[] move = keyboard.nextLine().split(" ");
        int row = Integer.parseInt(move[0]);
        int col = Integer.parseInt(move[1]);
        if (board[row][col] == ' ') {
            board[row][col] = symbol;
            moveCounter++;
            return (moveCounter);
        } else {
            System.out.println("Wrong move, field already taken!");
            move(moveCounter);
            moveCounter++;
            return (moveCounter);
        }
    }


    private static char getWinner() {
        if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != ' ') {
            return board[1][0];
        }
        if (board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != ' ') {
            return board[2][0];
        }
        if (board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != ' ') {
            return board[0][1];
        }
        if (board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != ' ') {
            return board[0][2];
        }
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != ' ') {
            return board[0][2];
        }
        return 'N';
    }
}

