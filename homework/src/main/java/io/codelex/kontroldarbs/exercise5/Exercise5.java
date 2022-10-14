package io.codelex.kontroldarbs.exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleFunction;
import java.util.function.Function;

public class Exercise5 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
        double percent = partOf(names, (String name) -> name.length() > 4);
        System.out.println(percent);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
        System.out.println(evenPercent);
    }

    private static <T> double partOf(List<T> list, Function<T, Boolean> tDoubleFunction) {

        return list.stream().filter(tDoubleFunction::apply).count() / (double) list.size();

    }

}


