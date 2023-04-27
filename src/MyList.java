public interface MyList<T> {

    //this is an interface "MyList" with main methods which must be implemented in MyArrayList and MyLinkedList

    int size();

    boolean contains(Object o);

    //void increaseBuffer();

    void add(T item);

    //void add(T[] arr);

    void add(T item, int index);

    void remove1(T item);

    void remove(int index);

    void clear();

    T get(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);

    void sort();

    void checkIndex(int index);

}
