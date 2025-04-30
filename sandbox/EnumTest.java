package sandbox;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("all books");

        for (Book book : Book.values()) {
            System.out.printf("%-2s%-2s%-2d%n", book, book.getTitle(), book.getNume());
        }
        for (Book book : EnumSet.range(Book.A, Book.C)) {
            System.out.println("ddd");
        }
    }
}