package oot.lab3.group3.y58;

import java.util.Scanner;

public class No2 {

    private static void perform(int a, char ch1, char ch2) {
        if (a % 2 == 0 || a % 5 == 0) {
            System.out.printf("%d ", perform(a));
            for (char c = ch1; c <= ch2; c++) {
                System.out.printf("%c", c);
            }
        } else {
            System.out.printf("%d:%d ", a, perform(a));
            for (char c = ch2; c >= ch1; c--) {
                System.out.printf("%c", c);
            }
        }
        System.out.println();
    }

    private static int perform(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.printf("Factorial(%d) = %d\n", a, perform(a));
        System.out.println();
        System.out.print("Enter first character: ");
        char ch1 = sc.next().charAt(0);
        System.out.print("Enter first character: ");
        char ch2 = sc.next().charAt(0);
        perform(a, ch1, ch2);
    }

}
