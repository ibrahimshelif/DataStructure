package stack;

public interface Stack<E> {
   boolean isEmpty();
   int size();
   E Top();
   void push(E element);
   E pop();

}
