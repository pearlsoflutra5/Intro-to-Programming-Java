/*
Kacie Rae
9-28-18
Exercise 5.11 showing integers that are divisible by 5 or 6 but not both in groups of 10.
*/

class Exercise5point11 {
	public static void main(String[] args) {
		int n = 100;
		int count = 0;
		final int LINE_COUNT = 10;
		System.out.println("Integers between 100 and 200 divisible by 5 or 6 but not both. ");
		while (n <=200){
			if ((n % 5 == 0 && n % 6 != 0) || ((n % 6 == 0 && n % 5 != 0)) ){
				count++;
				if (count % LINE_COUNT == 0){
					System.out.println(n);			
				}
				else {
					System.out.print(n + " ");
				}
			}
			n++;
		}
	}
}