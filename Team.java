import java.util.ArrayList;
public class Team {
	String teamName;
	ArrayList<Player> spelers = new ArrayList();

	void stelSpelersVoor() {
		System.out.println("Wij zijn team "+ teamName + " en spelen met de spelers :");
		for (int x = 0; x < spelers.size(); x++) {
			System.out.println(spelers.get(x).playerName);
		}
	}

}
