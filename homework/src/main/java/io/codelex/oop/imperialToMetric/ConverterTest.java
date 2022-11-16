package io.codelex.oop.imperialToMetric;

public class ConverterTest {
    public static void main(String[] args) {
        System.out.println(MeasurementConverter.convert(100, ConversionType.METERS_TO_YARDS));
        System.out.println(MeasurementConverter.convert(100, ConversionType.YARDS_TO_METERS));
        System.out.println(MeasurementConverter.convert(186, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println(MeasurementConverter.convert(87, ConversionType.INCHES_TO_CENTIMETERS));
        System.out.println(MeasurementConverter.convert(42, ConversionType.KILOMETERS_TO_MILES));
        System.out.println(MeasurementConverter.convert(500, ConversionType.MILES_TO_KILOMETERS));
    }
}
