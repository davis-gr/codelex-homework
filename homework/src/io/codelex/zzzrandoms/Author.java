// Dāvis Grundmanis
// Getters, setters, equals un hashcode metodes neizveidoju, jo tie uzdevumā nebija vajadzīgi, attiecīgi negribēju to piesārņot ar lieku, computer-generated kodu.

package io.codelex.zzzrandoms;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Author {

    public static final int BOOKS_IN_THE_WORLD = 129864880;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private ArrayList<String> books;

    public Author(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.books = new ArrayList<>();
    }
    public void addBook(String bookName) {
        this.books.add(bookName);
    }

    public long getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean hasWrittenBook(String bookName) {
        return this.books.contains(bookName);
    }

    public void printAllInfo() {
        System.out.println("Author " + getFullName());
        System.out.println("His age is " + getAge() + " at the moment");
        System.out.println("He has written " + this.books.size() + " books");
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", books=" + books +
                '}';
    }
}
