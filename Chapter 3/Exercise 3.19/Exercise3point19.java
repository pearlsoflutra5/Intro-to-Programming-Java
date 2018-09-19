/*
Kacie Rae Cox
9-14-18
Program for Exercise 3.19 compute perimeter of a Triangle if valid. 
*/

import java.util.Scanner;

class Exercise3point19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Type in Side 1 of your triangle: " );
		double one = input.nextDouble(); 
		System.out.println("Type in Side 2 of your triangle: " );
		double two = input.nextDouble();
		System.out.println("Type in Side 3 of your triangle: " );
		double three = input.nextDouble();
		double perimeter = one + two + three;
		
		
		if (one + two > three && three + two > one && one + three > two ) {
			System.out.println("The perimeter is: " + perimeter);
		}

		else {
			System.out.println( "This is not a triangle, so it cannot be solved.  " );
		}		
	}
}
	
	