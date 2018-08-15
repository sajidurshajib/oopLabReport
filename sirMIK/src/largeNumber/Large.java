package largeNumber;

import java.util.Scanner;

public class Large {

	public static void main(String[] args) {
		int[] number = new int[10];
		int counter = 1;
		int largest = 0;
		Scanner x = new Scanner(System.in);
		
		for(counter = 0; counter <= 9; counter++) {
			System.out.print("["+counter+"]"+" = ");
			number[counter]= x.nextInt();
		}
		
		for(counter = 0; counter <= 9; counter++) {
			if(counter == 9) {
				if(number[counter]>largest) {
					largest = number[counter];
				}
				break;
			}
			if(number[counter] > largest) {
				largest = number[counter];
			}
		}
		
		System.out.println("Largest number is: "+largest);
	}

}
