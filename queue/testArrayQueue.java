package queue;public class testArrayQueue {
    public static void main(String[] args) {
        Arrayqueue<String> queue =new Arrayqueue<>(3);
        queue.enqueue("ali");
        queue.enqueue("hjgb");
        queue.enqueue("kjhf");
        while (!queue.isEmpty())
            System.out.println(queue.dequeue());
    }
}
