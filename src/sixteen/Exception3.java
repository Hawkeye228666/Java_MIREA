package sixteen;

public class Exception3 {
    public void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
        } catch (Exception e) {
            System.out.println("General exception caught");
        }
    }

    public static void main(String[] args) {
        Exception3 example = new Exception3();
        example.exceptionDemo();
    }
}

/*
public class Exception3 {
    public void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
        } catch (Exception e) {
            System.out.println("General exception caught");
        }
    }

    public static void main(String[] args) {
        Exception3 example = new Exception3();
        example.exceptionDemo();
    }
}
 */