package oot.lab1_2.y58;

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

        if(ch == 'A') {
            System.out.printf("//%c\\\\", ch);
            System.out.println();
        }

        if(first > second) {
            System.out.printf("%d is not equal to %d ? = %s\n", first, second, first == second);
            System.out.printf("%d > %d = %s\n", first, second, first > second);
        } else {
            if (ch != 'A') {
                System.out.printf("\"%c\" ", ch);
            }
            System.out.printf("%d is equal to %d ? = %s\n", first, second, first == second);

            if (ch != 'A') {
                System.out.printf("\"%c\" ", ch);
            }
            System.out.printf("%d is less than %d = %s\n", first, second, first < second);
        }

    }

}
