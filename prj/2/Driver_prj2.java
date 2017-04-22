//file: Driver_prj2.java
//author: Victoria Cameron
//course: CMPT 220
//assignment: Project 2
//due date: May, 2017
//version: 0.4

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Driver_prj2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println ("-------------------------------------------------------");
    System.out.println ("|-----------------------------------------------------|");
    System.out.println ("|-----------ON THE DAY THAT YOU WERE BORN-------------|");
    System.out.println ("|-----------------Victoria Cameron--------------------|");
    System.out.println ("|-----------------------------------------------------|");
    System.out.println ("-------------------------------------------------------");
    System.out.println ("Press enter to continue:");
    Scanner scanner = new Scanner(System.in);
    scanner.nextLine();
    System.out.println ("Welcome to On the Day that You Were Born! Based on a little personal info"+
      "about you I'm gonna tell you more things about yourself that you may or" +
      " may not have known. The first thing that I need to know is your name.");


    System.out.print("Your name:");
    String name = (input.nextLine());

    System.out.println("Great " + name + ", next tell me your birth year, month," +
        " and day in the order they ask.");
    System.out.print("What year were you born:  ");
    int year = (input.nextInt());

    System.out.print("Can you tell me the month you were born; as a number: ");
    int month = (input.nextInt() - 1);

    System.out.print("Finally, what's your day of birth: ");
    int date = (input.nextInt());
    try{
    //----------Birthday Usage-------------
      Birthday userBirthday = new Birthday();
      userBirthday.dayOfTheWeek(year, date, month);
      userBirthday.whensBirthday(year, month, date);
      userBirthday.dateOfBirth(month, date, year);

    //-----------Zodiac Usage--------------
      Zodiac userZodiac = new Zodiac();
      userZodiac.chinese (year);
      userZodiac.western (month, date);

    //---------Print statements------------
      System.out.println (userBirthday.fullDateOfBirth);
      System.out.println (userZodiac.wZodiac);
    }
    catch (Exception ex){
    ex.printStackTrace();
    }
    //Birthday userBirthday = new Birthday();


  }
}