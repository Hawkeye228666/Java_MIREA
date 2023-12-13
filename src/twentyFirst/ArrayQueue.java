package twentyFirst;

import java.util.Arrays;

class ArrayQueue {
    private int capacity;
    private int[] queue;
    private int front = -1;
    private int rear = -1;

    public ArrayQueue() {
        this(ArrayQueueModule.DEFAULT_CAPACITY);
    }

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
    }

    public void enqueue(int item) {
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

    public int dequeue() {
        int item = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return item;
    }

    public int element() {
        return queue[front];
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else if (front <= rear) {
            return rear - front + 1;
        } else {
            return capacity - front + rear + 1;
        }
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public void clear() {
        front = -1;
        rear = -1;
    }

    private void expandCapacity() {
        int newCapacity = capacity * 2;
        queue = Arrays.copyOf(queue, newCapacity);

        if (front > rear) {
            System.arraycopy(queue, 0, queue, capacity, rear + 1);
            rear += capacity;
        }

        capacity = newCapacity;
    }
}