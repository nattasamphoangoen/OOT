package oot.lab3.group2;

import java.util.Scanner;

public class No1 {

    public static int mul5x(int a, int b) {
        int mul = 0;
        for (int i = 1; i <= a; i++) {
            mul = mul + 5;
        }
        return mul + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Display 5*A + B");
        System.out.println("===============");
        System.out.printf("Ex: A=10, B=2 : %d\n", mul5x(10, 2));
        while (true) {
            System.out.print("Enter A (0 to exit): ");
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            System.out.print("Enter B (0 to exit): ");
            int b = sc.nextInt();
            if (b == 0) {
                break;
            }
            System.out.printf("5*%d + %d = %d\n", a, b, mul5x(a, b));
            System.out.println();
        }
    }
}