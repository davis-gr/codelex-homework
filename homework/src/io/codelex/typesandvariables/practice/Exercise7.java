//Write a program that prompts the user to enter a string and displays the number of the uppercase letters in the string.

package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter string:");

        String input = myObj.nextLine();

        int uppercase = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                uppercase++;
            }
        }

        System.out.println("Uppercase letters: " + uppercase);

    }
}
