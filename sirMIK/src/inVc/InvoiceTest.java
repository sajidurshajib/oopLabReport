package inVc;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invc =new Invoice("1","lol",2,3);
		println(invc.getNumber());
		
	}
	
	public static void println(Object x) {
		System.out.println(x);
	}
	
	public static void print(Object x) {
		System.out.println(x);
	}
}
