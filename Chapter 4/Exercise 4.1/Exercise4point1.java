/*
Kacie Rae Cox
9-20-18
Code for Exercise 4.1 finding the area of a pentagon.
*/

import java.util.Scanner;

class Exercise4point1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a length from the center to a vertex ");
		double r = input.nextDouble();
		
		double side = 2 * r * Math.sin(Math.PI / 5);
		System.out.println("The side is " + Math.round(side * 100) / 100.0);
		
		double area = 5 * side * side / Math.tan(Math.PI / 5) / 4; 
		System.out.println("The area of the pentagon is " + Math.round(area * 100) / 100.0);
		
		
	}
}