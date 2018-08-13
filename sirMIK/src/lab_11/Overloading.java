package lab_11;

public class Overloading {

	public static void main(String[] args) {
		Overloading o = new Overloading();
		System.out.println(o.dimension(2, 3));
		System.out.println(o.dimension(2, 3,4));

	}
	
	public static int dimension(int a, int b) {
		int x = a*b;
		return x;
	}
	
	public static int dimension(int a, int b, int c) {
		int x = a*b*c;
		return x;
	}

}
