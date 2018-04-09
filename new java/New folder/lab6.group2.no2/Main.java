package oot.lab6.group2.no2;

public class Main {
    
    public static void main(String[] args) {
        Team team = new Team("No name", "no manager");
        lead(team);
        
        England englandTeam = new England();
        lead(englandTeam);
        
        Spain spain = new Spain();
        lead(spain);
    }

    public static void lead(Team t) {
        System.out.println(t.getName() + " has manager: " + t.getManager());
    }
    
}