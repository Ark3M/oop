package practice8;

public class Dish extends MenuItem //immutable class
{
    public Dish(int price, String name, String description)
    {
        super(price, name, description);
    }

    public Dish(String name, String description)
    {
        super(0, name, description);
    }

    @Override
    public String toString()
    {
        return "Dish{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", descripton='" + description + '\'' +
                '}';
    }
}