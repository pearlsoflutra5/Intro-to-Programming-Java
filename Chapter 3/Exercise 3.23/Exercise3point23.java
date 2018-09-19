/*
Kacie Rae Cox
9-18-18
Program for Exercise 3.23 compute if point is in the rectangle. 
*/

import java.util.Scanner;

class Exercise3point23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Type in a coordinate pair to see if it is in the rectangle.  " );
		System.out.println("Type in x: " );
		double x = input.nextDouble(); 
		System.out.println("Type in y: " );
		double y = input.nextDouble();
		
				
		if (0 - x <= 10 / 2 && 0 - x >= -10/2 && 0 - y <= 5.0 / 2 && 0 - y <= -5.0 / 2 ) {
			System.out.println("point (" + x +", " + y + ")" );
			System.out.println("This point is in the rectangle. "  );
		}

		else {
			System.out.println("point (" + x +", " + y + ")" );
			System.out.println( "This point isn't in the rectangle.  " );
		}		

	}
}