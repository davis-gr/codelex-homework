package io.codelex.oop.parcels;

public class ParcelTest {

    public static void main(String[] args) {

        Parcel oversized = new Parcel(100,100,101,25,false);
        Parcel undersized = new Parcel(25,30,35,1,true);
        Parcel heavy = new Parcel(90,60,90,69,false);
        Parcel heavyExpress = new Parcel(35,36,37,26,true);
        Parcel valid = new Parcel(65,65,65,25,false);

        oversized.validate();
        undersized.validate();
        heavy.validate();
        heavyExpress.validate();
        valid.validate();


    }
}
