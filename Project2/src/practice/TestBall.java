package practice;

import java.lang.System;
import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {

        Ball b1 = new Ball(3.0, "black");
        System.out.println("Size is" + b1.getSize() 
        + "Color is" + b1.getColor());

        Ball b2 = new Ball(5.0);
        System.out.println("Size is" + b2.getSize()
        + "Color is" + b2.getColor());

        Ball b3 = new Ball();
        System.out.println("Size is" + b3.getSize()
        + "Color is" + b3.getColor());

    }
}
