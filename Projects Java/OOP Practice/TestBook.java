package practice1;

import java.lang.System;
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {

        String page = new String("Number of pages in the book:");
        String color = new String("Color of the book:");
        String subject = new String("Subject of the book:");

        Book b1 = new Book();
        b1.setSubject("Economy");
        b1.setPage(90);
        System.out.println(page.toString() + b1.getPage());
        System.out.println(color.toString() + b1.getColor());
        System.out.println(subject.toString() + b1.getSubject());

        Book b2 = new Book(40.0);
        System.out.println(page.toString() + b2.getPage());
        System.out.println(color.toString() + b2.getColor());

        Book b3 = new Book(50.0, "Pink", "Maths");
        b3.setSubject("Physics");
        System.out.println(page.toString() + b3.getPage());
        System.out.println(color.toString() + b3.getColor());
        System.out.println(subject.toString() + b3.getSubject());

    }
}
