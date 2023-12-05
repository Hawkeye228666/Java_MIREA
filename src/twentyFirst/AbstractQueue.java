package twentyFirst;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;

    @Override
    public void enqueue(T element) {
        // Реализация добавления элемента в конец очереди
    }

    @Override
    public T dequeue() {
        // Реализация удаления и возврата элемента из начала очереди
        return null;
    }

    @Override
    public T peek() {
        // Реализация возврата элемента из начала очереди без удаления
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}