import java.lang.System;
import java.util.Scanner;

public class TestDish {
    public static void main(String[] args) {

        Fork f1 = new Fork("aluminum", "cafe");
        f1.displayInfo();

        Spoon s1 = new Spoon("plastic", "restaurant");
        s1.displayInfo();

        Plate p1 = new Plate("glass", "bar");
        p1.displayInfo();
    }
}
