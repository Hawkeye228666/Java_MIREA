package twentythird;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Item> items;

    // Конструктор без параметров
    public Order() {
        items = new ArrayList<>();
    }

    // Конструктор с массивом позиций заказа
    public Order(Item[] items) {
        this.items = new ArrayList<>();
        for (Item item : items) {
            addItem(item);
        }
    }

    // Метод добавляющий позицию в заказ
    public boolean addItem(Item item) {
        return items.add(item);
    }

    // Метод удаляющий позицию из заказа по названию
    public boolean removeItemByName(String itemName) {
        Item itemToRemove = null;
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                itemToRemove = item;
            }
        }
        return items.remove(itemToRemove);
    }

    // Метод удаляющий все позиции с заданным именем
    public int removeItemsByName(String itemName) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                items.remove(item);
                count++;
            }
        }
        return count;
    }

    // Метод возвращающий общее число позиций заказа
    public int getTotalItemsCount() {
        return items.size();
    }

    // Метод возвращающий массив заказанных блюд и напитков
    public Item[] getItems() {
        return items.toArray(new Item[0]);
    }

    // Метод возвращающий общую стоимость заказа
    public int getTotalCost() {
        int totalCost = 0;
        for (Item item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    // Метод возвращающий число заказанных блюд или напитков по названию
    public int getItemCountByName(String itemName) {
        int count = 0;
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                count++;
            }
        }
        return count;
    }

    // Метод возвращающий массив названий заказанных блюд и напитков без повторов
    public String[] getUniqueItemNames() {
        List<String> uniqueNames = new ArrayList<>();
        for (Item item : items) {
            if (!uniqueNames.contains(item.getName())) {
                uniqueNames.add(item.getName());
            }
        }
        return uniqueNames.toArray(new String[0]);
    }

    // Метод возвращающий массив позиций заказа, отсортированный по убыванию цены
    public Item[] getItemsSortedByPrice() {
        items.sort((item1, item2) -> Integer.compare(item2.getCost(), item1.getCost()));
        return items.toArray(new Item[0]);
    }
}