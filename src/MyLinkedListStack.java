import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<T> implements ListForStack<T> {

    private LinkedList<T> linkedList;

    MyLinkedListStack() {
        linkedList = new LinkedList<>();
    }

    @Override
    public void push(T element) {
        linkedList.addFirst(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return linkedList.removeFirst();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return linkedList.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int size() {
        return linkedList.size();
    }
}
