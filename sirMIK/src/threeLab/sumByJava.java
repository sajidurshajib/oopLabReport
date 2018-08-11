package threeLab;

import java.util.*;

public class sumByJava {
	public static void main(String[] args) {
		int reInt = 1;
		while (reInt == 1) {
			// Restart loop
			pr(" [.::Program Started::.]");
			int lbnum = scanInt(" [+] Lab number : ");
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
				pr("\n");
				pr("[1] Consucative number ->");
				pr("[2] Summetion of Consucative number ->");
				pr("[3] Consucative number series ->");
				pr("[4] Factorial ->");
				pr("[5] Set power of a number ->");
				pr("[6] Print 1st fibonacci number ->");
				pr("[7] Star structure ->");
				
				pr("\n");
				int lbnum3 = scanInt("[+] Which program you want to see : ");
				if (lbnum3 == 1) {
					obj3.con();
				} else if (lbnum3 == 2) {
					obj3.conSum();
				} else if (lbnum3 == 3) {
					obj3.conSeries();
				} else if (lbnum3 == 4) {
					obj3.facTorial();
				}  else if (lbnum3 == 5) {
					obj3.pOw();
				} else if(lbnum3 == 6){
					obj3.fibo();
				} else if(lbnum3 == 7){
					obj3.star();
				}  else {
					pr("Wrong input!");
				}
			
			} else {
				pr("You input wrong number...!");
			}

			// Restart program code...
			String reStart = scanString("\n\n\t[#]Restart the program? y/n :");
			if (reStart.equals("y") || reStart.equals("Y")) {
				reInt = 1;
				pr("\n\n\n\t..::[Restart]::..\n\n\n");
			} else if (reStart.equals("n") || reStart.equals("N")) {
				reInt = 2;
				pr("\n\t..::[] Shutdown program []::..");
			}	
		}
	}

	public static void pr(Object yourString) {
		System.out.println(yourString);
	}

	public static void p(Object yourString) {
		System.out.print(yourString);
	}

	public static int scanInt(String textForInt) {
		System.out.print(textForInt);
		Scanner x = new Scanner(System.in);
		int y = x.nextInt();
		return y;
	}

	public static double scanDouble(String textForDouble) {
		System.out.print(textForDouble);
		Scanner x = new Scanner(System.in);
		double y = x.nextDouble();
		return y;
	}

	public static String scanString(String textForString) {
		System.out.print(textForString);
		Scanner x = new Scanner(System.in);
		String y = x.nextLine();
		return y;
	}
}
