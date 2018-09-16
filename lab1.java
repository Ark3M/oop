package ooplabs;

        import java.lang.System;
        import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;

        System.out.println("Enter the number");

        for(int i = 0; i < 10; i++){
            arr[i] = scanner.nextInt();
        }

        for(int num : arr){
            sum = sum + num;
        }
        System.out.println("Amount of elements in array = " + sum);
    }

}
