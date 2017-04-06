//file: Problem_8_13.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 5
//due date: March 30, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_8_13 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a two-dimensional array
		System.out.print("Enter the number of rows and columns of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();

    //Create the multidimentional array from input
		double[][] mArray = new double[row][column];
		System.out.println("Enter the array:");
		for (int i = 0; i < mArray.length; i++) {
			for (int j = 0; j < mArray[i].length; j++) {
				mArray[i][j] = input.nextDouble();
			}
		}

		// Get the location of the largest element
		int[] location = locateLargest(mArray);

		// Display results
		System.out.println("The location of the largest element is at (" +
			location[0] + ", " + location[1] + ")");
	}

	// locateLargest returns the location of the
	    //largest element in a two-dimensional array
	public static int[] locateLargest(double[][] a) {
		int[] l = new int[2];
		l[0] = 0;
		l[1] = 0;
		double large = 0;

    //Loop the array through itself to find biggest
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > large) {
					l[0] = i;
					l[1] = j;
					large = a[i][j];
				}
			}
		}
		return l;
	}
}