import java.util.ArrayList;

public class Demo {
	public static void main(String args[]) {
		Team team1 = new Team();
		team1.teamName = "Feyenoord";
		team1.player.playerName = "Johan Cruijf";
		team1.player.playerNumber = 14;
		team1.player1.playerName = "Zlatan Ibrohimovic";
		team1.player1.playerNumber = 8;

		Team team2 = new Team();
		team2.teamName = "Ajax";
		team2.player.playerNumber = 5;
		team2.player.playerName = "Dirk Kuyt";
		team2.player1.playerName = "Jozef Kipric";
		team2.player1.playerNumber = 9;
		Player edwin = new Player();
		edwin.playerName = "Edwin van der Sar";
		edwin.playerNumber = 1;
		team1.spelers.add(edwin);
		team1.spelers.add(team1.player);
		team1.spelers.add(team1.player1);
		Player Frits = new Player();
		Frits.playerName = "Frits Korbach";
		Frits.playerNumber = 4;
		team2.spelers.add(Frits);
		team2.spelers.add(team2.player);
		team2.spelers.add(team2.player1);

		// public boolean add(E e)
		// public E get(int index)
		team1.stelSpelersVoor();
		team2.stelSpelersVoor();

	}
}

class Team {
	String teamName;
	ArrayList<Player> spelers = new ArrayList();
	Player player = new Player();
	Player player1 = new Player();

	void stelSpelersVoor() {
		System.out.println("Wij zijn team "+ teamName + " en spelen met de spelers :");
		for (int x = 0; x < spelers.size(); x++) {
			System.out.println(spelers.get(x).playerName);
		}
	}
}

class Player {
	String playerName;
	int playerNumber;
}