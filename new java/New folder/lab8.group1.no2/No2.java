package oot.lab8.group1.no2;

public class No2 {
    
    public static void main(String[] args) {
        Student st1 = new Student("A3C2F4");
        Student st2 = new Student("B5200101", "A6B3");
        Student st3 = new Student("B511111", "A2B4C3");
        show(st1);
        show(st2);
        show(st3);
        
        System.out.printf("%s got new result: %s\n", st1.getName(), st1.regrade('D'));
    }

    private static void show(Student st1) {
        String g = st1.getGrade();
        int gp = 0;
        float sumCredit = 0;
        float sumPoint = 0;
        for(char ch: g.toCharArray()) {
            if(ch >= '0' && ch <= '9') {
                int credit = ch-'0';                    
                sumPoint += (gp * credit);
                sumCredit += credit;
            } else {
                switch(ch) {
                    case 'A': gp = 4; break;
                    case 'B': gp = 3; break;
                    case 'C': gp = 2; break;
                    case 'D': gp = 1; break;
                    case 'F': gp = 0; break;
                }
            }
        }
        System.out.printf("%s got %s = %.2f\n", st1.getName(), st1.getGrade(), sumPoint/sumCredit);
    }
    
}
