package io.codelex.javaAdvancedTest.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    void testAddApple() {
        Basket<Apple> appleBasket = new Basket<>();
        Apple apple = new Apple();
        appleBasket.addToBasket(apple);
        Assertions.assertEquals(1, appleBasket.getSize());
    }

    @Test
    void testAddMushroom() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        Mushroom mushroom = new Mushroom();
        mushroomBasket.addToBasket(mushroom);
        Assertions.assertEquals(1, mushroomBasket.getSize());
    }

    @Test
    void testEmptyBasket() {

        Basket<Apple> myBasket = new Basket<>();
        BasketEmptyException error = Assertions.assertThrows(BasketEmptyException.class, myBasket::removeFromBasket);
        Assertions.assertEquals("Basket is empty", error.getMessage());
    }

    @Test
    void testFullBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        mushroomBasket.addToBasket(new Mushroom());
        BasketFullException error = Assertions.assertThrows(BasketFullException.class, () -> mushroomBasket.addToBasket(new Mushroom()));
        Assertions.assertEquals("Basket is full", error.getMessage());
    }
}
