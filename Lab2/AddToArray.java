import java.util.Arrays;
import java.util.Scanner;

public class AddToArray{
  int x[];
  int sum0TheElemnts;
  public AddToArray(){
      x= new  int[5];
      sum0TheElemnts=0;
  }
  public int addElemnts(int e){
      if (sum0TheElemnts < x.length){
          x[sum0TheElemnts] = 0;
          sum0TheElemnts++;
          return 0;
      }
      return -1;
  }

    public static void main(String[] args) {
        AddToArray test = new AddToArray();
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your Elemnts");
        for (int i = 0; i <7 ; i++) {
            if (test.addElemnts(in.nextInt())==0){
                System.out.println("added sucessfuly");
            }else {
                System.out.println("the array is full");
            }
            System.out.println(Arrays.toString(test.x));
        }
    }
}
