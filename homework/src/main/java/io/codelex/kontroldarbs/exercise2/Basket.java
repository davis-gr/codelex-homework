package io.codelex.kontroldarbs.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> list;
    private Integer itemCount;

    public Basket() {
        this.list = new ArrayList<>();
        this.itemCount = 0;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public void addToBasket(T item) {
        if (getItemCount() == 10) {
            throw new BasketFullException("Basket full!");
        } else {
            list.add(item);
            itemCount++;
        }
    }

    public void removeFromBasket(T item) {
        if (getItemCount() == 0) {
            throw new BasketEmptyException("Basket already empty!");
        } else {
            list.remove(item);
            itemCount--;
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "list=" + list +
                ", itemCount=" + itemCount +
                '}';
    }
}
