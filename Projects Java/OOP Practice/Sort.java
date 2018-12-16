package practice6;

import java.util.Scanner;


public class Sort
{
    public static void main(String[] args)
    {
        Student s[] = new Student[5];

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<s.length; i++)
        {
            System.out.print("Enter student "+(i+1)+" Id: ");
            int id = scan.nextInt();
            System.out.print("Enter student "+(i+1)+" Name: ");
            String name = scan.next();
            s[i] = new Student(id, name);
        }

        System.out.println("Before Sorting, Student array elements: ");

        for(int i=0; i<s.length; i++)
        {
            System.out.println(s[i].toString());
        }

        /*int low = 0;
        int high = s.length - 1;*/

        //QuickSort(s, low, high);
        sortStudent(s);

        System.out.println("After Sorting, Student array elements: ");

        for(int i=0; i<s.length; i++)
        {
            System.out.println(s[i].toString());
        }
    }

    public static void sortStudent(Student s[])
    {
        int n = s.length;
        Student temp;

        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
                if(s[j-1].getId() > s[j].getId())
                {
                    temp = s[j-1];
                    s[j-1] = s[j];
                    s[j] = temp;
                }

            }
        }
    }



    /*public static void QuickSort(Student s[], int low, int high)
    {
        if(s.length == 0)
        {
            return;
        }

        if(low >= high)
        {
            return;
        }

        int middle = low + (high - low) / 2;
        Student opora = s[middle];

        int i = low;
        int j = high;

        while (i <= j)
        {
            while(s[i] < opora) //???
            {
                i++;
            }

            while(s[j] > opora) //???
            {
                j--;
            }

            if(i <= j)
            {
                Student temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }
        }

        if(low < j)
        {
            QuickSort(s, low, j);
        }

        if(high > i)
        {
            QuickSort(s, i, high);
        }

    }*/
}
