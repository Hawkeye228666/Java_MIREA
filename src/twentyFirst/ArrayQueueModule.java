package twentyFirst;

import java.util.Arrays;

class ArrayQueueModule {
    public static final int DEFAULT_CAPACITY = 10;
    private static int capacity = DEFAULT_CAPACITY;
    private static int[] queue = new int[capacity];
    private static int front = -1;
    private static int rear = -1;


    public static void enqueue(int item) {
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
            if (front == rear) {
                expandCapacity();
            }
        }
        queue[rear] = item;
    }


    public static int dequeue() {
        int item = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return item;
    }


    public static int element() {
        return queue[front];
    }


    public static int size() {
        if (isEmpty()) {
            return 0;
        } else if (front <= rear) {
            return rear - front + 1;
        } else {
            return capacity - front + rear + 1;
        }
    }


    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }


    public static void clear() {
        front = -1;
        rear = -1;
    }

    private static void expandCapacity() {
        int newCapacity = capacity * 2;
        queue = Arrays.copyOf(queue, newCapacity);

        if (front > rear) {
            System.arraycopy(queue, 0, queue, capacity, rear + 1);
            rear += capacity;
        }

        capacity = newCapacity;
    }


    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);

        System.out.println("Front element: " + element()); // 1
        System.out.println("Queue size: " + size()); // 3

        System.out.println("Dequeue: " + dequeue()); // 1
        System.out.println("Queue size after dequeue: " + size()); // 2

        clear();
        System.out.println("Queue size after clear: " + size()); // 0
        System.out.println("Is empty? " + isEmpty()); // true
    }
}