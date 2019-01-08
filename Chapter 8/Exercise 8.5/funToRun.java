import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

class funToRun {
	public static void main(String[] args) {
		Random rgen = new Random();  // Random number generator
		int[] cards = new int[52];
		 
		//--- Initialize the array to the ints 0-51
		for (int i=0; i < cards.length; i++) {
		cards[i] = i;
		}
		 
		//--- Shuffle by exchanging each element randomly
		for (int i=0; i < cards.length; i++) {
		int randomPosition = rgen.nextInt(cards.length);
		int temp = cards[i];
		cards[i] = cards[randomPosition];
		cards[randomPosition] = temp;
		}
		
		for(int i = 0; i < cards.length; i++){
			System.out.print(cards[i]);
		}
	
		System.out.println(""); 
		// Create an array
		String[] array = new String[]{"a", "b", "c", ''};
		 
		// Shuffle the elements in the array
		Collections.shuffle(Arrays.asList(array)); 
		for( int i = 0; i < array.length; i ++){
			System.out.println(array[i]);
		}
			

	}
	
	
}