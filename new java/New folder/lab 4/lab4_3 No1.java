package oot.lab4.group3.y58;

import java.util.Scanner;

public class No1 {

    public static int[] arrayA(int size) {
        int[] a = new int[size];
        int n = 10;
        int i = 0;
        while (i < size) {
            if (n > 10 && n % 7 == 0) {
                a[i] = n;
                System.out.printf("%3d ", a[i]);
                i++;
            }
            n++;
        }
        System.out.println();
        return a;
    }

    public static int[] arrayB(int size) {
        int[] b = new int[size];
        int n = 1;
        int i = 0;
        while (i < size) {
            b[i] = n;
            System.out.printf("%3d ", b[i]);
            i++;
            n++;
            if (n > 3) {
                n = 1;
            }
        }
        System.out.println();
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        int[] a = arrayA(size);
        int[] b = arrayB(size);

        System.out.println();

        System.out.print("Enter index i: ");
        int i = scanner.nextInt();
        System.out.print("Enter index j: ");
        int j = scanner.nextInt();
        plus(a, b, i, j);
    }

    private static void plus(int[] a, int[] b, int i, int j) {
        for (int k = 0; k < a.length; k++) {
            System.out.printf("%d ", a[k] + b[k]);
        }
        System.out.println();
        System.out.printf("a[%d] = %d\n", i, a[i]);
        System.out.printf("b[%d] = %d\n", j, b[j]);
        System.out.printf("%d + %d = %d\n", a[i], b[j], a[i] + b[j]);
    }

}
