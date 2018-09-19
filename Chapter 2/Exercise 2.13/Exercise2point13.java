/* 
Kacie Rae
9-10-18
a file to compute Exercise 1.13 compount value of savings. 
*/

import java.util.Scanner;

class Exercise2point13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter original amount put into savings: ");
		// you can also make (1 + .00417) a final double (static amount).
		double savings = input.nextDouble();
		double firstMonth = savings * ( 1 + .00417);
		double secondMonth = firstMonth * ( 1 + .00417);
		double thirdMonth = secondMonth * ( 1 + .00417);
		double fourthMonth = thirdMonth * ( 1 + .00417);
		double fifthMonth = fourthMonth * ( 1 + .00417);
		double sixthMonth = fifthMonth * ( 1 + .00417);
		
		System.out.println ("The value of your money after 6 months is " + sixthMonth);
		
		
	}
}