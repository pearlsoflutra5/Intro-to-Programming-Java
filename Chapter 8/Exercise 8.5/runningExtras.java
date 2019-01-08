import java.util.Random;
import java.util.Arrays;

class runningExtras {
	public static void main(String[] args) {
	String [][] array = {
		{" a, 1"},
		{" b, 2"},
		{" c, 4"},
		{" d, 5"},
		{" e, 6"},
	};
	
	randomizeArray(array);
	for(int i = 0; i < array.length; i++)
		for( int j = 0; j < array[i].length; j++){
			System.out.print(array[i][j]);
			System.out.println("");
		}

	}
	
	public static String[][] randomizeArray(String [][] cards){
		Random random = new Random();
		int [] numbers = new int [input.length];
		/*String [][] array = new String[input.length][input[0].length];*/
		
		for (int i=0; i < cards.length; i++) {
			int randomPosition = rgen.nextInt(cards.length);
			String temp = cards[i];
			cards[i] = cards[randomPosition];
			cards[randomPosition] = temp;
		}
	}
					
	
}

	/*for(int i = 0; i < input.length; i++) {
		int k = random.nextInt(input.length);
		numbers[i] = k;
		for (int l = i; l > 0; l--){
			if(numbers[l] == k){
				k = random.nextInt(input.length);	
			}
 		}
		input[i][0] = input[k][0];
		for(int j = 1; j < input[0].length; j++){
			input [i][1] = input[k][1];
		}	
	}
	return input;				
}*/
