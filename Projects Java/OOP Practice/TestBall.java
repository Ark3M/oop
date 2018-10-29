package practice1;

import java.lang.System;
import java.util.Scanner;

public class TestBall {

        public static void main(String[] args) {

            String size = new String("Size is:");
            String color = new String("Color is:");


            Ball b1 = new Ball(3.0, "black");
            b1.setColor("orange");
            System.out.println(size.toString() + b1.getSize()
                    + color.toString() + b1.getColor());

            Ball b2 = new Ball(5.0);
            b2.setSize(15);
            System.out.println(size.toString() + b2.getSize()
                    + color.toString() + b2.getColor());

            Ball b3 = new Ball();
            System.out.println(size.toString() + b3.getSize()
                    + color.toString() + b3.getColor());

        }
}