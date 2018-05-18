import java.util.ArrayList;

public class Demo {
	public static void main(String args[]) {
		Tournament tournament = new Tournament();
		tournament.spelersmaken();
		Team ajax = tournament.team1;
		Team feyenoord = tournament.team2;	
		Wedstrijd wedstrijd = new Wedstrijd(ajax, feyenoord); // today
		wedstrijd.advertise();  // 1 month
		wedstrijd.playing();
	}	
}
class Wedstrijd{
	Team thuisTeam; 
	Team uitTeam;
	void playing() {
		System.out.println("Wedstrijd wordt gespeeld tussen "+thuisTeam.teamName+" en "+ uitTeam.teamName);
		thuisTeam.makeElftal();
		uitTeam.makeElftal();
		try {
			thuisTeam.introElftal();
			uitTeam.introElftal();
		}catch(NotAllPlayersAreInException e){
			System.out.println("THE GAME CAN NOT BE PLAYED DUE TO INCOMPLETE TEAMS");
		}
	}	
	Wedstrijd(Team thuisTeam, Team uitTeam){
		System.out.println("It is decided that this game will be played in the future");		
		this.thuisTeam = thuisTeam;
		this.uitTeam = uitTeam;
	}
	void advertise() {
		System.out.println("Advertisement Buy your tickets");
	}	
}
class NotAllPlayersAreInException extends Exception{}


