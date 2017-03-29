//file: Problem_7_20.java
//author: Victoria Cameron
//course: CMPT 220
//assignment:lab 5
//due date: March 3, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_7_20{
  public static void main(String[] args) {

   Scanner input = new Scanner(System.in);
// Make the array and get the numbers
    double[] numbers = new double[10];
    System.out.print("Enter ten numbers: ");



  }

  // selsctionSort sorts array in accending order instead of decending
  public static void selectionSort(double[] unsorted) {
    for (int i = unsorted.length - 1; i >= 0; i--) {
      // Find the max of the list[i+1...list.length]
      double currentMax = unsorted[i];
      int currentMaxIndex = i;

      for (int j = i - 1; j >= 0; j--) {
        if (currentMax < unsorted[j]) {
          currentMax = unsorted[j];
          currentMaxIndex = j;
        }
      }

      // Swap list unsorted[i] with list[currentMax] if necessary
      if (currentMaxIndex != i) {
        unsorted[currentMaxIndex] = unsorted[i];
        unsorted[i] = currentMax;
      }
    }
  }
}