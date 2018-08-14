package lab_11;

import java.lang.String;

public class Super_keyword_test extends Super_keyword{
	
	public String color = "Green";
	public static void main(String[] args) {
		Super_keyword_test c = new Super_keyword_test();
		c.col();

	}
	
	public void col() {		
		System.out.println(color);
		System.out.println(super.color);
	}

}
