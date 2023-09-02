import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите номер задания от 1 до 2:");
        int a = in.nextInt();
        switch (a) {
            case 1:
                first_task();
                break;
            case 2:
                second_task();
                break;
            default:
                System.out.println("Вы выбрали задание, номер которого не существует, запустите программу заново");
        }
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
    public static void second_task() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку, которую хотите перевернуть:");
        String line = in.nextLine();
        char[] arr = line.toCharArray();
        int begin = 0;
        int end = arr.length - 1;
        char temp;
        while(end > begin){
            temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            end--;
            begin++;
        }
        System.out.println("Новая строка: " + new String(arr));
    }
    public static void third_task(){}
}