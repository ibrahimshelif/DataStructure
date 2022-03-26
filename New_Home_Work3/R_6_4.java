package New_Home_Work3;
import java.util.Stack;

public class R_6_4 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

        Stack<Integer> firstStack = new Stack<>();
        Stack<Integer> secondStack = new Stack<>();

        for (int i = 0; i <5 ; i++) {
            firstStack.push(a[i]);

        }

        System.out.println("top of the Stack is = " + firstStack.peek());

        for (int i = 0; i <5 ; i++) {
            secondStack.push(firstStack.pop());
        }

        System.out.println("the Top of the Second Stack is  = " + secondStack.peek());

    }


}

