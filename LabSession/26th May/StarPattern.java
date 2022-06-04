package LabSession;

import java.util.Scanner;
// java program to print star pattern
public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating scanner object
				Scanner sc = new Scanner(System.in);

				System.out.println("Enter the size of the pattern");

				int n = sc.nextInt();
				// loop for printing row
				for (int i = 0; i < n; i++) {
					int spaces = n - i - 1;
					// lo0p for printing space
					for (int s = 0; s < spaces; s++) {
						System.out.print(" ");
					}
					int Num = i + 1;
					// loop for printing star
					for (int j = 0; j < Num; j++) {
						System.out.print("* ");
					}
					// printing new line
					System.out.println();
				}

			}

		}