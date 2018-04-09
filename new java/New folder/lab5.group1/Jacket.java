package oot.lab5.group1.jacket;

public class Jacket {
    
    private String name;    
    private Arm leftArm;
    private Arm rightArm;

    public void setLeftArm(Arm value) {
        this.leftArm = value;
    }

    public void setRightArm(Arm value) {
        this.rightArm = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Arm getLeftArm() {
        return leftArm;
    }

    public Arm getRightArm() {
        return rightArm;
    }
    
    @Override
    public String toString() {
        return String.format("Jacket \"%s\", Arm Color[L: %s R: %s]",
                this.name,
                this.leftArm.getColor(),
                this.rightArm.getColor());
    }
}
