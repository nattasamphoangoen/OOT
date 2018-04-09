package oot.lab1_1;

import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = scanner.next().charAt(0);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.println();

        if(ch == 'D') {
            System.out.printf("/\\%c/\\", ch);
        } else {
            System.out.println("\\\\//");
        }
        System.out.println();

        if(first >= second) {
            System.out.printf("%d not equal to %d ? = %s\n", first, second, first != second);
            System.out.printf("%d > %d = %s\n", first, second, first > second);
        } else {
            System.out.printf("%d less than %d\n", first, second);
        }
    }

}
