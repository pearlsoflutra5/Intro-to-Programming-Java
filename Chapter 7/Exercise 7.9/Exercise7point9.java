/* 
Kacie Rae
10-30-18
Exercise 7.9 Scanning through an array to find the smallest number. 
*/

import java.util.Scanner;

class Exercise7point9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		//first index in 0 and last is 9. 
		
		//code to populate the array.
		System.out.print("Enter 10 numbers with spaces in between ");
		for (int i = 0; i < numbers.length; i++ ) {
			numbers[i] = input.nextDouble();
		}
		System.out.println("");
		System.out.print("The mimimum value in the array is: " + min(numbers));		
	}
	
	public static double min(double[] list){
		double minDouble = list[0];
		for (int i = 1; i < list.length; i++){
			if (minDouble > list[i]){
				minDouble = list[i];
			}
		}
		return minDouble;
		
	}
	
}