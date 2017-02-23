//file: Problem_3_11.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Lab 2
//due date: February 9, 2017
//version: 1.0

import java.util.Scanner;
public class Problem_3_11{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
  
    //get the month and year from user (2 inputs?)
    System.out.print ("Enter the month as an interger: ");
    int month = input.nextInt();
	System.out.print ("Enter the year as a four digit interger: ");
    int year = input.nextInt();
    // print the month year and number of days

    switch (month){
      case 1: System.out.print ("January " + year + " had 31 days."); break;
      case 2: 
      if (year % 4 == 0){
        System.out.print ("February " + year + " had 29 days.");
      }
      else 
        System.out.print ("February " + year + " had 28 days."); break;

      case 3: System.out.print ("March " + year + " had 31 days."); break;
      case 4: System.out.print ("April " + year + " had 30 days."); break;
      case 5: System.out.print ("May " + year + " had 31 days."); break;
      case 6: System.out.print ("June " + year + " had 30 days."); break;
      case 7: System.out.print ("July " + year + " had 31 days."); break;
      case 8: System.out.print ("August " + year + " had 30 days."); break;
      case 9: System.out.print ("September " + year + " had 31 days."); break;
      case 10: System.out.print ("October " + year + " had 30 days."); break;  
      case 11: System.out.print ("November " + year + " had 31 days."); break;
      case 12: System.out.print ("December " + year + " had 30 days."); break;
    }
  }
}  