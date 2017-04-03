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
    //weekdayBorn(year, month, date);


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
  //public static String weekdayBorn(int year, int month, int day){




}