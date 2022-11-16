package io.codelex.oop.imperialToMetric;

import java.math.BigDecimal;

public enum ConversionType {

    METERS_TO_YARDS(BigDecimal.valueOf(1.0936133)),
    YARDS_TO_METERS(BigDecimal.valueOf(0.9144)),
    CENTIMETERS_TO_INCHES(BigDecimal.valueOf(0.393700787)),
    INCHES_TO_CENTIMETERS(BigDecimal.valueOf(2.54)),
    KILOMETERS_TO_MILES(BigDecimal.valueOf(0.621371192)),
    MILES_TO_KILOMETERS(BigDecimal.valueOf(1.609344));
    public final BigDecimal converter;

    ConversionType(BigDecimal converter) {
        this.converter = converter;
    }

}
