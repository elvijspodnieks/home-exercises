package io.codelex.generics.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("word");
        System.out.println(concatenate(stringList));

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        System.out.println(concatenate(intList));

        Object object = new Object();
        List<Object> objectList = new ArrayList<>();
        objectList.add(object);
        System.out.println(concatenate(objectList));

    }

    public static String concatenate(List<?> list) {
        String result = "";
        String separator = "";
        if (list.get(0) instanceof String) {
            result = "String:";
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = "Integers:";
            separator = "+";
        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }

}
