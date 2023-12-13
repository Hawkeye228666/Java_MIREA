package twentythird;

public class Drink implements Item {
    private static final int DEFAULT_COST = 0;

    private final int cost;
    private final String name;
    private final String description;

    // Конструктор с двумя параметрами
    public Drink(String name, String description) {
        this(DEFAULT_COST, name, description);
    }

    // Конструктор с тремя параметрами
    public Drink(int cost, String name, String description) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    // Метод возвращающий стоимость
    @Override
    public int getCost() {
        return cost;
    }

    // Метод возвращающий название
    @Override
    public String getName() {
        return name;
    }

    // Метод возвращающий описание
    @Override
    public String getDescription() {
        return description;
    }
}