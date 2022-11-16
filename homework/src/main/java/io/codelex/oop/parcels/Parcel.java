package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    private final int MAX_TOTAL_SIZE = 300;
    private final int MIN_SIZE = 30;
    private final float MAX_WEIGHT = 30;
    private final float MAX_EXPRESS_WEIGHT = 15;
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + yLength + zLength > MAX_TOTAL_SIZE) {
            System.out.println("Total sum of dimensions is more than " + MAX_TOTAL_SIZE + "!");
            return false;
        }
        if (xLength < MIN_SIZE || yLength < MIN_SIZE || zLength < MIN_SIZE) {
            System.out.println("One of dimensions is less than " + MIN_SIZE + "!");
            return false;
        }
        if (!isExpress && weight > MAX_WEIGHT) {
            System.out.println("Too heavy, weight over " + MAX_WEIGHT + "!");
            return false;
        }
        if (isExpress && weight > MAX_EXPRESS_WEIGHT) {
            System.out.println("Too heavy for express delivery, weight over " + MAX_EXPRESS_WEIGHT + "!");
            return false;
        }
        System.out.println("Parcel valid!");
        return true;
    }


}
