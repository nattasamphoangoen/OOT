package oot.lab2.group2.y58;

import java.util.Scanner;

/**
 *
 * @author chanwit
 */
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
                if (i >= 100) {
                    while (i > 0) {
                        int d = i % 10;
                        i = i / 10;
                        System.out.println(d);
                    }
                } else {
                    for (int k = 1; k <= i; k++) {
                        if (k % 7 == 0) {
                            System.out.printf("%d ", k);
                        }
                    }
                    System.out.println();
                }
            }
            break;

            case 'B':
            case 'b': {
                System.out.print("Enter number N: ");
                int n = s.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == 0 || i == n - 1) {
                            System.out.print('x');
                        } else if (j == 0 || j == n - 1) {
                            System.out.print('x');
                        } else {
                            System.out.print(' ');
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
