package io.codelex.oop.persons;


public class Customer extends Person {

    private final String customerId;
    private int purchaseCount;

    public Customer(String firstname, String lastname, String id, int age, String customerId, int purchaseCount) {
        super(firstname, lastname, id, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return String.format("%s %s %s (%d purchases)", getFirstname(), getLastname(), customerId, getPurchaseCount());
    }

}
