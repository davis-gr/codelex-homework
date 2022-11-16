package io.codelex.oop.summary.ordersandinvoices;

public class OrderProgram {
    public static void main(String[] args) {

        FoodItem pizza = new FoodItem("Pepperoni", 8.99, "15.10.2022");
        ElectronicsItem ps5 = new ElectronicsItem("Sony PlayStation 5", 699.99, 350);
        HouseholdItem table = new HouseholdItem("Generic table", 150.00, "black");
        System.out.println(pizza.getFullInfo());
        System.out.println(ps5.getFullInfo());
        System.out.println(table.getFullInfo());

        Order order = new Order();
        order.addToOrder(pizza);
        order.addToOrder(ps5);
        order.addToOrder(table);

        System.out.println(order);

        Invoice invoice = new Invoice(order.getOrder(), "INV123");
        System.out.println(invoice.formattedInvoice());
        invoice.send();
        System.out.println(invoice.formattedInvoice());

    }
}
