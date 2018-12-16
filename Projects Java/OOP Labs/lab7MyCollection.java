import java.util.Iterator;


public class CollectionAppMyCollection <E> implements My <E>
{
    public static void main(String[] args)
    {
        My <String> cities = new CollectionAppMyCollection<>();
        cities.add("Moscow");
        cities.add("New York City");
        cities.add("San Francisco \n");

        System.out.println(cities.get(0) + "\n");

        cities.update(1, "Kazan");

        System.out.printf("In the list %d elements: \n", cities.size());

        for (String city : cities)
        {
            System.out.println(city);
        }

        cities.delete(2);

        System.out.println("The list after delete the third element:");

        System.out.println(cities.get(0));
        System.out.println(cities.get(1));

    }



    private E[] values;

    public CollectionAppMyCollection()
    {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try
        {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        }
        catch (ClassCastException ex)
        {
            ex.printStackTrace();
        }
        return false;
    }

    public void delete(int index)
    {
        try
        {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values,0, index);
            int amountElementAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementAfterIndex);
        }
        catch (ClassCastException ex)
        {
            ex.printStackTrace();
        }
    }

    public E get(int index)
    {
        return values[index];
    }

    public int size()
    {
        return values.length;
    }

    public void update(int index, E e)
    {
        values[index] = e;
    }


    public Iterator<E> iterator()
    {
        return new ArrayIterator<>(values);
    }
}
