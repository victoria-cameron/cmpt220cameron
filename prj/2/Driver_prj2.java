//file: Driver_prj2.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Project 2
//due date: May, 2017
//version: 0.3

import java.util.Scanner;
public class Driver_prj2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.print("Enter year of birth .........:=> ");
    int year = (input.nextInt());


    System.out.print("Enter month of birth, as a number please ........:=> ");
    int month = (input.nextInt() - 1);


    System.out.print("Enter date of birth  ........:=> ");
    int date = (input.nextInt());

    monthWriten(month);
    System.out.println (dayOfTheWeek(year, date, month));
  }
  //Turns the number into the string of what month you were born.
  public static String monthWriten (int month){
    String writtenMonth = new String("ERROR");
    if (month == 0)
        writtenMonth = "January";
      else if (month == 1)
        writtenMonth = "February";
      else if (month == 2)
        writtenMonth = "March";
      else if (month == 3)
        writtenMonth = "April";
      else if (month == 4)
        writtenMonth = "May";
      else if (month == 5)
        writtenMonth = "June";
      else if (month == 6)
        writtenMonth = "July";
      else if (month == 7)
        writtenMonth = "August";
      else if (month == 8)
        writtenMonth = "September";
      else if (month == 9)
        writtenMonth = "October";
      else if (month == 10)
        writtenMonth = "November";
      else if (month == 11)
       writtenMonth = "December";
    return writtenMonth;
  }
  public static String dayOfTheWeek(int year1, int day1, int month1){
    int a = 0; //Teller for leap year
    if (year1%4 == 0){
      if (month1 == 0)
        a = 0;
      else if (month1 == 1)
        a = 3;
      else if (month1 == 2)
        a = 4;
      else if (month1 == 3)
        a = 0;
      else if (month1 == 4)
        a = 2;
      else if (month1 == 5)
        a = 5;
      else if (month1 == 6)
        a = 0;
      else if (month1 == 7)
        a = 3;
      else if (month1 == 8)
        a = 6;
      else if (month1 == 9)
        a = 1;
      else if (month1 == 10)
        a = 4;
      else if (month1 == 11)
        a = 6;
    else
      if (month1 == 0)
        a = 1;
      else if (month1 == 1)
        a = 4;
      else if (month1 == 2)
        a = 4;
      else if (month1 == 3)
        a = 0;
      else if (month1 == 4)
        a = 2;
      else if (month1 == 5)
        a = 5;
      else if (month1 == 6)
        a = 0;
      else if (month1 == 7)
        a = 3;
      else if (month1 == 8)
        a = 6;
      else if (month1 == 9)
        a = 1;
      else if (month1 == 10)
        a = 4;
      else if (month1 == 11)
        a = 6;
    }
    year1 -= 1900;
    int b = year1 / 4;
    int c = year1 + b + day1 + a;
    c = c%7;
    String weekday = new String("ERROR");
    if (c == 1)
      weekday = "Sunday";
    else if (c == 2)
      weekday = "Monday";
    else if (c == 3)
      weekday = "Tuesday";
    else if (c == 4)
      weekday = "Wednesday";
    else if (c == 5)
      weekday = "Thursday";
    else if (c == 6)
      weekday = "Friday";
    else if (c == 7)
      weekday = "Saturday";

    return weekday;
  }
}