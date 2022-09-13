package io.codelex.loops.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first word:");
        String input1 = in.nextLine();
        System.out.println("Enter second word:");
        String input2 = in.nextLine();

        System.out.print(input1);
        for (int i = input1.length(); i < 30 - input2.length(); i++) {
            System.out.print('.');
        }
        System.out.print(input2);

    }
}
