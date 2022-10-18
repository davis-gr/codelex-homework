package io.codelex.kontroldarbs.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    @Test
    void testIntegers() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String result = joiner.join(1,2,3,4);
        Assertions.assertEquals("1-2-3-4", result);
    }
}
