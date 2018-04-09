package oot.lab1_1;

import java.io.Console;

public class Hour {

    public static void main(String[] args) {

        Console console = System.console();
        System.out.println("Enter Seconds: ");
        String str = console.readLine();
        int secs = Integer.valueOf(str);
        double secsPerHour = 3600.0;
        double hour = secs / secsPerHour;
        console.printf("Seconds: %d\n", secs);
        console.printf("Hours:   %.6f\n", hour);

    }

}
