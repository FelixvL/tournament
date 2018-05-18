
public class Demo {
    public static void main(String args[]){
    	Team team1 = new Team();
    	team1.teamName = "Feyenoord";
    	team1.player.playerName = "Johan Cruijf";
    	team1.player.playerNumber = 14;
    	team1.player1.playerName = "Zlatan Ibrohimovic";
    	team1.player1.playerNumber = 8;
    	team1.stelSpelersVoor();
    	
    	Team team2 = new Team();
    	team2.teamName = "Ajax";
    	team2.player.playerNumber = 5;
    	team2.player.playerName = "Dirk Kuyt";
    	team2.player1.playerName = "Jozef Kipric";
    	team2.player1.playerNumber = 9;
    	team2.stelSpelersVoor();
    }
}
class Team{
	String teamName;
	Player player = new Player();
	Player player1 = new Player();
	void stelSpelersVoor() {
		System.out.println(this.teamName + " has one player called: " + this.player.playerName + " and his number is: " + player.playerNumber);
		System.out.println(this.teamName + " has one player called: " + this.player1.playerName + " and his number is: " + player1.playerNumber);
	}	
}
class Player {
	String playerName;
	int playerNumber;
} 