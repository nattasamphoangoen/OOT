package oot.lab2.group1.y58;

import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {
        System.out.println("============= Menu ============");
        System.out.println("1. Run code from No. 1");
        System.out.println("2. Display triangle");
        System.out.println("===============================");
        System.out.print("Enter choice: ");
        Scanner s = new Scanner(System.in);
        char choice = s.next("[12]").charAt(0);
        switch (choice) {
            case '1': {

                System.out.print("Enter char: ");
                String str = s.next("[A-Z]");
                char ch = str.charAt(0);
                System.out.print("Enter number of chars: ");
                int n = s.nextInt();
                if (n % 2 == 0) {
                    for (int i = 0; i < n; i++) {
                        System.out.print(ch);
                    }
                    System.out.println("\nDone.");
                } else {
                    while (n > 0) {
                        System.out.printf("%d%c\n", n, ch);
                        n--;
                    }
                }
            }
            break;

            case '2': {
                System.out.println("\nDisplay triangle");
                System.out.print("Enter num: ");
                int n = s.nextInt();
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            break;
        }

    }
}
