
public class Tournament {
		Team team1;
		Team team2;

		void spelersmaken() {
			team1 = new Team();
			team1.teamName = "Ajax";

			team2 = new Team();
			team2.teamName = "Feyenoord";

			Player edwin = new Player("Edwin van der Sar",1);
			Player johan = new Player("Johan Cruijff", 14);
			Player zlatan = new Player("Zlatan Ibrohimovic",8);
			
			Player Frits = new Player("Frits Korbach",4);
			Player jozef = new Player("Jozef Kipric", 9);
			Player dirk = new Player("Dirk Kuyt",5);		
			
			team1.spelers.add(edwin);
			team1.spelers.add(johan);
			team1.spelers.add(zlatan);
			team1.spelers.add(new Player("Dennis Bergkamp",12));
			team1.spelers.add(new Player("Marco van Basten",12));
			team1.spelers.add(new Player("Ruud Gullit",12));
			team1.spelers.add(new Player("Frank Overmars",12));
			team1.spelers.add(new Player("Frank Rijkaard",12));
			team1.spelers.add(new Player("Frank de Boer",12));
			team1.spelers.add(new Player("Ronald de Boer",12));
			team1.spelers.add(new Player("Sjaak Zwart",12));
			team1.spelers.add(new Player("Clarence Zeedorf",12));
			team1.spelers.add(new Player("Arthur Numan",12));

			team2.spelers.add(Frits);
			team2.spelers.add(jozef);
			team2.spelers.add(dirk);
			team2.spelers.add(new Player("Ed de Goey",12));
			Player elia = new Player("Elia Elia",12);
		//	elia.geschorst = true;
			team2.spelers.add(elia);
			team2.spelers.add(new Player("Gozer van Gobbel",12));
			team2.spelers.add(new Player("Ronald Koeman",12));
			team2.spelers.add(new Player("Pierre van Hooijdonk",12));
			team2.spelers.add(new Player("Eddie pieters Graafland",12));
			team2.spelers.add(new Player("Wim Rijsbergen",12));
			
			team2.spelers.add(new Player("Giovanni van Bronckhorst",12));
			team2.spelers.add(new Player("Wim Jansen",12));
			team2.spelers.add(new Player("Oven Kindvall",12));
			team2.spelers.add(new Player("Rinus Israel",12));
			team2.spelers.add(new Player("Willem van Hanegem",12));
			team2.spelers.add(new Player("Koen Moelijn",12));
			team2.spelers.add(new Player("Robin van Persie",12));
		}
	}