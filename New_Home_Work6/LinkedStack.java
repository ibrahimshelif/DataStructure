package New_Home_Work6;

import lab8.SinglyLinkedList;
import lab8.Stack;

public class LinkedStack<E> implements Stack<E> {
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
    public E Top() {
        return list.first();
    }

    @Override
    public void push(E element) {
list.addFirst(element);
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }
}
