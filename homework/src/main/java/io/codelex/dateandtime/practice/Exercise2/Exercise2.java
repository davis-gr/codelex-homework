package io.codelex.dateandtime.practice.Exercise2;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MM.yyyy");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter server launch date (DD.MM.YYYY): ");
        LocalDate launchDate = LocalDate.parse(in.nextLine(), dateFormatter);

        System.out.print("Enter server maintenance year and month (MM.YYYY):  ");
        LocalDate maintenanceMonth = YearMonth.parse(in.nextLine(), monthFormatter).atDay(1);

        System.out.println("Restarts are required at: ");
        calculateDates(launchDate, maintenanceMonth);

    }

    private static void calculateDates(LocalDate launchDate, LocalDate maintenanceMonth) {
        final int MAINTENANCE_PERIOD_DAYS = 14;
        for (LocalDate date = launchDate; date.isBefore(maintenanceMonth.plusMonths((1))); date = date.plusDays(MAINTENANCE_PERIOD_DAYS)) {
            if (date.isAfter(launchDate) && date.getMonthValue() == maintenanceMonth.getMonthValue() && date.getYear() == maintenanceMonth.getYear()) {
                System.out.println(date);
            }
        }
    }


}
