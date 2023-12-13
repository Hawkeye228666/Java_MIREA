package twentyFourth;

public interface Order {
    boolean addItem(Item item);
    boolean removeItemByName(String itemName);
    int removeItemsByName(String itemName);
    int getTotalItemsCount();
    Item[] getItems();
    int getTotalCost();
    int getItemCountByName(String itemName);
    String[] getUniqueItemNames();
    Item[] getItemsSortedByPrice();
}