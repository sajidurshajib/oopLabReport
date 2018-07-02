package sirMIK;

public class Lab2 extends sumByJava {
	public void evenOdd() {
		int num = scanInt("\nInput a number : ");
		int result = num % 2;
		if (result == 0) {
			pr("This number is Even.");
		} else {
			pr("This number is Odd.");
		}
	}

	public void pOn() {
		int num = scanInt("\nInput a number : ");
		if (num > 0) {
			pr("This is Positive number.");
		} else if (num < 0) {
			pr("This is Negative number.");
		} else {
			pr("This is Zero.");
		}
	}

	public void leapYear() {
		int year = scanInt("\nEnter a year : ");;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					pr(year + " is a leap year.");
				} else {
					pr(year + " is not a leap year.");
				}
			} else {
				pr(year + " is a leap year.");
			}
		} else {
			pr(year + " is not a leap year.");
		}
	}

	public void threeNumber() {
		int a = scanInt("\nFirst number : ");
		int b = scanInt("Second number : ");
		int c = scanInt("Third number : ");

		pr("\n\n");

		if (a > b && a > c) {
			pr(a + " is largest number.");
			if (b > c) {
				pr(c + " is smallest number.");
			} else {
				pr(b + " is smallest number.");
			}
		} else if (b > a && b > c) {
			pr(b + " is largest number.");
			if (a > c) {
				pr(c + " is smallest number.");
			} else {
				pr(a + " is smallest number.");
			}
		} else if (c > a && c > b) {
			pr(c + " is largest number.");
			if (b > a) {
				pr(a + " is smallest number.");
			} else {
				pr(b + " is smallest number.");
			}
		} else {
			pr("Something is going wrong!");
		}
	}

	public void GPA() {
		int marks = scanInt("\nInput your marks : ");

		if (marks >= 80 && marks <= 100) {
			pr("Your grade : A+");
		} else if (marks >= 70 && marks <= 79) {
			pr("Your grade : A");
		} else if (marks >= 60 && marks <= 69) {
			pr("Your grade : B+");
		} else if (marks >= 50 && marks <= 59) {
			pr("Your grade : B");
		} else if (marks >= 40 && marks <= 49) {
			pr("Your grade : C");
		} else if (marks < 40 && marks >= 0) {
			pr("Your grade : F");
		} else {
			pr("Invalid input");
		}
	}

	public void rightAngle() {
		int a = scanInt("\nInput a : ");
		int b = scanInt("Input b : ");
		int c = scanInt("Input c : ");

		if (a * a == b * b + c * c) {
			pr("Possible equation : a*a = b*b + c*c");
		} else if (b * b == a * a + c * c) {
			pr("Possible equation : b*b = a*a + c*c");
		} else if (c * c == a * a + b * b) {
			pr("Possible equation : c*c = a*a + b*b");
		} else {
			pr("Using this input impossible to create RightAngle Triangle.");
		}
	}

}
