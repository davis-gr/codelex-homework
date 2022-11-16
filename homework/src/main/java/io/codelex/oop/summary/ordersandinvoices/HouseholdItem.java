package io.codelex.oop.summary.ordersandinvoices;

public class HouseholdItem extends AbstractItem {

    String color;
    public HouseholdItem(String name, double price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String getFullInfo() {
        return String.format("%s, %.2f EUR, color: %s", getName(), getPrice(), color);
    }

    @Override
    public String toString() {
        return "HouseholdItem{" +
                "name='" + getName() + '\'' +
                ", price='" + String.format("%.2f", getPrice()) + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
