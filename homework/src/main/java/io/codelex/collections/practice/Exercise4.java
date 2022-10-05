package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {

    public static void main(String[] args) {

        Set<String> nameSet = new HashSet<>();
        Scanner in;
        while (true) {
            in = new Scanner(System.in);
            System.out.print("Enter name: ");
            String name = in.nextLine();
            if (name.equals("")) {
                break;
            }
            nameSet.add(name);
        }

        System.out.print("Unique name list contains:");
        for (String name : nameSet) {
            System.out.print(" " + name);
        }

    }

}
