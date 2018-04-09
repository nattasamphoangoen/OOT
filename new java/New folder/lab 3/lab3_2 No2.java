package oot.lab3.group2.y58;

import java.util.Scanner;

public class No2 {

    private static void fac(char ch, int a, int b) {
        if (b % 3 == 0 && b % 7 == 0) {
            System.out.print(fac(a) + " ");
            for (int i = 0; i < b; i++) {
                System.out.print(ch);
            }
        } else {
            System.out.printf("%d: %d ", a, fac(a));
            for (int i = 0; i < a; i++) {
                System.out.printf("%c", ch + i);
            }
        }
        System.out.println();
    }

    private static int fac(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println();
        fac(ch, a, b);
        System.out.printf("Factorial(%d) = %d\n", a, fac(a));
    }

}
