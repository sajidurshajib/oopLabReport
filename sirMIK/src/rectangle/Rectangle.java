package rectangle;

import java.util.Scanner;
import java.lang.*;

public class Rectangle {

	public static void main(String[] args) {
		System.out.println("..::|| Rectangle calculator ||::..\n");
		
		Scanner r = new Scanner(System.in);
		
		System.out.print("Length : ");
		double ln = r.nextDouble();		
		if(ln <= 0.0 || ln >= 20.0){
			System.out.println("\n[+]Length should be Larger than 0.0 and Less than 20.0");
			System.exit(0);
		}		
		
		System.out.print("Width : ");
		double wd = r.nextDouble();
		if(wd <= 0.0 || wd >= 20.0){
			System.out.println("\\n[+]Width should be Larger than 0.0 and Less than 20.0");
			System.exit(0);
		}
		
		if(ln < wd){
			System.out.println("\n[*] Width whould be less than length...");
			System.exit(0);
		}
		
		RectangleClass rec = new RectangleClass(ln,wd);
		
		System.out.println("\n[+] Area : " + rec.getArea());
		System.out.println("[-] Perimeter : " + rec.getPerimeter());
	}

}
