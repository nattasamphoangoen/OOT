package oot.lab4.group1;

import java.util.Scanner;

public class No1 {

    public static int[] genArrayA(int num) {
        int[] a = new int[num];
        int n = 0;
        int i = 0;
        System.out.print("Array A: ");
        while (i < num) {
            if (n > 10 && n % 7 == 0) {
                System.out.printf("%2d ", n);
                a[i] = n;
                i = i + 1;
            }
            n++;
        }
        System.out.println();
        return a;
    }

    public static int[] genArrayB(int num) {
        int[] b = new int[num];
        int n = 0;
        int i = 0;
        System.out.print("Array B: ");
        while (i < num) {
            if (n > 50 && n % 3 == 0) {
                System.out.printf("%2d ", n);
                b[i] = n;
                i = i + 1;
            }
            n++;
        }
        System.out.println();
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        int[] a = genArrayA(size);
        int[] b = genArrayB(size);
        System.out.print("Enter index to sum: ");
        int index = scanner.nextInt();
        printSum(a, b, index);
    }

    private static void printSum(int[] a, int[] b, int index) {
        System.out.printf("a[%d] = %d\n", index, a[index]);
        System.out.printf("b[%d] = %d\n", index, b[index]);
        System.out.printf("Sum = %d\n", a[index] + b[index]);
    }
}
