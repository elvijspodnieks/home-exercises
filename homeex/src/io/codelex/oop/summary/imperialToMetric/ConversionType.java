package io.codelex.oop.summary.imperialToMetric;

public enum ConversionType {

    METERS_TO_YARDS(1.0936133),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_ICHES(0.393700787),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.621371192),
    MILES_TO_KILOMETERS(1.609344);

    public double converter;

    ConversionType(double converter) {
        this.converter = converter;
    }

}
