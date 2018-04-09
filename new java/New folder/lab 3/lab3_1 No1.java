package oot.lab3.group1.y58;

import java.util.Scanner;

public class No1 {

    public static int sumEvens(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int sumOdds(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = s.nextInt();
        System.out.print("Enter y: ");
        int y = s.nextInt();

        System.out.printf("Sum evens: %d to %d = %d\n", x, y, sumEvens(x, y));
        System.out.printf("Sum odds : %d to %d = %d\n", x, y, sumOdds(x, y));
    }
}
