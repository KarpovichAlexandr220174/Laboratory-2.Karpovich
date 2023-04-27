import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<T> implements ListForStack<T> {

    private LinkedList<T> linkedList;

    MyLinkedListStack() {
        linkedList = new LinkedList<>();
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
