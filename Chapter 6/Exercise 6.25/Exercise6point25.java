/*
Kacie Rae
10-11-18
Exercise 6.25 Converting milliseconds to regular time. 
*/

import java.util.Scanner;

class Exercise6point25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a time in milliseconds: ");
		long totalMillis = input.nextLong();
		
		System.out.print("the converted time from miliseconds is " + convertMillis(totalMillis));
	}
	
	public static String convertMillis(long millis) {
		long totalSeconds = millis / 1000;
		int seconds = (int)(totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		int minutes = (int)(totalMinutes % 60);
		long hours = totalMinutes / 60;
	

		
		return hours + ":" + minutes + ":" + seconds; 
	}
}