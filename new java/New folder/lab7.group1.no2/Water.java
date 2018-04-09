package oot.lab7.group1.no2;


public class Water implements Drinkable {

    private String name;
    
    public Water(String name) {
        this.name = name;
    }

    @Override
    public void drink() {
        System.out.println(this.name + " Water");
    }
    
}
