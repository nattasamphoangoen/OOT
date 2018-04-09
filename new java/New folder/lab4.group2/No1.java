package oot.lab4.group2;

import java.util.Scanner;

public class No1 {

    public static int[] genA(int num) {
        int[] a = new int[num];
        int n = 0;
        int i = 0;
        System.out.print("Array A: ");
        while (i < num) {
            if (n > 10 && n % 2 != 0) {
                System.out.printf("%2d ", n);
                a[i] = n;
                i = i + 1;
            }
            n++;
        }
        System.out.println();
        return a;
    }

    public static int[] genB(int num) {
        int[] b = new int[num];
        int n = 0;
        int i = 0;
        System.out.print("Array B: ");
        while (i < num) {
            if (n >= 1) {
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
        int[] a = genA(size);
        int[] b = genB(size);
        System.out.print("Enter index to multiply: ");
        int index = scanner.nextInt();
        printMul(a, b, index);
    }

    private static void printMul(int[] a, int[] b, int index) {
        System.out.printf("a[%d] = %d\n", index, a[index]);
        System.out.printf("b[%d] = %d\n", index, b[index]);
        System.out.printf("Mul = %d\n", a[index] * b[index]);
    }
}
