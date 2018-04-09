package oot.lab2.group34;

import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {
        System.out.println("========== Menu ==========");
        System.out.println("1. Run code in No. 1");
        System.out.println("2. Display sparse triangle");
        System.out.println("Q. Quit");
        System.out.println("==========================");
        System.out.print("Enter choice: ");
        Scanner s = new Scanner(System.in);
        char choice = s.next("[12Q]").charAt(0);
        switch (choice) {
            case '1': {
                System.out.print("Enter float number: ");
                float f = s.nextFloat();
                if (f >= 100) {
                    int i = (int) (f * 100);
                    int count = 0;
                    while (i > 0) {
                        int d = i % 10;
                        i = i / 10;
                        System.out.print(d);
                        count++;
                        if (count == 2) {
                            System.out.print(".");
                        }
                    }
                } else {
                    for (int k = 1; k <= f; k++) {
                        if (k % 3 == 0) {
                            System.out.printf("%d ", k);
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
            break;

            case '2': {
                System.out.println("\nDisplay sparse triangle");
                System.out.print("Enter char: ");
                char ch = s.next().charAt(0);
                System.out.print("Enter num: ");
                int n = s.nextInt();
                for (int i = n; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(ch + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            break;
                
            case 'Q': {
                System.out.println("Quit.");
                break;
            }
        }
    }
}
