import java.util.Arrays;

public class shift_to_left {
    public static void main(String[] args) {
        int x[]={10,20,30,40,50};
        System.out.println("Array before shifting to Left");
        System.out.println(Arrays.toString(x));
        System.out.println("Array after shifting to Left");
        System.out.println(Arrays.toString(shiftLeft(x)));
    }
    public static int[] shiftLeft(int[] y){
        int first_index =y[0];
        for (int i = 0; i <y.length-1 ; i++) {
            y[i]=y[i+1];
        }
        y[y.length-1]=first_index;
        return y;
    }
}
