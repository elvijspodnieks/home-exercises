package io.codelex.javaAdvancedTest.exercise3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Joiner <T>{

    private String seperator;
    private Function<T, String> join;

    public Joiner(String seperator, Function<T, String> join) {
        this.seperator = seperator;
        this.join = join;

    }

//    @Override
//    public String toString() {
//        return join.apply(T);
//    }

}
