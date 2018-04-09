package oot.lab3.group1;

import java.util.Scanner;

public class No1 {

    public static int power3(int n) {
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow = pow * 3;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Display 3^N");
        System.out.println("===========");
        System.out.printf("Ex: 3^10 = %d\n", power3(10));
        while (true) {
            System.out.print("Enter N (0 to exit): ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.printf("3^%d = %d\n", n, power3(n));
        }
        System.out.println("Done.");
    }
}