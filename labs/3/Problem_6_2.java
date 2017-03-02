//file: Problem_6_2.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 3
//due date: February 23, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_6_2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //Get the users number int
    System.out.print ("Enter a integer: ");
    long number = input.nextLong();

    //print the sum of the seprate ints
    System.out.println ("The sum of the digits in " + number +
        " is " + sumDigits(number));
  }


    //Second method with int sumDigits(long n)
    public static long sumDigits(long n){
    int tot = 0;
    //while theres n %10 and /n but add n to the sum total
    while (n > 0){
        tot += n % 10;
        n /= 10;
    }
    //return sum to the main
    return tot;
  }
}
