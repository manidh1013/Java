package corejava;

import java.util.Scanner;

public class breakcontinue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter i:");
		int a=scan.nextInt();
		
		for (int i=1; i<a;i++) {
			if (i==4) {
				continue;
			}
			else if (i==7) {
				break;
				
			}
			System.out.println(i);
		}
		
		
	}

}
