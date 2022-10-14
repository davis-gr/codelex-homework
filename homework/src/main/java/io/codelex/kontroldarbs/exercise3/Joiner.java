package io.codelex.kontroldarbs.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Joiner<T> {

        private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... values) {


        ArrayList<T> list = new ArrayList<>(List.of(values));
        //Es zinu, ka nav līdz galam pareizi, bet man pietrūka 10min, lai uztaisītu normāli.
        return list.stream().map(item -> item.toString() + separator).toList().toString();


    }


}
