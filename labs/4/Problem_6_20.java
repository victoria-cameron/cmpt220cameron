//file: Problem_6_20.java
//author: Victoria Cameron
//course: CMPT 220
//assignment:
//due date: March 3, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_6_20{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Get a string
    System.out.print("Enter a string: ");
    String string = input.nextLine();

    // Display the number of letters in the string
    System.out.println("The number of letters in the string \"" +
      string + "\": " + countLetters(string));
   }

    // Method countLetters counts all letters
    public static int countLetters(String s) {
      int numberOfLetters = 0; // Counts the number of letters
      for (int i = 0; i < s.length(); i++) {
        // Test if character is a letter
        if (Character.isLetter(s.charAt(i)))
          numberOfLetters++; // Increment the number of letters
      }
    return numberOfLetters;
    }
}