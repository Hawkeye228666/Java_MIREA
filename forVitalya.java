//Реализовать интерфейс Priceable, имеющий метод getPrice(), возвращающий некоторую цену для объекта. Проверить работу для различных классов, сущности которых могут иметь цену.
interface Priceable {
    double getPrice();
}

class Book implements Priceable {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Phone implements Priceable {
    private String brand;
    private String model;
    private double price;

    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Laptop implements Priceable {
    private String brand;
    private String model;
    private double price;

    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class Price {
    public static void main(String[] args) {
        Priceable book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 19.99);
        System.out.println("The price of " + book.getClass().getSimpleName() + " is $" + book.getPrice());

        Priceable phone = new Phone("Samsung", "Galaxy S21", 999.99);
        System.out.println("The price of " + phone.getClass().getSimpleName() + " is $" + phone.getPrice());

        Priceable laptop = new Laptop("Apple", "MacBook Pro", 1499.99);
        System.out.println("The price of " + laptop.getClass().getSimpleName() + " is $" + laptop.getPrice());
    }
}


//Создать интерфейс Nameable, с методом getName(), возвращающим имя объекта, реализующего интерфейс.
//Проверить работу для различных объектов (например, можно создать классы, описывающие разные сущности, которые могут иметь имя: планеты, машины, животные и т. д.).

interface Nameable {
    String getName();
}
class Planet implements Nameable {
    private String name;
    public Planet(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
class Car implements Nameable {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String getName() {
        return brand + " " + model;
    }
}

class Animal implements Nameable {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public String getName() {
        return name + " (" + species + ")";
    }
}

public class Name {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        System.out.println(planet.getName());

        Nameable car = new Car("Toyota", "Camry");
        System.out.println(car.getName());

        Nameable animal = new Animal("Max", "Dog");
        System.out.println(animal.getName());
    }
}



//Практика номер 10
//Создать класс, описывающий модель окружности (Circle). В классе должны быть описаны нужные свойства окружности и методы для получения, изменения этих свойств. 
//Протестировать работу класса в классе CircleTest, содержащим метод статический main(String[] args).

public class Circle {
    private double radius;
    private double centerX;
    private double centerY;

    public Circle(double radius, double centerX, double centerY) {
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}


public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 0, 0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Center X: " + circle.getCenterX());
        System.out.println("Center Y: " + circle.getCenterY());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        circle.setRadius(7);
        circle.setCenterX(2);
        circle.setCenterY(3);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Center X: " + circle.getCenterX());
        System.out.println("Center Y: " + circle.getCenterY());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}

// Создать класс, описывающий тело человека(Human). Для описания каждой части тела создать отдельные классы(Head, Leg, Hand). 
//Описать необходимые свойства и методы для каждого класса. Протестировать работу класса Human.



public class Head {
    private String hairColor;
    private double headSize;

    public Head(String hairColor, double headSize) {
        this.hairColor = hairColor;
        this.headSize = headSize;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public double getHeadSize() {
        return headSize;
    }

    public void setHeadSize(double headSize) {
        this.headSize = headSize;
    }
}

public class Leg {
    private double legLength;
    private double footSize;

    public Leg(double legLength, double footSize) {
        this.legLength = legLength;
        this.footSize = footSize;
    }

    public double getLegLength() {
        return legLength;
    }

    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }

    public double getFootSize() {
        return footSize;
    }

    public void setFootSize(double footSize) {
        this.footSize = footSize;
    }
}

public class Hand {
    private double armLength;
    private boolean hasFingers;

    public Hand(double armLength, boolean hasFingers) {
        this.armLength = armLength;
        this.hasFingers = hasFingers;
    }

    public double getArmLength() {
        return armLength;
    }

    public void setArmLength(double armLength) {
        this.armLength = armLength;
    }

    public boolean isHasFingers() {
        return hasFingers;
    }

    public void setHasFingers(boolean hasFingers) {
        this.hasFingers = hasFingers;
    }
}

public class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }
}

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Brown", 56.2);
        Leg leftLeg = new Leg(80.5, 9.5);
        Leg rightLeg = new Leg(81.0, 9.5);
        Hand leftHand = new Hand(70.0, true);
        Hand rightHand = new Hand(72.0, true);

