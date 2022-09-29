package io.codelex.oop.computers;

import java.util.Objects;

public class Computer {

    private String processor;
    private String RAM;
    private String graphicsCard;
    private String company;
    private String model;

    public Computer(String processor, String RAM, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.RAM = RAM;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", RAM='" + RAM + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer computer)) return false;
        return getProcessor().equals(computer.getProcessor()) && getRAM().equals(computer.getRAM()) && getGraphicsCard().equals(computer.getGraphicsCard()) && getCompany().equals(computer.getCompany()) && getModel().equals(computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProcessor(), getRAM(), getGraphicsCard(), getCompany(), getModel());
    }


}
