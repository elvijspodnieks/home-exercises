package io.codelex.javaAdvancedTest.exercise5;

import java.util.List;

public class PartOf <T> {

    private List<T> list;

}


//## Exercise #5
//        #### (generics + functional programming)
//        Implement the generic partOf method, which will return % of items satisfying the condition based on any type of list and the function indicated as parameter.
//
//        Example of how it should work:
//        ```java
//        List<String> names = Arrays.asList("John", "Peter", "Angelina", "Bravo");
//        double percent = partOf(names, (String name) -> name.length() > 4);
//        System.out.println(percent); //Should print out 0.75 because 75% of names are longer than 4 letters
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        double evenPercent = partOf(numbers, (Integer n) -> n % 2 == 1);
//        System.out.println(evenPercent); //Should print out 0.5 because 50% of numbers are even