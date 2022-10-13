package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StringImpl implements Interface {

    List<String> strList = new ArrayList<>();

    @Override
    public void add(int i, Object el) {

        strList.add(i, (String) el);
    }

    @Override
    public Object get(int i) {
        return strList.get(i);
    }
}
