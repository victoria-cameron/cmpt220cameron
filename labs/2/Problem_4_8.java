//file: Problem_4_8.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 2
//due date: February 9, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_4_8{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Get the interger
    System.out.print("Enter an ASCII code: ");
    int code = input.nextInt();

    //Print the ASCII character
    System.out.print((char)code);
  }
}