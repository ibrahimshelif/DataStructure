package New_homeWork2;
import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
        int [] x={11,12,13,14,15,20,7,19};

        System.out.println("Before"+Arrays.toString(x));
        int []y=new int[x.length];


        for (int i = 0; i < x.length; i++) {
            y[(x.length-1)-i]=x[i];

        }

        System.out.println("  After revers = " + Arrays.toString(y));
    }
}

