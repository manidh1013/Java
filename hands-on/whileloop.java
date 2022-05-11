package corejava;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int a = sc.nextInt();
		
		int i;
		i=1;
		while(i<=10) {
			System.out.println(a+"*"+i+"="+a*i);
			i++;
		}
		
	}

}
