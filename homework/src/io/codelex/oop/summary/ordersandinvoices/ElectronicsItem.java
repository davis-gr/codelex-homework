package io.codelex.oop.summary.ordersandinvoices;

public class ElectronicsItem extends AbstractItem {
    private int power;

    public ElectronicsItem(String name, double price, int power) {
        super(name, price);
        this.power = power;
    }

    @Override
    public String getFullInfo() {
        return String.format("%s, %.2f EUR, power: %dW", getName(), getPrice(), power);
    }

    @Override
    public String toString() {
        return "ElectronicsItem{" +
                "name='" + getName() + '\'' +
                ", price='" + String.format("%.2f", getPrice()) + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
