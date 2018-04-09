package oot.lab1_2;

import java.io.*;

public class Lab1N3 {

    public static void main(String[] args) {

        Console console = System.console();

        System.out.print("Enter first number: ");
        int f = Integer.valueOf(console.readLine());

        System.out.print("Enter second number: ");
        int s = Integer.valueOf(console.readLine());

        System.out.print("Enter character: ");
        char c = console.readLine().charAt(0);

        if(c == 'C') {
            System.out.println("/\\" + c + "/\\");
        } else {
            System.out.println("\\\\//");
        }

        if(f > s) {
            System.out.printf("%d is not equal to %d : %s\n", f, s, f != s);
            System.out.printf("%d > %d: %s\n", s, f, s > f);
        } else {
            System.out.printf("%d not greater than %d\n", f, s);
        }

    }

}
