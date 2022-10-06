package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {

        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        //Create an ArrayList with String elements
        List<String> list = new ArrayList<>();

        //Add 10 values to list
        list.addAll(Arrays.asList(words));

        //Add new value at 5th position
        list.add(4, "four and a half");

        // Change value at last position (Calculate last position programmatically)
        list.set(list.size() - 1, "twenty six");

        // Sort your list in alphabetical order
        Collections.sort(list);

        //Check if your list contains "Foobar" element
        if (list.contains("Foobar")) {
            System.out.println("Contains Foobar!\n");
        } else {
            System.out.println("No Foobar :(\n");
        }

        //Print each element of list using loop
        for (String item : list) {
            System.out.println(item);
        }
    }

}
