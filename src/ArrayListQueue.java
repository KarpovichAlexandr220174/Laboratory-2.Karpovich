import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListQueue<T> implements ListForQueue<T> {
    private ArrayList<T> arrayList;

    ArrayListQueue() {
        arrayList = new ArrayList<>();
    }


    @Override
    public void enqueue(T element) {

    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
