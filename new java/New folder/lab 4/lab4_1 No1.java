package oot.lab4.group1.y58;

import java.util.Scanner;

public class No1 {

    public static int[] genArrayA(int size) {
        int[] a = new int[size];
        int n = 20;
        int i = 0;
        while (i < size) {
            if (n > 20 && n % 2 != 0) {
                a[i] = n;
                System.out.printf("%d ", a[i]);
                i++;
            }
            n++;
        }
        System.out.println();
        return a;
    }

    private static int[] genArrayB(int size) {
        int[] b = new int[size];
        int n = 10;
        int i = 0;
        while (i < size) {
            if (n > 10 && (n % 3 == 0 || n % 5 == 0)) {
                b[i] = n;
                System.out.printf("%d ", b[i]);
                i++;
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

        System.out.println();
        System.out.print("Enter index: ");
        int index = scanner.nextInt();
        sub(a, b, index);
    }

    private static void sub(int[] a, int[] b, int index) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i] - b[i]);
        }
        System.out.println();
        System.out.printf("a[%d] = %d\n", index, a[index]);
        System.out.printf("b[%d] = %d\n", index, b[index]);
        System.out.printf("a[%d] - b[%d] = %d\n", index, index, a[index] - b[index]);
    }

}
