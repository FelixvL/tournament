
public class Demo {
    public static void main(String args[]){
    	Team team1 = new Team();
    	team1.teamName = "Feyenoord";
    	System.out.println(team1.teamName);
    	Team team2 = new Team();
    	team2.teamName = "Ajax";
    	team2.player.playerName = "Dirk Kuyt";
    	System.out.println(team2.teamName + " has one player named: " + team2.player.playerName);
    }
}
class Team{
	String teamName;
	Player player = new Player();
	
	
}

class Player {
	String playerName;
}