package io.codelex.classesandobjects.practice.Exercise5;

public class DateTest {

    public static void main(String[] args) {

        // setting a new date object and changing it
        Date date1 = new Date(31, 12, 2022);
        System.out.println(displayDate(date1));

        date1.setDate(20);
        date1.setMonth(04);
        date1.setYear(1969);

        System.out.println(displayDate(date1));

        //Static method for displaying specific date in the format required
        System.out.println(displayDate(01, 01, 2022));

    }

    static String displayDate(int date, int month, int year) {
        return "The date is " + date + "/" + month + "/" + year + " (DD/MM/YYYY).";
    }

    static String displayDate(Date dateObject) {
        return "The date is " + dateObject.getDate() + "/" + dateObject.getMonth() + "/" + dateObject.getYear() + " (DD/MM/YYYY).";
    }
}
