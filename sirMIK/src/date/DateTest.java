package date;

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.print("Date : ");
		int d = x.nextInt();
		System.out.print("Month : ");
		int m = x.nextInt();
		System.out.print("Year : ");
		int y = x.nextInt();
		System.out.println("\n\n");
		
		
		Date l = new Date(d,m,y);
		
		displayDate(l.getDay(), l.getMonth(), l.getYear());
		

	}
	
	public static void displayDate(int date, int month, int year) {
		if(date == 0 || month == 0 || year == 0) {
			System.out.println("Invalid...!!!");
			if(date==0) {
				System.out.println("This date not valid in calender");
			}
			else if(month == 0) {
				System.out.println("Month not exist in calender");
			}
			else if(year == 0) {
				System.out.println("Negetive year never exist...");
			}
		}else {
			System.out.println(date +" / "+ month +" / "+ year);
		}
	}

}
