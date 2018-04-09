package oot.lab8.group1.no2;

public class No2 {

    public static void main(String[] args) {
        Student st1 = new Student("A=3  C=2 F=4");
        Student st2 = new Student("B5200101", "A=6 B=3");
        Student st3 = new Student("B511111", "A=2 B=4  C=3");
        show(st1);
        show(st2);
        show(st3);

        System.out.printf("%s got new result: %s\n", st1.getName(), st1.changeFto('D'));
    }

    private static void show(Student s) {
        String g = s.getGrade();
        int gp = 0;
        float sumCredit = 0;
        float sumPoint = 0;
        for(char ch: g.toCharArray()) {
            if(ch >= '0' && ch <= '9') {
                int credit = ch-'0';
                sumCredit += credit;
            }
        }
        System.out.println("%s got %s = %d\n", s.getName(), s.getGrade(), sumCredit);
    }

}
