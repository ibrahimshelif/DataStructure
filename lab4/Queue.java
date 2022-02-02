package lab4;

public interface Queue <E> {
    boolean fsEmpty ();
    int size();
    void en_queue (E element);
    E de_queue ();
    E first ();
}
