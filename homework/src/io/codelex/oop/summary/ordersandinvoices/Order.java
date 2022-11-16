package io.codelex.oop.summary.ordersandinvoices;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Item> itemList;

    public Order() {
        itemList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Order{" +
                "itemList=" + itemList +
                '}';
    }

    public void addToOrder(Item item) {
        itemList.add(item);
    }

    public List<Item> getOrder() {
        return itemList;
    }
}
