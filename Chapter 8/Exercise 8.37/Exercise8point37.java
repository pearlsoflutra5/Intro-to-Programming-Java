/*
Kacie Rae
11-16-18
Exercise 8.37 guessing capitals of 10 states.
*/

import java.util.Scanner;

class Exercise8point37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] list = statesAndCapitals();
		int correct = 0;
		
		for(int i = (int)(Math.random() * 40), j = 0; j < 10 ; i++, j++){
			System.out.print("What is the capital of " + list[i][0] + ": ");
			String s = input.nextLine();
			if (s.equalsIgnoreCase(list[i][1])){
				System.out.println("Correct!");
				correct++;
			}	
			else{
				System.out.println("The correct answer should be " + list[i][1]);
			}
		}
		
		System.out.println("\nThe correct count is " + correct);
	}
	public static String[][] statesAndCapitals(){
		String[][] list = { {"Alabama", "Montgomery"},
			{"Alaska", "Juneau"},
			{"Arizona", "Phoenix"},
			{"Arkansas", "Little Rock"},
			{"California", "Sacramento"},
			{"Colorado", "Denver"},
			{"Connecticut", "Hartford"},
			{"Delaware", "Dover"},
			{"Florida", "Tallahassee"},	
			{"Georgia", "Atlanta"},
			{"Hawaii", "Honolulu"},
			{"Idaho", "Boise"},
			{"Illinois", "Springfield"},
			{"Maryland", "Annapolis"},
			{"Minnesota", "Saint Paul"},
			{"Iowa", "Des Moines"},
			{"Maine", "Augusta"},
			{"Kentucky", "Frankfort"},
			{"Indiana", "Indianapolis"},
			{"Kansas", "Topeka"},
			{"Louisiana", "Baton Rouge"},
			{"Oregon", "Salem"},
			{"Oklahoma", "Oklahoma City"},
			{"Ohio", "Columbus"},
			{"North Dakota", "Bismark"},
			{"New York", "Albany"},
			{"New Mexico", "Santa Fe"},
			{"New Jersey", "Trenton"},
			{"New Hampshire", "Concord"},
			{"Nevada", "Carson City"},
			{"Nebraska", "Lincoln"},
			{"Montana", "Helena"},
			{"North Carolina", "Raleigh"},
			{"Missouri", "Jefferson City"},
			{"Mississippi", "Jackson"},
			{"Massachusetts", "Boston"},
			{"Michigan", "Lansing"},
			{"Pennsylvania", "Harrisburg"},
			{"Rhode Island", "Providence"},
			{"South Carolina", "Columbia"},
			{"South Dakota", "Pierre"},
			{"Tennessee", "Nashville"},
			{"Texas", "Austin"},
			{"Utah", "Salt Lake City"},
			{"Vermont", "Montpelier"},
			{"Virginia", "Richmond"},
			{"Washington", "Olympia"},
			{"West Virginia", "Charleston"},
			{"Wisconsin", "Madison"},
			{"Wyoming", "Cheyenne"} };
		return list; 
	}

}