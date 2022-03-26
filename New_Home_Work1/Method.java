package New_Home_Work1;

import java.util.Scanner;

public class Method {
    public static void output_array(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public static void input_array(int[] array){
        System.out.println("Enter 5 number");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length ; i++) {
            array[i]=in.nextInt();
        }
    }
    public static void main(String[] args) {
        int [] array = new int[5];
         input_array(array);
         output_array(array);
    }

}
