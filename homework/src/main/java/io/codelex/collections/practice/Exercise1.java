package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * Volkswagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "Volkswagen", "Mercedes", "Tesla"};
        String[] originations = {"Audi:Germany", "BMW:Germany", "Honda:Japan", "Mercedes:Germany", "Volkswagen:Germany", "Tesla:USA"};

        //replace array with an ArrayList and print out the results
        List<String> arrayListExample = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayListExample);

        //replace array with a HashSet and print out the results
        Set<String> hashSetExample = new HashSet<>(Arrays.asList(array));
        System.out.println(hashSetExample);

        //replace array with a HashMap (use brand as key and origination as value) an print out the results
        HashMap<String, String> hashMapExample = new HashMap<>();
        for (String origination : originations) {
            String[] originationParts = origination.split(":");
            hashMapExample.put(originationParts[0].trim(), originationParts[1].trim());
        }
        System.out.println(hashMapExample);

    }
}
