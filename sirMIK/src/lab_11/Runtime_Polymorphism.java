package lab_11;

public class Runtime_Polymorphism extends Runtime_test{
	public void test() {
		System.out.println("MIK");
	}
	public static void main(String[] args) {
		Runtime_test r = new Runtime_Polymorphism();
		r.test();
	}

}
