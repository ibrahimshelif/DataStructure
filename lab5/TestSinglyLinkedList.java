package lab5;

import lab8.SinglyLinkedList;

import java.util.Scanner;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("1 add first ");
        System.out.println("2 add last ");
        System.out.println(("3 remove first"));
        System.out.println(" 0 Exit");
        int choice = -1;
        while (choice!=0){
            System.out.println("what is ur choice ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input name");
                    list.addFirst(input.next());
                    break;
                case 2:
                    System.out.println("input name");
                    list.addLast(input.next());
                    break;
                case 3:
                    System.out.println("removed = " + list.removeFirst());
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println(" First = " + list.first() +"  Last = " +list.last()  + " Size = " + list.size()) ;
        }

    }
}
