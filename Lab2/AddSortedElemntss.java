import java.util.Arrays;
import java.util.Scanner;

public class AddSortedElemntss {
    int x[];
    int numOElemnts;

    public AddSortedElemntss(){
        x = new  int[5];
        numOElemnts = 0;

    }
    public int test(int e){
        if (numOElemnts < x.length){
            int i = numOElemnts;
            while (i > 0 && e < x[i -1]){
                x[i] = x[i -1];
                i--;
            }
            x[i] = e;
            numOElemnts++;
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        AddSortedElemntss test = new AddSortedElemntss();
        Scanner in = new Scanner(System.in);
        System.out.println("input the elements");
        for (int i = 0; i <7 ; i++) {
            if (test.test(in.nextInt())==0)
                System.out.println("added sucessfuly");
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));
        }
    }
}
