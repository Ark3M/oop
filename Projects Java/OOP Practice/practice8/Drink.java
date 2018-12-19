package practice8;

public class Drink extends MenuItem implements Alcoholable //immutable class
{
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(int price, String name, String description, double alcoholVol, DrinkTypeEnum type)
    {
        super(price, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }



    @Override
    public double getAlcoholVol()
    {
        return alcoholVol;
    }

    @Override
    public boolean isAlcoholicDrink()
    {
        if(alcoholVol > 0)
            return true;
        else
            return false;
    }

    public DrinkTypeEnum getType()
    {
        return type;
    }

    @Override
    public String toString()
    {
        return "Drink{" +
                "alcoholVol=" + alcoholVol +
                ", type=" + type +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
