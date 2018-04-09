package oot.lab3.group2.y58;

import java.util.Scanner;

public class No1 {

    public static int mulFive(int x, int y) {
        int result = 1;
        for (int i = x; i <= y; i++) {
            if (i % 5 == 0) {
                result = result * i;
            }
        }
        return result;
    }

    public static int mulNotFive(int x, int y) {
        int result = 1;
        for (int i = x; i <= y; i++) {
            if (i % 5 != 0) {
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

        System.out.printf("Mul five: %d to %d = %d\n", x, y, mulFive(x, y));
        System.out.printf("Mul not five: %d to %d = %d\n", x, y, mulNotFive(x, y));
    }
}
