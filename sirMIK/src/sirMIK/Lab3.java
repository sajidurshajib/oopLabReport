package sirMIK;

public class Lab3 extends sumByJava {
	private int sum = 0;

	public void con() {
		int con = scanInt("\nHow many consecutive number you want : ");
		int n = 1;
		while (n <= con) {
			p(n + "  ");
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
		pr("\t|                                 |");
		pr("\t|    Choose consecutive series    |");
		pr("\t|    [1] 2+4+6+ … + n             |");
		pr("\t|    [2] 3+6+9+ … + n             |");
		pr("\t|    [3] 1^2 +2^2 +3^2 + … + n^2  |");
		pr("\t|    [4] 1^2 +3^2 +5^2 + … + n^2  |");
		pr("\t|                                 |");
		pr("\t+---------------------------------+");
		pr("\n");

		int choose = scanInt("\t[+] Choose series : ");

		if (choose == 1) {
			int n;
			int s = 2;
			int i = 1;
			int f = 0;
			n = scanInt("\tInput n : ");

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
			n = scanInt("\tInput n : ");

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
			n = scanInt("\tInput n : ");

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
			n = scanInt("\tInput n : ");

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
		int num = scanInt("Input number : ");

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
		int num = scanInt("Input number : ");
		int power = scanInt("Input power : ");
		
		int inc = 1;
		int fnum = num;
		while(inc < power) {
			fnum = fnum * num;
			inc =inc + 1;
		}
		pr("The output of " + num + "^" + power + " = " + fnum);
	}
	
	public void fibo() {
		int icount = scanInt("How many : ");
		int n = 2;
		int fibo = 0;
		int f0 = 0;
		int f1 = 1;
		
		p(f0 + "    "+f1+"    ");
		while(icount > n) {
			fibo = f0 + f1;
			f0 = f1;
			f1 = fibo;
			n += 1;
			p(fibo +"    ");
		}
	}
	
	public void star() {
		// i, ic, k, a, ma, b, ba, c, ca, d, da
		int countStar = scanInt("How many star for column : ");
		int countBox = countStar;
		int countNum = countStar;
		int i = 1;
		int ic = 1;
		
		// ----------- 1st --------------//
		pr("\n");
		while(countStar >= i) {
			ic = 1;
			p("\n");
			while(i >= ic) {
				p("*");	
				ic = ic + 1;
			}
			i = i + 1;		
		}
		
		pr("\n\n");
		
		// ----------- 2nd --------------//
		int j = 1;
		while(countStar > 0) {
			p("\n");
			j = 1;
			while(countStar >= j) {
				p("*");
				j += 1;
			}
			countStar = countStar - 1;
		}
		
		pr("\n\n");
		
		// ----------- 3rd -------------//
		
		int a = 1;
		int fa = 1;
		while(countBox >= a) {
			
			if(a == 1) {
				while(countBox >= fa) {
					p("* ");
					fa += 1;
				}
				p("\n");
			}	
			
			int ma = 1;
			if(countBox >= a+1 || countBox >= countBox-1) {
				p("*");
				while(countBox*2-3 >= ma) {
					p(" ");
					ma += 1;
				}
				p("*");
			}	
			
			p("\n");
			if(a == countBox) {
				fa = 1;
				while(countBox >= fa) {
					p("* ");
					fa += 1;
				}
			}
			a += 1;
		}
		
		// ------------- 4th ------------//
		pr("\n");
		
		int b = 1;
		int ba = 1;
		while(countNum >= b) {
			ba = 1;
			while(b >= ba) {
				p(b);
				ba += 1;
			}
			p("\n");
			b += 1;
		}
		
		// --------------- 5th ------------//
		pr("\n");
		
		int c = 1;
		int ca = 1;
		while(countNum >= c) {
			ca = 1;
			while(c >= ca) {
				p(ca);
				ca += 1;
			}
			p("\n");
			c += 1;
		}
		
		// --------------- 6th -------------//
		pr("\n");
		
		int d = 1;
		int da = countNum;
		
		while(countNum >= d) {
			while(1 <= da) {
				p(da);
				da -= 1;
			}
			da = countNum;
			da = da - d;
			p("\n");
			d += 1;
		}
		
	}

}
