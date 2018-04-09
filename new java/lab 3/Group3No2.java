package oot.lab3.group34;

import java.util.Scanner;

public class No2 {

    public static int fc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void fc(int n, char ch) {
        if (n % 5 == 0) {
            for (int i = 0; i < 5; i++) {
                System.out.printf("%c ", ch);
            }
            System.out.println("\nResult: " + fc(n));
            for (int i = 0; i < 5; i++) {
                System.out.printf("%c ", ch);
            }
            System.out.println();
        } else {
            System.out.println("Result: " + fc(n));
            System.out.printf("%d: ", n);
            for (int i = 0; i < 3; i++) {
                System.out.printf("%c ", ch+i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.printf("Factorial(%d) = %d\n", a, fc(a));
        System.out.printf("Factorial(%d) = %d\n", a * 2, fc(a * 2));
        System.out.println();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        fc(b, ch);
    }

}
