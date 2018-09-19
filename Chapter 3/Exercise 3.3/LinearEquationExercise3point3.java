/*
Kacie Rae Cox
9-13-18
Program for Exercise 3.3 Linear Equation
*/

import java.util.Scanner;

class LinearEquationExercise3point3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double determineA = (a * d) - (b * c);
		
		if (determineA == 0) {
			System.out.println("The equation has no solution :( ");
			}
		else {
			double x = (e * d - b * f) / determineA;
			double y = (a * f - e * c) / determineA;
			System.out.println("x = " + x + " y = " + y);
		}
		
	}
}