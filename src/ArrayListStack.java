import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListStack<T> implements ListForStack<T> {

    private ArrayList<T> arraylist;

    ArrayListStack() {
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
        return arraylist.remove(size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arraylist.get(size() - 1);
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
