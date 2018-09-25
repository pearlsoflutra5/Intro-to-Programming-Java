/*
Kacie Rae Cox
9-21-18
Code for Exercise 4.17 finding the number of days in a month for a given year between 1600 and 2600.
*/

import java.util.Scanner;

class Exercise4point17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String month = "";
		int year = 0;
		
		System.out.println("Enter first three letters of a month with capital first letter: ");
		month = input. next();
		System.out.println("Enter year between 1600 and 2600:");
		year = input.nextInt();
		
		// not equal to !=
		// String -> !month.equals() 
		
		
		if(month.equals("Jan") || month.equals("Mar") || month.equals("May")|| month.equals("Jul") || month.equals("Aug") || month.equals("Oct")|| month.equals("Dec")) {
			System.out.println(month + " of " + year + " has 31 days");	
		}
		else if(month.equals("Sep")|| month.equals("Apr") || month.equals("Jun") || month.equals("Nov")){
			System.out.println(month + " of " + year + " has 30 days");			
		}
		else if (month.equals("Feb") && year % 4 == 0 /*&& year % 100 == 0 && year % 400 == 0*/ && year != 1700 && year != 1800 && year != 1900 && year != 2100 && year != 2200 && year != 2300 && year != 2500 && year != 2600) {
			System.out.println(month + " of " + year + " has 29 days");
				
		}				
		else if (month.equals("Feb")){
				System.out.println(month + " of " + year + " has 28 days");
		}
		else {
			System.out.println(" Invalid month");
		}
	}
}