package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {

        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(2);

        List<Number> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(4);

        addAllX(integersList, numbersList);
        //addAllY(integersList, numbersList);
        System.out.println(numbersList);



    }


    public static <V> void add(V value, List<V> list) {
        list.add(value);
    }

    public static <V> void add2(V value, List<? super V> list) {
        list.add(value);
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        for (V el : v) l.add(el);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for (V el : v) l.add(el);
    }

}
