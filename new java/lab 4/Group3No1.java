package oot.lab4.group3;

import java.util.Scanner;

public class No1 {

    public static int[] newArrayA(int size) {
        int[] a = new int[size];
        int n = 100;
        int i = 0;
        while(i < size) {
            if(n > 100 && n % 7 == 0) {
                a[i] = n;
                System.out.printf("%3d ", a[i]);
                i++;
            }
            n++;
        }
        return a;
    }

    public static int[] newArrayB(int size) {
        int[] b = new int[size];
        int n = 0;
        for (int i = 0; i < size; i++) {
            b[i] = n + 1;
            n = (n + 1) % 3;
            System.out.printf("%3d ", b[i]);
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] a = newArrayA(size);
        System.out.println();
        int[] b = newArrayB(size);
        System.out.println();
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        shiftPlus(a, b, index);
    }

    private static void shiftPlus(int[] a, int[] b, int index) {
        System.out.printf("a[%d] = %d\n", index, a[index]);
        System.out.printf("b[%d] = %d\n", index+1, b[index+1]);
        System.out.printf("%d + %d = %d\n", a[index], b[index+1], a[index] + b[index+1]);
    }

}
