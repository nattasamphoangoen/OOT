package oot.lab7.group1.no2;

import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter water: ");
        String str = sc.next();
        Water w = new Water(str);
        display(w);
        
        System.out.println("Enter coffee: ");
        str = sc.next();
        Coffee c = new Coffee(str);
        display(c);
    }

    private static void display(Drinkable d) {
        d.drink();
    }
    
}
