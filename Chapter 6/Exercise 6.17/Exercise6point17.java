/*
Kacie Rae
10-10-18
Exercise 6.17 Displaying a matrix of 1 and 0. 
*/

import java.util.Scanner;

class Exercise6point17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = input.nextInt();
		
		// code for calling a method to print matrix.
		printMatrix(n);
		
	}// end of main method
	
	public static void printMatrix(int n) {
		int lineNumber = 0;
		for (int r = 1; r <= n; r++) { //loop for rows 
			for (int c = 1; c <= n; c++) { // loop for columns
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
		
	
	}
}