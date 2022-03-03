package stack;

public class testArraystack {
    public static void main(String[] args) {
        Arraystack<Integer>stack=new Arraystack<Integer>(3);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
