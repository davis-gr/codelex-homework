package io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = in.nextInt();
        int result;
        do {
            List<Integer> digits = new ArrayList<>();
            result = 0;
            while (number > 0) {
                digits.add(number % 10);
                number /= 10;
            }
            for (Integer digit : digits) {
                result += digit * digit;
            }
            System.out.println(result);
            number = result;
        } while (result > 9);

        if (result == 1) {
            System.out.println("Happy");
        } else {
            System.out.println("Unhappy");
        }
    }
}
