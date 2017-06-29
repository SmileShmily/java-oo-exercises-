
public class Robot {
	
	// Names self-explanatory, orientation should be N, S, E, or W
	private String name;
	private int x;
	private int y;
	private int speed;
	private char orientation;

	// Constructor class with all variables
	public Robot(String name, int x, int y, int speed, char orientation) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.orientation = orientation;
	}
	
	// Gets the x coordinate of a robot
	public int getX() {
		return x;
	}
	
	// Gets the y coordinate of a robot
	public int getY() {
		return y;
	}
	
	public int move(int time) {
		int d = time * speed;
		
		if (orientation == 'N' || orientation == 'n') {
			y += d;
			return y;
		}
		else if (orientation == 'S' || orientation == 's') {
			y -= d;
			return y;
		}
		else if (orientation == 'E' || orientation == 'e') {
			x += d;
			return x;
		}
		else if (orientation == 'W' || orientation == 'w') {
			x -= d;
			return x;
		}
		else return 0; // need to correct this
	}
	
	// Robot turns to the left 90 degrees
	public void rotateLeft() {
		switch (orientation) {
			case 'N': orientation = 'W';
				break;
			case 'n': orientation = 'W';
				break;
			case 'E': orientation = 'N';
				break;
			case 'e': orientation = 'N';
				break;
			case 'S': orientation = 'E';
				break;
			case 's': orientation = 'E';
				break;
			case 'W': orientation = 'S';
				break;
			case 'w': orientation = 'S';
				break;
			default: orientation = '?';
		}
	}

	// Robot turns to the right 90 degrees
	public void rotateRight() {
		switch (orientation) {
			case 'N': orientation = 'E';
				break;
			case 'n': orientation = 'E';
				break;
			case 'E': orientation = 'S';
				break;
			case 'e': orientation = 'S';
				break;
			case 'S': orientation = 'W';
				break;
			case 's': orientation = 'W';
				break;
			case 'W': orientation = 'N';
				break;
			case 'w': orientation = 'N';
				break;
			default: orientation = '?';
		}
	}

	//
	public double distance(Robot B) {
		return Math.sqrt(Math.pow(x - B.getX(), 2) + Math.pow(y - B.getY(), 2));
	}
	
	public String toString() {
		return "Name: " + this.name + " X-coordinate: " + this.x + " Y-coordinate: " + this.y + " Speed: " + this.speed
				+ " Orientation: " + this.orientation;
	}

	public static void main(String[] args) {
		Robot bob = new Robot("Bob", 40, -80, 25, 'N');
		Robot alice = new Robot("Alice", -1, 5, 10, 'S');
		
		System.out.println( bob );
		System.out.println( alice );
		System.out.println("Bob is " + bob.distance(alice) + " units from Alice.");
		
		bob.rotateLeft();
		bob.move(2);
		System.out.println( bob );
		System.out.println("Bob is " + bob.distance(alice) + " units from Alice.");
		
	}

}
