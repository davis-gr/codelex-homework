package io.codelex.generics.practice.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {

/*
This program is rejected by the Java compiler. Why?
    – To quote stack overflow: Java uses something called type erasure, which means at runtime both objects are equivalent. The compiler knows the lists contain integers or strings, and as such can maintain a type safe environment. This information is lost (on an object instance basis) at runtime, and the list only contain 'Objects'.

 */


    public static void main(String[] args) {

        System.out.println(concatenate(new ArrayList<>(Arrays.asList("String1", "String2", "String3"))));
        System.out.println(concatenate(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(concatenate(new ArrayList<>(Arrays.asList(new Person("LeBron"), new Person("Michael"), new Person("Kobe")))));
        System.out.println(concatenate(new ArrayList<>(List.of("word"))));
        System.out.println(concatenate(new ArrayList<>(List.of(1))));
        System.out.println(concatenate(new ArrayList<>(List.of(new Person("Shaquille")))));
        System.out.println(concatenate(new ArrayList<>()));


    }

    static String concatenate(List<?> list) {
        if (list.size() == 0) {
            return null;
        }
        String result = "";
        String separator = "";
        if (list.get(0) instanceof String) {
            result = "String:";
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = "Integers:";
            separator = "+";
        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }

    /*
    Is this behaviour consistent with what you would expect from the initial program? If not, how can you fix it?
         – It's consistent as long as the lists have any items in them. I added a check to print out null if list doesn't have any items in it.

    What would happen if you tried to implement the different cases using method overloading instead of just one method. Why is this the case?
        – I think it wouldn't work because at runtime Java wouldn't know if the list contains Strings, Integers or Objects, therefore it couldn't apply the correct method constructor.
     */


}
