package oot.lab1_3;

import java.io.Console;

public class Degree {

    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter Fahrenheit: ");
        String str = console.readLine();
        int degree = Integer.valueOf(str);
        double c = (degree - 32)/1.80;
        console.printf("Fahrenheit : %d \n", degree);
        console.printf("Celsius: %.3f\n", c);
    }

}
