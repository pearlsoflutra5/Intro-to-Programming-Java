/* 
Kacie Rae
10-31-18
Exercise 7.5 Adding numbers to an array if they are not duplicates.  
*/ 

import java.util.Scanner;

class Exercise7point5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int numberOfDistictValues = 0;
	
		System.out.print("Enter 10 numbers separated by a space: ");
	 
		for (int i = 0; i < numbers.length; i++){
			int value = input. nextInt();
			boolean isInTheArray = false;
		
			for (int j = 0; j < numberOfDistictValues; j++){
				if (value == numbers[j]){
					isInTheArray = true; 
			}	
		}// end of search loop
			if (!isInTheArray){
				// let's add it to the array
				numbers[numberOfDistictValues] = value;
				// now increase the tally by one
				numberOfDistictValues ++;
			}// end of if statement
		}// end of for loop
	
		System.out.println("The number of distict values is " + numberOfDistictValues);
	
		for(int i = 0; i < numberOfDistictValues; i++){
			System.out.print(numbers[i] + " ");
		}
	}
}