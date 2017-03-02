//file: Problem_6_3.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 3
//due date: February 23, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_6_3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Get the number
    System.out.print ("Enter a number to reverse: ");
    int num = input.nextInt();

    //Reverse the received number
    //Put the reverse and original into isPalindrome
    //print the number in reverse and if it is a palendrome
    if(isPalindrome (num, reverse(num))){
      System.out.println(num + " is a palindrome.");
    }
    else{
      System.out.println(num + " is not a palindrome.");
    }

  }

  public static int reverse (int number){
    //will return reversed int
    int rev = 0;
    while (number != 0){
      rev = rev * 10;
      rev = rev + number%10;
      number = number/10;
    }
    return rev;
  }

  public static boolean isPalindrome (int number, int reversed){
    //checks if number and the reverse are the same thing
    boolean check = false;
    if (number == reversed){
    //returns true or false
      check = true;
    }
    return check;
  }
}

