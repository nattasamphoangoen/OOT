package oot.lab2.group34;

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter float number: ");
        float f = scanner.nextFloat();
        if(f >= 100) {
            int i = (int)(f * 100);
            int count = 0;
            while(i > 0) {
                int d = i % 10;
                i = i / 10;
                System.out.print(d);
                count++;
                if(count == 2) {
                    System.out.print(".");
                }
            }
        } else {
            for(int k=1; k<=f; k++) {
                if(k % 3 == 0) {
                   System.out.printf("%d ", k);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
