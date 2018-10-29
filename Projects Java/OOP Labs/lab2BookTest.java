package lab2;

import java.lang.System;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {

        String year = new String("The book was written on ");
        String page = new String("The book consist of ");
        String author = new String("The book was written by ");
        String title = new String("Title of the book: ");
        String color  = new String("Color of the book: ");

        Book b1 = new Book();
        System.out.println(year.toString() + b1.getYear());
        System.out.println(page.toString() + b1.getPage() + " pages");
        System.out.println(author.toString() + b1.getAuthor());
        System.out.println(title.toString() + b1.getTitle());
        System.out.println(color.toString() + b1.getColor());

        Book b2 = new Book(1951, 277, "J. D. Salinger", "The Catcher in the Rye", "Red");
        System.out.println(year.toString() + b2.getYear());
        System.out.println(page.toString() + b2.getPage() + " pages");
        System.out.println(author.toString() + b2.getAuthor());
        System.out.println(title.toString() + b2.getTitle());
        System.out.println(color.toString() + b2.getColor());

        Book b3 = new Book(1932, "Aldous Huxley", "Brave New World");
        b3.setYear(1931);
        System.out.println(year.toString() + b3.getYear());
        System.out.println(author.toString() + b3.getAuthor());
        System.out.println(title.toString() + b3.getTitle());
    }
}