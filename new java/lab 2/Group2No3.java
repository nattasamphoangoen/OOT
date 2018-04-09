package oot.lab2.group2;

import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {
        System.out.println("============= Menu ============");
        System.out.println("A. Run code from No. 1");
        System.out.println("B. Display rectangle of size N");
        System.out.println("===============================");
        System.out.print("Enter choice: ");
        Scanner s = new Scanner(System.in);
        char choice = s.next("[AaBb]").charAt(0);
        switch (choice) {
            case 'A':
            case 'a': {
                System.out.print("Enter number: ");
                int i = s.nextInt();
                System.out.println("Number > 150 ? : " + (i > 150));
                if (i >= 150) {
                    System.out.println("Print each digit backwards");
                    while (i > 0) {
                        int d = i % 10;
                        i = i / 10;
                        System.out.print(d + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Print numbers divisible by 9");
                    int count = 0;
                    for (int k = 1; k <= i; k++) {
                        if (k % 9 == 0) {
                            System.out.printf("%d ", k);
                            count++;
                        }
                    }
                    System.out.println();
                    System.out.printf("There are %d numbers\n", count);
                }
                System.out.println("Done!");
            }
            break;

            case 'B':
            case 'b': {
                System.out.print("Enter number N: ");
                int n = s.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(i==0 || i == n-1) {
                            System.out.print('-');
                        } else if (j == 0 || j == n - 1) {
                            System.out.print('|');
                        } else {
                            System.out.print('x');
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
            break;
        }

    }
}
