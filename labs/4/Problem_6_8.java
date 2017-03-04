//file: Problem_6_8.java
//author: Victoria Cameron
//course: CMPT 220
//assignment:Lab 4
//due date: March 3, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_6_8{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //display the table with data

		System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius ");
	  System.out.println("----------------------------------------------------------");

		//incrament celsius -1 and fahrenheit-10 print the results
		for (double celsius = 40.0, fahrenheit = 120.0;
			  celsius >= 31.0; celsius--, fahrenheit -= 10) {
			System.out.printf("%-12.1f", celsius);
			System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
			System.out.printf("     %-15.1f", fahrenheit);
			System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit));
		}
	}

	// Convert from Celsius to Fahrenheit
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	// Convert from Fahrenheit to Celsius
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
  }
}









