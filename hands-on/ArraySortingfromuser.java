package corejava;


import java.util.*;

public class ArraySortingfromuser {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter array length:");
		Integer len= sc.nextInt();
		
		Integer a[]= new Integer[len];
	
		System.out.println("enter"+len+"element to store in array");
		for(int i=0;i<len;i++) {
			a[i]= sc.nextInt();
		}
	 
		Arrays.sort(a);
		System.out.println("In Ascending Order Modified arr[] :"+ Arrays.toString(a));
		
		Arrays.sort(a, Collections.reverseOrder());
	
		System.out.println("In descending Order Modified arr[] : "+Arrays.toString(a));
		
		
	}}


