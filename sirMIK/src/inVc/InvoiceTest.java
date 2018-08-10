package inVc;

import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		println("+----------------------------------+");
		println("|                                  |");
		println("|    Welcome to Invoice program    |");
		println("|                                  |");
		println("+----------------------------------+\n\n");
		
		Scanner x = new Scanner(System.in);
		
		print("Serial number    : ");
		String num = x.nextLine();
		
		print("Description      : ");
		String des = x.nextLine();
		
		print("Quantity         : ");
		int qun = x.nextInt();
		
		print("Price(per item)  : ");
		double prc = x.nextDouble();
		
		Invoice invc =new Invoice(num,des,qun,prc);
		
		println("\n\n");
		println("========= Output =========");
		
		println("Serial           : " + invc.getNumber());
		println("Description      : " + invc.getDescription());
		println("Quantity         : " + invc.getQuantity());
		println("Price(per item)  : " + invc.getPrice());
		println("-------------------------------");
		println("Total price      : " + invc.getTotalPrice());
		
		println("\n\n\n\n\nCoded by Sajidur\nHonor code.. :)\nDon't copy :p ");
	}
	
	public static void println(Object x) {
		System.out.println(x);
	}
	
	public static void print(Object x) {
		System.out.print(x);
	}
}
