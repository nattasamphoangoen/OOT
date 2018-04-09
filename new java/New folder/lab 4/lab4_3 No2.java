package oot.lab4.group3.y58;

import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {
        int[][] a = {{19, 18, 17}, {16, 15, 14}, {17, 18, 19}};
        int[][] b = {{1, 2, 3}, {4, 5, 3}, {7, 8, 9}};
        System.out.println("Matrix A:");
        print(a);
        System.out.println("Matrix B:");
        print(b);

        System.out.println("== Set A[i][j] ==");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter i: ");
        int i = scanner.nextInt();
        System.out.print("Enter j: ");
        int j = scanner.nextInt();
        System.out.print("Enter value: ");
        int value = scanner.nextInt();
        a[i][j] = value;

        System.out.println("Matrix A:");
        print(a);

        int[][] c = compute(a, b, value);
        System.out.println("(A - B)*value :");
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

    private static int[][] compute(int[][] a, int[][] b, int value) {
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = (a[i][j] - b[i][j]) * value;
            }
        }
        return c;
    }

}
