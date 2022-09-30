package io.codelex.oop.summary.imperialToMetric;

public class MeasurementConverter {

    public static double convert(int value, ConversionType conversionType) {
        return conversionType.converter * value;
    }
}
