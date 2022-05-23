package corejava;

import java.util.Scanner;

public class MatrixSubstraction {

	public static void main(String[] args) {
		
		//initializing array
		int i ,j;
		int [][] a= new int [3][3];
		int [][] b= new int [3][3];
		int [][] c= new int [3][3];

		//creating scanner class object
		Scanner s = new Scanner(System.in);
		
		//input for 1 matrix
		System.out.println("enter 9 elements for 1 matrix :");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				a[i][j]= s.nextInt();	
			}
			
		}
		
		//input for 2 matrix
		System.out.println("enter 9 elements for 1 matrix :");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				b[i][j]= s.nextInt();	
			}
			
		}
		
		//sub of 2 matrix
				System.out.println("the sub of 2 matrix are: ");
				for(i=0;i<3;i++) {
					for(j=0;j<3;j++) {
						c[i][j]= a[i][j]-b[i][j];
						System.out.print(c[i][j]+" "); 
						}
					System.out.println();
				}
				
				
	}

}