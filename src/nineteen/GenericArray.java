package nineteen;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T getElementByIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return null; // or throw an exception
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> genericIntArray = new GenericArray<>(intArray);

        System.out.println("Element at index 2: " + genericIntArray.getElementByIndex(2));
    }
}