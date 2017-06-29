package RobotPrep;

public class SpaceBot extends Robot{
	private boolean welder, repair;
	
	public SpaceBot(String name, int xPos, int yPos, int speed, String direction){
		super(name, xPos, yPos, speed, direction);
		this.welder = false;
		this.repair = false;
	}
	
	public void Weld(){
		this.welder = true;
		System.out.println("The bot has begun welding.");
	}
	
	public void StopWeld(){
		this.welder = false;
		System.out.println("The bot has finished the weld.");
	}
	
	public void Repairs(){
		this.repair = true;
		System.out.println("The bot has begun repairs.");
	}
	
	public void StopRepairs(){
		this.repair = false;
		System.out.println("The bot has finished repairs.");
	}
}
