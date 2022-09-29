package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public class MeasurementConverter {

    public static BigDecimal convert(int value, ConversionType conversionType) {
        return conversionType.converter.multiply(BigDecimal.valueOf(value));
    }

}
