import java.util.Arrays;

public class String_to_Right {
    public static void main(String[] args) {
        int x[]={10,20,30,40,50};
        System.out.println("Array before shifting to right");
        System.out.println(Arrays.toString(x));
        System.out.println("Array after shifting to right");
        System.out.println(Arrays.toString(shiftRight(x)));
    }
    public static int[] shiftRight(int[] a){
        int last_index = a[a.length -1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i]= a[i - 1];
        }
        a[0]=last_index;
        return a;
    }
}
