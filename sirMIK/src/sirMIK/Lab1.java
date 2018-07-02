package sirMIK;

import java.text.DecimalFormat;

public class Lab1 extends sumByJava {
	protected double py = 3.1416;
	protected DecimalFormat df2 = new DecimalFormat(".##");

	public void twoNumber() {
		pr("[+] Input 2 number. Where 1st_number > 2nd_number\n");
		int firstVar = scanInt("[*] First number : ");
		int secondVar = scanInt("[*] Second number : ");

		pr("\n");
		int sum = firstVar + secondVar;
		pr("[=] Addition of two numbers = " + sum);

		int sub = firstVar - secondVar;
		pr("[=] Subtraction of two numbers = " + sub);

		int multi = firstVar * secondVar;
		pr("[=] Subtraction of two numbers = " + multi);

		double div = firstVar / secondVar;
		pr("[=] Division first number by second = " + div);

		double mod = firstVar % secondVar;
		pr("[=] Division first number by second = " + mod);
	}

	public void twoChange() {
		int c = scanInt("\nInput as C : ");
		int d = scanInt("Input as D : ");

		pr("\nC = " + c);
		pr("D = " + d);

		pr("\nInterchange using variable : ");
		int a = 0;
		a = c;
		c = d;
		d = a;
		pr("\nC = " + c);
		pr("D = " + d);

		pr("\nInterchange without extra variable : ");

		c = c + d;
		d = c - d;
		c = c - d;

		pr("\nC = " + c);
		pr("D = " + d);
	}

	public void fiveDigit() {
		int x = scanInt("\nInpt 5 digit number : ");
		int y;
		int f = 0;
		p("Reversed number : ");
		while (x != 0) {
			y = x % 10;
			p(y);
			f = f + y;
			x = x / 10;
		}
		pr("\nSum : " + f);
	}

	public void cyLendar() {
		pr("\nCylendar volume : ");
		int height = scanInt("\nInput height : ");
		int radius = scanInt("Input radius : ");
		double f;
		f = py * (radius * radius) * height;
		pr("Cylender volume = " + df2.format(f));

	}

	public void spHere() {
		pr("\nSphere =>\n\n");
		double radius = scanDouble("Input radius : ");

		double area = 4 * py * (radius * radius);
		pr("Area : " + df2.format(area));

		double volume = (4 / 3) * py * (radius * radius * radius);
		pr("Volume : " + df2.format(volume));
	}

}
