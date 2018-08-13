package lab_11;

public class Encapsulation {
	private int a;
	private int b;
	
	public void setA(int x) {
		this.a = x;
	}
	
	public void setB(int x) {
		this.b = x;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		
		e.setA(3);
		e.setB(4);
		
		System.out.println(e.getA());
		System.out.println(e.getB());

	}

}
