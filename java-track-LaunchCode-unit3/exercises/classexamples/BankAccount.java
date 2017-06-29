package classexamples;

public class BankAccount {
	
	private Integer balance;
	private double interestRate;
	
	public BankAccount(Integer balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public Integer getBalance() {
		return balance;
	}
	
	public double getinterestRate() {
		return interestRate;
	}
	
	public Integer add(Integer deposit) {
		this.balance += deposit;
		return balance;
	}
	
	public Integer subtract(Integer withdraw) {
		this.balance -= withdraw;
		return balance;
	}
	
	public Integer accrue() {
		add((int)(this.balance * this.interestRate));
		return balance;
	}
	
	public String toString() {
		return "Balance: " + balance + " @ Interest Rate: " + interestRate;
	}
	
	public static void main(String[] args) {
		
		BankAccount Acc1 = new BankAccount(450, 0.02);
		System.out.println(Acc1);
		Acc1.add(100);
		Acc1.accrue();
		System.out.println(Acc1);
		
	}

}
