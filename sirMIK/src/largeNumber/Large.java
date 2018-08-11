package largeNumber;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		int number;
		int counter = 1;
		int largest = 0;
		Scanner x = new Scanner(System.in);
		
		System.out.println("Input 10 number ==>\n");
		while(counter <= 10) {
			System.out.print("["+counter+"] "+"number = ");
			number = x.nextInt();
			
			if(largest <= number) {
				largest = number;
			}
			
			counter++;
		}
		
		System.out.println("The largest number is : " + largest);

	}

}
