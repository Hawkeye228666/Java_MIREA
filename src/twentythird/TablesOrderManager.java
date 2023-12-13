package twentythird;

import java.util.HashMap;
import java.util.Map;

public class TablesOrderManager {
    private final Map<String, Order> ordersByTable;

    // Конструктор
    public TablesOrderManager() {
        ordersByTable = new HashMap<>();
    }

    // Метод добавления заказа
    public void addOrder(String tableName, Order order) {
        ordersByTable.put(tableName, order);
    }

    // Метод получения заказа
    public Order getOrder(String tableName) {
        return ordersByTable.get(tableName);
    }

    // Метод удаления заказа
    public void removeOrder(String tableName) {
        ordersByTable.remove(tableName);
    }
}