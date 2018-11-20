
import java.util.Scanner;

class Example8point35{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Store 50 states and their capitals in a two-dimensional array
		String[][] statesAndCapitals = getData();
		int correctCount = 0;
		for (int i = 0; i < statesAndCapitals.length; i++) {
			System.out.print("What is the capital of " + statesAndCapitals[i][0]+ "? ");
			String s = input.nextLine();
			if (s.equalsIgnoreCase(statesAndCapitals[i][1])) {
				System.out.println("Correct!");
				correctCount++;
			}
			else {
				System.out.println("The correct answer should be " + statesAndCapitals[i][1]);
			}
		}

		// Display the total correct count
		System.out.println("\nThe correct count is " + correctCount);
	}

	/** isEqual returns true if a is equal to c */
	public static boolean isEqual(String c, String a) {
		if (c.length() != a.length())
			return false;

		for (int i = 0; i < c.length(); i++) {
			if (c.charAt(i) != a.charAt(i))
				return false;
		}

		return true;
	}

	/** getData initializes the array with the 50 states and their capitals */
	public static String[][] getData() {
		String[][] d = {
			 
			{"Alaska", "Juneau"}, 
			{"Arizona", "Phoenix"},
			{"Arkansas", "Little Rock"}, 
			{"California", "Sacramento"},
			{"Colorado", "Denver"}, 
			{"Idaho", "Boise"},
			{"Kansas", "Topeka"}, 
			{"Texas", "Austin"}, 
			{"Utah", "Salt Lake City"}, 
			{"Wyoming", "Cheyenne"}};
			return d;
	}
}

/*
{"Vermont", "Montpelier"}, 
{"Virginia", "Richmond"}, 
{"Washington", "Olympia"}, 
{"West Virginia", "Charleston"}, 
{"Wisconsin", "Madison"}, 
{"Connecticut", "Hartford"}, 
{"Delaware", "Dover"},
{"Florida", "Tallahassee"}, 
{"Georgia", "Atlanta"},
{"Hawaii", "Honolulu"},
{"Maryland", "Annapolis"}, 
{"Massachusetts", "Boston"}, 
{"Michigan", "Lansing"}, 
{"Minnesota", "Saint Paul"}, 
{"Mississippi", "Jackson"}, 
{"Missouri", "Jefferson City"}, 
{"Montana", "Helena"}, 
{"Nebraska", "Lincoln"}, 
{"Nevada", "Carson City"}, 
{"New Hampshire", "Concord"}, 
{"New Jersey", "Trenton"}, 
{"New Mexico", "Santa Fe"}, 
{"New York", "Albany"}, 
{"North Carolina", "Raleigh"}, 
{"North Dakota", "Bismarck"},
{"Ohio", "Columbus"},
{"Oklahoma", "Oklahoma City"}, 
{"Oregon", "Salem"}, 
{"Pennsylvania", "Harrisburg"}, 
{"Rhode Island", "Providence"},  
{"Kentucky","Frankfort"},  
{"Louisiana", "Baton Rouge"},  
{"Maine", "Augusta"},  
{"South Carolina", "Columbia"}, 
{"South Dakota", "Pierre"},  
{"Tennessee", "Nashville"}, 
{"Illinois", "Springfield"},  
{"Indiana", "Indianapolis"},  
{"Iowa ", "Des Moines"},  
{"Alabama", "Montgomery"},
*/
