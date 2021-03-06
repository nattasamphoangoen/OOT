package oot.lab3.group1;

import java.util.Scanner;

public class No2 {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void factorial(String label, int n) {
        System.out.println(label + factorial(n));
        System.out.printf("%d: ", n);
        String str;
        if (n % 3 == 0 || n % 7 == 0) {
            System.out.println("divisible by 3 or 7");
            str = "= ";
        } else {
            str = "+ ";
        }
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int a = sc.nextInt();
        System.out.printf("Factorial(%d) = %d\n", a, factorial(a));
        System.out.println();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        factorial("Result = ", b);
    }

}
