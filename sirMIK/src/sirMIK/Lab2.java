package sirMIK;

import java.util.*;

public class Lab2 extends Lab1 {
	public void evenOdd() {
		int num;
		System.out.print("Input a number : ");
		Scanner n = new Scanner(System.in);
		num = n.nextInt();
		int result = num % 2;
		if (result == 0) {
			System.out.println("This number is Even.");
		} else {
			System.out.println("This number is Odd.");
		}
	}

	public void pOn() {
		int num;
		System.out.print("Input a number : ");
		Scanner n = new Scanner(System.in);
		num = n.nextInt();

		if (num > 0) {
			System.out.println("This is Positive number.");
		} else if (num < 0) {
			System.out.println("This is Negative number.");
		} else {
			System.out.println("This is Zero.");
		}
	}

	public void leapYear() {
		int year;
		System.out.print("Enter a year : ");
		Scanner y = new Scanner(System.in);
		year = y.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year.");
				} else {
					System.out.println(year + " is not a leap year.");
				}
			} else {
				System.out.println(year + " is a leap year.");
			}
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}

	public void threeNumber() {
		int a;
		int b;
		int c;

		System.out.print("First number : ");
		Scanner n1 = new Scanner(System.in);
		a = n1.nextInt();

		System.out.print("Second number : ");
		Scanner n2 = new Scanner(System.in);
		b = n2.nextInt();

		System.out.print("Third number : ");
		Scanner n3 = new Scanner(System.in);
		c = n3.nextInt();

		System.out.println("\n\n");

		if (a > b && a > c) {
			System.out.println(a + " is largest number.");
			if (b > c) {
				System.out.println(c + " is smallest number.");
			} else {
				System.out.println(b + " is smallest number.");
			}
		} else if (b > a && b > c) {
			System.out.println(b + " is largest number.");
			if (a > c) {
				System.out.println(c + " is smallest number.");
			} else {
				System.out.println(a + " is smallest number.");
			}
		} else if (c > a && c > b) {
			System.out.println(c + " is largest number.");
			if (b > a) {
				System.out.println(a + " is smallest number.");
			} else {
				System.out.println(b + " is smallest number.");
			}
		} else {
			System.out.println("Something is going wrong!");
		}
	}

	public void GPA() {
		System.out.print("Input your marks : ");
		Scanner x = new Scanner(System.in);
		int marks = x.nextInt();

		if (marks >= 80 && marks <= 100) {
			System.out.println("Your grade : A+");
		} else if (marks >= 70 && marks <= 79) {
			System.out.println("Your grade : A");
		} else if (marks >= 60 && marks <= 69) {
			System.out.println("Your grade : B+");
		} else if (marks >= 50 && marks <= 59) {
			System.out.println("Your grade : B");
		} else if (marks >= 40 && marks <= 49) {
			System.out.println("Your grade : C");
		} else if (marks < 40 && marks >= 0) {
			System.out.println("Your grade : F");
		} else {
			System.out.println("Invalid input");
		}
	}

	public void rightAngle() {
		int a;
		int b;
		int c;

		System.out.print("Input a : ");
		Scanner na = new Scanner(System.in);
		a = na.nextInt();

		System.out.print("Input b : ");
		Scanner nb = new Scanner(System.in);
		b = nb.nextInt();

		System.out.print("Input c : ");
		Scanner nc = new Scanner(System.in);
		c = nc.nextInt();

		if (a * a == b * b + c * c) {
			System.out.println("Possible equation : a*a = b*b + c*c");
		} else if (b * b == a * a + c * c) {
			System.out.println("Possible equation : b*b = a*a + c*c");
		} else if (c * c == a * a + b * b) {
			System.out.println("Possible equation : c*c = a*a + b*b");
		} else {
			System.out.println("Using this input impossible to create RightAngle Triangle.");
		}
	}

}
