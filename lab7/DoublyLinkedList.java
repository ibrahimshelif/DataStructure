package lab7;

public class DoublyLinkedList<E> {
    private Node<E>header;
    private Node<E>trailer;
    private int size=0;

    public DoublyLinkedList() {
        header=new Node<E>(null,null,null);
        trailer=new Node<E>(null,header,null);
        header.setNext(trailer);
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public E first(){
        if (isEmpty())return null;
        return header.getNext().getElement();

    }
    public E last(){
        if (isEmpty())return null;
        return trailer.getPrev().getElement();
    }

    private void AddBetween(E element ,Node<E>p, Node<E>s){
        Node<E> newest=new Node<E>(element,p,s);
        p.setNext(newest);
        s.setPrev(newest);
        size++;
    }
   public void addfirst(E element){
        AddBetween(element, header , header.getNext());
   }
    public void addlast(E element){
        AddBetween(element, trailer.getPrev() , trailer);
    }

    private E remove(Node<E>x){
        Node<E>p=x.getPrev();
        Node<E>s=x.getNext();
        p.setNext(s);
        s.setPrev(p);
        size--;
        return x.getElement();
    }

    public E removeFirst(){
        if (isEmpty())return null;
        return remove(header.getNext());
    }
    public E removlast(){
        if (isEmpty())return null;
        return remove(trailer.getPrev());
    }
    private static class Node<E>{
        private E element;
        private Node<E>prev;
        private Node<E>next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }


        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
