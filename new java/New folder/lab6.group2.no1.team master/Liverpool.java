package oot.lab6.group2.no1.team;

import oot.lab6.group2.Team;

public class Liverpool extends Team {
    
    public Liverpool() {
        this.name = "Liverpool";
    }
    
    @Override
    public void printName() {
        System.out.println("[override] '" + this.name + "' Team.");
    }
    
}
