package io.codelex.oop.persons;

public class Main {

    public static void main(String[] args) {

        Employee consuela = new Employee("Consuela", "De La Morrela", "1", 55, "Cleaning lady", "01.01.2007");

        System.out.println(consuela.getInfo());

        Customer homer = new Customer("Homer", "Simpson", "2", 40, "CID1234", 10);

        System.out.println(homer.getInfo());

        homer.setPurchaseCount(26);

        System.out.println(homer.getInfo());

    }
}
