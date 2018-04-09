package oot.lab3.group2;

import java.util.Scanner;

public class No2 {

    public static int fac(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void fac(int n, char ch) {
        System.out.println("fac: " + fac(n));
        if (n % 2 == 0) {
            for (int i = 0; i < 4; i++) {
                System.out.printf("%c ", ch - i);
            }
        } else {
            System.out.printf("%d: ", n);
            for (int i = 0; i < n; i++) {
                System.out.printf("%c ", ch - i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N1: ");
        int n1 = sc.nextInt();
        System.out.printf("Factorial(N = %d) = %d\n", n1, fac(n1));
        System.out.printf("Factorial(N = %d) = %d\n", n1 + 1, fac(n1 + 1));
        System.out.println();
        System.out.print("Enter N2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter ch: ");
        char ch = sc.next().charAt(0);
        fac(n2, ch);
    }

}
