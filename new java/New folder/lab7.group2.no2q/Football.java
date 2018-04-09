package oot.lab7.group2.no2;


public class Football implements Playable {

    private final String name;

    public Football(String name) {
        this.name = name;
    }
    
    @Override
    public void play() {
        System.out.println("Football: " + this.name);
    }
    
}
