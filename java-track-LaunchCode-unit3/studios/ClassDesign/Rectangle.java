package ClassDesign;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double len, double wid) {
		this.length = len;
		this.width = wid;
	}
	
	public double area() {
		return this.length * this.width;
	}
	
	public double perimeter() {
		return 2.0 * (this.length + this.width);
	}
	
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}
		else return false;
	}
	
	public String toString() {
		return "Width: "  + this.width + " Length: " + this.length; 
	}

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(20, 20);
		Rectangle rec2 = new Rectangle(10.2, 20);
		
		System.out.println(rec1);
		System.out.println("Area of Rectangle 1: " + rec1.area());
		System.out.println("Perimeter of Rectangle 1: " + rec1.perimeter());
		System.out.println("Is Rectangle 1 square? " + rec1.isSquare());
		
		System.out.println();
		
		System.out.println("Area of Rectangle 2: " + rec2.area());
		System.out.println("Perimeter of Rectangle 2: " + rec2.perimeter());
		System.out.println("Is Rectangle 2 square? " + rec2.isSquare());

	}

}
