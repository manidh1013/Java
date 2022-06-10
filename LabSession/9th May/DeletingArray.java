package LabSession;
/*
 program to delete the repeated elements in an array.
When a letter is deleted,the remaining letters are moved one position to fill in the gap.
The program must contain a static method called deleteRepeats(char[])
This method will have 1 parameter of the typr char[].
This method should return the size of the array after deleting the duplicate element from the array that is passed to this method.
Use Scanner to provide Input of character array elements.
The size of character array should be 4.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class DeletingArray {
	//creating static variables
	public static Character[] k;
	
	public static void main(String[] args) throws Exception {
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		//creating char array
		char[] arr= new char[4];
		System.out.println("Array before deleting duplicate:");
		//for traversing the array and taking input 
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
			System.out.println("a["+i+"]="+arr[i]);
		}
		//printing values
		System.out.println("size:"+arr.length);
		System.out.println("Array after deleting duplicates:");
		int size=deleteRepeats(arr);
		//for printing array after deleting duplicates
		for(int i=0;i<size;i++) {
		 System.out.println("a["+i+"]= "+ k[i]);
		}
		//for printing size after deleting duplicate
		 System.out.println("Final size:"+ k.length);
	}
		 public static int deleteRepeats(char[] arr) {
			ArrayList<Character>lis = new ArrayList<Character>();
			for(int i=0;i<arr.length;i++) {
				if(lis.contains(arr[i])) {
					continue;
				}
				else {
					lis.add(arr[i]);
					
				}
			}
			k= new Character[lis.size()];
			k=lis.toArray(k);
			return k.length;
		}}	
	
