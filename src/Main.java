import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        first_task();
    }
    public static void first_task() {
        System.out.println("Введите размер массива:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        double sr = 0;
        int sum = 0;
        System.out.println("Через пробел введите целые числа(кол-во чисел должно совпадать с размеров массива!), которые будут являться элементами массива:");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        sr = sum / (n * 1.0);
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое числе в массиве: " + sr);
        System.out.println("Всего Вам доброго!");
    }
}