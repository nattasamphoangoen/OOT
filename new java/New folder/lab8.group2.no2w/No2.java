package oot.lab8.group2.no2;

public class No2 {
    
    public static void main(String[] args) {
        Student st1 = new Student("A3C2I4");
        Student st2 = new Student("B5200101", "A6B3");
        Student st3 = new Student("B511111", "A2B4C3");
        display(st1);
        display(st2);
        display(st3);
        checkScolarship(st1);
        checkScolarship(st2);        
    }

    private static void display(Student st1) {
        String g = st1.getGrade();
        int gp = 0;
        float sumCredit = 0;
        float sumPoint = 0;
        for(char ch: g.toCharArray()) {
            if(!Character.isDigit(ch)) {
                switch(ch) {
                    case 'A': gp = 4; break;
                    case 'B': gp = 3; break;
                    case 'C': gp = 2; break;
                    case 'D': gp = 1; break;
                    case 'F':
                    case 'I': gp = 0; break;
                }                
            } else {
                int credit = ch-'0';                    
                sumPoint = sumPoint + (gp * credit);
                sumCredit = sumCredit + credit;
            }
        }
        float gpx = sumPoint/sumCredit;
        System.out.printf("%s got %s = %.2f\n", st1.getName(), st1.getGrade(), gpx);

        st1.setGpx(gpx);
    }

    private static void checkScolarship(Student st1) {
        String applicable = st1.isApplicable() ? "" : "NOT";        
        System.out.printf("%s:%s applicable.\n", st1.getName(), applicable);
    }
    
}
