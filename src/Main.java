import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите номер задания от 1 до 4:");
        int a = in.nextInt();
        switch (a) {
            case 1:
                firstTask();
                break;
            case 2:
                secondTask();
                break;
            case 3:
                thirdTask();
            case 4:
                fourthTask();
            default:
                System.out.println("Вы выбрали задание, номер которого не существует, запустите программу заново");
        }
    }
    public static void firstTask() {
        System.out.println("Введите размер массива(натуральное число):");
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
    public static void secondTask() {
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
    public static void thirdTask(){
        double arr[] = new double[4];
        Random rand = new Random();
        arr[0] = rand.nextDouble(10, 99);
        arr[1] = rand.nextDouble(10, 99);
        arr[2] = rand.nextDouble(10, 99);
        arr[3] = rand.nextDouble(10, 99);
        for(int i = 0; i < 4; i ++) { System.out.print(arr[i] + " ");}
        if (arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]) { System.out.println("Массив является строго возрастающей последовательностью");}
        else { System.out.println("Массив не является строго возрастающей последовательностью");}
    }
    public static void fourthTask() {
        Double a = Double.valueOf(9.0);
        Double b = Double.valueOf("12");
        String s = "55";
        double l = Double.parseDouble(s);
        byte c = a.byteValue();
        short d = a.shortValue();
        int e = a.intValue();
        long f = a.longValue();
        float g = a.floatValue();
        double h = a.doubleValue();
        char t = (char) l;
        boolean y;
        if (a == 0) y = false;
        else y = true;
        System.out.println(b);
        String v = Double.toString(3.14);
    }
}