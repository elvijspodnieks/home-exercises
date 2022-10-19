package io.codelex.javaAdvancedTest.exercise3;

import io.codelex.javaAdvancedTest.exercise2.Apple;
import io.codelex.javaAdvancedTest.exercise2.Basket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class JoinerTest {
    @Test
    void testInt() {

        Joiner joiner = new Joiner<>("-");
        List<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        String result = joiner.Join(intArray);

        Assertions.assertEquals("1-2-3", joiner.Join(intArray));
    }

    @Test
    void testString() {

        Joiner joiner = new Joiner<>("=");
        List<String> intArray = new ArrayList<>();
        intArray.add("one");
        intArray.add("two");
        intArray.add("three");
        String result = joiner.Join(intArray);

        Assertions.assertEquals("one=two=three", joiner.Join(intArray));
    }
}
