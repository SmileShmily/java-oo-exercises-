package ClassDesign;

public class BaseballPlayer {
	
	private String name;
	private Integer jersey;
	private char bats;
	private char fields;
	private Integer total_games;
	private Integer total_hits;
	private Integer total_rbi;
	private Integer total_runs;
	
	public BaseballPlayer(String name, Integer jersey, char bats, char fields) {
		this.name = name;
		this.jersey = jersey;
		this.bats = bats;
		this.fields = fields;
		total_games = 0;
		total_hits = 0;
		total_rbi = 0;
		total_runs = 0;
	}
	
	public void gamePlayed(Integer hits, Integer rbi, Integer runs) {
		this.total_games++;
		this.total_hits += hits;
		this.total_rbi += rbi;
		this.total_runs += runs;
	}
	
	public String toString() {
		return name + " has " + total_hits + " hits, " + total_rbi + " RBIs, and " + total_runs + " runs "
				+ " in " + total_games + " games played.";
	}

	public static void main(String[] args) {
		BaseballPlayer molina = new BaseballPlayer("Yadier Molina", 4, 'R', 'R');
		System.out.println("Molina's bats " + molina.bats + " and fields " + molina.fields);
		System.out.println(molina);
		
		molina.gamePlayed(2, 1, 0);
		System.out.println(molina);
	}

}
