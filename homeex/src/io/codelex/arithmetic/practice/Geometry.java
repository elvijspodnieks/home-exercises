package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        return new BigDecimal(Math.PI).multiply(radius.pow(2));

    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {

        return length.multiply(width);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        return (base.multiply(h)).multiply(new BigDecimal(0.5));
    }
}
