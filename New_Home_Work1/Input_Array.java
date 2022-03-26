package New_Home_Work1;

import java.util.Scanner;

public class Input_Array {
    public static void main(String[] args) {
        int [] array = new int[5];
        System.out.println("enter 5 number");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length ; i++) {
          array[i]=in.nextInt();
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
