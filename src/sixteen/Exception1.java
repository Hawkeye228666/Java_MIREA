package sixteen;

// Шаг 1
public class Exception1 {
    public void exceptionDemo() {
        System.out.println(2 / 0);
    }

    public static void main(String[] args) {
        Exception1 example = new Exception1();
        example.exceptionDemo();
    }
}

// Шаг 2
/*
public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 example = new Exception1();
        example.exceptionDemo();
    }
}
