public interface ListForQueue<T> {
    public void enqueue(T element);

    public T dequeue();

    public T peek();

    public boolean isEmpty();

    public int size();


}
