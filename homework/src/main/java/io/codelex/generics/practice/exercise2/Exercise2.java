package io.codelex.generics.practice.exercise2;

import java.util.List;

public class Exercise2 {

    String concatenate(List <?> list) {
        String result = "";
        String separator = "";
        if (list instanceof List<String>) {
            result = "String:";
            separator = " ";
        } else if (list instanceof List<Integer>) {
            result = "Integers:";
            separator = "+";
        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }


}
