package io.codelex.javaAdvancedTest.exercise3;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Joiner <T>{

    private String separator;


    public Joiner(String separator){
        this.separator = separator;
    }

    public String Join(List<T> values){
        return values.stream().map(T::toString).collect(Collectors.joining(separator));
    }
}
