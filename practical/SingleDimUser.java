package corejava;

import java.util.Scanner;

public class SingleDimUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length ;//length of the array
		Scanner scan= new Scanner(System.in);
	
		System.out.println("enter array length: ");
		length= scan.nextInt();
		
		int a[] = new int[length];
		System.out.println("enter"+length+"element to store in array\n");
		
		for(int i=0;i<length;i++) {
			
			a[i]= scan.nextInt();
					
		}
		System.out.println("elementa in array are: \n");
		for(int i=0;i<length;i++ ) {
			System.out.print(a[i]+"   ");
		}
		
	}

}
