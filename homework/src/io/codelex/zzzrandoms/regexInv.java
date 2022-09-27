package io.codelex.zzzrandoms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexInv {
    public static void main(String[] args) {

        String paymentDetails1 = "Maksājums par rēķinu INV-LV-20230110-4.";
        String paymentDetails2 = "1. payment for INV-EE-20222309-2P";
        String paymentDetails3 = "INV-LT-20230101-120";
        String paymentDetails4 = "Invoice nr. INV-EE-20222309-2";
        String paymentDetails5 = "Ceturtais maksājums INV-LV-20230110-4";
        String paymentDetails6 = "Maksājums par griķiem: INV-LV-20221011-47";
        String paymentDetails7 = "INV-LV-20221224-47 - dāvana vecmāmiņai";

        System.out.println(invoiceFinder(paymentDetails1));
        System.out.println(invoiceFinder(paymentDetails2));
        System.out.println(invoiceFinder(paymentDetails3));
        System.out.println(invoiceFinder(paymentDetails4));
        System.out.println(invoiceFinder(paymentDetails5));
        System.out.println(invoiceFinder(paymentDetails6));
        System.out.println(invoiceFinder(paymentDetails7));
    }

    private static String invoiceFinder(String paymentDetail) {

        Pattern invoicePattern = Pattern.compile("INV-(LV|EE|LT)-\\d{8}-\\d{1,3}P?");
        Matcher invoiceMatcher = invoicePattern.matcher(paymentDetail);
        if (invoiceMatcher.find()) {
            return invoiceMatcher.group();
        }
        return "Did not identify invoice";
    }
}
