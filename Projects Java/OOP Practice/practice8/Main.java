package practice8;

public class Main
{
    public static void main(String[] args)
    {
        TableOrderManager tm = new TableOrderManager(5);

        TableOrder t1 = new TableOrder(new Customer(20));
        t1.add(new Drink(99,"Beer", "Sweet honey!", 5,  DrinkTypeEnum.BEER));
        tm.add(t1, 4);

        TableOrder t2 = new TableOrder(new Customer(29));
        t2.add(new Drink(1500,"Whiskey", "Your best friend", 40,  DrinkTypeEnum.WHISKEY));
        tm.add(t2, 3);

        System.out.println("BEER COUNT " + tm.itemsQuantity("Beer"));
        System.out.println("WHISKEY COUNT " + tm.itemsQuantity("Whiskey"));


        int[] tables = tm.freeTableNumbers();
        System.out.println("Free tables:");
        for(int i = 0; i < tables.length; i++)
        {
            System.out.println(tables[i]);
        }

        tm.remove(4);

        System.out.println("BEER COUNT " + tm.itemsQuantity("Beer"));
        System.out.println("WHISKEY COUNT " + tm.itemsQuantity("Whiskey"));

        TableOrder t3 = new TableOrder(new Customer(18));
        t3.add(new Drink(250,"Wine", "Lonley nights", 15,  DrinkTypeEnum.WINE));
        tm.add(t3, 1);

        System.out.println("Final cost " + tm.ordersCostSummary());
    }
}