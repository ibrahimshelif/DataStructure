package lab8;

public class LikedQueue<E> implements Queue<E> {

    SinglyLinkedList<E> list = new SinglyLinkedList<>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public void enqueue(E element) {
        list.addFirst(element);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }
}
