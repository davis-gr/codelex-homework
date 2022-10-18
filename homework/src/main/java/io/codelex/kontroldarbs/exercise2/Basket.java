package io.codelex.kontroldarbs.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> list;

    public Basket() {
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }


    public void addToBasket(T item) {
        if (list.size() == 10) {
            throw new BasketFullException("Basket full!");
        } else {
            list.add(item);
        }
    }

    public void removeFromBasket(T item) {
        if (list.size() == 0) {
            throw new BasketEmptyException("Basket already empty!");
        } else {
            list.remove(item);
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "list=" + list +
                '}';
    }
}
