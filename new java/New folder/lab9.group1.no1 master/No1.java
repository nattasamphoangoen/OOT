package oot.lab9.group1.no1;

import java.util.ArrayList;

public class No1 {

    public static void main(String[] args) {
        // No 1.
        ArrayList students = new ArrayList();
        students.add(new Student("B5101111", "A1B2C3I4"));
        students.add(new Student("B5101111", "A1B 2C3I4"));
        students.add(new Student("J5101111", "A1B2I4"));
        students.add(new Student("B510XX11", ""));
        students.add(new Student("B550", "A1"));

        for (int i = 0; i < students.size(); i++) {
            Student s = (Student) students.get(i);
            try {
                s.checkFormat();
            } catch (NoDataException e) {
                System.out.println("NoDataException: " + e.getMessage());
            } catch (LengthException e) {
                System.out.println("LengthException: " + e.getMessage());
            }
        }

        // No. 2
        howManySubjects(students);
    }

    private static void howManySubjects(ArrayList students) {
        System.out.println();
        for (int i = 0; i < students.size(); i++) {
            Student s = (Student) students.get(i);
            String data = s.getData();
            int count = 0;
            for (char ch : data.toCharArray()) {
                if (Character.isAlphabetic(ch)) {
                    count++;
                }
            }
            System.out.printf("%s : %d subjects found\n", s.getId(), count);
        }

    }

}
