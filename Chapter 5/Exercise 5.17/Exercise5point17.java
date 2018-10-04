/*
Kacie Rae
10-2-18
Exercise 5.17 showing a pyramid of numbers.
*/
import java.util.Scanner;

class Exercise5point17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MIN = 1;
		System.out.print("Enter Number of rows between 1 and 15: ");
		final int MAX = input.nextInt();
		
		if (MAX < 1 || MAX > 15){
			System.out.print("Invalid input :( ");
		} 
		else {
			for(int j = MIN; j <= MAX; j++) {
				for(int i = MIN, k = MAX; i <= MIN + 2*(MAX-MIN); i++) {
					if (k > 9 && j < 10 ){
						System.out.print(" ");
					}
				
					if(k <= j) {
						System.out.print("" + k + " ");
					}
			
					else if(k <= j && j>= 10) {
					System.out.print("" + k + " ");	
					}
				
					else if (k > j && j< 10) {
						System.out.print("  ");
					}
			
					else {
						System.out.print("   ");
					}
				
					if(i < MAX) {
						k--;
					} 	
					else {
						k++;
					}
				}
				System.out.println("");
			}	
		}
	}
}

