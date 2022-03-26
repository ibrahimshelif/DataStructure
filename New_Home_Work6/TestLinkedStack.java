package New_Home_Work6;

import lab8.LinkedStack;

import java.util.Scanner;

public class TestLinkedStack {
    public static void main(String[] args) {
        lab8.LinkedStack<String> list = new LinkedStack<>();
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
                    list.push(input.next());
                    break;
                case 2:
                    System.out.println("Removed = " + list.pop());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            System.out.println(" Size =   " + list.size() + "   Top = " + list.Top());
        }

    }}