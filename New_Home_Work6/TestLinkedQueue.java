package New_Home_Work6;

import lab8.LikedQueue;

import java.util.Scanner;

public class TestLinkedQueue {
    public static void main(String[] args) {
        lab8.LikedQueue<String> list = new LikedQueue<>();
        Scanner input = new Scanner(System.in);
        System.out.println("1 add first ");
        System.out.println("2 remove ");
        System.out.println(" 0 Exit");

        int choice = -1;
        while (choice != 0) {
            System.out.println("what is ur choice ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("input name");
                    list.enqueue(input.next());
                    break;
                case 2:
                    System.out.println("Removed = " + list.dequeue());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            System.out.println(" Size =   " + list.size() + "   First = " + list.first());
        }
}
    }