package oot.lab6.group2.no2;

public class Main {
    
    public static void main(String[] args) {
        Team team = new Team("No name", "no manager");
        manage(team);
        
        Iran iran = new Iran();
        manage(iran);
        
        Brazil brazil = new Brazil();
        manage(brazil);
    }

    public static void manage(Team team) {
        System.out.printf("[%s] manages [%s]\n", team.getManager(), team.getName());
    }

}