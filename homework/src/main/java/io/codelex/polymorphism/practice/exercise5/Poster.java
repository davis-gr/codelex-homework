package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    private int height;
    private int width;
    private int copies;
    private double costPerCopy;

    public Poster(int fee, int height, int width, int copies, double costPerCopy) {
        super(fee);
        this.height = height;
        this.width = width;
        this.copies = copies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return super.cost() + (int) Math.round(costPerCopy * copies);
    }


    public String toString() {
        return super.toString() + " Poster: dimensions=" + height + "x" + width + ". Copies=" + copies +  ", cost per copy=" + costPerCopy;
    }
}
