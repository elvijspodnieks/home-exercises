package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class WhitoutGenerics {

    List<Integer> strList = new ArrayList<>();

    public void add(int i, int el){
        strList.add(i, el);
    }

    public Object get(int i){
        return strList.get(i);
    }
}
