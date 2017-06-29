package RobotPrep;

public class Robot {
	private String name, direction;
	private int xPos, yPos, speed;
	
	public Robot(String name, int xPos, int yPos, int speed, String direction){
		this.name = name;
		this.xPos = xPos;
		this.yPos = yPos;
		this.speed = speed;
		this.direction = direction;
	}
	
	public void Move() {
		switch(this.direction){
		case "North": this.yPos+=this.speed;
					  break;
		case "East": this.xPos+=this.speed;
					 break;
		case "South": this.yPos-=this.speed;
					   break;
		case "West": this.xPos-=this.speed;
					 break;
		default: System.out.println("That is an invalid direction.");
				 break;
		}
	}
	
	public void Rotate(String rotation) {
		switch(rotation){
		case "Right": if(this.direction.equals("North")){
				this.direction = "East";
				return;
			}else if(this.direction == "East"){
				this.direction = "South";
				return;
			}else if(this.direction == "South"){
				this.direction = "West";
				return;
			}else if(this.direction == "West"){
				this.direction = "North";
				return;
			}
			break;
		case "Left": if(this.direction.equals("North")){
				this.direction = "West";
				return;
			}else if(this.direction == "East"){
				this.direction = "North";
				return;
			}else if(this.direction == "South"){
				this.direction = "East";
				return;
			}else if(this.direction == "West"){
				this.direction = "South";
				return;
			}
			break;
		default: System.out.println("That is an invalid rotation direction.");
		 		 break;
		}
	}
	
	public double Distance(Robot r){
		double xDelta = Math.pow(this.xPos - r.getxPos(), 2);
		double yDelta = Math.pow(this.yPos - r.getyPos(), 2);
		double dist = Math.sqrt(xDelta + yDelta);
		return dist;
	}

	public String toString() {
		return "Name: " + name + ", Position: " + "(" + xPos + ", " + yPos + "), " +
				"Speed: " + speed + ", Direction: " + direction;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getPos() {
		return "(" + xPos + ", " + yPos + ")";
	}
	
	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Robot r = new Robot("Chappy", 5, 5, 10, "North");
		r.Rotate("Left");
		r.Rotate("Left");
		r.Move();
		System.out.println(r.toString());
	}
}
