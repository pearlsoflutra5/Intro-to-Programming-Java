class ArrayAverage {
	public static void main(String[] args) {
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		double sum = 0.0;
		double avg = 0.0;
		
		for (int i = 0; i < 4; i++) { // can also use i < myList.length for middle portion
			sum = sum + myList[i];
		}
					
		avg = sum / 4;
		
		System.out.println(avg);
	
	}
}