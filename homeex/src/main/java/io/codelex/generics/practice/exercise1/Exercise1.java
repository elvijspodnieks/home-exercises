package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    private List<Object> objectList = new ArrayList<>();

    public void add(int i, Object el) {
        objectList.add(i, el);
    }

    public Object get(int i) {
        return objectList.get(i);
    }
}
