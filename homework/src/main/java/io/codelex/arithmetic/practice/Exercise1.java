package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println(checkValues());

    }

    public static boolean checkValues() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first integer:");
        int int1 = myObj.nextInt();

        System.out.println("Enter second integer:");
        int int2 = myObj.nextInt();

        return int1 == 15 || int2 == 15 || int1 - int2 == 15 ||  int2 - int1 == 15 || int1 + int2 == 15;

    }
}