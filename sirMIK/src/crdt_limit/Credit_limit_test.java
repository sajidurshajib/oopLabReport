package crdt_limit;

import java.util.Scanner;

public class Credit_limit_test {

	public static void main(String[] args) {
		System.out.println("Credit limit calculator :) \n\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Account number: ");
		int accNum = sc.nextInt();
		
		System.out.print("Account balance: ");
		double balance = sc.nextDouble();
		
		System.out.print("Total charges: ");
		double charges = sc.nextDouble();
		
		System.out.print("Credit limit: ");
		double limit = sc.nextDouble();
		
		Credit cr = new Credit(charges,balance,limit);
		
		System.out.println("New balance: "+cr.getNewBalance());
		
		if(cr.getNewBalance() > limit) {
			System.out.println("[-] Credit limit exceded..!");
		}else {
			System.out.println("[+] Credit limit sufficient...(y) ");
		}
	}

}
