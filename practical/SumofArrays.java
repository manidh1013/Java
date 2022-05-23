package corejava;

import java.util.Scanner;

public class SumofArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.println("enter array length:");
		int len= scan.nextInt();
		
		int a[] = new int[len];
		System.out.println("enter"+len+"element to store in array\n");
		
		for(int i=0;i<len;i++) {
			a[i]=scan.nextInt();
			
		}
				int sum=0;
			for(int i=0;i<len;i++) {
				
				sum = sum + a[i];
				
			}	
	System.out.println("The Sum of All Elements in this Array = " + sum);
		
		
		
	}

}
