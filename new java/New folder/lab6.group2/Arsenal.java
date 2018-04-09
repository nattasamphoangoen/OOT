package oot.lab6.group2;

public class Arsenal extends Team {
    
    public Arsenal() {
        this.name = "Arsenal";
    }
    
    @Override
    public void printName() {
        System.out.println(this.name + " Team.");
    }
    
}
