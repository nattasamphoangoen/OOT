package oot.lab5.group2;

import java.util.Scanner;
import oot.lab5.group2.bike.Bike;
import oot.lab5.group2.bike.Wheel;

public class No1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Bike bike = new Bike();
        bike.setBrand("BMX");
        Wheel front = new Wheel("L");
        bike.setFrontWheel(front);
        Wheel rear = new Wheel("L");
        bike.setRearWheel(rear);
        
        while(true) {
            System.out.println("Choose Wheel, ");
            System.out.println("1. Front");
            System.out.println("2. Rear");
            System.out.print("0 to exit: ");
            int ch = scan.nextInt();        
            if(ch == 0) {
                break;
            }

            if (ch == 1) {
                System.out.println("Front Wheel is: " + bike.getFrontWheel().getSize());
            } else if(ch == 2) {
                System.out.println("Rear Wheel is: " + bike.getRearWheel().getSize());
            }
            
            System.out.print("Choose wheel size (L M S) : ");
            String size = scan.next("[LMS0]");
            if (ch == 1) {
                bike.setFrontWheel(new Wheel(size));
            } else if(ch == 2) {
                bike.setRearWheel(new Wheel(size));
            }
            
            System.out.println("==============================");
            System.out.println(bike);
            System.out.println("==============================\n");
        }
    }
    
}
