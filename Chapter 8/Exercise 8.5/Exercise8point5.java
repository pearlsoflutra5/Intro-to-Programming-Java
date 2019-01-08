/*
Kacie Rae
11-15-18
Exercise 8.5 adding 2 dimensional arrays/matrices. 
*/

import java.util.Scanner;

class Exercise8point5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//n is row m is column
		final int R = 3;
		final int C = 3;
		System.out.println("Enter a 3 * 3 matrix for both matrices.  ");
		
		System.out.print("Enter matrix A:");
		double [][] matrixA = new double[R][C];
		
		for(int row = 0; row < matrixA.length; row++) {
			for(int column = 0; column < matrixA[row].length; column++ ){
				matrixA[row][column] = input.nextDouble(); 
			}
		}
		
		System.out.print("Enter matrix B:");
		double [][] matrixB = new double[R][C];
		
		for(int row = 0; row < matrixB.length; row++) {
			for(int column = 0; column < matrixB[row].length; column++ ){
				matrixB[row][column] = input.nextDouble(); 
			}
		}
		
		//Now add the two matrices together
		double[][] resultMatrix = addMatrix (matrixA, matrixB);
		System.out.println("The sum of the matrices is");
		printResult(resultMatrix);	
	}
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] result = new double[a.length][a[0].length];
		for(int row = 0; row < result.length; row ++){
			for(int column = 0; column < result[row].length; column++){
				result[row][column] = a[row][column] + b[row][column]; 
			}
		}
		return result;
	}
	public static void printResult(double[][] c) {
		for(int row = 0; row < c.length; row++) {
			for(int column = 0; column < c[row].length; column++ ){
				System.out.print(c[row][column] + " " );  
			}
			System.out.println(" ");
		}	
	}
}