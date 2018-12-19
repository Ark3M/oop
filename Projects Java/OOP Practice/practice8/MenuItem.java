package practice8;

public abstract class MenuItem
{
    protected int price;
    protected String name;
    protected String description;

    public MenuItem(int price, String name, String description)
    {
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public int getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    @Override
    public String toString()
    {
        return "MenuItem{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", descripton='" + description + '\'' +
                '}';
    }
}
