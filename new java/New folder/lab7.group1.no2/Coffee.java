package oot.lab7.group1.no2;


public class Coffee implements Drinkable {

    private String name;
    
    public Coffee(String name) {
        this.name = name;
    }

    @Override
    public void drink() {
        System.out.println(this.name + " Coffee");
    }
    
}
