package oot.lab8.group2.no2;

public class Student implements Funding {
    
    private String name;
    private String grade;

    private Float  gpx;

    Student(String grade) {
        this.name  = "Anonymous id";
        this.grade = grade;
    }

    Student(String id, String grade) {
        this.name = id;
        this.grade = grade;
    }

    @Override
    public boolean isApplicable() {
        return getGpx() >= 2.75;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Float getGpx() {
        return gpx;
    }

    public void setGpx(Float gpx) {
        this.gpx = gpx;
    }
    
    
}
