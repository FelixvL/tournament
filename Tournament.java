
public class Tournament {
		Team team1;
		Team team2;

		void spelersmaken() {
			team1 = new Team();
			team1.teamName = "Feyenoord";

			team2 = new Team();
			team2.teamName = "Ajax";

			Player edwin = new Player("Edwin van der Sar",1);
			Player johan = new Player("Johan Cruijff", 14);
			Player zlatan = new Player("Zlatan Ibrohimovic",8);
			
			Player Frits = new Player("Frits Korbach",4);
			Player jozef = new Player("Jozef Kipric", 9);
			Player dirk = new Player("Dirk Kuyt",5);		
			
			team1.spelers.add(edwin);
			team1.spelers.add(johan);
			team1.spelers.add(zlatan);

			team2.spelers.add(Frits);
			team2.spelers.add(jozef);
			team2.spelers.add(dirk);

			team1.stelSpelersVoor();
			team2.stelSpelersVoor();
		}
	}