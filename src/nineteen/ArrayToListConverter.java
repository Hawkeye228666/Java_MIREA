package nineteen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {
    public static <T> List<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "orange"};
        List<String> stringList = convertArrayToList(stringArray);
        System.out.println("String List: " + stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Integer List: " + intList);
    }
}