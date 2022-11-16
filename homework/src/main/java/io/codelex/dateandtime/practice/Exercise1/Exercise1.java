package io.codelex.dateandtime.practice.Exercise1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise1 {

    private static int hours = 0;
    private static final int HOURS_PER_WORKDAY = 8;

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter date from (DD.MM.YYYY): ");
        LocalDate dateFrom = LocalDate.parse(in.nextLine(), formatter);

        System.out.print("Enter date to (DD.MM.YYYY): ");
        LocalDate dateTo = LocalDate.parse(in.nextLine(), formatter);

        System.out.println("Total number of worked hours: " + calculateHours(dateFrom, dateTo));

    }

    private static int calculateHours(LocalDate dateFrom, LocalDate dateTo) {
        for (LocalDate date = dateFrom; date.isBefore(dateTo.plusDays((1))); date = date.plusDays(1)) {
            if (date.getDayOfWeek().getValue() < 6) {
                hours += HOURS_PER_WORKDAY;
            }
        }
        return hours;
    }

}
