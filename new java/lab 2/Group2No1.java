package oot.lab2.group2;

import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = scanner.nextInt();
        System.out.println("Number > 150 ? : " + (i>150));
        if(i >= 150) {            
            System.out.println("Print each digit backwards");
            while(i > 0) {
                int d = i % 10;
                i = i / 10;
                System.out.print(d + " ");
            }
            System.out.println();
        } else {
            System.out.println("Print numbers divisible by 9");
            int count = 0;
            for(int k=1; k<=i; k++) {
                if(k % 9 == 0) {
                   System.out.printf("%d ", k);
                   count++;
                }
            }
            System.out.println();
            System.out.printf("There are %d numbers\n", count);
        }
        System.out.println("Done!");
    }
    
}
