import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Student [] team =new  Student[3];
        Scanner input= new Scanner(System.in);
        System.out.println("Enter The Id The Names of each Student");
        for (int i = 0; i <team.length ; i++) {
            Student s =new Student(input.nextInt(), input.next());
            team[i]=s;
        }
        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
        }
    }
}
