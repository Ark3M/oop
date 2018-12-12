import java.util.Scanner;


public class Recursion
{
    public static void rec16(int count, int max)
    {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if (value == 0) {
            System.out.println(count + " " + max);
            return;
        }

        if (value == max)
            count++;

        if (value > max) {
            max = value;
            count = 1;
        }

        rec16(count, max);
    }


    public static void rec15(int N)
    {
        if(N == 0)
            return;

        System.out.print(N%10 + " ");

        rec15(N/10);
    }

    public static void rec17(int max)
    {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if (value == 0)
        {
            System.out.println(max);
            return;
        }

        if (value > max)
        {
            max = value;
        }

        rec17(max);
    }



    public static void main(String[] args)
    {
        rec15(56789);
    }
}
