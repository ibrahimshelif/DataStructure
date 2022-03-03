package lab7;

import java.util.Scanner;

public class testDoublyLinkedList{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        System.out.println("1 add first ");
        System.out.println("2 add last ");
        System.out.println("3 remove first ");
        System.out.println("4 remove last ");
        System.out.println("0 Exit ");
        int choice = -1;
        while (choice!= 0 ){
            System.out.println("what is ur choice ????");
            choice= in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input name ");
                    list.addfirst(in.next());
                    break;
                case 2:
                    System.out.println("input name ");
                    list.addlast(in.next());
                    break;
                case 3:
                    System.out.println("removed  " + list.removeFirst());
                    break;
                case 4:
                    System.out.println("removed  " + list.removlast());
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println(" First = " + list.first() + " last = " + list.last() + " size = " + list.size());

        }


    }
}

