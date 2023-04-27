import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayListStack<T> implements ListForStack<T> {

    private ArrayList arraylist;

    MyArrayListStack() {
        arraylist = new ArrayList<>();
    }

    @Override
    public void push(T element) {

    }

    @Override
    public T pop() {
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
