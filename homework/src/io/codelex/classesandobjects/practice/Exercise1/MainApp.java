package io.codelex.classesandobjects.practice.Exercise1;

public class MainApp {
    public static void main(String[] args) {

        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);

        System.out.println("Initial values:");
        product1.printProduct();
        product2.printProduct();
        product3.printProduct();

        product1.changePrice(69.69);
        product3.changeQty(42);

        System.out.println("Values after change:");
        product1.printProduct();
        product2.printProduct();
        product3.printProduct();

    }
}
