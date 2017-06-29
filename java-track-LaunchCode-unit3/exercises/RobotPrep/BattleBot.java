package RobotPrep;

public class BattleBot extends Robot{
	private String weapon;
	
	public BattleBot(String name, int xPos, int yPos, int speed, String direction, String weapon){
		super(name, xPos, yPos, speed, direction);
		this.weapon = weapon;
	}
	
	public void Attack(){
		System.out.println("The bot attacks ith it's " + weapon + "!");
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
}
