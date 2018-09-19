/* 
Kacie Rae
9-10-18
a file to compute Exercise 2.23 cost of driving. 
*/

import java.util.Scanner;

class Exercise2point23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double ppg = input.nextDouble();
		
		double cost = (distance / mpg) * ppg;
		
		System.out.println (" The cost of driving is " + cost );
	}
}