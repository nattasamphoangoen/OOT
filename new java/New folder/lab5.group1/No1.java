package oot.lab5.group1;

import java.util.Scanner;
import oot.lab5.group1.jacket.Jacket;
import oot.lab5.group1.jacket.Arm;

public class No1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Jacket jacket = new Jacket();
        jacket.setName("CPE");

        Arm leftArm = new Arm("ORANGE");
        jacket.setLeftArm(leftArm);

        Arm rightArm = new Arm("GOLD");
        jacket.setRightArm(rightArm);

        while (true) {
            System.out.print("Enter L or R (0 to exit): ");
            char ch = scan.next("[LR0]").charAt(0);
            if (ch == '0') {
                break;
            }
            if (ch == 'L') {
                System.out.printf("LEFT arm color is: %s\n",
                    jacket.getLeftArm().getColor());
                System.out.print("Enter new color: ");
                String color = scan.next();
                jacket.setLeftArm(new Arm(color));
            } else if (ch == 'R') {
                System.out.printf("RIGHT arm color is: %s\n",
                    jacket.getRightArm().getColor());
                System.out.print("Enter new color: ");
                String color = scan.next();
                jacket.setRightArm(new Arm(color));
            }

            System.out.println("***************************************");
            System.out.println(jacket);
            System.out.println("***************************************\n");
        }
    }

}
