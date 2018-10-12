/*
Kacie Rae
10-12-18
Exercise 6.37 outputting a number with a specified width. 
*/
import java.util.Scanner;

class Exercise6point37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int number = input.nextInt();
		System.out.print("Enter a width: ");
		int width = input.nextInt();
		
		System.out.print("The formatted number is: " + format(number, width));
	}
	
	public static String format(int number, int width){
		String result = number + "";
		
		for (int i = 0; i < width - length(number); i++){
			result = "0" + result;
		}
		return result;
		// return a number possibly with additional 0's
	}
	public static int length(int number) {
		int size = 0;
		while (number > 0){
			size += 1;
			number = number / 10;
		}
		return size; 
		//return number of digits
	}
}