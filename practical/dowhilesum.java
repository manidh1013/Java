

package corejava;

import java.util.Scanner;

public class dowhilesum {
	public static void main (String []args) {
		
		Scanner sc = new Scanner (System.in);
		
		int num =0 ,sum=0  	;
			do{
				sum += num;
				System.out.println("enter number:");
				num= sc.nextInt();
			
			}
		
			while (num>0);
			System.out.println("the sum of the no are="+sum);
			sc.close();
		
	}
}