        Human human = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        System.out.println("Head hair color: " + human.getHead().getHairColor());
        System.out.println("Head size: " + human.getHead().getHeadSize());

        System.out.println("Left leg length: " + human.getLeftLeg().getLegLength());
        System.out.println("Left foot size: " + human.getLeftLeg().getFootSize());

        System.out.println("Right leg length: " + human.getRightLeg().getLegLength());
        System.out.println("Right foot size: " + human.getRightLeg().getFootSize());

        System.out.println("Left hand arm length: " + human.getLeftHand().getArmLength());
        System.out.println("Left hand has fingers: " + human.getLeftHand().isHasFingers());

        System.out.println("Right hand arm length: " + human.getRightHand().getArmLength());
        System.out.println("Right hand has fingers: " + human.getRightHand().isHasFingers());
    }
}



//Практика номер 11
//Напишите два класса MovablePoint и MovableCircle - которые реализуют интерфейс Movable.

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}



public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getXSpeed() {
        return xSpeed;
    }
    public  int getYSpeed() {
        return ySpeed;
    }
    public String toString() {
        return "Point at (" + x + "," + y + ") with speed (" + xSpeed + "," + ySpeed + ")";
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}



public class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "Circle with center at (" + center.getX() + "," + center.getY() + ") with speed (" +
                center.getXSpeed() + "," + center.getYSpeed() + ") and radius " + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}

// Напишите новый класс MovableRectangle (движущийся прямоугольник). Его можно представить как две движущиеся точки MovablePoints 
//(представляющих верхняя левая и нижняя правая точки) и реализующие интерфейс Movable. Убедитесь, что две точки имеет одну и ту же скорость (нужен метод это проверяющий).

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        if (!checkSpeed()) {
            throw new IllegalArgumentException("Points have different speeds");
        }
    }

    public String toString() {
        return "Rectangle with top left at (" + topLeft.getX() + "," + topLeft.getY() + ") and bottom right at (" +
                bottomRight.getX() + "," + bottomRight.getY() + ") with speed (" + topLeft.getXSpeed() + "," +
                topLeft.getYSpeed() + ")";
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    private boolean checkSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed() && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }
}


//Практика номер 12
//Создать абстрактный класс, описывающий посуду(Dish). С помощью наследования реализовать различные виды посуды, имеющие свои свойства и методы. Протестировать работу классов.
public abstract class Dish {
    private String material;
    private String color;
    private double price;

    public Dish(String material, String color, double price) {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void use();

    @Override
    public String toString() {
        return "Dish made of " + material + " with color " + color + " and price " + price;
    }
}



public class Plate extends Dish {
    private int diameter;

    public Plate(String material, String color, double price, int diameter) {
        super(material, color, price);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void use() {
        System.out.println("Using a plate to eat food");
    }

    @Override
    public String toString() {
        return "Plate with diameter " + diameter + ", " + super.toString();
    }
}

public class Cup extends Dish {
    private int volume;

    public Cup(String material, String color, double price, int volume) {
        super(material, color, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void use() {
        System.out.println("Using a cup to drink a beverage");
    }

    @Override
    public String toString() {
        return "Cup with volume " + volume + ", " + super.toString();
    }
}



public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate("ceramic", "white", 10.99, 20);
        System.out.println(plate);
        plate.use();

        Cup cup = new Cup("glass", "clear", 5.99, 250);
        System.out.println(cup);
        cup.use();
    }
}


//Создать абстрактный класс, описывающий собак(Dog). С помощью наследования реализовать различные породы собак. Протестировать работу классов.
public abstract class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public abstract void bark();

    @Override
    public String toString() {
        return "Dog named " + name + " of breed " + breed + " and age " + age;
    }
}



public class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age, "Labrador");
    }

    @Override
    public void bark() {
        System.out.println("Barking like a Labrador");
    }
}

public class Poodle extends Dog {
    public Poodle(String name, int age) {
        super(name, age, "Poodle");
    }

    @Override
    public void bark() {
        System.out.println("Barking like a Poodle");
    }
}



public class Main {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Max", 3);
        System.out.println(labrador);
        labrador.bark();

        Poodle poodle = new Poodle("Charlie", 5);
        System.out.println(poodle);
        poodle.bark();
    }
}
