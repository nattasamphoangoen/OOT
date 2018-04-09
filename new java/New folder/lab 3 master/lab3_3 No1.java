package oot.lab3.group3.y58;

import java.util.Scanner;

public class No1 {

    public static int sumOdds(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int mulEvens(int x, int y) {
        int result = 1;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                result = result * i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = s.nextInt();
        System.out.print("Enter y: ");
        int y = s.nextInt();

        System.out.printf("Sum odds : %d to %d = %d\n", x, y, sumOdds(x, y));
        System.out.printf("Mul evens: %d to %d = %d\n", x, y, mulEvens(x, y));

    }

}
