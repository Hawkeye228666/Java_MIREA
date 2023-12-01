import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Student[] array = new Student[10];
        for (int i = 0; i < 10; i++) {
            int a = in.nextInt();
            array[i] = new Student(a);
        }
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = array[i].getiDNumber();
        }
        arr = mergeSort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }



    public static String palindrome(String s) {
        if (s.length() == 1 || s.isEmpty()) {
            return "Слово является палиндромом";
        }
        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            return palindrome(s.substring(1, s.length() - 1));
        }
        return "Слово не является палиндромом";
    }
    public static int wthoutOO(int a, int b) {
        if (a == 0) return 1;
        else if (a == 1) return b + 1;
        else if (a > 0 && b == 0) return 0;
        else return wthoutOO(a - 1, b - 1) + wthoutOO(a, b - 1);
    }
    public static int numberReversal(int n, int i){
        return (n==0) ? i : numberReversal( n/10, i*10 + n%10 );
    }


}