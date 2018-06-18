package sirMIK;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab1 {
	protected double py = 3.1416;
	protected DecimalFormat df2 = new DecimalFormat(".##");
	
	public void twoNumber() {
		System.out.println("[+] Input 2 number. Where 1st_number > 2nd_number\n");
		System.out.print("[*] First number : ");
		Scanner firstInput = new Scanner(System.in);
		int firstVar = firstInput.nextInt();
		
		System.out.print("[*] Second number : ");
		Scanner secondInput = new Scanner(System.in);
		int secondVar = secondInput.nextInt();
		
		
		System.out.println("\n");		
		int sum = firstVar + secondVar;
		System.out.println("[=] Addition of two numbers = " + sum);
		
		int sub = firstVar - secondVar;
		System.out.println("[=] Subtraction of two numbers = " + sub);
		
		int multi = firstVar * secondVar;
		System.out.println("[=] Subtraction of two numbers = " + multi);
		
		double div = firstVar/secondVar;
		System.out.println("[=] Division first number by second = " + div);
		
		double mod = firstVar%secondVar;
		System.out.println("[=] Division first number by second = " + mod);
	}
	public void twoChange() {
		int c;
		int d;
		
		System.out.print("Input as C : ");
		Scanner cInput = new Scanner(System.in);
		c = cInput.nextInt();
		System.out.print("Input as D : ");
		Scanner dInput = new Scanner(System.in);
		d = dInput.nextInt();
		
		System.out.println("\nC = " + c);
		System.out.println("D = " + d);
		
		System.out.println("\nInterchange using variable : ");
		int a = 0;
		a = c;
		c = d;
		d = a;
		System.out.println("\nC = " + c);
		System.out.println("D = " + d);
		
		System.out.println("\nInterchange without variable : Incomplete");
					
	}
	public void fiveDigit() {
		System.out.print("Inpt 5 digit number : ");
		int x;
		Scanner lol = new Scanner(System.in);
		x = lol.nextInt();
		
		int y ;
		int f = 0;
		System.out.print("Reversed number : ");
		while(x != 0) {
			y = x%10;
			System.out.print(y);  
			f = f + y;
			x = x/10;
		}
		System.out.println("\nSum : " + f);
	}
	public void cyLendar() {
		int height;
		int radius;
		double f;
		
		System.out.println("Cylendar volume : ");
		System.out.print("\nInput height : ");
		Scanner h = new Scanner(System.in);
		height = h.nextInt();
		System.out.print("Input radius : ");
		Scanner r = new Scanner(System.in);
		radius = r.nextInt();
		
		f = py * (radius*radius) * height;
		System.out.println("Cylender volume = " + df2.format(f));
		
		
	}
	public void spHere() {
		System.out.println("Sphere =>\n\n");
		System.out.print("Input radius : ");
		Scanner r = new Scanner(System.in);
		double radius = r.nextDouble();
		
		double area = 4 * py *(radius * radius);
		System.out.println("Area : " + df2.format(area));
		
		double volume = (4/3) * py * (radius*radius*radius);
		System.out.println("Volume : " + df2.format(volume));
	}
	
}
