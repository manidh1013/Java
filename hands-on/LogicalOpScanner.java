package corejava;

import java.util.Scanner;

public class LogicalOpScanner {

	public static void main(String[] args) {
		
		int a , b, c,d ;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("value of a:");
		a = scan.nextInt();
		
		System.out.println("value of b :");
		b = scan.nextInt();

		System.out.println("value of c:");
		c = scan.nextInt();
	
		System.out.println("value of d:");
		d=scan.nextInt();
		//and operator &&
		if((a<b) && (b==c)) {

			d=a+b+c;
			System.out.println("Sum is: " + d);
			}

			else
			System.out.println("False Condition");
		
		
		//or operator
		if( a>b || c==d ) {
			System.out.println("One or both" + " the conditions are true");}
		else
			{
			System.out.println("Both the" + " conditions are false");
			
			}
		
		// not operator
		System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
	}	

}
