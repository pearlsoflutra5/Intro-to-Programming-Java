/* 
Kacie Rae
11-1-18
Exercise 7.15 Copying an array and make a list that has no duplicates in it. 
*/

import java.util.Scanner;

class Exercise7point15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] numbers = new int[10];
		System.out.print("Enter 10 numbers separated by a space: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		 
		// call the method to remove the array duplicates
		int[] result2 = eliminateDuplicates(numbers);
		//print the array
		System.out.println("The unique numbers in the array are: " + result2.length);
		System.out.print("The array without duplicates is: { ");
		for (int i = 0; i < result2.length; i++){
			System.out.print(result2[i] + " ");
		}	
		System.out.print ("}");
	}// end of main
	
	public static int[] eliminateDuplicates(int[] list) {
		int[] temp = new int[list.length];
		int size = 0; 
		for (int i = 0; i < list.length; i++){
			boolean isInArray = false;
			for (int j = 0; j < i && !isInArray; j++){
				if (list[j] == list [i]) {
					isInArray = true;
				} // end of if
			}// end of j for loop
			if (!isInArray) {
				temp[size] = list[i];
				size ++;
			}
		}// end of i for loop
		
		// return array with no duplicates
		int[] result = new int[size];
		for (int i = 0; i < size; i++){
			result[i] = temp[i];
		}
		
		return result;
	}
}

