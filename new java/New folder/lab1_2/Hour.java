package oot.lab1_2;

import java.io.Console;

public class Hour {

    public static void main(String args[]) {
        Console console = System.console();
        System.out.print("Enter Minutes: ");
        String str = console.readLine();
        int minute = Integer.valueOf(str);
        double min = 60.0;
        double hour = minute/min;
        console.printf("Minute: %d\n", minute);
        console.printf("Hour: %.3f\n", hour);
    }

}