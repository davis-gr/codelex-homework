package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter diagram size: ");

        final int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++ ) {
                System.out.print("////");
            }
            for (int k = (size - i) * 2; k < size * 2; k++ ) {
                System.out.print("****");
            }
            for (int l = i + 1; l < size; l++) {
                System.out.print("\\\\\\\\");
            }
            System.out.println();
        }
    }

}