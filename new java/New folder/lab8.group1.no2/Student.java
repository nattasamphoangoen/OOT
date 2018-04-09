package oot.lab8.group1.no2;

public class Student implements Regradable {

    private final String name;
    private final String grade;

    public Student(String grade) {
        this.name = "Anonymous id";
        this.grade = grade;
    }

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String regrade(char x) {
        String result = "";
        for(int i=0;i<this.grade.length();i++) {
            char ch = this.grade.charAt(i);            
            if(ch == 'F') {
                result = result + x;
            } else {
                result = result+ch;
            }
        }
        return result;
    }

    public String getName() {
        return this.name;
    }

    public String getGrade() {
        return this.grade;
    }
    
}
