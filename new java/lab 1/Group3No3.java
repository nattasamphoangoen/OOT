package oot.lab1_3;

import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();
        System.out.print("Enter character: ");
        char ch = scanner.next().charAt(0);

        System.out.println();

        if(first % 2 == 0) {
            System.out.printf("%d greater than %d : %s\n", first, second, first > second);
            System.out.printf("%d equals to %d : %s\n", second, first, first == second);
        } else {
            System.out.printf("%d not greater than %d : %s \n", second, first, second <= first);
        }

        if(ch == 'B') {
            System.out.printf("//\\\\%c//\\\\", ch);
        } else {
            System.out.println("\\\\NO//");
        }
        System.out.println();

    }

}
