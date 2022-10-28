package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {

        int[] numArray = new int[10];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 100);
        }

        int[] numArray2 = Arrays.copyOf(numArray, numArray.length);
        numArray2[numArray.length-1] = -7;

        StringBuilder print1 = new StringBuilder("Array 1: ");
        StringBuilder print2 = new StringBuilder("Array 2: ");

        for (int number = 0; number < numArray.length; number++) {
            print1.append(numArray[number]).append(" ");
            print2.append(numArray2[number]).append(" ");
        }

        System.out.println(print1.toString());
        System.out.println(print2.toString());

    }
}
