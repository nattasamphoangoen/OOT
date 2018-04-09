package oot.lab1;

import java.io.Console;

public class Currency {

    public static void main(String[] args) {
        Console console = System.console();
        System.out.print("Enter EURO: ");
        String s = console.readLine();
        double euro = Double.valueOf(s);
        double convert = 43.28;
        double baht = convert*euro;
        console.printf("Euro: %f\n");
        console.printf("Baht: %.2f\n", baht);
    }

}