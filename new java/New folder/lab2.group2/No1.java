package oot.lab2.group2;

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = scanner.nextInt();
        if(i >= 100) {
            while(i > 0) {
                int d = i % 10;
                i = i / 10;
                System.out.println(d);
            }
        } else {
            for(int k=1; k<=i; k++) {
                if(k % 7 == 0) {
                   System.out.printf("%d ", k);
                }
            }
            System.out.println();
        }
    }
    
}
