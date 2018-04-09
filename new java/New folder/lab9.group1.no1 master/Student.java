package oot.lab9.group1.no1;

public class Student {

    private final String id;
    private final String data;

    public String getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public Student(String id, String data) {
        this.id = id;
        this.data = data;
    }

    public void checkFormat() throws NoDataException, LengthException {
        if(this.data.length() == 0) {
            throw new NoDataException("Grade '" + this.data + "' contains no data.");
        } else {
            if(this.id.length() != 8) {
                throw new LengthException("Size of Id '" + this.id + "' is invalid.");
            }
        }

        System.out.printf("%s : %s\n", this.id, this.data);
    }

}
