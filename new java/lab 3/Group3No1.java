package oot.lab3.group34;

import java.util.Scanner;

public class No1 {

    public static int xsum(int x, int m, int n) {
        int result = 0;
        for (int i = m; i <= n; i++) {
            result = result + 1;
        }
        return result + m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Compute X * SIGMA(m,n)");
        System.out.println("======================");
        System.out.printf("Ex: X:10, m:2, n:5 = %d\n", xsum(10, 2, 5));
        while (true) {
            System.out.print("Enter X (0 to exit): ");
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            System.out.print("Enter m (0 to exit): ");
            int m = sc.nextInt();
            if (m == 0) {
                break;
            }
            System.out.print("Enter n (0 to exit): ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.printf("%d * SIGMA(%d, %d) = %d\n", x, m, n, xsum(x, m, n));
            System.out.println();
        }
    }
}