package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter height in cm: ");
        int height = myObj.nextInt();

        System.out.println("Enter weight in kg: ");
        int weight = myObj.nextInt();

        double BMI = ((double) weight / Math.pow(height, 2)) * 10000;

        if (BMI < 18.5) {
            System.out.println("Your BMI is " + String.format("%.1f", BMI) + ". Skeleton alert!");
        } else if (BMI > 25) {
            System.out.println("Your BMI is " + String.format("%.1f", BMI) + ". We have a fatty!");
        } else {
            System.out.println("Your BMI is " + String.format("%.1f", BMI) + ". Congratulations! You are considered to have a \"normal\" weight under some arbitrary standards that don't have any connection to real life!");
        }
    }
}