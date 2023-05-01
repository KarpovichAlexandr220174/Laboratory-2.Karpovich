// Importing the necessary utilities

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

// Implementing ListForStack interface and Iterable for ArrayListStack
public class ArrayListStack<T> implements ListForStack<T>, Iterable<T> {
    // Declare an ArrayList to store elements
    private ArrayList<T> arraylist;

    // Constructor to initialize the ArrayList
    ArrayListStack() {
        arraylist = new ArrayList<>();
    }

    // Method to add element to the stack
    @Override
    public void push(T element) {
        arraylist.add(element);
    }

    // Method to remove and return the top element from the stack
    @Override
    public T pop() {
        // Check if the stack is empty
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        // Remove and return the top element from the stack
        return arraylist.remove(size() - 1);
    }

    // Method to return the top element of the stack without removing it
    @Override
    public T peek() {
        // Check if the stack is empty
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        // Return the top element of the stack
        return arraylist.get(size() - 1);
    }

    // Method to check if the stack is empty
    @Override
    public boolean isEmpty() {
        return arraylist.isEmpty();
    }

    // Method to return the size of the stack
    @Override
    public int size() {
        return arraylist.size();
    }

    // Method to return an iterator for the stack
    @Override
    public Iterator<T> iterator() {
        return arraylist.iterator();
    }
}