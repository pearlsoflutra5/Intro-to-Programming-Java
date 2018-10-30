import java.util.Scanner;

class PopulateArrayEasy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] myList = new double[6];
			
		for (int i = 0; i < myList.length; i ++) {
			System.out.println("Enter Value: ");
			myList[i] = input.nextDouble();
		}
		
		for (int i = 0; i < myList.length; i ++) {
			System.out.println(myList[i] + " ");
		}


	}
}