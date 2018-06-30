package sirMIK;

import java.util.*;

public class sumByJava {
	public static void main(String[] args) {

		int lbnum = scanInt("[+] Lab number : ");

		if (lbnum == 1) {
			Lab1 obj1 = new Lab1();
			pr("\n");
			pr("[1] Two integer calculation ->");
			pr("[2] Two number interchange ->");
			pr("[3] Reverse the number ->");
			pr("[4] Volume of Cylendar ->");
			pr("[5] Volume of Sphere ->");

			pr("\n");
			int lbnum1 = scanInt("[+] Which program you want to see : ");
			if (lbnum1 == 1) {
				obj1.twoNumber();
			} else if (lbnum1 == 2) {
				obj1.twoChange();
			} else if (lbnum1 == 3) {
				obj1.fiveDigit();
			} else if (lbnum1 == 4) {
				obj1.cyLendar();
			} else if (lbnum1 == 5) {
				obj1.spHere();
			} else {
				pr("Wrong input!");
			}
		} else if (lbnum == 2) {
			Lab2 obj2 = new Lab2();
			pr("\n");
			pr("[1] Even & Odd number finder ->");
			pr("[2] Positive & Negative number finder ->");
			pr("[3] Leap year program ->");
			pr("[4] Three number compare ->");
			pr("[5] GPA calculator ->");
			pr("[6] Right angle triangle program ->");

			pr("\n");
			int lbnum2 = scanInt("[+] Which program you want to see : ");
			if (lbnum2 == 1) {
				obj2.evenOdd();
			} else if (lbnum2 == 2) {
				obj2.pOn();
			} else if (lbnum2 == 3) {
				obj2.leapYear();
			} else if (lbnum2 == 4) {
				obj2.threeNumber();
			} else if (lbnum2 == 5) {
				obj2.GPA();
			} else if (lbnum2 == 6) {
				obj2.rightAngle();
			} else {
				pr("Wrong input!");
			}

		} else if (lbnum == 3) {
			Lab3 obj3 = new Lab3();
			// obj3.con();
			// obj3.conSum();
			// obj3.conSeries();
			// obj3.facTorial();
			// obj3.pOw();
		} else {
			pr("You input wrong number...!");
		}

	}

	public static void pr(Object yourString) {
		System.out.println(yourString);
	}

	public static int scanInt(String textForInt) {
		System.out.print(textForInt);
		Scanner x = new Scanner(System.in);
		int y = x.nextInt();
		return y;
	}

	public static String scanString(String textForString) {
		System.out.print(textForString);
		Scanner x = new Scanner(System.in);
		String y = x.nextLine();
		return y;
	}
}
