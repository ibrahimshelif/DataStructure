package queue;

public class Arrayqueue<E> implements Queue<E>{
    E data[];
    static int cap=100;
    int f=0;
    int sz=0;

    public Arrayqueue(int c) {
        data= (E[]) new Object[c];
    }

    public Arrayqueue() {
        this(cap);
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public E first() {
       if (isEmpty())return null;
       return data[f];
    }

    @Override
    public void enqueue(E element) {
        if (size()==data.length)throw new IllegalStateException("queue is full");
        int x=(f+sz)%data.length;
          data[x]=element;
          sz++;

    }

    @Override
    public E dequeue() {
        if (isEmpty())return null;
        E del=data[f];
        data[f]=null;
        f=(f+1)% data.length;
        sz--;
        return del;
    }
}
