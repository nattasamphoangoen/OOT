package oot.lab4.group2.y58;

import java.util.Scanner;

public class No1 {

    public static int[] createA(int size) {
        int[] a = new int[size];
        int n = 19;
        int i = 0;
        while (i < size) {
            if (n > 20) {
                a[i] = n;
                System.out.printf("%2d ", a[i]);
                i++;
            }
            n++;
        }
        System.out.println();
        return a;
    }

    public static int[] createB(int size) {
        int[] b = new int[size];
        int n = 9;
        int i = 0;
        while (i < size) {
            if (n > 10 && n % 2 == 1) {
                b[i] = n;
                System.out.printf("%2d ", b[i]);
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
        int[] a = createA(size);
        int[] b = createB(size);
        System.out.println();
        System.out.print("Enter index: ");
        int idx = scanner.nextInt();
        minus(a, b, idx);
    }

    private static void minus(int[] a, int[] b, int idx) {
        System.out.printf("a[%d] = %d\n", idx, a[idx]);
        System.out.printf("b[%d] = %d\n", idx, b[idx]);
        System.out.printf("a[%d] - b[%d] = %d\n", idx, idx, a[idx] - b[idx]);
        System.out.println();
        System.out.println("a-b:");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i] - b[i]);
        }
    }

}
