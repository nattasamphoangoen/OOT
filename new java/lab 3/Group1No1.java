package oot.lab3.group1;

import java.util.Scanner;

public class No1 {

    public static int pow4PlusX(int n, int x) {
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow = pow * 4;
        }
        return pow + x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Compute 4^N + X");
        System.out.println("===========");
        System.out.printf("Ex: 4^5 + 10 = %d\n", pow4PlusX(5, 10));
        while (true) {
            System.out.print("Enter N (0 to exit): ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.print("Enter X (0 to exit): ");
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            System.out.printf("4^%d + %d = %d\n",n , x, pow4PlusX(n, x));
        }
        System.out.println("Done.");
    }
}