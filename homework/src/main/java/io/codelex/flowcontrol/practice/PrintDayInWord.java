package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PrintDayInWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the weekday number: ");
        int dayNumber = in.nextInt();

        if (dayNumber == 0) {
            System.out.println("It's Sunday");
        } else if (dayNumber == 1) {
            System.out.println("It's Monday");
        } else if (dayNumber == 2) {
            System.out.println("It's Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("It's Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("It's Thursday");
        } else if (dayNumber == 5) {
            System.out.println("It's Friday");
        } else if (dayNumber == 6) {
            System.out.println("It's Saturday");
        } else {
            System.out.println("Not a valid day");
        }

        switch (dayNumber) {
            case 0 -> System.out.println("It's Sunday, but written with a Switch");
            case 1 -> System.out.println("It's Monday, but written with a Switch");
            case 2 -> System.out.println("It's Tuesday, but written with a Switch");
            case 3 -> System.out.println("It's Wednesday, but written with a Switch");
            case 4 -> System.out.println("It's Thursday, but written with a Switch");
            case 5 -> System.out.println("It's Friday, but written with a Switch");
            case 6 -> System.out.println("It's Saturday, but written with a Switch");
            default -> System.out.println("Not a valid day, but written with a Switch");
        }

    }
}
