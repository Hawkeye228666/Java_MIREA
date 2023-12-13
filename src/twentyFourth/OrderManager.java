package twentyFourth;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private final Map<String, Order> ordersByAddress;

    // Конструктор
    public OrderManager() {
        ordersByAddress = new HashMap<>();
    }

    // Метод добавления заказа по адресу
    public void addOrder(String address, Order order) {
        if (ordersByAddress.containsKey(address)) {
            throw new OrderAlreadyAddedException("Order already added for address: " + address);
        }
        ordersByAddress.put(address, order);
    }

    // Метод получения заказа по адресу
    public Order getOrder(String address) {
        if (!ordersByAddress.containsKey(address)) {
            throw new IllegalTableNumber("No order found for address: " + address);
        }
        return ordersByAddress.get(address);
    }

    // Метод удаления заказа по адресу
    public void removeOrder(String address) {
        if (!ordersByAddress.containsKey(address)) {
            throw new IllegalTableNumber("No order found for address: " + address);
        }
        ordersByAddress.remove(address);
    }

    // Метод добавления позиции к заказу по адресу
    public void addOrderItem(String address, Item item) {
        if (!ordersByAddress.containsKey(address)) {
            throw new IllegalTableNumber("No order found for address: " + address);
        }
        Order order = ordersByAddress.get(address);
        order.addItem(item);
    }

    // Метод возвращающий массив имеющихся на данный момент заказов по адресам
    public Order[] getOrders() {
        return ordersByAddress.values().toArray(new Order[0]);
    }

    // Метод возвращающий суммарную сумму имеющихся на данный момент заказов
    public int getTotalOrdersCost() {
        int totalCost = 0;
        for (Order order : ordersByAddress.values()) {
            totalCost += order.getTotalCost();
        }
        return totalCost;
    }

    // Метод возвращающий общее количество заказанных порций заданного блюда по его имени
    public int getTotalItemCountByName(String itemName) {
        int totalCount = 0;
        for (Order order : ordersByAddress.values()) {
            totalCount += order.getItemCountByName(itemName);
        }
        return totalCount;
    }
}