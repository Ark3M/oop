package practice8;

import java.util.ArrayList;

public interface Order
{
    boolean add(MenuItem i);
    String[] itemsNames();
    int itemsQuantity(); //кол-во
    int itemsQuantity(String name);
    int itemsQuantity(MenuItem item);
    MenuItem[] getItems();
    boolean remove(String name);
    boolean remove(MenuItem item);
    int removeAll(String name);
    int removeAll(MenuItem item);
    MenuItem[] sortedItemsByCost();
    double costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}
