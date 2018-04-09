package oot.lab4.group2;

import java.util.Scanner;

public class No1 {

    public static int[] createArrayA(int size) {
        int[] a = new int[size];
        int n = 15;
        int i = 0;
        while(i < size) {
            if(n > 15 && n % 2 == 0) {
                a[i] = n;
                System.out.printf("%2d ", a[i]);
                i++;
            }
            n++;
        }
        return a;
    }

    public static int[] createArrayB(int size) {
        int[] b = new int[size];
        for(int i = 0;i < size; i++) {
            if(i % 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 5;
            }
            System.out.printf("%2d ", b[i]);
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] a = createArrayA(size);
        System.out.println();
        int[] b = createArrayB(size);
        System.out.println();
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        minus(a, b, index);
    }

    private static void minus(int[] a, int[] b, int index) {
        System.out.printf("a[%d] = %d\n", index, a[index]);
        System.out.printf("b[%d] = %d\n", index, b[index]);
        System.out.printf("%d - %d = %d\n", a[index], b[index], a[index] - b[index]);

    }

}
