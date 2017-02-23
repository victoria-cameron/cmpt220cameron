//file: Problem_4_1.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 2
//due date: February 9, 2017
//version: 1.0

import java.util.Scanner; 
public class Problem_4_1{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    //Get the radiusfrom the user
    System.out.print ("Enter the length from the center to a vertex: ");
    double radius = input.nextDouble();
	
    //Calculate the side length [r2*(sin(3.14/5))]
    double side = (2 * radius) * Math.sin(Math.PI / 5);
    
    //Calculate the area [5*s^2 / (4 * tan(3.14/5))]
    double area = (5 * Math.pow (side, 2)) / (4 * Math.tan (Math.PI / 5));

    //Print the result
    System.out.println ("The area of the pentagon is: " + area);
  }
}