package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.print("Input i: ");
        i = in.nextInt();


        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        int k = i;
        for (int j = 0; j < n; j++) {
            i *= k;
        }
        System.out.printf("%d multiplied by itself %d number of times is %d", k, n, i);

    }

}
