package io.codelex.oop.computers;

public class ComputerTest {

    public static void main(String[] args) {

        Computer legion5 = new Computer("AMD Ryzen 7", "8 GB", "NVIDIA GeForce RTX 3050", "Lenovo", "Legion 5");
        Computer legion7 = new Computer("Intel Core i7", "16 GB", "NVIDIA GeForce RTX 3060", "Lenovo", "Legion 7");
        Computer chromebook = new Computer("Mediatek", "4 GB", "Integrated", "Acer", "Chromebook Spin 311");
        Computer msi = new Computer("Intel Core i7", "16 GB", "NVIDIA GeForce RTX 3070 Ti", "MSI", "Gaming GP76");
        Computer chromebook2 = new Computer("Mediatek", "2 GB", "Integrated", "Acer", "Chromebook Spin 311");

        // test toString
        System.out.println(legion5);
        // test getter
        System.out.println(legion7.getGraphicsCard());
        // test equals() on object variables
        System.out.println(legion7.getProcessor().equals(msi.getProcessor()));
        // test hashcode() on object variables
        System.out.println(legion5.getCompany().hashCode() == legion7.getCompany().hashCode());
        // test equals() on objects
        System.out.println(chromebook.equals(chromebook2));
        // test setter
        chromebook2.setRAM("4 GB");
        // test equals() on objects after updating value
        System.out.println(chromebook.equals(chromebook2));


        Laptop macbook = new Laptop("Apple M", "8 GB", "Integrated", "Apple", "Macbook Pro", "58.2 Wh");
        // test Laptop toString() - I modified it to also print battery, but it uses Computer getters
        System.out.println(macbook);
        // test Laptop getter
        System.out.println(macbook.getBattery());
        // test Computer equals() on Laptop vs Computer object variables
        System.out.println(macbook.getRAM().equals(legion5.getRAM()));


    }
}
