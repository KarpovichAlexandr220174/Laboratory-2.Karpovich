# Laboratory-2.Karpovich

!!!MY README IS ONLY FOR ASSIGNMENT-3!!!
ArrayListStack, LinkedListStack, ArrayListQueue, LinkedListQueue

Stack Implementations:
These Java classes implement the ListForStack interface and provide a stack implementation using an ArrayList and LinkedList. 
The classes are iterable, and the iterator is implemented using the ArrayList and LinkedList iterator.

The classes have the following methods:

    push(T element): adds an element to the stack.
    pop(): removes and returns the top element from the stack.
    peek(): returns the top element of the stack without removing it.
    isEmpty(): returns true if the stack is empty.
    size(): returns the size of the stack.
    iterator(): returns an iterator for the stack.

The classes throw an EmptyStackException if pop() or peek() is called on an empty stack.

Queue Implementations:

This repository contains two implementations of a Queue data structure in Java:

    ArrayListQueue: an implementation using an ArrayList.
    LinkedListQueue: an implementation using a LinkedList.

Both implementations implement the same ListForQueue interface, which defines the following methods:

    enqueue(T element): adds the specified element to the end of the queue.
    dequeue(): retrieves and removes the head of the queue.
    peek(): retrieves, but does not remove, the head of the queue.
    isEmpty(): returns true if the queue is empty, false otherwise.
    size(): returns the number of elements in the queue.
    iterator(): returns an iterator over the elements in the queue in proper sequence.

The classes throw a NoSuchElementException if dequeue() or peek() is called on an empty queue.
