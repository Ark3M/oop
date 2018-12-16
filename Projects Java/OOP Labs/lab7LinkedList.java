import java.util.LinkedList;


public class CollectionAppLinkedList
{
    public static void main(String[] args)
    {
        LinkedList <String> oceans = new LinkedList<String>();
        oceans.add("Atlantic Ocean");
        oceans.add("Indian Ocean");
        oceans.addLast("Arctic Ocean\n");
        oceans.addFirst("Pacific Ocean");
        oceans.add(3, "Antarctic Ocean");

        System.out.println();

        System.out.println("The fourth element in the list: " + oceans.get(3) + "\n");

        oceans.set(3, "South Ocean");

        System.out.printf("In the list %d elements: \n", oceans.size());

        for (String ocean : oceans)
        {
            System.out.println(ocean);
        }

        if (oceans.contains("Atlantic Ocean"))
        {
            System.out.println("The list contains Atlantic Ocean\n");
        }

        oceans.remove(2);
        oceans.removeFirst();
        oceans.removeLast();

        System.out.println("The list after remove the third, first and last elements:");

        for (String ocean : oceans)
        {
            System.out.println(ocean);
        }

        System.out.printf("\n");

        class Person
        {
            private String name;

            public Person (String value)
            {
                name = value;
            }

            String getName()
            {
                return name;
            }
        }

        LinkedList <Person> people = new LinkedList<Person>();
        people.add(new Person("John"));
        people.add(new Person("Mike"));
        people.add(new Person("Nick"));
        people.remove(2);

        System.out.println("The list of persons:");

        for (Person p : people)
        {
            System.out.println(p.getName());
        }

        Person first = people.getFirst();

        System.out.println(first.getName());

    }
}
