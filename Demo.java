import java.util.ArrayList;

public class Demo {
	public static void main(String args[]) {
		Tournament tournament = new Tournament();
		tournament.spelersmaken();
		Team ajax = tournament.team1;
		Team feyenoord = tournament.team2;	
		Wedstrijd pete = new Wedstrijd(ajax, feyenoord);
	}
	
}

class Wedstrijd{
	Team thuisTeam = new Team(); 
	Team uitTeam = new Team();
	
	Wedstrijd(Team thuisTeam, Team uitTeam){
		
		System.out.println("Wedstrijd wordt gespeeld tussen "+thuisTeam.teamName+" en "+ uitTeam.teamName);
		
	}
	
}



