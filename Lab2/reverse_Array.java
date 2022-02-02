import java.util.Arrays;

public class reverse_Array {
    public static void main(String[] args) {
        int x[]={11,12,13,14,15};
        System.out.println("Array before revers");
        System.out.println(Arrays.toString(x));
        System.out.println("Array after revers");
        System.out.println(Arrays.toString(reversArray(x)));
    }
    public static int [] reversArray(int[] a){
        int n = a.length-1;
        for (int i = 0; i <a.length/2 ; i++) {
            int t = a[i];
            a[i] = a[n];
            a[n]=t;
            n--;
        }
        return a;
    }

}
