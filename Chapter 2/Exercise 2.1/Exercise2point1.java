/* 
Kacie Rae
9-10-18
a file to compute Exercise 2.1 Celsius to Fahrenheit. 
*/

import java.util.Scanner;

class Exercise2point1 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius: " );
		double celsius = input.nextDouble();
	
		double fahrenheit = (9.0 / 5) * celsius + 32;
	
		System.out.println(celsius + " Celsus is " + fahrenheit + " Fahrenheit ");
		
	}
}