import java.util.ArrayList;


public class CollectionAppArrayList
{
    public static void main(String[] args)
    {
        ArrayList <String> oceans = new ArrayList<String>();
        oceans.add("Atlantic Ocean");
        oceans.add("Indian Ocean");
        oceans.add("Antarctic Ocean");
        oceans.add("Arctic Ocean\n");
        oceans.add(0,"Pacific Ocean");

        System.out.println(oceans.get(2) + "\n");
        oceans.set(3, "South Ocean");

        System.out.printf("In the list %d elements: \n", oceans.size());

        for (String ocean : oceans)
        {
            System.out.println(ocean);
        }

        if (oceans.contains("Indian Ocean"))
        {
            System.out.println("The list contains Indian Ocean\n");
        }

        oceans.remove("Atlantic Ocean");

        System.out.println("The list after remove the second element:");

        for (String ocean : oceans)
        {
            System.out.println(ocean);
        }

        System.out.println("The list after converting to array of objects:");

        Object [] oceaNStoarray = oceans.toArray();

        for (Object oceaNtoarray : oceaNStoarray)
        {
            System.out.println(oceaNtoarray);
        }

    }
}
