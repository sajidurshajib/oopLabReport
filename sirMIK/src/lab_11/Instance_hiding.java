package lab_11;

public class Instance_hiding {

	private int inst = 50;
	public void Check() {
		System.out.print(this.inst); //this keyword use here...
	}
	
	public static void main(String[] args) {
		Instance_hiding c = new Instance_hiding();
		
		System.out.print("Instant hidden value = ");
		c.Check();
	}

}
