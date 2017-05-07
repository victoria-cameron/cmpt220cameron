//file: Problem_9_13.java
//author: Victoria Cameron
//course: CMPT 220
//assignment:Lab 6
//due date: April 20, 2017
//version: 1.0
//Find he largest element of an array with the location class

import java.util.Scanner;

public class Problem_9_13 {

  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    //get the two-dimensional array from input
    System.out.print("Enter the number of rows and columns in the array: ");
    int rows = input.nextInt();
    int columns = input.nextInt();

    // Create a matrix
    double[][] array = new double[rows][columns];
    System.out.println("Enter the array: ");
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = input.nextDouble();
      }
    }

    Location max = locateLargest(array);

    // Display the location of the largest element in the array
    System.out.println("The location of the largest element is " +
      max.maxValue + " at (" + max.row + ", " + max.column + ")");
  }

  //locateLargest returns the location of the largest
  public static Location locateLargest(double[][] a) {
    return new Location(a);
  }
}