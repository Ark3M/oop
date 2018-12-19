import java.util.ArrayList;
import java.util.Random;

public class Drunk
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        Random random = new Random();


        for(int i = 0; i < 5; i++)
        {
            arrayList.add(random.nextInt(10) + 1);
            arrayList2.add(random.nextInt(10) + 1);
        }

        int count = 0;

        while (true)
        {
            for(int i :arrayList)
            {
                System.out.print(i + " ");
            }
            System.out.println("\n");
            for(int j :arrayList2)
            {
                System.out.print(j + " ");
            }
            System.out.println("\n");
            System.out.println("\n");
            if(arrayList.get(0) > arrayList2.get(0))
            {
                arrayList.add(arrayList.get(0));
                arrayList.add(arrayList2.get(0));

                arrayList.remove(0);
                arrayList2.remove(0);
            }
            else if(arrayList.get(0) < arrayList2.get(0))
            {
                arrayList2.add(arrayList.get(0));
                arrayList2.add(arrayList2.get(0));

                arrayList.remove(0);
                arrayList2.remove(0);
            }
            else
            {
                arrayList.add(arrayList.get(0));
                arrayList2.add(arrayList2.get(0));

                arrayList.remove(0);
                arrayList2.remove(0);
            }
            count++;
            if(count >= 60)
            {
                break;
            }
            if(arrayList.isEmpty() || arrayList2.isEmpty())
            {
                break;
            }
        }
        if(arrayList2.isEmpty())
        {
            System.out.println("Первый победил, число ходов: " + count);
        }
        else if(arrayList.isEmpty())
        {
            System.out.println("Второй победил, число ходов: " + count);
        }
        else
        {
            System.out.println("Превышено число ходов: " + count);
        }

    }
}
