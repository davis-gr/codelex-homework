package io.codelex.collections.practice.phonebook;

public class Test {

    public static void main(String[] args) {

        PhoneDirectory phoneNew = new PhoneDirectory();
        phoneNew.putNumber("Anakin", "22484848");
        phoneNew.putNumber("Padme", "22848484");


        System.out.println(phoneNew);
        System.out.println(phoneNew.getNumber("Anakin"));
        phoneNew.putNumber("Anakin", "22666666");
        System.out.println(phoneNew.getNumber("Anakin"));
        System.out.println(phoneNew.getNumber("Obi-Wan"));


    }
}
