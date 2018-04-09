package oot.lab4.group2.y58;

import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 4}, {3, 2, 1}};
        int[][] b = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.println("Matrix A:");
        show(a);
        System.out.println("Matrix B:");
        show(b);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] += x;
            }
        }
        System.out.println("Matrix A:");
        show(a);

        int[][] c = sub(a, b);
        System.out.println("A - B:");
        show(c);
    }

    private static void show(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int[][] sub(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

}
