package io.codelex.oop.computers;

public class Laptop extends Computer {

    private String battery;

    public Laptop(String processor, String RAM, String graphicsCard, String company, String model, String battery) {
        super(processor, RAM, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + getProcessor() + '\'' +
                ", RAM='" + getRAM() + '\'' +
                ", graphicsCard='" + getGraphicsCard() + '\'' +
                ", company='" + getCompany() + '\'' +
                ", model='" + getModel() + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

