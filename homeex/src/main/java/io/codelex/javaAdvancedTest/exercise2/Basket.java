package io.codelex.javaAdvancedTest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket <T> {

    private List<T> basket;

    public Basket() {
        this.basket  = new ArrayList<>();
    }

    public void addToBasket(T item){
        if(basket.size() == 10){
            throw new BasketFullException("Basket is full");
        } else {
            basket.add(item);
        }
    }

    public void removeFromBasket(){
        if(basket.size() == 0) {
            throw new BasketEmptyException("Basket is empty");
        } else {
            basket.remove(basket.size() - 1);
        }
    }

    public int getSize(){
        return basket.size();
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket +
                '}';
    }
}
