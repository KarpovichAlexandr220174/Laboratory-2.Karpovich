# Laboratory-2.Karpovich
ArrayListStack, LinkedListStack, ArrayListQueue, LinkedListQueue

ArrayListStack:
This Java class implements the ListForStack interface and provides a stack implementation using an ArrayList. 
The class is iterable, and the iterator is implemented using the ArrayList iterator.

The ArrayListStack class has the following methods:

    push(T element): adds an element to the stack.
    pop(): removes and returns the top element from the stack.
    peek(): returns the top element of the stack without removing it.
    isEmpty(): returns true if the stack is empty.
    size(): returns the size of the stack.
    iterator(): returns an iterator for the stack.

The class throws an EmptyStackException if pop() or peek() is called on an empty stack.

This implementation of a stack is based on the ArrayList data structure, which means that it is not as memory-efficient as a linked list implementation. 
However, it provides constant-time access to elements and has a better worst-case time complexity for some operations.

LinkedListStack:
