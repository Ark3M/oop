import java.lang.System;
import java.util.Scanner;

public class TestPrice {
    public static void main(String[] args) {

        Priceable p1 = new FoodShop("Parmalat");
        System.out.println(p1);
        System.out.println(p1.getPrice());

        Priceable p2 = new SportShop("Adidas");
        System.out.println(p2);
        System.out.println(p2.getPrice());
    }
}
