package oot.lab2.group3.y58;

import java.util.Scanner;

/**
 *
 * @author chanwit
 */
public class No3 {

    public static void main(String[] args) {
        System.out.println("============= Menu ============");
        System.out.println("A. Run code from No. 1");
        System.out.println("B. Display inverted triangle");
        System.out.println("===============================");
        System.out.print("Enter choice: ");
        Scanner s = new Scanner(System.in);
        char choice = s.next("[AaBb]").charAt(0);
        switch (choice) {
            case 'A':
            case 'a': {
                System.out.print("Enter number: ");
                int i = s.nextInt();
                if (i % 3 == 0 || i % 7 == 0) {
                    while (i > 0) {
                        int r = i % 8;
                        System.out.print(r + " ");
                        i = i / 8;
                    }
                    System.out.println();
                } else {
                    while (i > 0) {
                        int d = i % 10;
                        i = i / 10;
                        System.out.print(d + " ");
                    }
                    System.out.println();
                }
            }
            case 'B':
            case 'b': {
                System.out.println("\nDisplay inverted triangle");
                System.out.print("Enter num: ");
                int n = s.nextInt();
                for (int i = n; i >0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();

            }
        }
    }
}
