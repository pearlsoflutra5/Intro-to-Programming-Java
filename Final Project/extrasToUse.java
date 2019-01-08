class extrasToUse {
	public static void main(String[] args) {
		
		System.out.println("How long do you want to practice?"); 
		System.out.print("Type the number of hours: ");
		int hours = input.nextInt();
		System.out.print("Type the number of minutes: ");
		int minutes = input.nextInt();
		
		int repeat = timer(problems(hours, minutes));
		

	}
	public static int problems(int h, int m){
			int startTime = h * 60;
			int finalTime = startTime + m;
			return finalTime;
		}
		public static int timer(int t){
			
		}

}

/* 

- method for menu 
- method for input
- if statements



*/