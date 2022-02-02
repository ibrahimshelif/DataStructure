package Assignment_1;

public class array_using_another_array {
    public static void main(String[] args) {
        int[] first_array={1,2,3,4,5,6,7,8,9,10};
        int[] second_array = new int[first_array.length];

        for (int i = 0; i <second_array.length ; i++) {
            second_array[i]=first_array[first_array.length-1-i];
            System.out.println("second arry position "+i+ " is " + second_array[i] );
        }


    }
}
