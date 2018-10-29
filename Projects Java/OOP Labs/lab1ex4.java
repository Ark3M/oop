package lab1;

import java.lang.System;
import java.util.Scanner;
import java.util.Random;

public class ex4 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) rand.nextInt();
            System.out.println(arr[i]);
        }

        System.out.println("Array after sorting:");

        for (int i = 0; i <= arr.length - 1; i++)
            for (int j = 0; j <= arr.length - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

}