package oot.lab4.group1;

import java.util.Scanner;

public class No1 {

    public static int[] generateArrayA(int size) {
        int[] a = new int[size];
        int n = 10;
        int i = 0;
        while(i < size) {
            if(n > 10 && n % 2 != 0) {
                a[i] = n;
                System.out.printf("%d ", a[i]);
                i++;
            }
            n++;
        }
        return a;
    }

    public static int[] generateArrayB(int size) {
        int[] b = new int[size];
        int n = 50;
        int i = 0;
        while(i < size) {
            if(n > 50 && (n % 3 == 0 || n % 5 == 0)) {
                b[i] = n;
                System.out.printf("%d ", b[i]);
                i++;
            }
            n++;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] a = generateArrayA(size);
        System.out.println();
        int[] b = generateArrayB(size);
        System.out.println();
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        mul(a, b, index);
    }

    private static void mul(int[] a, int[] b, int index) {
        System.out.printf("a[%d] = %d\n", index, a[index]);
        System.out.printf("b[%d] = %d\n", index, b[index]);
        System.out.printf("a[%d] * b[%d] = %d\n", index, index, a[index] * b[index]);
    }

}
