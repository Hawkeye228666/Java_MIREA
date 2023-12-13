package twentyFourth;

public final class Dish implements Item {
    private final int cost;
    private final String name;
    private final String description;

    // Конструктор с тремя параметрами
    public Dish(int cost, String name, String description) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        if (name.isEmpty() || description.isEmpty()) {
            throw new IllegalArgumentException("Name and description cannot be empty");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    // Остальные методы остаются без изменений
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
