package io.codelex.companytasks.cub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.codelex.companytasks.cub.FrequencyCalculator.*;

public class FrequencyCalculatorTest {

    @Test
    void testText1() {
        String result = calculateFrequencies().toString();
        Assertions.assertEquals("{a=127, b=24, c=61, d=76, e=156, f=32, g=40, h=91, i=119, j=1, k=20, l=48, m=27, n=127, o=114, p=33, q=1, r=85, s=88, t=126, u=46, v=14, w=29, x=4, y=20}", result);
    }

}
