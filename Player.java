public class Player {
	String playerName;
	int playerNumber;
	
	Player(){
		this("Moet nog naam krijge",99);
		System.out.println("Lege constructor speler gebruikt");
	}
	Player(String name, int number){		
		this.playerName = name;
		this.playerNumber = number;
	}
}
