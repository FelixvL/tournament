import java.util.ArrayList;

public class Demo {
	public static void main(String args[]) {
		Tournament tournament = new Tournament();
		tournament.spelersmaken();		
	}
}

class Team {
	String teamName;
	ArrayList<Player> spelers = new ArrayList();

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


class Tournament{
	Team team1;
	Team team2;
	void spelersmaken() {
		team1 = new Team();
		team1.teamName = "Feyenoord";
		Player johan = new Player();
		johan.playerName = "Johan Cruijf";
		johan.playerNumber = 14;
		Player zlatan = new Player();
		zlatan.playerName = "Zlatan Ibrohimovic";
		zlatan.playerNumber = 8;

		team2 = new Team();
		team2.teamName = "Ajax";
		Player dirk = new Player();
		
		dirk.playerNumber = 5;
		dirk.playerName = "Dirk Kuyt";
		Player jozef = new Player();
		jozef.playerName = "Jozef Kipric";
		jozef.playerNumber = 9;
		Player edwin = new Player();
		edwin.playerName = "Edwin van der Sar";
		edwin.playerNumber = 1;
		team1.spelers.add(edwin);
		team1.spelers.add(johan);
		team1.spelers.add(zlatan);
		Player Frits = new Player();
		Frits.playerName = "Frits Korbach";
		Frits.playerNumber = 4;
		team2.spelers.add(Frits);
		team2.spelers.add(jozef);
		team2.spelers.add(dirk);

		// public boolean add(E e)
		// public E get(int index)
		team1.stelSpelersVoor();
		team2.stelSpelersVoor();

	}
}