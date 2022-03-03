package ReverseArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class revers {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] myArray = {10,20,30,40,50};
        System.out.println(Arrays.toString(myArray));
        int size = myArray.length;
        for (int i = 0; i < size ; i++) {
            stack.push(myArray[i]);
        }
        int[] reverseArray = new int[size];
        for (int i = 0; i < size; i++) {
            reverseArray[i] = stack.pop();
        }
        System.out.println("Reversed array is :: "+ Arrays.toString(reverseArray));
    }
}
