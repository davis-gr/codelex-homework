package io.codelex.classesandobjects.practice.Exercise3;

public class Odometer {
    int mileage;

    public Odometer(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage, FuelGauge gauge) {
        if (this.mileage + mileage > 999999) {
            this.mileage += mileage - 1000000;
        } else {
            this.mileage += mileage;
        }
        gauge.setFuel(-mileage / 10);
    }


}