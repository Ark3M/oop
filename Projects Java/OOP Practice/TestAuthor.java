import java.lang.System;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {

        Author a1 = new Author("Artem Matveev", "artyom.maveev@yandex.ru", 'M');
        System.out.println(a1);
        a1.setEmail("stingartem1148@gmail.com");
        System.out.println(a1);
    }
}
