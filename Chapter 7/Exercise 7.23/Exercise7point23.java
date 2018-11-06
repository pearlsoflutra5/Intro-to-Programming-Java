/*
Kacie Rae Cox
11-5-18
Code for Exercise 7.23 Locker puzzle: 100 lockers, 100 students; student n changes n locker(s).
*/

class Exercise7point23 {
	public static void main(String[] args) {
		// [] just have to be on left of =. 
		boolean locker[] = new boolean[100];
		
		// increment student selection
		
		for(int s = 1; s <= 100; s++){
			for(int l = s - 1 ; l < 100; l += s){
				// changes from true/false oppposite of what it is
				locker[l] = !locker[l];
			}		
		}
		
		System.out.print("These are the lockers that are open: ");
		
		for(int i = 0; i < 100; i++ ){
			if (locker[i] == true){
				System.out.print((i + 1) + " ");
			}
		}	
	}
}

/*
The lockers are prime because they have an odd number of factors. 
Ex: the factors for 4 are 1, 2, and 4. There are 3 of them which is an odd number. 


need number of student. student number equals what number locker changes. starts false turns true for every other. 


(Game: locker puzzle) 100 lockers 100 student 0 opens all 1 closes every other and 2 changes for every third.  

After all the students have passed through the building and changed the lockers, which lockers are open? Write a program to find your answer and display all open locker numbers separated by exactly one space.

(Hint: Use an array of 100 Boolean elements, each of which indicates whether a locker is open ( true ) or closed ( false ). Initially, all lockers are closed.)

You can use a nested for loops to increment the student selection, and close the lockers. Finally, you can use a for loop to display which lockers are still open. 

*/
