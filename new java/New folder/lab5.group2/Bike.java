package oot.lab5.group2.bike;

public class Bike {

    private Wheel rear;
    private Wheel front;
    
    private String brand;

    public void setBrand(String value) {
        this.brand = value;
    }

    public void setFrontWheel(Wheel value) {
        this.front = value;
    }

    public void setRearWheel(Wheel value) {
        this.rear = value;
    }

    public Wheel getFrontWheel() {
        return this.front;
    }

    public Wheel getRearWheel() {
        return this.rear;
    }
    
    @Override
    public String toString() {
        return String.format("Bike: %s, Front: %s, Rear: %s",
                this.brand,
                this.getFrontWheel().getSize(),
                this.getRearWheel().getSize());
    }
    
}
