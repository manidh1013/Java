package corejava;

import java.util.Scanner;

public class RelationalOpScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int num1, num2 ;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("num1:");
		num1= scan.nextInt();
		
		System.out.println("num2:");
		num2 = scan.nextInt();
		
		
		  //is equal to
		  System.out.println("num1 == num2 = " + (num1 == num2) );
		  //is not equal to
		  System.out.println("num1 != num2 = " + (num1 != num2) );
		  //Greater than
		  System.out.println("num1 >  num2 = " + (num1 >  num2) );
		  //Less than
		  System.out.println("num1 <  num2 = " + (num1 <  num2) );
		  //Greater than or equal to
		  System.out.println("num1 >= num2 = " + (num1 >= num2) );
		  //Less than or equal to
		  System.out.println("num1 <= num2 = " + (num1 <= num2) );
		
		
	}

}
