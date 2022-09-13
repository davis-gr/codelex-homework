package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter distance in meters:");
        long distance = myObj.nextLong();

        System.out.println("Input hour:");
        long hours = myObj.nextLong();

        System.out.println("Input minutes:");
        long minutes = myObj.nextLong();

        System.out.println("Input seconds:");
        long seconds = myObj.nextLong();

        long totalSeconds = hours * 3600 + minutes * 60 + seconds;
        double speedMS = distance / (double) totalSeconds;
        double speedKMH = ((double) distance / 1000.0) / ((double) totalSeconds / 3600.0);
        double speedMPH = speedKMH / 1.609;

        System.out.println("Your speed in meters/second is " + String.format("%.08f", speedMS));
        System.out.println("Your speed in km/h is " + String.format("%.08f", speedKMH));
        System.out.println("Your speed in miles/h is " + String.format("%.08f", speedMPH));

    }
}
