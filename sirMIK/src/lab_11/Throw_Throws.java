package lab_11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw_Throws {
	public static int div(int a, int b) throws ArithmeticException {
		  if(b == 0) {
		    throw new ArithmeticException("Division by Zero");
		  } else {
		    return a / b;
		  }
		}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input 1st number: ");
		int a = scan.nextInt();
		
		System.out.print("Input 2nd number: ");
		int b = scan.nextInt();
		
		try {
			int c = div(a,b);
			System.out.println("Div: " + c);
		}
		catch(ArithmeticException e){
			System.out.println("Exception: "+ e);
		}

	}

}
