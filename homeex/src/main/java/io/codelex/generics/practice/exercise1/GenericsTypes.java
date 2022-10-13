package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class GenericsTypes<L> {

    private final List<L> list = new ArrayList<>();

    public void add(int i, L el) {
        list.add(i, el);
    }

    public L get(int i) {
        return list.get(i);
    }

}
