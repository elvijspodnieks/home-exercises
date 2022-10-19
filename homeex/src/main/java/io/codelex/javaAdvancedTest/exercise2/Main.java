package io.codelex.javaAdvancedTest.exercise2;

public class Main {
    public static void main(String[] args) {
        Basket<Integer> basket = new Basket<>();
        basket.addToBasket(1);
        basket.addToBasket(2);
        basket.addToBasket(3);
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.addToBasket(8);
        basket.removeFromBasket();


        System.out.println(basket);
    }

}
