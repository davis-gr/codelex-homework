package io.codelex.zzzcombiner;

import org.junit.jupiter.api.*;

import java.util.function.BiFunction;

public class CombinerTest {

    @Test
    void testNumberAndText() {
        Combiner<Integer, String, BiFunction<Integer, String, String>> combiner = new Combiner<>(10, "Teksts", (a, b) -> a.toString() + "-" + b.toString());
        String result = combiner.combine();
        Assertions.assertEquals("10-Teksts", result);
    }

}
