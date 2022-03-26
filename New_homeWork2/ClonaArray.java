package New_homeWork2;

import java.util.Arrays;

public class ClonaArray {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5,4};

        System.out.println(" the main array = " + Arrays.toString(x));

        int []y=new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i]=x[i];

        }

        System.out.println("  the backup array = " + Arrays.toString(y));
    }
}

