package corejava;

import java.util.Scanner;

public class MultiDimUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of row: ");
		int r=sc.nextInt();
		
		System.out.println("enter number of column:");
		int c =sc.nextInt();
		
		int arr[][] = new int[r][c];
		System.out.println("enter element to store in array: \n");
		
		int i,j;
		for( i=0;i<r;i++)
		for( j=0;j<c;j++)
		arr[i][j]= sc.nextInt();
		
		
		System.out.println("elements of array are:");
		for(i=0;i<r;i++)
			{
			for(j=0;j<c;j++) 
				System.out.print(arr[i][j]+"  ");
			System.out.println();
				
		}
	
		
	}}