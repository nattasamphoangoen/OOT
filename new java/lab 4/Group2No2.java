package oot.lab4.group2;

import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {
        int[][] a = {{1,   2,  3}, {4,   5,  6}, {7,   8,  9}};
        int[][] b = {{19, 18, 17}, {16, 15, 14}, {13, 12, 11}};
        System.out.println("Matrix A:");
        print(a);
        System.out.println("Matrix B:");
        print(b);
        System.out.println("== Clear a[i][j] == ");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter i: ");
        int i = s.nextInt();
        System.out.print("Enter j: ");
        int j = s.nextInt();
        a[i][j] = 0;
        System.out.println("Matrix A:");
        print(a);
        int[][] c = plus(a, b);
        System.out.println("A + B:");
        print(c);
    }

    private static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%3d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] plus(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}
