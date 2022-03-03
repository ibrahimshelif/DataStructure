package stack;

public class Arraystack<E> implements Stack<E> {
    static   int cap=100;
     E data[];
      int t=-1;

    public Arraystack(int cap) {
        data= (E[]) new Object[cap];
    }

    public Arraystack() {
        this(cap);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public E Top() {
        if (isEmpty())return null;
        return data[t];
    }

    @Override
    public void push(E element) {
        if (size()==data.length)throw new IllegalStateException("stack is full");
        data[++t]=element;

    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E del=data[t];
        data[t]=null;
        t--;
        return del
                ;
    }
}
