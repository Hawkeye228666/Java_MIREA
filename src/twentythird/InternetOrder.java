package twentythird;

import java.util.LinkedList;

public class InternetOrder {
    private final Node head;

    // Конструктор без параметров
    public InternetOrder() {
        head = new Node(null, null, null);
        head.prev = head.next = head;
    }

    // Конструктор с массивом позиций заказа
    public InternetOrder(Item[] items) {
        this();
        for (Item item : items) {
            addItem(item);
        }
    }

    // Метод добавления позиции в заказ
    public boolean addItem(Item item) {
        Node newNode = new Node(item, head, head.next);
        head.next.prev = head.next = newNode;
        return true;
    }

    // Метод удаления позиции из заказа по названию
    public boolean removeItemByName(String itemName) {
        Node currentNode = head.next;
        while (currentNode != head) {
            if (currentNode.data.getName().equals(itemName)) {
                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    // Метод удаления всех позиций с заданным именем
    public int removeItemsByName(String itemName) {
        int count = 0;
        Node currentNode = head.next;
        while (currentNode != head) {
            if (currentNode.data.getName().equals(itemName)) {
                currentNode.prev.next = currentNode.next;
                currentNode.next.prev = currentNode.prev;
                count++;
            }
            currentNode = currentNode.next;
        }
        return count;
    }

    // Метод возвращающий общее число позиций заказа
    public int getTotalItemsCount() {
        int count = 0;
        Node currentNode = head.next;
        while (currentNode != head) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    // Метод возвращающий массив заказанных блюд и напитков
    public Item[] getItems() {
        Item[] items = new Item[getTotalItemsCount()];
        Node currentNode = head.next;
        for (int i = 0; i < items.length; i++) {
            items[i] = currentNode.data;
            currentNode = currentNode.next;
        }
        return items;
    }

    // Метод возвращающий общую стоимость заказа
    public int getTotalCost() {
        int totalCost = 0;
        Node currentNode = head.next;
        while (currentNode != head) {
            totalCost += currentNode.data.getCost();
            currentNode = currentNode.next;
        }
        return totalCost;
    }

    // Метод возвращающий число заказанных блюд или напитков по названию
    public int getItemCountByName(String itemName) {
        int count = 0;
        Node currentNode = head.next;
        while (currentNode != head) {
            if (currentNode.data.getName().equals(itemName)) {
                count++;
            }
            currentNode = currentNode.next;
        }
        return count;
    }

    // Метод возвращающий массив названий заказанных блюд и напитков без повторов
    public String[] getUniqueItemNames() {
        LinkedList<String> uniqueNames = new LinkedList<>();
        Node currentNode = head.next;
        while (currentNode != head) {
            if (!uniqueNames.contains(currentNode.data.getName())) {
                uniqueNames.add(currentNode.data.getName());
            }
            currentNode = currentNode.next;
        }
        return uniqueNames.toArray(new String[0]);
    }

    // Метод возвращающий массив позиций заказа, отсортированный по убыванию цены
    public Item[] getItemsSortedByPrice() {
        Item[] items = getItems();
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j].getCost() < items[j + 1].getCost()) {
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }

    // Внутренний класс Node для реализации двусвязного списка
    private static class Node {
        Item data;
        Node prev;
        Node next;

        Node(Item data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}