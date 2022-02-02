package Lab3;

import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        ArrayStack<Integer> mystack=new ArrayStack<>(5);
        Scanner in=new Scanner(System.in);
        System.out.println("is the stack empty?"+mystack.isEmpty());
        System.out.println("input elements");
        for (int i = 0; i <5 ; i++) {
            mystack.push(in.nextInt());
            System.out.println("top element ="+mystack.top());
            System.out.println("size ="+mystack.size());
            System.out.println("is the stack empty?"+mystack.isEmpty());
        }
        for (int i = 0; i <6 ; i++) {
            System.out.println("deleted element ="+mystack.pop());
            System.out.println("top element after delete="+mystack.top());
            System.out.println("size ="+mystack.size());
            System.out.println("is the stack empty?"+mystack.isEmpty());
        }
    }
}
