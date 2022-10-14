package io.codelex.kontroldarbs.exercise1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        CreditCard creditcard = new CreditCard("0000111122223333", "Harry Potter", "123", BigDecimal.valueOf(105));
        DebitCard debitcard = new DebitCard("0123456789106666", "Tom Riddle", "123", BigDecimal.valueOf(6666));

        debitcard.deposit(BigDecimal.valueOf(6666));
        creditcard.withdraw(BigDecimal.valueOf(50));
        //Uncomment to see if Harry goes bust X_X
        //creditcard.withdraw(BigDecimal.valueOf(60));
        //Draco trying to create fraudulent credit card here:
        CreditCard dracocard = new CreditCard("1234123412341234", "Draco Malfoy", "66nine", BigDecimal.valueOf(9000));

    }


}
