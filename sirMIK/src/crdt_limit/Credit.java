package crdt_limit;

public class Credit {
	private double charges;	
	private double balance;
	private double limit;
	
	public Credit() {
		this.charges = 0.0;		
		this.balance = 0.0;
		this.limit = 0.0;
	}
	
	public Credit(double crg, double bal, double lmt) {
		this.charges = crg;
		this.balance = bal;
		this.limit = lmt;
	}
	
	public double getNewBalance() {
		double newbal = (this.balance + this.charges) - this.limit; 
		return newbal;
	}

}
