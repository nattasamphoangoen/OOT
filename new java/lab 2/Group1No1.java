package oot.lab2.group1;

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter char: ");
        String str = scanner.next("[A-Z]");
        char ch = str.charAt(0);
        System.out.println("Input is: " + ch);
        if(ch == 'A' || ch == 'E') {
            System.out.println("A or E, do nothing.");
        } else {
            System.out.print("Enter number of chars: ");
            int n = scanner.nextInt();
            if (n % 3 == 1) {
                for(int i = 1; i <= n; i++) {
                    System.out.printf("[%d: %c]",i,ch);
                    ch++;
                }
                System.out.println("\nDone.");
            } else {
                while(n > 0) {                
                    System.out.printf("%d%c\n", n, ch);
                    n--;
                }
            }
        }
    }
}
