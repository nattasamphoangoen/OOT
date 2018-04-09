
package oot.lab8.group1.no1;

import java.util.Scanner;


public class No1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first subject: ");
        String str = sc.next();        
        
        System.out.print("Enter second subject: ");
        String str2 = sc.next();        
        
        // combo ท่าลับ
        String code1 = str.split(":")[0];
        String subj1 = str.split(":")[1];
        
        String code2 = str2.split(":")[0];
        String subj2 = str2.split(":")[1];
        
        System.out.println(code1.concat("; ").concat(code2));
        
        if(code1.equals(code2)==true) {
            System.out.printf("%s and %s are same subject\n", code1, code2);
        } else {
            System.out.printf("%s and %s are different subject\n", code1, code2);
        }

        System.out.printf("Length of %s : %d\n", subj1, subj1.length());
        System.out.printf("Length of %s : %d\n", subj2, subj2.length());

        System.out.print("Enter index: ");
        int i = sc.nextInt();
        
        System.out.printf("Character at %d of %s: %c\n", i, subj1, subj1.charAt(i));
        System.out.printf("Character at %d of %s: %c\n", i, subj2, subj2.charAt(i));
    }
    
}
