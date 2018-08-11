package employee;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		println("+-----------------+");
		println("|                 |");
		println("|   SalarySheet   |");
		println("|                 |");
		println("+-----------------+");
		
		println("\n1st employee =>\n");
		print("First name : ");
		String firstName1 = x.nextLine();		
		print("Last name : ");
		String lastName1 = x.nextLine();		
		print("Salary : ");
		double mSalary1 = x.nextDouble();
		
		//Taking 1st salary can't take 2nd first name that's why I use lol
		String lol = x.nextLine();
		//consume newLine
		
		println("\n\n2nd employee =>\n");
		print("First name : ");
		String firstName2 = x.nextLine();		
		print("Last name : ");
		String lastName2 = x.nextLine();		
		print("Salary : ");
		double mSalary2 = x.nextDouble();
		
		
		Employee emp1 = new Employee(firstName1,lastName1,mSalary1);
		Employee emp2 = new Employee(firstName2,lastName2,mSalary2);
		
		println("\n\n");
		println(emp1.getFirstName() +" "+ emp1.getLastName() + " Yearly salary = "+yearlySalary(emp1.getSalary()));
		println(emp2.getFirstName() +" "+ emp2.getLastName() + " Yearly salary = "+yearlySalary(emp2.getSalary()));
		
		println("\n\nAfter increase 10%\n");
		println(emp1.getFirstName() +" "+ emp1.getLastName() + " Yearly salary = "+percent10add(yearlySalary(emp1.getSalary())));
		println(emp2.getFirstName() +" "+ emp2.getLastName() + " Yearly salary = "+percent10add(yearlySalary(emp2.getSalary())));
		
	}
	
	public static double yearlySalary(double y) {
		double z = y *12;
		return z;
	}
	public static double percent10add(double a) {
		double b = (a/10)*100;
		double c = a + b;
		return c;
	}
	
	public static void println(Object x) {
		System.out.println(x);
	}
	
	public static void print(Object x) {
		System.out.print(x);
	}
}
