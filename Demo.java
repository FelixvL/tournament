
public class Demo {
    public static void main(String args[]){
    	Team team1 = new Team();
    	team1.teamName = "Feyenoord";
    	team1.player.playerName = "Johan Cruijf";
    	team1.stelSpelersVoor();
//    	System.out.println(team1.teamName + " has one player named: " + team1.player.playerName);
    	Team team2 = new Team();
    	team2.teamName = "Ajax";
    	team2.player.playerName = "Dirk Kuyt";
    	team2.stelSpelersVoor();
//    	System.out.println(team2.teamName + " has one player named: " + team2.player.playerName);
    }
}
class Team{
	String teamName;
	Player player = new Player();
	
	void stelSpelersVoor() {
		System.out.println(this.teamName + " has one player called: " + this.player.playerName);
	}
	
	
}

class Player {
	String playerName;
}