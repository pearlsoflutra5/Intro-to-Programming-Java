class ArrayPractice {
	public static void main(String[] args) {
		double[] myList = new double[10];  //declare myList, and set it to new with amount of how many elements you want. if you don't use them all it is just extra space reserved and has no consequence. 
		
		//arrays start at 0 so ending number is 1 less that what you declared.
		myList[0] = 5.6; 
		myList[1] = 4.5; 
		myList[2] = 3.3; 
		myList[3] = 13.2; 
		myList[4] = 4.0; 
		myList[5] = 34.33; 
		myList[6] = 34.0; 
		myList[7] = 45.45; 
		myList[8] = 99.993; 
		myList[9] = 11123;
		//array is populated when it has data in it. otherwise it is unpopulated.
		
		System.out.println(myList[6]);
		
		double[] myListA = {1.9, 2.9, 3.4, 3.5};
		
		System.out.println(myListA[2]);
	}
}