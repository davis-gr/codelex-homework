package io.codelex.oop.summary.ordersandinvoices;

public class FoodItem extends AbstractItem {

    private String bestBeforeDate;

    public FoodItem(String name, double price, String bestBeforeDate) {
        super(name, price);
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public String getFullInfo() {
        return String.format("%s, %.2f EUR, best before: %s", getName(), getPrice(), bestBeforeDate);
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + getName() + '\'' +
                ", price='" + String.format("%.2f", getPrice()) + '\'' +
                ", bestBeforeDate='" + bestBeforeDate + '\'' +
                '}';
    }
}
