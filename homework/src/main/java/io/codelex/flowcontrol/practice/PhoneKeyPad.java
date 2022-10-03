package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your string:");
        String input = in.nextLine().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'b' || input.charAt(i) == 'c') {
                System.out.print('2');
            } else if (input.charAt(i) == 'd' || input.charAt(i) == 'e' || input.charAt(i) == 'f') {
                System.out.print('3');
            } else if (input.charAt(i) == 'g' || input.charAt(i) == 'h' || input.charAt(i) == 'i') {
                System.out.print('4');
            } else if (input.charAt(i) == 'j' || input.charAt(i) == 'k' || input.charAt(i) == 'l') {
                System.out.print('5');
            } else if (input.charAt(i) == 'm' || input.charAt(i) == 'n' || input.charAt(i) == 'o') {
                System.out.print('6');
            } else if (input.charAt(i) == 'p' || input.charAt(i) == 'q' || input.charAt(i) == 'r' || input.charAt(i) == 's') {
                System.out.print('7');
            } else if (input.charAt(i) == 't' || input.charAt(i) == 'u' || input.charAt(i) == 'v') {
                System.out.print('8');
            } else if (input.charAt(i) == 'w' || input.charAt(i) == 'x' || input.charAt(i) == 'y' || input.charAt(i) == 'z') {
                System.out.print('9');
            }
        }
        System.out.println();
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'a', 'b', 'c' -> System.out.print('2');
                case 'd', 'e', 'f' -> System.out.print('3');
                case 'g', 'h', 'i' -> System.out.print('4');
                case 'j', 'k', 'l' -> System.out.print('5');
                case 'm', 'n', 'o' -> System.out.print('6');
                case 'p', 'q', 'r', 's' -> System.out.print('7');
                case 't', 'u', 'v' -> System.out.print('8');
                case 'w', 'x', 'y', 'z' -> System.out.print('9');
            }
        }
    }
}
