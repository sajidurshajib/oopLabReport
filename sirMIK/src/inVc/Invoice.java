package inVc;

public class Invoice {
	private String number;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice(){
		this.number = null;
		this.description = null;
		this.quantity = 0;
		this.price = 0.0;
	}
	
	public Invoice(String adminNumber, String adminDescription, int adminQuantity, double adminPrice) {
		this.number = adminNumber;
		this.description = adminDescription;
		this.quantity = adminQuantity;
		this.price = adminPrice;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	

}
