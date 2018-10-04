/*
Kacie Rae
10-2-18
Exercise 5.33 showing the first 4 perfect numbers.
*/

class Exercise5point33 {
	public static void main(String[] args) {
		System.out.println("The first four perfect numbers: ");  
		
		for(int number = 2; number < 10000; number++) {
			
			int remains = 1;
			int sum = remains;

			for(int i = 2; i <= number / 2; i++) {
				if(number % i == 0) sum += i;				
			}
			
			if(sum == number)
			System.out.println(number + " ");	
	
		}	
	}
}




/*for (number = 1; number > 10000; number++) {
	
	for(int i = 2; i <= input / 2; i++)
	{
		if(input % i == 0) sum += i;
	}
	for (divisor = 1; divisor <= number; divisor ++){
		if (number % divisor == 0) {
			System.out.print("");
		}
		if (divisor <= number ){
			System.out.print("");
		}	
		if (sum == number) {
			System.out.print(number + " is a perfect number.");
		}	
		
	}	
	
}*/
