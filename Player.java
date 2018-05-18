public class Player {
	String playerName;
	int playerNumber;
	boolean geschorst;
	Player(){
		System.out.println("Lege constructor speler gebruikt");
	}
	Player(String name, int number){		
		this.playerName = name;
		this.playerNumber = number;
	}
}
