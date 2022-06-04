package LabSession;

import java.util.Arrays;
import java.util.Scanner;

//java program to remove particular element from an array

public class RemovingElement {
	public static void main(String[] args) {
		
		//creating a scanner class oject	
		Scanner scan = new Scanner(System.in);
	
		int length ;//length of the array
		System.out.println("enter array length:");
		length= scan.nextInt();
		
		//array declaration
		int arr[]= new int[length];
		System.out.println("Enter the elements of the array :");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println("Original Array : " + Arrays.toString(arr));
	
		int removelement = 1;
		for (int i = removelement; i <arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		//after the removal, the last and second last element in the array will exist twice
		 System.out.println("After removing the second element: "+Arrays.toString(arr));
	}
	

}
