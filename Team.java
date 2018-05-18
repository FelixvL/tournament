import java.util.ArrayList;
public class Team {
	String teamName;
	ArrayList<Player> spelers = new ArrayList();
	Player[] elftal = new Player[11];
	
	void stelSpelersVoor() {
		System.out.println("Wij zijn team "+ teamName + " en have on contract "+spelers.size()+" amount of players being:");
		for (int x = 0; x < spelers.size(); x++) {
			System.out.println(spelers.get(x).playerName);
		}
	}
	void opstellingMaken(int position, Player player) {
		elftal[position] = player;
		player.playerNumber = position+1;
	}
	void introElftal() throws NotAllPlayersAreInException{
		for(int x = 0 ; x < elftal.length ; x ++) {
			if(!(elftal[x].geschorst)) {
				System.out.println(elftal[x].playerName + " is playing with number "+ elftal[x].playerNumber);
			}else {
				throw new NotAllPlayersAreInException();
			}
		}
	}
	void makeElftal() {
		opstellingMaken(0, spelers.get(0));
		opstellingMaken(1, spelers.get(1));
		opstellingMaken(2, spelers.get(2));
		opstellingMaken(3, spelers.get(3));
		opstellingMaken(4, spelers.get(4));
		opstellingMaken(5, spelers.get(5));
		opstellingMaken(6, spelers.get(6));
		opstellingMaken(7, spelers.get(7));
		opstellingMaken(8, spelers.get(8));
		opstellingMaken(9, spelers.get(9));
		opstellingMaken(10, spelers.get(10));
	}

}
