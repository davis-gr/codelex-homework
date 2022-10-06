package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise1 {

    //Write a Java program to create a new array list, add some elements (string) and print out the collection.
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        //Add 5 colors to list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("BLACK");

        System.out.println(colors);
    }

}
