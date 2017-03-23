//file: Problem_7_18.java
//author: Victoria Cameron
//course: CMPT 220
//assignment:lab 4
//due date: March 3, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_7_18{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Make the 10 array
		double[] numbers = new double[10];

		//Get ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		//Use the bubblesort method
		bubbleSort(numbers);

		// display the sorted numbers
		for (double e: numbers) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	/** bubbleSort */
	public static void bubbleSort(double[] list) {
		double fixed;
		boolean switched;

		do {
			switched = false;
			for (int i = 0; i < list.length - 1; i++) {
				// If a neighboring pair is not in order, swap values
				if (list[i] > list[i + 1]) {
					fixed = list[i];
					list[i] = list[i + 1];
					list[i + 1] = fixed;
					switched = true;
				}
			}
		} while (switched); // Repeat if a value was swapped
	}
}