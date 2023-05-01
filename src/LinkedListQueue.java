import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException; // importing main utils.

public class LinkedListQueue<T> implements ListForQueue<T>, Iterable<T> {
    // Declaring a private instance variable of LinkedList type.
    private LinkedList<T> linkedList;

    // Creating a constructor for the class and initialize the instance variable.
    LinkedListQueue() {
        linkedList = new LinkedList<>();
    }

    // Adds the specified element to the end of the queue.
    @Override
    public void enqueue(T element) {
        linkedList.addLast(element);
    }

    // Retrieves and removes the head of the queue.
    // Throws NoSuchElementException if the queue is empty.
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return linkedList.removeFirst();
    }

    // Retrieves, but does not remove, the head of the queue.
    // Throws NoSuchElementException if the queue is empty.
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return linkedList.getFirst();
    }

    // Returns true if the queue is empty, false otherwise.
    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    // Returns the number of elements in the queue.
    @Override
    public int size() {
        return linkedList.size();
    }

    // Returns an iterator over the elements in the queue in proper sequence.
    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }
}