import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayListStack<T> implements ListForStack<T> {

    private ArrayList arraylist;

    MyArrayListStack() {
        arraylist = new ArrayList<>();
    }

    @Override
    public void push(T element) {
        arraylist.add(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) arraylist.remove(size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) arraylist.get(size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return arraylist.isEmpty();
    }

    @Override
    public int size() {
        return arraylist.size();
    }
}
