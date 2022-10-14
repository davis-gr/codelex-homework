package io.codelex.kontroldarbs.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasketTest {

    @Test
    void testApples() {
        Apple apple = new Apple();
        Basket<Apple> basket = new Basket<>();
        basket.addToBasket(apple);
        String result = basket.getList().get(0).getClass().getSimpleName();
        Assertions.assertEquals("Apple", result);
    }

    @Test
    void testShrooms() {
        Mushroom mushroom = new Mushroom();
        Basket<Mushroom> basket = new Basket<>();
        basket.addToBasket(mushroom);
        String result = basket.getList().get(0).getClass().getSimpleName();
        Assertions.assertEquals("Mushroom", result);
    }

    @Test
    void testEmpty() {
        Apple apple = new Apple();
        Basket<Apple> basket = new Basket<>();
        basket.addToBasket(apple);
        basket.removeFromBasket(apple);
        Exception exception = assertThrows(BasketEmptyException.class, () -> {
            basket.removeFromBasket(apple);
        });
        Assertions.assertEquals("Basket already empty!", exception.getMessage());
    }

    @Test
    void testFull() {
        Apple apple = new Apple();
        Basket<Apple> basket = new Basket<>();
        for (int i = 0; i < 10; i++) {
            basket.addToBasket(apple);
        }
        Exception exception = assertThrows(BasketFullException.class, () -> {
            basket.addToBasket(apple);
        });
        Assertions.assertEquals("Basket full!", exception.getMessage());
    }


}
