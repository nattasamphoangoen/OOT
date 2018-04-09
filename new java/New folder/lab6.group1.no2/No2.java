package oot.lab6.group1.no2;

public class No2 {
    
    public static void lead(Team t) {
        System.out.println(t.getName() + " has captain: " +  t.getCaptain());        
    }
    
    public static void main(String[] args) {
        Team team = new Team("No name", "No captain");
        lead(team);
        
        England englandTeam = new England();
        lead(englandTeam);
        
        Argentina argen = new Argentina();
        lead(argen);
    }
    
}
