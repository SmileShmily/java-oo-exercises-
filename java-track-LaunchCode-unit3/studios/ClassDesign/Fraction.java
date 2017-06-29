package ClassDesign;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int num, int den) {
		this.numerator = num;
		this.denominator = den;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public Fraction add(Fraction A) {
		int newNum = (this.numerator * A.getDenominator()) + (A.getNumerator() * this.denominator);
		int newDen = (this.denominator * A.getDenominator());
		return new Fraction(newNum, newDen);
	}
	
	public Fraction mul(Fraction A) {
		int newNum = (this.numerator * A.getNumerator());
		int newDen = (this.denominator * A.getDenominator());
		return new Fraction(newNum, newDen);
	}
	
	public Fraction reduce() {
		int common = gcd(this.numerator, this.denominator);
		return new Fraction(numerator/common, denominator/common);
	} 
	
	public Fraction reciprocal() {
		int newNum = this.denominator;
		int newDen = this.numerator;
		return new Fraction(newNum, newDen);
	}
	
	private static int gcd(int m, int n) {
		int newM, newN;
		if (m < n) {
			newM = n;
			newN = m;
		}
		else {
			newM = m;
			newN = n;
		}
		if (newM == 0 || newN == 0) return newM + newN;
		else return gcd(newN, (newM%newN));
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}

	public static void main(String[] args) {
		Fraction twoThirds = new Fraction(2,3);
		Fraction half = new Fraction(1,2);
		System.out.println(twoThirds);
		System.out.println(half);
		System.out.println(twoThirds.add(half));
		Fraction twoFourths = new Fraction(2,4);
		System.out.println(twoFourths.reduce());

	}

}
