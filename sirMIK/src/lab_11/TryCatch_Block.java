package lab_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch_Block {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("Input a integer: ");
			int a = scan.nextInt();
			System.out.println("Your integer is : " + a);
		}
		catch(InputMismatchException e) {
			System.out.println("Input integer. The exception is :" + e);
		}
		finally {
			System.out.println("Program end");
		}

	}

}
