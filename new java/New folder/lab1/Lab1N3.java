package oot.lab1;

import java.io.Console;

public class Lab1N3 {

    public static void main(String[] args) {

        Console console = System.console();

        System.out.print("Enter first number: ");
        int first = Integer.valueOf(console.readLine());

        System.out.print("Enter second number: ");
        int second = Integer.valueOf(console.readLine());

        System.out.print("Enter character: ");
        char c = console.readLine().charAt(0);

        if(first < second) {
            System.out.printf("%d is equal to %d: %s\n", second, first, second == first);
            System.out.printf("%d is not equal to %d: %s\n", first, second, second != first);
            System.out.printf("%d < %d : %s\n", second, first, second < first);
        } else {
            System.out.println("//" + "\\\\");
        }

        if(c == 'C') {
            System.out.println("//" + c + "\\\\");
        } else {
            System.out.println("\"" + c + "\"");
        }

    }

}