package sales_commision;

import java.util.Scanner;

public class Commision {
	public static void main (String args[])    {
	    
	     double earning;
	     String item;
	     double total=0;
	           
	         
	    Scanner input = new Scanner (System.in);
	    System.out.print("Enter the name of the Item: ");
	    item=input.nextLine();
	  
	    System.out.print("Enter the value of the item: ");
	    total = input.nextDouble();    
	   	     
	    System.out.println();
	     
	    earning = 200 + (((9*total)/100));
	    System.out.println("You have earned :" + earning);
	   
	   
	 
	}

}
