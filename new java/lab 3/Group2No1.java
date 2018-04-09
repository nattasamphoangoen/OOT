package oot.lab3.group2;

import java.util.Scanner;

public class No1 {

    public static int pow2Mul3(int a, int x, int c) {
        int pow = 1;
        for (int i = 1; i <= x; i++) {
            pow = pow * 2;
        }
        return (a * pow) + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Compute A * 2^X + C");
        System.out.println("===================");
        System.out.printf("Ex: A:10, X:2, C:1 = %d\n", pow2Mul3(10, 2, 1));
        while (true) {
            System.out.print("Enter A (0 to exit): ");
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            System.out.print("Enter X: ");
            int x = sc.nextInt();

            System.out.print("Enter C: ");
            int c = sc.nextInt();

            System.out.printf("%d * 2^%d + %d = %d\n", a, x, c, pow2Mul3(a, x, c));
            System.out.println();
        }
    }
}