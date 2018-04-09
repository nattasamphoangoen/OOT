package oot.lab3.group1.y58;

import java.util.Scanner;

public class No2 {

    public static int compute(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void compute(char ch, int n) {
        int result = compute(n);
        if (n % 2 == 0) {
            System.out.printf("%d ", n);
            for (int i = 0; i < n; i++) {
                System.out.printf("%c", ch);
            }
            System.out.println();
        } else {
            System.out.printf("%d: %d\n", n, result);
            System.out.printf("%c has odd number\n", ch);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int fac = s.nextInt();
        System.out.printf("Factorial(%d) = %d\n", fac, compute(fac));
        s.nextLine();
        System.out.print("Enter char: ");
        char ch = s.nextLine().charAt(0);
        compute(ch, fac);
    }

}
