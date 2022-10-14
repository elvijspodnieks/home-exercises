package io.codelex.javaAdvancedTest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket <T> {

    List<T> basket = new ArrayList<>();
    int basketSize = 0;

    public Basket(List<T> basket) {
        this.basket = basket;
    }

}
