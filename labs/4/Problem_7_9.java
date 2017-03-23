//file: Problem_7_9.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 4
//due date: March 3, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_7_9{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Create array of length 10
    double[] numbers = new double[10]; 

    // Prompt the user to enter ten numbers
    System.out.print("Enter ten numbers: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextDouble();
    }

    // Display the minimum value
    System.out.println("The minimum number is: " + min(numbers));
    }

    //Method min returns the smallest element in an array of double values
    public static double min(double[] array) {
      double min = array[0];	// The minimum value
      for (double i: array) {
        if (i < min)
          min = i;
      }
    return min;
    }