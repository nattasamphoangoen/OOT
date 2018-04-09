package oot.lab7.group2.no2;


public class Basketball implements Playable {

    private final String name;

    public Basketball(String name) {
        this.name = name;
    }
    
    @Override
    public void play() {
        System.out.println("Basketball: " + this.name);
    }
    
}
