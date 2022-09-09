package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numbers:");

        String numberAsString = myObj.nextLine();
        int sum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
        }

        System.out.println(sum);

    }
}
