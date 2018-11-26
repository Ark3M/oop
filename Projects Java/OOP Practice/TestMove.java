import java.lang.System;
import java.util.Scanner;

public class TestMove {
    public static void main(String[] args) {

        Movable m1 = new MovablePoint(5, 6, 25, 36);
        System.out.println(m1);
        m1.moveDown();
        m1.moveLeft();
        m1.moveRight();
        m1.moveUp();

        Movable m2 = new MovableCircle(7, 8, 49, 56, 100);
        System.out.println(m2);
        m2.moveDown();
        m2.moveLeft();
        m2.moveRight();
        m2.moveUp();
    }
}
