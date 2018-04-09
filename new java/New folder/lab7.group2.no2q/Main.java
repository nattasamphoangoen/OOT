package oot.lab7.group2.no2;

import java.util.Scanner;

public class Main {
    
    private static void show(Playable p) {
        p.play();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter football team: ");
        String str = sc.next();
        Football w = new Football(str);
        show(w);
        
        System.out.println("Enter basketball team: ");
        str = sc.next();
        Basketball c = new Basketball(str);
        show(c);
    }
    
}
