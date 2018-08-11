package employee;

public class Employee {
	private String fname;
	private String lname;
	private double salary;
	
	public Employee() {
		this.fname = null;
		this.lname = null;
		this.salary = 0.0;
	}
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.fname = firstName;
		this.lname = lastName;
		this.salary = monthlySalary;
	}
	
	public String getFirstName() {
		return fname;
	}
	
	public String getLastName() {
		return lname;
	}
	
	public double getSalary() {
		if(salary <= 0) {
			return 0;
		}else {
			return salary;
		}
	}
}
