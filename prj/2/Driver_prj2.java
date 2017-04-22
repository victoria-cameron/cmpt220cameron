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
      userBirthday.monthWriten(month);

    //-----------Zodiac Usage--------------
      Zodiac userZodiac = new Zodiac();
      userZodiac.chinese (year);
      userZodiac.western (month, date);

    //---------Print statements------------
      System.out.println (userBirthday.daysTill);
      System.out.println (userZodiac.wZodiac);
    }
    catch (Exception ex){
    ex.printStackTrace();
    }
    //Birthday userBirthday = new Birthday();


  }
}