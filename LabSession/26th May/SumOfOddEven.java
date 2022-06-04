package LabSession;

import java.util.Arrays;
import java.util.Scanner;

//program to read a set of integers , and then prints the sum of even and odd  integers

public class SumOfOddEven {

	public static void main(String[] args) {
		//creating an object of scanner class

				Scanner sc = new Scanner(System.in);
				System.out.println("enter the  interger set ");
				//taking input from user
				int n = sc.nextInt();

				int[] arr = new int[n];
				for (int i = 0; i < arr.length; i++) {
					//taking input from user
					arr[i] = sc.nextInt();
				}
				// printing the array
				System.out.println("The set of Integer is " + Arrays.toString(arr));
				
				// creating variable
				int resultForEven = 0;
				int resultForodd = 0;
				for (int j = 0; j < arr.length; j++) {
					// adding elements of array depending on if they are odd or even
					if (arr[j] % 2 == 0) {
						resultForEven = resultForEven + arr[j];

					} else if (arr[j] % 2 != 0) {
						resultForodd = resultForodd + arr[j];
					}
				}
				// printing output
				System.out.println("Addition of even number is " + resultForEven);
				System.out.println("Addition of odd number is " + resultForodd);

			}

		}