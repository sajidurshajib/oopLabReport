package sirMIK;

import java.util.*;

public class Lab3 extends sumByJava {
	private int sum = 0;

	public void con() {
		int con = scanInt("\nHow many consecutive number you want : ");
		int n = 1;
		while (n <= con) {
			System.out.print(n + "  ");
			n += 1;
			sum = sum + n;
		}
	}

	public void conSum() {
		this.con();
		pr("\nSum : " + sum);
	}

	public void conSeries() {
		pr("\n");
		pr("\t+---------------------------------+");
		pr("\t|    Choose consecutive series    |");
		pr("\t|    [1] 2+4+6+ … + n             |");
		pr("\t|    [2] 3+6+9+ … + n             |");
		pr("\t|    [3] 1^2 +2^2 +3^2 + … + n^2  |");
		pr("\t|    [4] 1^2 +3^2 +5^2 + … + n^2  |");
		pr("\t+---------------------------------+");
		pr("\n");

		System.out.print("\t[+] Choose series : ");
		Scanner ch = new Scanner(System.in);
		int choose = ch.nextInt();

		if (choose == 1) {
			int n;
			int s = 2;
			int i = 1;
			int f = 0;
			System.out.print("\tInput n : ");
			Scanner nn = new Scanner(System.in);
			n = nn.nextInt();

			while (n >= i) {
				f = f + s;
				s += 2;
				i += 1;
			}
			pr("\tSum of this consecutive number : " + f);
		} else if (choose == 2) {
			int n;
			int s = 3;
			int i = 1;
			int f = 0;
			System.out.print("\tInput n : ");
			Scanner nn = new Scanner(System.in);
			n = nn.nextInt();

			while (n >= i) {
				f = f + s;
				s += 3;
				i += 1;
			}
			pr("\tSum of this consecutive number : " + f);
		} else if (choose == 3) {
			int n;
			int s = 1;
			int ns = 1;
			int i = 1;
			int f = 0;
			System.out.print("\tInput n : ");
			Scanner nn = new Scanner(System.in);
			n = nn.nextInt();

			while (n >= i) {
				f = f + ns;
				s += 1;
				ns = s * s;
				i += 1;
			}
			pr("\tSum of this consecutive number : " + f);
		} else if (choose == 4) {
			int n;
			int s = 1;
			int ns = 1;
			int i = 1;
			int f = 0;
			System.out.print("\tInput n : ");
			Scanner nn = new Scanner(System.in);
			n = nn.nextInt();

			while (n >= i) {
				f = f + ns;
				s += 2;
				ns = s * s;
				i += 1;
			}
			pr("\tSum of this consecutive number : " + f);
		} else {
			pr("Invalid input :( Try again...");
		}
	}

	public void facTorial() {
		System.out.print("Input number : ");
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();

		int f = num;
		while (num != 0) {
			num = num - 1;
			if (num == 0) {
				break;
			}

			f = f * num;
		}
		pr("Factorial : " + f);
	}

	public void pOw() {
		System.out.print("Input number : ");
		Scanner x = new Scanner(System.in);
		int num = x.nextInt();

		System.out.print("Input power : ");
		Scanner y = new Scanner(System.in);
		int power = y.nextInt();

		pr("The output of " + num + "^" + power + " = " + Math.pow(num, power));
	}

}
