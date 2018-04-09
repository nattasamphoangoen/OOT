package oot.lab8.group1.no2;

public class Student implements ChangeGrade {

    private final String name;
    private final String grade;

    Student(String grade) {
        this.name = "Anonymous id";
        this.grade = grade;
    }

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String changeFto(char x) {
        String result = "";
        for (int i = 0; i < this.grade.length(); i++) {
            char ch = this.grade.charAt(i);
            if (ch == 'F') {
                result = result.concat(String.valueOf(x));
            } else {
                result = result.concat(String.valueOf(ch));
            }
        }
        return result;
    }

    String getName() {
        return this.name;
    }

    String getGrade() {
        return this.grade;
    }

}
