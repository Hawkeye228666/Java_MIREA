package sixteen;

public class Exception4 {
    public void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        Exception4 example = new Exception4();
        example.exceptionDemo();
    }
}

/*
public class Exception4 {
    public void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        Exception4 example = new Exception4();
        example.exceptionDemo();
    }
}
 */