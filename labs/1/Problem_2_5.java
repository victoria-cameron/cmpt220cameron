//file: Problem_2_5.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 1
//due date: January 26, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_2_5{
  public static void main(String[] args){
    //get total and gratuity
    Scanner input = new Scanner(System.in);
    System.out.print ("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuityRate = input.nextDouble();
    //calculate the tip and total
    double tip = subtotal * (gratuityRate/ 100.0);
    double total = subtotal + tip;
    //print the tip and total
    System.out.println("The gratuity is $" + tip + 
	" and the total is $" + total);
  }
}
