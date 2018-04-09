package oot.lab1_2;

import java.io.Console;

public class Currency {

    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Enter Euro: ");
        String str = console.readLine();
        double euro = Double.valueOf(str);
        double rate = 43.28;
        double baht = rate * euro;
        console.printf("Euro: %f\n", euro);
        console.printf("Baht: %.2f\n", baht);
    }

}
