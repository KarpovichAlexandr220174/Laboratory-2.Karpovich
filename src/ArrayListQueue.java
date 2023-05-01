import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException; // importing main utils.

public class ArrayListQueue<T> implements ListForQueue<T>, Iterable<T> {
    // Declaring a private instance variable of ArrayList type.
    private ArrayList<T> arrayList;

    // Creating a constructor for the class and initializing the instance variable.
    ArrayListQueue() {
        arrayList = new ArrayList<>();
    }

    // Adds the specified element to the end of the queue.
    @Override
    public void enqueue(T element) {
        arrayList.add(element);
    }

    // Retrieves and removes the head of the queue.
    // Throws NoSuchElementException if the queue is empty.
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return arrayList.remove(0);
    }

    // Retrieves, but does not remove, the head of the queue.
    // Throws NoSuchElementException if the queue is empty.
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(0);
    }

    // Returns true if the queue is empty, false otherwise.
    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    // Returns the number of elements in the queue.
    @Override
    public int size() {
        return arrayList.size();
    }

    // Returns an iterator over the elements in the queue in proper sequence.
    @Override
    public Iterator<T> iterator() {
        return arrayList.iterator();
    }
}