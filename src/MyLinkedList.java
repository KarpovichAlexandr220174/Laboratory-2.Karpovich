import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;


//implementation MyList, Iterable and Comparator for realization all methods...
public class MyLinkedList<E> implements MyList<E>, Iterable<E>, Comparator<MyLinkedList<E>> {
    //MyList is main interface
    //Iterable is interface for using for-each in collections and for realization any methods
    //Comparator is for coding a "sort" method for collections
    //<E> is generic for using all types in collections


    //Node class is using like a main part of "linked list" algorithms

    private static class Node<E> {
        //main parameters of Node<E> class;

        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            //constructor Node, I've used it for realization add() methods

            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    //main parameters of MyLinkedList class
    private Comparator<E> comparator;
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList() {
        //standard constructor

        head = null;
        tail = null;
        size = 0;
    }

    MyLinkedList(Comparator<E> comparator) {
        //constructor for using "sort" in main with
        // Comparator<> ... = new Comparator<>()

        head = null;
        tail = null;
        size = 0;
        this.comparator = comparator;
    }

    //main methods of MyLinkedList...
    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {
        Node<E> newNode = new Node<>(item, null, tail);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    @Override
    public void add(E item, int index) {
        if (size == 0 && index == 0) {
            add(item);
        } else {
            Node<E> newNode = new Node<>(item, null, null);
            if (index == 0) {
                newNode.next = head;
                if (head != null) {
                    head.prev = newNode;
                }
                head = newNode;
                if (tail == null) {
                    tail = newNode;
                }
                size++;
            } else if (index == size) {
                newNode.prev = tail;
                if (tail != null) {
                    tail.next = newNode;
                }
                tail = newNode;
                if (head == null) {
                    head = newNode;
                }
                size++;
            } else {
                Node<E> current = getNode(index);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
                size++;
            }
        }
    }

    @Override
    public boolean contains(Object o) {
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()) {
            E element = iterator.next();
            if (o == null ? element == null : o.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            head = head.next;
        } else {
            Node<E> before = getNode(index - 1);
            Node<E> target = before.next;
            before.next = before.next.next;
        }
        size--;
    }

    @Override
    public void remove1(E item) {
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (item == null ? current.element == null : item.equals(current.element)) {
                remove(index);
                return;
            }
            current = current.next;
            index++;
        }
    }


    @Override
    public void clear() {
        Node<E> current = head;
        while (current != null) {
            Node<E> next = current.next;
            current.prev = null;
            current.next = null;
            current = next;
        }
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public int indexOf(Object o) {
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (o == null ? current.element == null : o.equals(current.element)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node<E> current = head;
        int index = 0;
        int lastIndex = -1;
        while (current != null) {
            if (o == null ? current.element == null : o.equals(current.element)) {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }

    @Override
    public void sort() {
        if (size <= 1) {
            return;
        }
        Node<E> current = head.next;
        while (current != null) {
            E key = current.element;
            Node<E> previous = current.prev;
            while (previous != null && comparator.compare(previous.element, key) > 0) {
                previous.next.element = previous.element;
                previous = previous.prev;
            }
            if (previous == null) {
                head.element = key;
            } else {
                previous.next.element = key;
            }
            current = current.next;
        }
    }

    @Override
    public void checkIndex(int index) {
        //Checking index method, very useful for fast checking in another methods

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    public Node<E> getNode(int index) {
        //useful method for using in another methods for getting a current element of "linked list"

        checkIndex(index);
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<E> {
        //Iterator with main methods for realization algorithms of another methods in MyLinkedList

        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E element = current.element;
            current = current.next;
            return element;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    //compare method for using it in sort method related to comparator
    @Override
    public int compare(MyLinkedList<E> o1, MyLinkedList<E> o2) {
        return o1.size - o2.size;
    }

}
