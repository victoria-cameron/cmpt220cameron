//Problem 4.8 Victoria Cameron

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