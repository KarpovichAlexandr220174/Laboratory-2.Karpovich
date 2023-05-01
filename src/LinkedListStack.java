// Importing necessary Java libraries

import java.util.Iterator;
import java.util.LinkedList;
import java.util.EmptyStackException;

// Class definition with type parameter T
public class LinkedListStack<T> implements ListForStack<T>, Iterable<T> {

    // Declare linked list of type T
    private LinkedList<T> linkedList;

    // Constructor for creating an empty linked list
    LinkedListStack() {
        linkedList = new LinkedList<>();
    }

    // Method to add an element to the top of the stack
    @Override
    public void push(T element) {
        linkedList.addFirst(element); // Adds the specified element at the beginning of the linked list
    }

    // Method to remove and return the top element from the stack
    @Override
    public T pop() {
        if (isEmpty()) { // If stack is empty
            throw new EmptyStackException(); // Throw EmptyStackException
        }
        return linkedList.removeFirst(); // Removes and returns the first element in the linked list
    }

    // Method to return the top element of the stack without removing it
    @Override
    public T peek() {
        if (isEmpty()) { // If stack is empty
            throw new EmptyStackException(); // Throw EmptyStackException
        }
        return linkedList.getFirst(); // Returns the first element in the linked list
    }

    // Method to check if the stack is empty
    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty(); // Returns true if the stack is empty, false otherwise
    }

    // Method to return the number of elements in the stack
    @Override
    public int size() {
        return linkedList.size(); // Returns the size of the linked list
    }

    // Method to return an iterator over the elements in the stack
    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator(); // Returns an iterator over the elements in the linked list
    }
}